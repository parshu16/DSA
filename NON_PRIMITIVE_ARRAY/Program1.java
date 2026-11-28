package PAVANSIR.NON_PRIMITIVE_ARRAY;

class Person{
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
public class Program1 {
    public static void main(String[] args) {
        Person[]p={new Person("Narendhar", 30)
            ,new Person("Simhadri", 28)
            ,new Person("Sai", 26)
            ,new Person("Gopichand", 19)
        };
        for(Person ele:p){
            System.out.println(ele);
        }
    }
}
