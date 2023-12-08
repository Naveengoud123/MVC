package com.Naveen;

public class PriscriptionDetails {
    private String medicineName;
    private double amount;
    private String medicineId;
    
	public String getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}
	public PriscriptionDetails(String medicineName, double amount , String medicineId ) {
		super();
		this.medicineName = medicineName;
		this.amount = amount;
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
    
}
