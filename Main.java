import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();

    p1.setX(5);
    p2.setY(10);

    p1.setX(10);
    p2.setY(5);


    Dog d = new Dog();
    d.breed = "blabla";
    d.color = "brown";
    d.size = 23.7;
  }
  public static void main(String[] args)
  {
    Dog d = new Dog();
    d.setBreed("weiner dog");
    d.setName("tommy");
    d.setColor("red");
    d.setWeigh(100);
  }
  public static void createDog(Dog inDog. String breed, String name, String color, double weight)
  {
    inDog.setBreed(breed);
    inDog.setName(name);
    inDog.setColor(color);
    inDod.setWeight(weight);
  }
  public static void main(String[] args)
  {
    Dog d = new Dog();
    createDog(d, "chihuahua", "tommy", "red", 100);
  }
  Dog dog3 = new Dog();
  createDog(dog3, "golden retriver", "trong", "brown")
}
