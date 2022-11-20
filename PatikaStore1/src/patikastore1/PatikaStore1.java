/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patikastore1;


import patikastore1.brands.BrandsCostumer;
import patikastore1.electronic.ComputerCostumer;
import patikastore1.electronic.PhoneCostumer;

/**
 *
 * @author cihan
 */
public class PatikaStore1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here"
 
        BrandsCostumer brands = new BrandsCostumer();      
        brands.computer_Add(new ComputerCostumer(1, "asusa 15", 3, 13000, 12, "Asus", "500gb", "13 inc", "15 gb"));
        
        brands.phone_Add(new PhoneCostumer(13, "p40", 3, 7000, 1, "Lenovo", "64 gb", "6 inc", "5000 milampr", "3 gb", "red"));      
       
        brands.phone_Add(new PhoneCostumer(15, "p50", 3, 8300, 1, "Asus", "128 gb", "6 inc", "2500 milampr", "4 gb", "blue"));      
        
        brands.brandList();
        
        
        
        
    
}
        
      
       
          
    }
    

