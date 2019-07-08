/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatetransactiontestharness;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anmol
 */
class RealEstateTransaction {
    private String streetNumber,purchasePrice,streetName,city,country,finalString,upperCased;
    public RealEstateTransaction(String streetNumber,String purchasePrice,String streetName,String city,String country){
    this.streetNumber=streetNumber;
    this.purchasePrice=purchasePrice;
    this.streetName=streetName;
    this.city=city;
    this.country=country;
    }
    
    /**
     * @return the streetNumber
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * @param streetNumber the streetNumber to set
     */
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * @return the purchasePrice
     */
    public String getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
   String[] array= new String[2];
    public String stateObject(){
        String finalString=streetNumber+purchasePrice+"-"+streetName+city+country;
        String array[]=finalString.split("-");
        String part1=array[0];
        String part2=array[1];
        String lowerCased=array[0].toLowerCase();
        String upperCased=array[1].toUpperCase();
        String total = lowerCased+upperCased;
        return total;
    }
    public String method2(){
        String ttt="";
        
        String finalString=streetNumber+purchasePrice+"-"+streetName+city+country;
        String array[]=finalString.split("-");
        String part1=array[0];
        String part2=array[1];
        String lowerCased=array[0].toLowerCase();
        upperCased=array[1].toUpperCase();
        String total = lowerCased+upperCased;
        Random tt = new Random();
        int aat = tt.nextInt(total.length());
        int i = tt.nextInt(total.length());
        
        if(i>aat){
       
        ttt= total.substring(aat, i);
        
       
       
        }
        else if (i<aat){   
            ttt= total.substring(i, aat);
  
       
        }
        
        
       
       return ttt;
    }

     public void method(int offset){
    int result;
     String ch = "abcdefghijklmnopqrstuvwxyz";
     
        String finalString=streetNumber+purchasePrice+streetName+city+country;
     for(int i=0;i<finalString.length();i++){
     char r= finalString.charAt(i);
     int number = ch.indexOf(r);
     
     result = number + offset;
     if(result<=25){
         char word = ch.charAt(result);
         String obtainedWord =""+word;
         System.out.print(obtainedWord);
         result=0;
        }
     else if(result>25){
         result = result-26;
         char word = ch.charAt(result);
         String obtainedWord = word+"";
         System.out.print(obtainedWord);
         result=0;
            
        }
//    System.out.println("");

     }
     
    
    }
//    public static int yy(int z){
//     z=0;
//     return z;
//     }
}
