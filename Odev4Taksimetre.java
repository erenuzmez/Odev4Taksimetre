package Java101odevler;
import java.util.Scanner;
public class Odev4Taksimetre {
    public static void main(String[] args) {
        double km,tutar,birkm;
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç KM gideceksiniz:");
        km=input.nextDouble();
        birkm=2.20;
        tutar=10+(birkm*km);
        boolean yirmidenkucukse=tutar<20 && tutar>0;
        String str= (yirmidenkucukse) ? "Ücret:20 TL" : "Ücret:"+tutar+"TL";
        System.out.println(str);
    }
}
