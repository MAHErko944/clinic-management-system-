package com.clinicmanagementsystem.clinicmanagementsystem;

import java.sql.Timestamp;

public class Report {
    private int reportId;
    private int appointmentId;
    private String doctorName;
    private String patientName;
    private String reportContent;
    private Timestamp createdAt;

    public Report(int reportId, int appointmentId, String doctorName, String patientName, String reportContent, Timestamp createdAt) {
        this.reportId = reportId;
        this.appointmentId = appointmentId;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.reportContent = reportContent;
        this.createdAt = createdAt;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getReportContent() {
        return reportContent;
    }



    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
