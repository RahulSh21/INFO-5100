package edu.northeastern.rahul;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        String name = null, dob = null;
        Scanner sc = new Scanner(System.in);
        while(dob == null && name == null) {
        System.out.println("Enter Applicant Name ");
         name = sc.next();
         System.out.println("Enter Date of Birth in YYYY/MM/DD format ");
         dob =sc.next();
        }
        String[] str = dob.split("/");
        int year = Integer.parseInt(str[0]) - 1900;
        int month = Integer.parseInt(str[1]) - 1;
        int day = Integer.parseInt(str[2]);

        Date dateOfBirth = new Date(year, month, day);
        DrivingLicenseApplication drivingLicenseApplication = new DrivingLicenseApplication();

        try {
            int age = drivingLicenseApplication.checkForValidation(dateOfBirth);
            System.out.println(name + ",your age is: " + age + " and your application for driving license is approved");
        }
        catch (InvatidDateException e){
            System.out.println(name + ",your age is: " + e.getAge() + ", which is too early to apply for a driving license");
        }

    }
}
