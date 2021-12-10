package edu.northeastern.rahul;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class DrivingLicenseApplication {
    private LocalDate todayDate = LocalDate.now();
    private LocalDate doB;

    public int checkForValidation(Date dateOfBirth) throws InvatidDateException {
        doB = dateOfBirth.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        int age = calculateAge(doB);
        System.out.println();
        if(age < 16){
            throw new InvatidDateException(age);
        }
        return age;
    }

     public int calculateAge(LocalDate doB){
         System.out.println();
        return Period.between(doB, todayDate).getYears();
     }
}
