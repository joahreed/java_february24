package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
    // TO DO: Implement HIPAACompliantUser!
	
	public Physician(int i) {
        //TODO Auto-generated constructor stub
    }

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    
    /**
     * 	Pin must be exactly 4 digits, returns false if not.
Expected to assign the pin to the user (as a member variable)
     */
    @Override
    public boolean assignPin(int pin) {
        System.out.println(pin);
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accessAuthorized'");
    }
	
    // TO DO: Setters & Getters
}
