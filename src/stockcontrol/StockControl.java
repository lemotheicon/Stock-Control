/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcontrol;

/**
 *
 * @author Omolemo
 */
import javax.swing.*;
import javax.swing.JOptionPane;
public class StockControl {

    
    public static void main(String[] args) {
    final int PRODUCTS = 3;
      int[] productId = {101,102,103};
      String[] productName ={"ACER Laptop", "HP Laptop", "DELL Laptop"};
      double[] price = {5500.00,5200.00,3100.00};
     
      
      
      String productDetails = JOptionPane.showInputDialog(null, 
              "Enter (1) to search for product details." +"\n" +
                      "Enter (2) to display all product details in stock." + "\n" +
                      "Enter any other number to exit");
      int selection = Integer.parseInt(productDetails);
      
      int one =1;
      int two = 2;
      
     if(selection == 1) 
          {
              searchArray(productId,productName,price);
              JOptionPane.showConfirmDialog(null, "Would you like to search for more products?","More?",JOptionPane.QUESTION_MESSAGE);
               
          }
     else
         if(selection ==2)
              {
                  loadArray();
              }
     else
             JOptionPane.showMessageDialog(null,"Thank you for stopping by.");
      
    }
    
public static void searchArray(int[] productId ,String[] productName,double[] price)
        {
        int selection;
        String productDetails;
        final int PRODUCTS = 3;
        double productPrice = 0.0;
        boolean isValidItem = false;
        productDetails = JOptionPane.showInputDialog(null,"Enter in the Product ID ");
        selection = Integer.parseInt(productDetails);
        
        for(int x = 0; x <= PRODUCTS; ++x)
            {
               if(selection == productId[x]) 
                   {
                       isValidItem = true;
                       productPrice = price[x];
                       if(isValidItem)
                   JOptionPane.showMessageDialog(null,"PRODUCT ID: " +productId[x] +
                               "\nPRODUCT: " + productName[x] + "\nPRICE: " + price[x] +
                               "\nPRODUCT COUNT: 3","Display",JOptionPane.INFORMATION_MESSAGE);
                       }
                else    
               
                     JOptionPane.showMessageDialog(null,"Thank you for stopping by.");
            
            }
        }
     public static void loadArray()
              {
                  JOptionPane.showMessageDialog(null, "ID " + "  PRODUCT  " + "   PRICE "+
                          "\n----------------------------"+
                          "\n101 " + " ACER Laptop " + " R5500.00"
                           + "\n102 " + " HP Laptop " + " R5200.00"
                          + "\n103 " + " DELL Laptop " + " R3100.00" +
                          "\nPRODUCT COUNT: 3","Stock Report",JOptionPane.INFORMATION_MESSAGE);
              }
           
}

