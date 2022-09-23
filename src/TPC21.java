import kr.tpc.*;

public class TPC21 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();
        
        // Dog.class, Cat.class
        Animal ani = new Dog(); //upcasting
        ani.eat();

        ani = new Cat();
        ani.eat();
        //ani.night();
        ((Cat)ani).night(); //down casting


    }
}
