package io.codelex.classesandobjects.practice.Exercise7;

/*
Change the dog class to include a method boolean hasSameMotherAs(Dog otherDog). The method should return true on the call
referenceToCoco.hasSameMotherAs(referenceToRocky). Show that the new method works in the DogTest main method.
 */

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        max.setMother(molly);
        max.setFather(rocky);
        coco.setMother(molly);
        coco.setFather(buster);
        rocky.setMother(molly);
        rocky.setFather(sam);
        buster.setMother(lady);
        buster.setFather(sparky);

        System.out.println(coco.fathersName()); // expect Buster
        System.out.println(sparky.fathersName()); // expect Unknown

        System.out.println(max.hasSameMotherAs(coco)); //expect true
        System.out.println(max.hasSameMotherAs(rocky)); //expect true
        System.out.println(coco.hasSameMotherAs(buster)); //expect false
    }
}
