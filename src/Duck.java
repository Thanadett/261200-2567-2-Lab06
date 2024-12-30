public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name;
    }

    public String toString() {
        return "เป็ด : " + this.name;
    }

    @Override
    void sound() {
        System.out.println("quack quack (ก๊าบ ก๊าบ)");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb (พรึ่ม ๆ)");
    }

    @Override
    public void glide() {
        System.out.println("hi-yahhh!");
    }

    void clean(Animal animal){
        System.out.println(this + " is cleaning " + animal.toString());
    }
}
