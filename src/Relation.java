import java.util.ArrayList;

public class Relation {

    private ArrayList<String> lhs;
    private String rhs;


    public Relation (){

    }

    public Relation(ArrayList<String> lhs, String rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void setLhs(ArrayList<String> lhs) {
        this.lhs = lhs;
    }

    public void setRhs(String rhs) {
        this.rhs = rhs;
    }

    public ArrayList<String> getLhs() {

        return lhs;
    }

    public String getRhs() {
        return rhs;
    }
}
