public class DogTypes{
    public static void main(String[] args){

        ConditionDog d1 = new ConditionDog();
        d1.size = 80;

        ConditionDog d2 = new ConditionDog();
        d2.size = 20;

        ConditionDog d3 = new ConditionDog();
        d2.size = 40;

        d1.bark();
        d2.bark();
        d3.bark();
    }
}