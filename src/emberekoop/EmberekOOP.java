/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberekoop;

public class EmberekOOP {

    public static void main(String[] args) {
        
        Ember akos= new Ember("Kuki Muki Ákos","NoN","Kelendföld");
        Ember laszlo = new Ember("Debreczeni László" , "1996-01-13", "Budapest");
        Ember niki = new Ember("Gáti Nikolett","1997-07-12","Szeged");
        
        
        
        System.out.println(akos);
        System.out.println(laszlo); 
        System.out.println(laszlo.szuletesiEv());
        System.out.println(niki);
       
        System.out.println(laszlo.szuletesiEv());
        System.out.println(niki.eletKor());
        
        Emberek sokEmber =new Emberek();
        System.out.println(sokEmber);
        
        Emberek nagyonSokEmber = new Emberek("emberek.txt");
        System.out.println(nagyonSokEmber);
        
        System.out.println("A decemberben születettek száma:"
        + nagyonSokEmber.adottHonapbanSzuletettekSzama(12));
        
        System.out.println("Átlag életkor:" + nagyonSokEmber.atlagEletkor());
        
        System.out.println("A legfiatalbb ember:" + nagyonSokEmber.legfiatalabbEmber());
    }
    
}
