package my.project.module1;

public class SpotlessDemo {

    public void method() {
        System.out.println("Hello");

        // indent this line more and run spotless apply, it should remove redundant spaces
        System.out.println("World");
    }

}
