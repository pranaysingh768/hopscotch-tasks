package in.hopscotch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="car_registration_detail")
public class CarRegistrationDetail {
	
	@Id
	@GeneratedValue
	@Column(name="reg_id")
	private int regId;
	
	@Column(name="car_no")
	private String carNo;
	
	@Column(name="car_colour")
	private String carColour;
	
	@Column(name="slot_no")
	private int slotNo;
	
	@Column(name="parking_cost")
	private double parkingCost;
	
	@Column(name="entry_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDate;
	
	@Column(name="exit_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date exitDate;
	
	@Column(name="customer_status")
	private String customerStatus;

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
	
	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public double getParkingCost() {
		return parkingCost;
	}

	public void setParkingCost(double parkingCost) {
		this.parkingCost = parkingCost;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	
	
	
}
