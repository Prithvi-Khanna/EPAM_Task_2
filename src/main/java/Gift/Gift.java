package Gift;
import Sweets.*;

import java.util.ArrayList;
import java.util.Collections;

public class Gift  {
    ArrayList<Sweet> Array = new ArrayList<Sweet>();

    public int NetWeight()
    {
        int totalWeight=0;
        for(int i=0;i<Array.size();i++)
        {
            totalWeight= totalWeight + (Array.get(i).getWeight() * Array.get(i).getQuantity());
        }
        return totalWeight;
    }

    public void add(Sweet sweets)
    {
        Array.add(sweets);
    }
    public void sort()
    {
        Collections.sort(Array);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.Array.size();i++){
            sb.append(Array.get(i).getCategory()+" ");
        }
        return sb.toString();
    }

    public void findCandy()
    {
        for(int i=0;i<this.Array.size();i++)
        {
            if("Candy" == Array.get(i).getCategory())
            {
                Candy c1 = new Candy();
                c1 = (Candy) Array.get(i);

                System.out.println("Candy Name = " + c1.getCandyName() + "  Candy Color = " + c1.getColorName());
            }
        }
    }

}