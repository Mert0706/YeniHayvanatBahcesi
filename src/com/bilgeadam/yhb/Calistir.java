package com.bilgeadam.yhb;

public class Calistir {

    /*public void seslendir(Kopek kopek){
        kopek.sesCikar();
    }

    public void seslendir(Kedi kedi){
        kedi.sesCikar();
    }*/

    public void seslendir(Hayvan hayvan){
        hayvan.sesCikar();
    }

    public static void main(String[] args) {
    Calistir calistir = new Calistir();

    //Kopek kopek1 = new Kopek();

        //Polymorphism
        //Alt class objesini, üst class değişkeniyle oluşturma.

        Hayvan kopek1 = new Kopek();
        kopek1.setNo(1);
        kopek1.setAd("Garip");
        kopek1.setAgirlik(30);
        kopek1.setUzunluk(1.5);

    calistir.seslendir(kopek1);

    //Kedi kedi1 = new Kedi();

        Hayvan kedi1 = new Kedi();
        kedi1.setNo(2);
        kedi1.setAd("Duman");
        kedi1.setAgirlik(20);
        kedi1.setUzunluk(0.4);

    calistir.seslendir(kedi1);

        Hayvan esek1 = new Esek();
        esek1.setNo(3);
        esek1.setAd("Deli");
        esek1.setAgirlik(50);
        esek1.setUzunluk(1.70);

        calistir.seslendir(esek1);

    }
}
