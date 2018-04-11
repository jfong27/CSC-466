import java.util.*;

public class Apriori {


    public double minSupport = 1;
    public double minConfidence = 1;

    public static void main(String[] args) {
        ArrayList<Receipt> receipts = BakeryParse.parse();
        Set<Integer> items = new TreeSet<Integer>();
        Collections.sort(receipts,
                (o1, o2) -> new Integer(o1.getSize()).compareTo(o2.getSize()));
        for(int x = 0; x < receipts.size(); x++)
        {
            Receipt r = receipts.get(x);
            int size = r.size;
            for(int y = 0; y< size; y++)
            {
                items.add(r.items.get(y));
            }
        }






    }

    public double getSupport(ArrayList<Receipt> r , Set<Integer> s, int size){
        int count = 0;
        boolean flag = true;
        for(int x = 0; x < r.size(); x++)
        {
            Receipt temp = r.get(x);
            ArrayList<Integer> list = temp.items;
            for(int y = 0 ; y < list.size(); y++)
            {
                for( int item : s)
                {
                    if (!list.contains(item))
                    {
                        flag = false;
                    }
                }
                if(flag)
                {
                    count++;
                }
            }
        }
        return count/size;
    }

    public ArrayList<Relation> candidateGen(ArrayList<Receipt> r, int size){

        ArrayList<Relation> results = new ArrayList<Relation>();

        return results;
    }
}
