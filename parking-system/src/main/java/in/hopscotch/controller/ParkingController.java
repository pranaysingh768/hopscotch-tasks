package in.hopscotch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.hopscotch.entity.CarRegistrationDetail;
import in.hopscotch.service.ParkingService;

@RestController
public class ParkingController {
	
	@Autowired
	ParkingService parkingService;
	
	//leaveCar
	@PostMapping("/parkCar")
	public CarRegistrationDetail parkTheCar(@RequestBody CarRegistrationDetail detail) {
		
		return parkingService.parkTheCar(detail);
		
	}
	
	@PutMapping("/leaveSlot/{slotNo}")
	public CarRegistrationDetail leaveCar(@PathVariable int slotNo) {
		
		return parkingService.leaveCar(slotNo);
		
	}
	
	
}
