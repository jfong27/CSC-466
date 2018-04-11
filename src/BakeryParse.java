import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BakeryParse {

    public static ArrayList<Receipt> parse() {

        ArrayList<Receipt> reciepts = new ArrayList<Receipt>();


        String csvFile = "1000-out1.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ", ";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] receipt = line.split(cvsSplitBy);
                Receipt r = new Receipt();
                r.setNumber(Integer.parseInt(receipt[0]));
                ArrayList<Integer> items = new ArrayList<Integer>();
                for(int x = 1; x < receipt.length; x++){
                    items.add(Integer.parseInt(receipt[x]));
                    System.out.print(receipt[x] + ", ");
                }
                r.setItems(items);
                r.size = receipt.length -1;

                reciepts.add(r);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return reciepts;
    }
}
