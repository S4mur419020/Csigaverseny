
package main;

import java.util.Random;
import java.util.Scanner;


public class CsigaVerseny {
    private static final Random RND=new Random();
    private static final Scanner SC=new Scanner(System.in);
    private static final int MIN=0;
    private static final int MAX=3;
    private Csiga[] csigak;
    private  int[] AktPozTomb;
    private static final int KOROK_SZAMA = 10;
 

    public CsigaVerseny(){
    int sebesseg=RND.nextInt(MIN, MAX);
    
    Csiga cs1=new Csiga("Piros","\u001B[31m Piros", "🐌\u001B[0m",sebesseg);
    Csiga cs2=new Csiga("Zöld","\u001B[32m Zöld"," 🐌\u001B[0m",sebesseg);
    Csiga cs3=new Csiga("Kék","\u001B[34m Kék","🐌\u001B[0m",sebesseg);
    
    csigak=new Csiga[3];
    csigak[0]=cs1;
    csigak[1]=cs2;
    csigak[2]=cs3;
    
    
    }

    void Start() {
        
        int legtav=0;
        int nyertesi=0;
        int[] AktPozTomb=new int[csigak.length];
        System.out.println("Melyik csiga fog nyerni szerinted?:");
        String tipp=SC.nextLine();
        System.out.print("Majd kiderül");
        
        for (int i = 0; i < KOROK_SZAMA; i++) {
            System.out.printf("%d. kör:\n",i+1);
            for (int j = 0; j < csigak.length; j++) {
                AktPozTomb[j]+=csigak[j].Gyorsito();
                System.out.println(" "+ "Aktuális pozicio: "+AktPozTomb[j]+
                        " "+csigak[j].getSzkod()+" "+csigak[j].getIkon());
                if (AktPozTomb[j]>legtav) {
                    legtav=AktPozTomb[j];
                    nyertesi=j;
                    
                }
            }
        }
        System.out.println("A nyertes: "+AktPozTomb[nyertesi]+
                " "+"távolságal"+csigak[nyertesi].getSzkod()+" "+csigak[nyertesi].getIkon());
        
        
        boolean vanNyertes = tipp == csigak[0].getSzin()||tipp == csigak[1].getSzin()||tipp == csigak[2].getSzin();
  
        if (vanNyertes) {
            System.out.println("Eltaláltad, nyertél!");
            
        }else{
            System.out.println("Sajnos nem találtad el, vesztettél!");
        }
       
        
    }
    
    
    

   
    
    
}
