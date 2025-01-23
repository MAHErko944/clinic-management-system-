package com.clinicmanagementsystem.clinicmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    private List<Doctorrrr> doctors;
    private List<Appointment> appointments;

    public Admin(int userId, String name, String email, String password, String role) {
        super(userId, name, email, password, role);
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addDoctor(String doctorName, String doctorSpecialization, String doctorEmail, String doctorPhone) {
        Doctorrrr newDoctor = new Doctorrrr(doctorName, doctorSpecialization, doctorEmail, doctorPhone);
        doctors.add(newDoctor);
        System.out.println("Doctor " + doctorName + " with specialization in " + doctorSpecialization + " has been successfully added.");
    }

    public void removeDoctor(int doctorId) {
        boolean doctorFound = false;
        for (Doctorrrr doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                doctors.remove(doctor);
                System.out.println("Doctor with ID " + doctorId + " has been successfully removed.");
                doctorFound = true;
                break;
            }
        }
        if (!doctorFound) {
            System.out.println("Doctor with ID " + doctorId + " not found.");
        }
    }

    public void createAppointment(int patientId, int doctorId, String appointmentDate, String appointmentTime) {
        boolean doctorFound = false;
        for (Doctorrrr doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                doctorFound = true;
                System.out.println("Appointment created for patient ID " + patientId + " with doctor ID " + doctorId + " on " + appointmentDate + " at " + appointmentTime);
                break;
            }
        }
        if (!doctorFound) {
            System.out.println("Doctor with ID " + doctorId + " not found.");
        }
    }
}

class Doctorrrr {
    private static int idCounter = 1;
    private int doctorId;
    private String doctorName;
    private String doctorSpecialization;
    private String doctorEmail;
    private String doctorPhone;

    public Doctorrrr(String doctorName, String doctorSpecialization, String doctorEmail, String doctorPhone) {
        this.doctorId = idCounter++;
        this.doctorName = doctorName;
        this.doctorSpecialization = doctorSpecialization;
        this.doctorEmail = doctorEmail;
        this.doctorPhone = doctorPhone;
    }

    public int getDoctorId() {
        return doctorId;
    }

}
