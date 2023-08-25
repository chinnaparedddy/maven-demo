package org.example;

import org.example.demo.Demo;
import org.example.demo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Demo demo = new Demo(101,"Naresh","Gari",new Employee(200,"Prashanta","PH",20000));

        System.out.println(demo);
        System.out.println("Sucessfully");
    }
}
