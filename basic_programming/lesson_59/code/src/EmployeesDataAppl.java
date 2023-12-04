package ait.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeesDataAppl {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String str = br.readLine();
//            System.out.println(str);
            String[] cells = str.split(",");
            printCells(cells);
            /*
            1) Total salary
            2) Total employees
            3) Average salary
            4) Average age
             */
            double salary = 0;
            int counter = 0;
            str = br.readLine();
            int age = 0;
            while (str != null) {
                counter++;
                cells = str.split(",");
                salary += Double.parseDouble(cells[2]); // salary = salary + Double.parseDouble(cells[2]);
                LocalDate birthDate = LocalDate.parse(cells[3]);
                age += ChronoUnit.YEARS.between(birthDate, LocalDate.now());
                printCells(cells);
                str = br.readLine();
            }
            System.out.println("Total salary: " + salary);
            System.out.println("Total employees: " + counter);
            System.out.println("Average salary: " + salary / counter);
            System.out.println("Average age: " + 1. * age / counter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printCells(String[] cells) {
        for (String s : cells) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
