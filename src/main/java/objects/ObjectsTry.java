package objects;

import java.util.Objects;

public class ObjectsTry {

    public static void main(String[] args) {
        String napis = null;

        System.out.println(Objects.toString(napis));

        String napis2 = null;

        try{
            napis2 = Objects.requireNonNull(napis);
        } catch(NullPointerException e){
            System.out.println("Object ma wartość null");
        }

        System.out.println(Objects.toString(napis2, "Object ma wartość null"));

        System.out.println(Objects.equals(napis,napis2));
    }
}
