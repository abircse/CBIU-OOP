package cbiu.ac.bd;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public void loadData(List<PojoModel> studentList)
    {
        studentList = new ArrayList<>();
        studentList.add(new PojoModel("Galib",29,"Male"));
        studentList.add(new PojoModel("Abir", 29,"Male"));
        if (studentList.isEmpty()) {

            System.out.println("No data in list");
        }
        else
        {
            for (int i = 0; i < studentList.size(); i++)
            {
                System.out.println(studentList.get(i).getStudentname()+" "+studentList.get(i).getStudentage()+ "  "+studentList.get(i).getStudentgender());
            }
        }

    }
}
