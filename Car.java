import java.util.Scanner;
import java.util.ArrayList;
import java.time.*;

class Car{

public static void main(String[] args) {
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter Name, Age, Salary");
  String name = myObj.nextLine();
  Integer age = myObj.nextInt();
  Double salary = myObj.nextDouble();
  LocalDate myTime = LocalDate.now();



  System.out.println("Hello, Name " + name);
  System.out.println("Hello, Age " + age);  
  System.out.println("Hello, Salary " + salary);
  System.out.println(myTime);
  myObj.close();


  ArrayList<String> cars = new ArrayList<String>();
  cars.add("Volvo");
  cars.add("Benzi");
  cars.add("Audi");

  System.out.println(cars);
  String item = cars.get(2).toUpperCase();
  System.out.println(item);

}
}