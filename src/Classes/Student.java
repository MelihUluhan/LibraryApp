
package Classes;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public static ArrayList<StudentInfo> arraylist = new ArrayList<StudentInfo>();
    public static File studentFile = new File("student.txt");

    public static ArrayList<StudentInfo> getArraylist() {
        return arraylist;
    }

    
    public static boolean searhId(int id) {
        for (StudentInfo a : arraylist) {
            if (a.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static String displayAll(){
        String all = "";
        for (int i = 0; i < arraylist.size(); i++) {
            all += arraylist.get(i).toString()+"\n";
        }
        return all;
    }
    public static void readtxtFile() {

        try {
            Scanner input = new Scanner(studentFile);
            while (input.hasNext()) {

                int id = input.nextInt();
                String name = input.next();
                String surname = input.next();
                int age = input.nextInt();
                String faculty = input.next();
                arraylist.add(new StudentInfo(id, name, surname, age, faculty));

            }
            input.close();

        } catch (Exception e) {
            System.out.println("Read operation problem.");
        }

    }
    public static void addStu(int id,String name,String surname,int age, String faculty){
    Student.arraylist.add(new StudentInfo(id,name,surname,age,faculty));
    }
    
}
