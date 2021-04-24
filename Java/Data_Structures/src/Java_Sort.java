import java.util.*;

class Verificador implements Comparator<Student>{

    @Override
    public int compare(Student student, Student t1) {

        if(student.getCgpa() == t1.getCgpa())
            return student.getFname().equals(t1.getFname()) ? student.getId()-t1.getId() : student.getFname().compareTo(t1.getFname());
        else
            return student.getCgpa() < t1.getCgpa() ? 1 : -1;
    }
}

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Java_Sort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Verificador verificador = new Verificador();
        studentList.sort(verificador);

        Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().
                thenComparing(Student :: getFname).thenComparing(Student :: getId));

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

}
