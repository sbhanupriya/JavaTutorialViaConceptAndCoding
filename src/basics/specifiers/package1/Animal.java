package basics.specifiers.package1;

public class Animal {
 public boolean canFly;
 protected String name ;
 public String category;
 protected Animal()
 {

 }
 public Animal(String n, boolean canFly)
 {
  this.category = n;
  this.canFly = canFly;
  this.name = n;
 }
 public void printAnimal()
 {
  System.out.println("I am " + category);
  System.out.println("Can I fly "+ canFly);
 }
}
