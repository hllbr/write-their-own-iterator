
import java.util.ArrayList;
import java.util.Iterator;


public class Radyo implements Iterable<String>{
    private ArrayList<String> kanallar_listesi = new ArrayList<String>();
    public class RadyoIterator implements Iterator<String>{

        
            private int index = 0;

        @Override
        public void remove() {
            Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
           
        }
            
        @Override
        public boolean hasNext() {
           if(index<kanallar_listesi.size()){
               return true;
           }else{
               return false;
           }
        }

        @Override
        public String next() {
           String deger = kanallar_listesi.get(index);
           index++;
           return deger;
        }
        
    }
    public Radyo(String[] kanallar){
        for(String kanal :kanallar){
            kanallar_listesi.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      // return kanallar_listesi.iterator();//sorunu çözmek için bir yöntem 
      //kendi iteratorümüzüde yazabiliriz == 
      return new RadyoIterator();
    }
    
}
