package basics.specifiers.package2;

import basics.specifiers.package1.Animal;

public class Bird extends Animal {
    public boolean hasFeathers;

    public Bird(String name)
    {
        super(name, Boolean.TRUE);
        hasFeathers = Boolean.TRUE;
    }
    public void printBird()
    {
        printAnimal();
        System.out.println("In child class, printing protected property");
        System.out.println("name" + name);
    }


}
