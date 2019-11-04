package cbiu.ac.bd;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

    public static void main(String[] args) {

        List<PojoModel> studentlist = new ArrayList<>();
        // call data class
        Database db = new Database();
        db.loadData(studentlist);

    }
}
