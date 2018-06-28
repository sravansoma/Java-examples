public class Dog{
    String name;

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommmy";
        d1.bark();

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = d1;

        myDogs[0].name = "Ruby";
        myDogs[1].name = "Marge";

        System.out.print("Last dog name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + "says Rufffffff!");
    }
}