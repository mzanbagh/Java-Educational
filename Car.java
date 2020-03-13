import java.util.Scanner;
import java.util.ArrayList;
import java.time.*;

class Car{

public static void main(String[] args) {
  
  //creating scanner object for user input
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter Name, Age, Salary");
  String name = myObj.nextLine();
  Integer age = myObj.nextInt();
  Double salary = myObj.nextDouble();

  // Print Local time using myTime Object
  LocalDate myTime = LocalDate.now();

  //Print user input & time
  System.out.println("Hello, Name " + name);
  System.out.println("Hello, Age " + age);  
  System.out.println("Hello, Salary " + salary);
  System.out.println(myTime);
  
  //close object
  myObj.close();

  // Creating arrayList object & add items
  ArrayList<String> cars = new ArrayList<String>();
  cars.add("Volvo");
  cars.add("Benzi");
  cars.add("Audi");
  
  //print objects in array
  System.out.println(cars);
  
  //upper case item 2 in array & print
  String item = cars.get(2).toUpperCase();
  System.out.println(item);

}
}