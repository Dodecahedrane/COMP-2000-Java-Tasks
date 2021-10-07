public class stopwatch {
    private long start = 0;
    private long stop = 0;
    private boolean run = false;


    public void start() {
        start = System.currentTimeMillis();
        run = true;
    }


    public void stop() {
        stop = System.currentTimeMillis();
        run = false;
    }

    public void printTimeSecs() {
        long elapsed;
        if (run) {
            elapsed = ((System.currentTimeMillis() - start) / 1000);
        } else {
            elapsed = ((stop - start) / 1000);
        }
        System.out.println(elapsed);
    }


}
