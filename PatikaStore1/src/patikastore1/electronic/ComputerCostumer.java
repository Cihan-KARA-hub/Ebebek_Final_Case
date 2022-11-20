/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikastore1.electronic;

import java.util.*;

/**
 *
 * @author cihan
 */
public class ComputerCostumer {

    public static ArrayList<ComputerCostumer> pc = new ArrayList<>();
    int id;
    String name;
   public static int stock;
    int price;
    int discount;
    public static String brandInfo;
    String memory;
    String inch;
    String ram;

    public ComputerCostumer(int id, String name, int stock, int price, int discount, String brandInfo, String memory, String inch, String ram) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.discount = discount;
        this.brandInfo = brandInfo;
        this.memory = memory;
        this.inch = inch;
        this.ram = ram;
    }

    public ComputerCostumer() {

    }

    public void add(ComputerCostumer item) {
          for (int i = 0; i < pc.size(); i++) {
            if(item.id==pc.get(i).id){
                System.out.println(" ekleyeceiniz  ürünün id numarası daha önce kullanılmış");
            }
            else{
            pc.add(item);
            }
        }

       
        System.out.println(item.name + " adli urunu eklediniz eklediniz." + "\n" + "id numarasi :" + item.id);
        System.out.println("----------------------------------");
        stock++;
    }

    public static void remove() {
          Scanner item = new Scanner(System.in);
        System.out.printf(" silmek istediiniz id numarasını gidiniz :");
        int temp;
        temp = item.nextInt();
        for (int i = 0; i < pc.size(); i++) {

            if (pc.get(i).id == temp) {
                 System.out.println(pc.get(i).id + " id urunu sildiniz.");
                pc.remove(i);
                stock--;
               
                
                break;
            }
            System.err.println(" girdiginiz  id bulunamadu");

        }
    }

    public void list(String item) {
        for (int i = 0; i < pc.size(); i++) {
            if (pc.get(i).brandInfo.equals(item)) {
                System.out.println(
                        "Birim fiyati :" + pc.get(i).price + "tl\n "
                        + "Indirim orani :" + pc.get(i).discount + "%\n "
                        + "Stok miktari: " + pc.get(i).stock + " adet kaldi\n "
                        + "Urun adi : " + pc.get(i).name + "\n "
                        + "Marka bilgisi : " + pc.get(i).brandInfo + "\n "
                        + "Ram : " + pc.get(i).ram + "\n "
                        + "Depolama :" + pc.get(i).memory + "\n "
                        + "Ekran Boyutu :" + pc.get(i).inch + "\n ");
                System.out.println("------------------------------------------");

            }
        }

    }

  

}
