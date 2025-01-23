package com.clinicmanagementsystem.clinicmanagementsystem;

import javafx.beans.property.*;

import java.time.LocalDateTime;

public class Appointment {
    private IntegerProperty appointmentId;
    private IntegerProperty queueNumber;
    private StringProperty status;
    private StringProperty patientName;
    private StringProperty doctorName;
    private StringProperty scheduleDay;
    private ObjectProperty<LocalDateTime> appointmentDate;
    private StringProperty specialty;
    private StringProperty day;
    private StringProperty createdAt;

    public Appointment(int appointmentId, String patientName, String doctorName,
                       int queueNumber, String status, String day, String createdAt){
        this.appointmentId = new SimpleIntegerProperty(appointmentId);
        this.queueNumber = new SimpleIntegerProperty(queueNumber);
        this.status = new SimpleStringProperty(status);
        this.patientName = new SimpleStringProperty(patientName);
        this.doctorName = new SimpleStringProperty(doctorName);
        this.scheduleDay = new SimpleStringProperty(day);
        this.day = new SimpleStringProperty(day);
        this.createdAt = new SimpleStringProperty(createdAt);
    }


    public Appointment(int appointmentId, String patientName, String doctorName, String specialty, LocalDateTime appointmentDate, int queueNumber, String status, String appointmentDay) {
        this.appointmentId = new SimpleIntegerProperty(appointmentId);
        this.queueNumber = new SimpleIntegerProperty(queueNumber);
        this.status = new SimpleStringProperty(status);
        this.patientName = new SimpleStringProperty(patientName);
        this.doctorName = new SimpleStringProperty(doctorName);
        this.scheduleDay = new SimpleStringProperty(appointmentDay);
        this.appointmentDate = new SimpleObjectProperty<>(appointmentDate);
        this.specialty = new SimpleStringProperty(specialty);
    }

    public Appointment(int appointmentId, String patientName) {
        this.appointmentId = new SimpleIntegerProperty(appointmentId);
        this.patientName = new SimpleStringProperty(patientName);
    }


    public int getAppointmentId() {
        return appointmentId.get();
    }

    public IntegerProperty appointmentIdProperty() {
        return appointmentId;
    }

    public int getQueueNumber() {
        return queueNumber.get();
    }

    public IntegerProperty queueNumberProperty() {
        return queueNumber;
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public String getPatientName() {
        return patientName.get();
    }

    public StringProperty patientNameProperty() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName.get();
    }

    public StringProperty doctorNameProperty() {
        return doctorName;
    }

    public String getScheduleDay() {
        return scheduleDay.get();
    }

    public StringProperty scheduleDayProperty() {
        return scheduleDay;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate.get();
    }

    public ObjectProperty<LocalDateTime> appointmentDateProperty() {
        return appointmentDate;
    }

    public String getSpecialty() {
        return specialty.get();
    }

    public StringProperty specialtyProperty() {
        return specialty;
    }

    public String getDay() {
        return day.get();
    }

    public StringProperty dayProperty() {
        return day;
    }

    public String getCreatedAt() {
        return createdAt.get();
    }

    public StringProperty createdAtProperty() {
        return createdAt;
    }
}
