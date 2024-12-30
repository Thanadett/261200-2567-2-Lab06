public class PekingDuck extends Duck {

    public PekingDuck(String name) {
        super(name);
    }

    @Override
    void clean(Animal animal) {
        System.out.println("พี่แจ๊คครับ...");
    }

    void beCrispy() {
        System.out.println("Very crispy!!");
    }
}
