package at.htlgkr.pos.gaert;

public class RunnableTask implements Runnable {
    private String name;
    public RunnableTask(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + ": " + System.currentTimeMillis());
    }
}
