/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gorevTakip;

import java.util.ArrayList;

/**
 *
 * @author Sony
 */
public class Hizmetli extends Personel {

    public Hizmetli() {
        calismaSuresi = 8;
        maas = 3000;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas > 3100) {
            System.out.println("Maas arttirilamaz");
        } else {
            this.maas = maas;
        }   
    }

    public int getCalismaSuresi() {
        return calismaSuresi;
    }

    public void setCalismaSuresi(int calismaSuresi) {
       if (calismaSuresi < 0 || calismaSuresi>=24) {
            System.out.println("Hatali giris yaptiniz");
            
        } else {
            this.calismaSuresi = calismaSuresi;
            
        }
    }

    public boolean isSureTamamlandiMi() {
        return sureTamamlandiMi;
    }

    public void setSureTamamlandiMi(boolean sureTamamlandiMi) {
        this.sureTamamlandiMi = sureTamamlandiMi;
    }

    

    
     @Override
    boolean calisma(int calismaSuresi) {
        
        isSureTamamlandiMi();
        if (getCalismaSuresi() == calismaSuresi) {
            setSureTamamlandiMi(true);    
            return sureTamamlandiMi;
        } else if (getCalismaSuresi() < calismaSuresi  ) {
            setSureTamamlandiMi(true);   
            ekMesai(calismaSuresi);
            return sureTamamlandiMi;
        } else {
            setSureTamamlandiMi(false);
            maasAzalt(calismaSuresi);
            return sureTamamlandiMi;
        }
    }

    int maasAzalt(int calismaSuresi) {
        if (calismaSuresi < this.calismaSuresi) {
            setMaas(getMaas() - 50);
        }
        return maas;
    }

    int ekMesai(int calismaSuresi) {
        if (calismaSuresi > 8 && calismaSuresi < 10) {
            setMaas(getMaas() + 50);
        } else if (calismaSuresi >= 10) {
            setMaas(getMaas() + 100); 
        }
        return maas;
    }


    

    @Override
    void gorevEkle(Gorev g) {
        if(g.isim=="icecekServisi" || g.isim=="temizlik"){
        this.getGorevListesi().add(g);
        }
        else{
            System.out.println("Yanlis gorev atamasi yapilmistir.");
        }
    }
    
}
