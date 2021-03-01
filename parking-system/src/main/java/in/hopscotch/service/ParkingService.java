package in.hopscotch.service;

import in.hopscotch.entity.CarRegistrationDetail;

public interface ParkingService {
	
	public CarRegistrationDetail parkTheCar(CarRegistrationDetail detail);
	
	public CarRegistrationDetail leaveCar(int slotNo);
	
}
