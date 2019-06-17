package school.cesar.Q5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComparaListas {


    static List comparaListas(List<Integer> a, List<Integer> b){

        List<Integer> result = new ArrayList<>();

        HashMap<Integer,String> values = new HashMap<>();


        b.forEach(integer->{
            values.put(integer,"");
        });


        for (Integer integer : a) {

            if(values.get(integer) != null){
                result.add(integer);
            }
        }

        return result;


    }
}
