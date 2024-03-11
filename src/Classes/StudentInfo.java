
package Classes;

public class StudentInfo extends Info implements Display{

    
    
    
    private String surname;
    private String faculty;
    private int age;

    public StudentInfo(int id,String name,String surname,int age, String faculty) {
        super(name, id);
        this.surname = surname;
        this.faculty = faculty;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAge() {
        return age;
    }


    
    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + age + " " + faculty ;
    }

    @Override
    public void display() {
        for(StudentInfo a : Student.arraylist){
            System.out.println(a);
    }
    }
}

    

