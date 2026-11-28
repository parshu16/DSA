package PAVANSIR.NON_PRIMITIVE_ARRAY;
import java.util.*;
class Student{
  String name;
  int rollno;
  double cgpa;
  Student(String name,int rollno,double cgpa){
    this.name=name;
    this.rollno=rollno;
    this.cgpa=cgpa;
  }
  @Override
  public String toString(){
    return "Student{name='" + name +"', rollno=" + rollno +", cgpa=" + cgpa + "}";
  }
}
public class Program2 {
    public static void main(String[] args) {
      Student[]s={new Student("Pavan",678,9.8),
      new Student("narendar",688,9.8),
      new Student("karthik",670,9.8),
      new Student("simhadri",676,9.8),};
      double hcgpa=Double.MIN_VALUE;
      for(Student ele:s){
        if(ele.cgpa>hcgpa) {hcgpa=ele.cgpa;System.out.println(ele);}
      }
      System.out.println(hcgpa);
    }
}
