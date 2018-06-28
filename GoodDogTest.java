public class GoodDogTest{

    public static void main(String[] args) {
        GoodDog dogOne = new GoodDog();

        int dogSize = 60;
        dogOne.setSize(dogSize);

        System.out.println("first dog size is:" + dogOne.getSize());
        dogOne.bark();
    }
    

}