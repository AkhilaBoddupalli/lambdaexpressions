import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Employee {
    private int age;
    private String name;
    private String lastname;

    public Employee(int age,String name,String lastname){

        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

class LambdaExpressionExample11
{
    public static void main(String[] args)
    {

        List<Employee> al = new ArrayList<>();
        Employee obj1 = new Employee(10,"harika","kothapalli");
        Employee obj2 = new Employee(22,"charmisha","caruthala");
        Employee obj3 = new Employee(13,"chary","chermisha");
        Employee obj4 = new Employee(18,"bhanu","pittapalli");
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        for(Employee emp:al)
        {
            if(emp.getLastname().startsWith("c"))
            {
                System.out.println(emp.toString());
            }
        }
        //Predicate<String> startsWithc = (n) -> n.startsWith("c");
//        var result = al.All(n => n.StartsWith("c"));
////        name.stream()
////                .filter(startsWithc)
////                .forEach((n) -> System.out.print("\nName, which starts with 'c' " + n));
//
//
//        System.out.println(obj1.getName().startsWith("c"));
//
//
//
//        al.sort((Employee a, Employee b)->a.getLastname().compareTo(b.getLastname()));
//        al.forEach((s)->System.out.println(s));

    }




}



//
//    }