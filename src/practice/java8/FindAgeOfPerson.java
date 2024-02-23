package practice.java8;

import java.time.LocalDate;
import java.time.Period;

public class FindAgeOfPerson {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2001, 8, 14);
        LocalDate currenDate = LocalDate.now();

        // LocalDate.minusYears(1998);
        Period peroid = Period.between(dob, currenDate);
        System.out.println(peroid);
    }
}