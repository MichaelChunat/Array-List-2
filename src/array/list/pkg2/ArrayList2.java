package array.list.pkg2;
import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList band = new ArrayList();
        band.add("Mark");
        band.add("Michael");
        band.add("Roger");
        band.add("Jake");
       
        System.out.println(band);
        
        int location = 0;
        location = band.indexOf("Jake");
        System.out.println("The location is " + location);
        band.remove(location);
        System.out.println(band);
        System.out.println("The size of the band is " + band.size());
        band.add(0,"Jerome");    
        System.out.println(band);
        band.add(3,"Diggs");
        System.out.println(band);
        band.trimToSize();
    }
    
}
