//one of the key feature is lambda expression and functional interface

import java.util.Arrays;
import java.util.List;

public class code_v8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jim", "Jill");

        // Using lambda expression with the forEach method
        names.forEach(name -> System.out.println(name));
    }
}
//In this example, we have a list of names. The forEach method is used to iterate over the list.
// The lambda expression name -> System.out.println(name) is passed to the forEach method,
// which prints each name in the list

//Default and Static Methods in Interfaces:
//      Java 8 allows the addition of default and static methods in interfaces

public interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is a default method");
    }

    static void staticMethod() {
        System.out.println("This is a static method");
    }
}
