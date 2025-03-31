
package main;

import java.util.Random;


public class Csiga {
        private static final Random RND=new Random();
        private String szin;
        private String szkod;
        private String ikon;
        private int sebesseg;
        private boolean kapgyorsitot;
    public Csiga(String szin,String szkod,String ikon,int sebesseg){
        this.szin = szin;
        this.szkod = szkod;
        this.ikon = ikon;
        this.sebesseg = 0;
        
    }
    
    public int Gyorsito(){
        if (RND.nextDouble()<0.2) {
            kapgyorsitot = true;
            sebesseg += 1;
            System.out.print("Kapott gyorsítót!");
        }
        return sebesseg + RND.nextInt(3)+1;
    }
    
    public String getSzin(){
    return szin;
    }
    public String getSzkod(){
    return szkod;
    }
    
    public String getIkon(){
    return ikon;
    }
    
    public int getSebesseg(){
    return sebesseg;
    }
}
