package in.hopscotch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.hopscotch.entity.CarRegistrationDetail;

@Repository
public interface ParkingRepository extends JpaRepository<CarRegistrationDetail, Integer>{
	
	public List<CarRegistrationDetail> findByCustomerStatus(String status);
	
	public CarRegistrationDetail findBySlotNoAndCustomerStatus(int slotNo,String status);
}
