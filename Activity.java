public class Activity {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.setName("kwek");
        puppy.bark();

        puppy.addPuppy("eli");
        puppy.addPuppy("za");
        puppy.addPuppy("ja");

        System.out.println("Number of puppies: " + puppy.showNumOfPuppies()); 
        puppy.showPuppies(); 
    }
}