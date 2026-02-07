interface Animal{
    void sound();
}
class Dog implements Animal{
    public void soind(){
        System.out.println("Dog barks");
    }
}
public class InterfaceExample{
    public static void main(string[] args){
        Animal a new Dog();
        a.sound();
    }
}