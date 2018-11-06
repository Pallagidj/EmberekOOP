


package emberekoop;

import java.time.LocalDateTime;

public class Ember {
    
    private String nev;
    private String szulDatum;
    private String szulHely;
    
    public Ember(){
    }
    
    public Ember(String adatSor){
        String[] adatok = adatSor.split(";");
    
        this.nev = adatok[0];
        this.szulDatum = adatok[1];
        this.szulHely = adatok[2];
    }
    

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }
    
    public int szuletesiEv(){
    
        return Integer.parseInt(this.szulDatum.substring(0, 4));
    
    }
    
    public int szuletesiHonap(){
        String[] adatok=this.szulDatum.split("-");
        return Integer.parseInt(adatok[1]);
    }
    
    public int szuletesiNap(){
        String[] adatok=this.szulDatum.split("-");
        return Integer.parseInt(adatok[2]);
    }
    
    public int eletKor(){
        return LocalDateTime.now().getYear() - this.szuletesiEv();
    }
    
    @Override
    public String toString(){    
        return String.format("%-23s %-25s %-24s", this.nev,this.szulDatum,this.szulHely);
    }
  
    
}
