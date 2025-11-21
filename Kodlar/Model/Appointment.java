package com.mainPackage.randevuapp.Model;

public class Appointment {
    private String doctorName;
    private String department;
    private String hospitalName;
    private String date;
    private String time;

    public Appointment(String doctorName, String department, String hospitalName, String date, String time) {
        this.doctorName = doctorName;
        this.department = department;
        this.hospitalName = hospitalName;
        this.date = date;
        this.time = time;
    }

    // Getters
    public String getDoctorName() {
        return doctorName;
    }

    public String getDepartment() {
        return department;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
