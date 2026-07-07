import java.io.*;
import java.io.Serializable;


class Student implements Serializable {
int id;
String name;


Student(int id, String name) {
 this.id = id;
 this.name = name;
}
}


public class SerializeExample {
public static void main(String[] args) {
 try {
  Student s = new Student(101, "Rahul"); 


  FileOutputStream file = new FileOutputStream("student.ser");
  ObjectOutputStream out = new ObjectOutputStream(file);


  out.writeObject(s);   // Serialize object
  out.close();
  file.close();


  System.out.println("Object serialized successfully");
 } catch (Exception e) {
  System.out.println(e);
 }
}
}
