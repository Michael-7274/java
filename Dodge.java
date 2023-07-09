import java.io.*;
class Animal
{
void print()
{
System.out.println("Superclass Animal");
}
}
public class Dodge extends Animal
{
void print()
{
System.out.println("Subclass Dog");

}
public static void main(String args[])
{
Animal animal = new Animal();
Dodge dog = new Dodge();
animal.print();
dog.print();
}
}