package gradleproject1;

import java.util.ArrayList;
import java.util.List;

public class Custmor extends User {

    private List<MenuItem> pereferances;

    public Custmor(String id, String fname, String lname, String address) {
        super(id, fname, lname, address);
      this.pereferances = new ArrayList<>();
    }

    public void addPereferances(MenuItem prefered) {
        pereferances.add(prefered);
    }

   public List<MenuItem> getPereferances() {
        return new ArrayList<>(pereferances); 
    }

}
