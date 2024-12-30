public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); <-- error
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        Owl hedwing = new Owl();

        wagyu.sound();
        donald.sound();
        burin.sound();
        hedwing.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        PekingDuck fourseasons = new PekingDuck("4ss");
        fourseasons.clean(daisy);
        fourseasons.fly();
        fourseasons.beCrispy();

        donald.clean(new Cow());
    }
}
