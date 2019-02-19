/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gorevTakip;

/**
 *
 * @author Sony
 */
public class Test {
    public static void main(String[] args) {
        Doktor d=new Doktor();
        d.setAdi("Eda");
        d.setSoyadi("Erdemir");
        
        Gorev gorev1=new Gorev();
        gorev1.isim="muayene";
        d.gorevEkle(gorev1);
        
        Gorev gorev2=new Gorev();  
        gorev2.isim="ameliyat";
        d.gorevEkle(gorev2);
        
        Gorev gorev3=new Gorev();
        gorev3.isim="ilacYazma";
        d.gorevEkle(gorev3);
        
        d.GorevleriListele();
        
        d.Gorev_Bul(gorev1.isim);
        d.Gorev_Yap(gorev1);
        d.Gorev_Kontrol(gorev1.isim);
        
        d.Gorev_Bul(gorev2.isim);
        d.Gorev_Yap(gorev2);
        d.Gorev_Kontrol(gorev2.isim);
        
        d.Gorev_Bul(gorev3.isim);
        d.Gorev_Yap(gorev3);
        d.Gorev_Kontrol(gorev3.isim);
        
        d.GorevleriListele();
        d.calisma(11);
        d.setCalismaSuresi(11);
        System.out.println("Dr."+d.getAdi()+" "+d.getSoyadi()+"'ın maasi: " +d.getMaas());
        System.out.println("");
        
        Hemsire h=new Hemsire();
        h.setAdi("Kubra");
        h.setSoyadi("Erdemir");
        
        Gorev hemsireGorev=new Gorev();
        hemsireGorev.isim="igneYap";
        h.gorevEkle(hemsireGorev);
        
        Gorev hemsireGorev2=new Gorev();
        hemsireGorev2.isim="hastaKontrol";
        h.gorevEkle(hemsireGorev2);
        
        Gorev hemsireGorev3=new Gorev();
        hemsireGorev3.isim="tahlilleriTopla";
        h.gorevEkle(hemsireGorev3);
        
        h.GorevleriListele();
        
        h.Gorev_Bul(hemsireGorev.isim);
        h.Gorev_Yap(hemsireGorev);
        h.Gorev_Kontrol(hemsireGorev.isim);
        
        h.Gorev_Bul(hemsireGorev2.isim);
        h.Gorev_Yap(hemsireGorev2);
        h.Gorev_Kontrol(hemsireGorev2.isim);
        
        h.Gorev_Bul(hemsireGorev3.isim);
        h.Gorev_Yap(hemsireGorev3);
        h.Gorev_Yap(hemsireGorev3);
        
        h.GorevleriListele();
        h.calisma(12);
        h.setCalismaSuresi(12);
        System.out.println("Hemsire "+h.getAdi()+" "+h.getSoyadi()+"'ın maasi:"+h.getMaas());
        System.out.println("");
        Hizmetli hizmetli=new Hizmetli();
        hizmetli.setAdi("Ahmet");
        hizmetli.setSoyadi("Ak");
        
        Gorev hizmetliGorev=new Gorev();
        hizmetliGorev.isim="icecekServisi";
        hizmetli.gorevEkle(hizmetliGorev);
        
        Gorev hizmetliGorev2=new Gorev();
        hizmetliGorev2.isim="temizlik";
        hizmetli.gorevEkle(hizmetliGorev2);
        
        hizmetli.GorevleriListele();
        
        hizmetli.Gorev_Bul(hizmetliGorev.isim);
        hizmetli.Gorev_Yap(hizmetliGorev);
        hizmetli.Gorev_Kontrol(hizmetliGorev.isim);
        
        hizmetli.Gorev_Bul(hizmetliGorev2.isim);
        hizmetli.Gorev_Yap(hizmetliGorev2);
        hizmetli.Gorev_Kontrol(hizmetliGorev2.isim);
        hizmetli.GorevleriListele();
        hizmetli.calisma(5);
        hizmetli.setCalismaSuresi(5);
        System.out.println("Hizmetli "+hizmetli.getAdi()+" "+hizmetli.getSoyadi()+"'ın maasi: "+hizmetli.getMaas());
         
        
    }
}
