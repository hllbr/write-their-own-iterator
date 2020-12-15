
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        String [] kanallar = {"radyo viva","radyo fenomen","Kral pop","Radyo Hacettepe","Alem FM"};
        Radyo radyo = new Radyo(kanallar);
       /* for(String s : radyo){
        
        //radyo objesi  iterator olmadığı için foreach ile bastırılamaz.
        //bu yapının çalışması için radyonun iterable sınıfını implemente etmesi gerek ve bizim iterator sınıfını almamız gerek.
        
            System.out.println(s);
        
        }*/
       for(String s : radyo){
           System.out.println(s);
           System.out.println("Hata ortadan kaldırıldı...");
       }
        System.out.println("////////////////////////////////");
        
        Iterator<String> iterator = radyo.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
