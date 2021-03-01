package in.hopscotch.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hopscotch.entity.CarRegistrationDetail;
import in.hopscotch.exception.NotFoundException;
import in.hopscotch.repository.ParkingRepository;

@Service
public class ParkingServiceImple implements ParkingService {
	
	public final static int  TOTAL_SLOT = 5;
	
	@Autowired
	ParkingRepository parkingRepository;
	
	@Override
	public CarRegistrationDetail parkTheCar(CarRegistrationDetail detail) {

		Optional<CarRegistrationDetail> optional = Optional.ofNullable(detail);
		
		if(!optional.isPresent()) {
			
			throw new NotFoundException("Please Enter Valid Detail");
		}
		
		List<CarRegistrationDetail> saveDetail = parkingRepository.findByCustomerStatus("Active");
		
		int slotCount = checkSlots(saveDetail);
		
		detail.setSlotNo(slotCount);
		detail.setEntryDate(new Date());
		detail.setCustomerStatus("Active");
		
		parkingRepository.save(detail);
		
		return detail;
	}
	
	
	public int checkSlots(List<CarRegistrationDetail> saveDetail ) {
		
		if(saveDetail.size() > TOTAL_SLOT) {
			throw new NotFoundException("Parking Slot Is Full");
		}
		
		TreeSet<Integer> storeSlot = new TreeSet<>();
		
		for(CarRegistrationDetail c : saveDetail) {
			
			storeSlot.add(c.getSlotNo());
		}
		
		int slotCount = 1;
		for(slotCount=1;slotCount<=TOTAL_SLOT;slotCount++) {
			if(storeSlot.contains(slotCount)) {
				continue;
			}
			else {
				break;
			}
		}
		
		return slotCount;
		
	}
	

	@Override
	public CarRegistrationDetail leaveCar(int slotNo) {

		CarRegistrationDetail slotDetail = parkingRepository.findBySlotNoAndCustomerStatus(slotNo,"Active");
		
		Optional<CarRegistrationDetail> optional = Optional.ofNullable(slotDetail);
		
		if(!optional.isPresent()) {
			
			throw new NotFoundException("Please Enter Valid Slot No");
		}
		
		slotDetail.setCustomerStatus("Inactive");
		slotDetail.setExitDate(new Date());
		
		Date startDate = slotDetail.getEntryDate();
		Date endDate = new Date();
		long duration = endDate.getTime() - startDate.getTime();
		long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		
		if(diffInHours > 2) {
			long remainTime = diffInHours - 2;
			 
			 int cost = ((int)remainTime * 10) + 10;
			 
			 slotDetail.setParkingCost(cost);
		}
		else {
			slotDetail.setParkingCost(10);
		}
		
//		System.out.println(duration);
//		System.out.println(diffInHours);
		
		parkingRepository.save(slotDetail);
		
		return slotDetail;
	}

	
	
}
