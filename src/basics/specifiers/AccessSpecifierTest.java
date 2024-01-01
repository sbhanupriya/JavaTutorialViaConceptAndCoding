package basics.specifiers;

import basics.specifiers.package1.Animal;
import basics.specifiers.package2.Bird;

public class AccessSpecifierTest {
    public static  void main(String[] args) {
        Animal animal = new Animal("Cat", Boolean.FALSE);
        animal.printAnimal();
        Bird bird = new Bird("Sparrow");
        bird.printBird();
    }
}
