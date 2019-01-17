public class Cloning{
    public static void main(String[] args) throws CloneNotSupportedException{
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;

//        Abc obj1 = obj;
        Abc obj1 = (Abc)obj.clone();
        obj1.j = 10;
        System.out.println(obj);
        System.out.println(obj1);
    }
}

class Abc implements Cloneable{
    int i, j;

    @Override
    public String toString() {
        return "Abc[i=" + i + "j=" + j + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}