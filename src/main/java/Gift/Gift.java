package Gift;

import Sweets.*;

import java.util.ArrayList;
import java.util.Collections;

public class Gift  {
ArrayList<Sweets> al = new ArrayList<Sweets>();

public int NetWeight()
{
    int w=0;
    for(int i=0;i<al.size();i++)
    {
        w+= al.get(i).getWeight();
    }
    return w;
}

public void add(Sweets sweets)
{
    al.add(sweets);
}
public void sort()
{
    Collections.sort(al);
}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.al.size();i++){
            sb.append(al.get(i).getName()+" ");
        }
        return sb.toString();
    }


}
