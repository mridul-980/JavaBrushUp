package brushup;

import java.util.ArrayList;

public class arrayList {
    public static void main(RahulS[] args) {
        ArrayList<java.lang.String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.get(2));
        for(int i=0 ; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
