
package emberekoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Emberek {
    
    private List<Ember> emberekLista;
    
    public Emberek(){
    
        String[] nevek= {"Kis Géza", "Nagy Géza","Takács Endre", "Lovári László","Lakatos Ka Kálmán"};
        String[] szuletesiDatumok={"1999-09-29","1999-06-29","1999-07-29","1999-08-29","1999-10-29",};
        String[] szuletesiHelyek={"Budapest","Budapest","Budapest","Etyek","Szeged"};
        
        this.emberekLista = new ArrayList<Ember>();
        for (int i = 0; i < nevek.length; i++) {
            this.emberekLista.add(new Ember(nevek[i],szuletesiDatumok[i],szuletesiHelyek[i]));
        }
    
    }
    
    public Emberek(String fajl){
        try{
            FileReader fr= new FileReader(fajl);
            BufferedReader br = new BufferedReader(fr);
        
            String sor = br.readLine();
            while (sor!= null){
                this.emberekLista.add(new Ember (sor));
                sor=br.readLine();
            }
            
            br.close();
            fr.close();
        } catch (Exception ex){
            System.out.println("Hiba: "+ex); 
        
        }
    
    
    }
    
    public int adottHonapbanSzuletettekSzama(int honap){
    
        int db = 0 ;
        for (int i = 0; i < this.emberekLista.size(); i++) {
            if (this.emberekLista.get(i).szuletesiHonap()==honap){
                db++;
            }    
        }
        return db;
    }
    
    public int atlagEletkor(){
      int s = 0;
        for (int i = 0; i < this.emberekLista.size(); i++) {
            s +=this.emberekLista.get(i).eletKor();
        }
        return s / this.emberekLista.size();
    }
    
    public Ember legfiatalabbEmber(){
        int min =0;
        for (int i = 0; i < this.emberekLista.size(); i++) {
            if (this.emberekLista.get(i).eletKor() < this.emberekLista.get(min).eletKor()) {
              min=i;  
            }
        }
      return this.emberekLista.get(min);  
    
    }
    
    
    
    @Override
    public String toString(){
        String s="";
        for(Ember e : this.emberekLista) {
            s += e + "\n"; 
        }
        return s;
    }
    
    
    
}
