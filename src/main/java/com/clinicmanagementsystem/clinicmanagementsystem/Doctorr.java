package com.clinicmanagementsystem.clinicmanagementsystem;

public class Doctorr extends User {
    private int doctor_id;
    private int specialtyId;
    private int appointmentLimit;

    public Doctorr(int userId, String name, String email, String password, String role, int specialtyId, int appointmentLimit) {
        super(userId, name, email, password, role);
        this.specialtyId = specialtyId;
        this.appointmentLimit = appointmentLimit;
    }

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

    public int getAppointmentLimit() {
        return appointmentLimit;
    }

    public void setAppointmentLimit(int appointmentLimit) {
        this.appointmentLimit = appointmentLimit;
    }



}
