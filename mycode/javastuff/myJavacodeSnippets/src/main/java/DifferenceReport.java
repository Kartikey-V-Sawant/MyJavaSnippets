

import java.util.*;

public class DifferenceReport {
    public static void main(String[] args) {
        // i need the difference report
        // for below 2 arrays using hashmap
        Integer[] a = {1,2,3,4,5};
        Integer[] b =  {1,3,5};
        HashMap<Integer,Integer> hma = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> hmb = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++)  {
            hma.put(a[i],a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            hmb.put(b[i],b[i]);
        }

        // iterate over array mydummyprojecta
        for (int i=0 ; i < a.length ; ++i){
            if (hmb.containsKey(a[i])) {
                System.out.println ("a[" + i + "] COMMON IN HM(AB)\t\t" + a[i]);
            }
            else {
                System.out.println ("MISSING IN HMB\t\t" + a[i]);
            }
        }

        System.out.println ("==============================");

        // iterate over array b
        for (int i=0 ; i < b.length ; ++i){
            if (hma.containsKey(b[i])) {
                System.out.println ("b[" + i + "] COMMON IN HM(AB)\t\t" + b[i]);
            }
            else {
                System.out.println ("MISSING IN HMA\t\t" + b[i]);
            }
        }
    }
}
