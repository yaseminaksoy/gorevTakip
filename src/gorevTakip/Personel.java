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
public class Personel {

    protected String adi, soyadi;
    protected int maas;
    protected int calismaSuresi;
    protected boolean sureTamamlandiMi=false;
    private ArrayList<Gorev> gorevListesi = new ArrayList();
    
    private String getAdi() {
        return adi;
    }
    
    private void setAdi(String adi) {
        this.adi = adi;
    }

    private String getSoyadi() {
        return soyadi;
    }

    private void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    private int getMaas() {
        return maas;
    }

    private void setMaas(int maas) {
        if(maas>=15000){
            System.out.println("Maas arttirilamaz");
        }else{
            this.maas = maas;
        }
        
    }

    private int getCalismaSuresi() {
        return calismaSuresi;
    }

    private void setCalismaSuresi(int calismaSuresi) {
        if (calismaSuresi < 0 && calismaSuresi>=24) {
            System.out.println("Hatali giris yaptiniz");
        } else {
            this.calismaSuresi = calismaSuresi;
        }
    }
    
    private boolean isSureTamamlandiMi() {
        return sureTamamlandiMi;
    }

    private void setSureTamamlandiMi(boolean sureTamamlandiMi) {
        this.sureTamamlandiMi = sureTamamlandiMi;
    }
    
    void gorevEkle(Gorev g) {
        gorevListesi.add(g);
    }
     
    public void GorevleriListele(){
        
        System.out.println(this.getAdi()+"'ın "+"Görev Listesi");
        for (Gorev gorev : gorevListesi) {
            System.out.println(gorev.isim +"=" + gorev.gorevTamamlandiMi);
        }
        System.out.println("----------------------");
    }

    public ArrayList<Gorev> getGorevListesi() {
        return gorevListesi;
    }
 
     boolean calisma (int calismaSuresi){
         boolean sureTamamlandiMi=false;
        if(getCalismaSuresi()>=calismaSuresi){
            sureTamamlandiMi=true;
            return sureTamamlandiMi;
        }else
        {
            return false;
        }
    }
    public boolean Gorev_Kontrol(String isim) {
        
        Gorev x=this.Gorev_Bul(isim);
        if(x != null)
        {
            return x.gorevTamamlandiMi;
        }
        else
        {
            return false;
        }
       
     }
    public Gorev Gorev_Yap(Gorev x){
        for (int i = 0; i < this.gorevListesi.size(); i++) {
            
            if(this.gorevListesi.get(i).isim== x.isim) {
            
                this.gorevListesi.get(i).gorevTamamlandiMi=true;
                
                return this.gorevListesi.get(i);
            }
        }
        return x;
    }
    
    public Gorev Gorev_Bul(String isim){
        for (int i = 0; i < this.gorevListesi.size(); i++) {
            if(this.gorevListesi.get(i).isim.equals(isim) ){
                return this.gorevListesi.get(i);
            }
        }
        
        return null;
    }
   
}
