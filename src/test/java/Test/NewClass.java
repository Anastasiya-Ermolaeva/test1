package Test;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.HashMap;

public class NewClass {
    public static int a = 33;
    private int b = 11;
    protected int c = 14;
    int d = 22;

    public static void main(String[] args) {
        int prm = 15;
        int i=0;
        int k = 0;
        int l=0;

        String str = "name";
        if (a == 33)  {
            System.out.println("Значение переменной равно 33");
        }
        for (i=0; i<10;i++) {
        System.out.println(i);
        }

      while (k < 4)
        {
        System.out.println(k);
        k++;
        }

       do {
          System.out.println(l);
          l++;
         }
       while (l<7);

        ArrayList<String> mas = new ArrayList<String>();
        mas.add("a");
        mas.add("b");
        mas.add("c");
        for (String ms:mas)
             {
                 System.out.println(ms);
             }

        HashMap<String,String> map = new HashMap<String, String>();
        map.put("a","Katya");
        map.put("k","Nastya");
        map.put("b","Liza");

        for (String x:map.keySet())
              {
                  System.out.println(map.get(x));

        }
    }


    public int getA() {
        return a;
    }
}

