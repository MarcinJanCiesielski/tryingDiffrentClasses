import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTry {

    private static final String[] imiona = new String[] {"Marcin", "Zuzanna", "Katarzyna", "Anna", "Marcin", "Krzysztof", "Piotr", "Anna",
                                    "Tomasz", "Marcin", "Mariusz", "Julia", "Patryk", "Jolanta"};

    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        Set<String> ts = new TreeSet<String>();
        Set<String> lhs = new LinkedHashSet<>();

        for(String imie: imiona){
            hs.add(imie);
            ts.add(imie);
            lhs.add(imie);
        }

        System.out.print("HashSet - size: " + hs.size()+" : ");
        for(String imie: hs){
            System.out.print(imie+", ");
        }
        System.out.println("");

        System.out.print("\nTreeSet - size: " + hs.size()+" : ");
        for(String imie: ts){
            System.out.print(imie+", ");
        }
        System.out.println("");

        System.out.print("\nLinkedHashSet - size: " + hs.size()+" : ");
        for(String imie: lhs){
            System.out.print(imie+", ");
        }
        System.out.println("");


    }
}
