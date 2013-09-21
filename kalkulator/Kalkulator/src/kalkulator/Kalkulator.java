package kalkulator;

public class Kalkulator {

    public static void main(String[] args){
        DataKalkulator isi = new DataKalkulator();
        isi.setX(200);
        isi.setY(100);
        
        System.out.println("kalkulator");
        System.out.println("200+100 = "+(isi.getX()+isi.getY()));
        System.out.println("200-100 = "+(isi.getX()-isi.getY()));
        System.out.println("200*100 = "+(isi.getX()*isi.getY()));
        System.out.println("200/100 = "+(isi.getX()/isi.getY()));
    }
        
}
