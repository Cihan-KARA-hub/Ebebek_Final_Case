/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikastore1.brands;

import java.util.*;
import patikastore1.electronic.ComputerCostumer;
import patikastore1.electronic.PhoneCostumer;

public class BrandsCostumer {
//Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster

    public static ArrayList<String> brand = new ArrayList<>();
    PhoneCostumer phone = new PhoneCostumer();
    ComputerCostumer computer = new ComputerCostumer();

    public BrandsCostumer() {
        brand.add("Samsung");
        brand.add("Lenovo");
        brand.add("Huawei");
        brand.add("Casper");
        brand.add("Asus");
        brand.add("HP");
        brand.add("Xiaomi");
        brand.add("Monster");

    }

    public void computer_Add(ComputerCostumer computer) {
        // markalara elektronik cihaz ekleme methodu.
        // bu methodları farklı yazmalıyım.
        computer.add(computer);

    }

    public void phone_Add(PhoneCostumer phone) {
        phone.add(phone);
    }

    public void phone_List(String item) {
        phone.list(item);

    }

    public void computer_List(String item) {

        computer.list(item);

    }

    public void brandList() {

        Scanner scan = new Scanner(System.in);
        listele();
        String item = null;
        int x = 0;
        System.out.println(" listelemek istediginiz markayi seciniz ");
        for (String brand1 : brand) {
            System.out.println(x + ". " + brand.get(x));
            x++;
        }
        int temp = scan.nextInt();
        switch (temp) {

            case 0 ->
                item = brand.get(0);

            case 1 ->
                item = brand.get(1);
            case 2 ->
                item = brand.get(2);
            case 3 ->
                item = brand.get(3);
            case 4 ->
                item = brand.get(4);
            case 5 ->
                item = brand.get(5);
            case 6 ->
                item = brand.get(6);
            case 7 ->
                item = brand.get(7);
            case 8 ->
                item = brand.get(8);
            default ->
                System.out.println(" istedginiz marka bulunamadi .");
        }
        phone.list(item);
        computer.list(item);

        //alfabetik olacak
    }

    private void listele() {
        Collections.sort(brand);

    }

}
