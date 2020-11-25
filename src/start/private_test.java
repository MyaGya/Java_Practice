package start;
class Updater {
    public void update(private_test counter) {
        counter.count++;
    }
}


public class private_test {
    int count = 0;
    public static void main(String[] args) {
        private_test myCounter = new private_test();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
