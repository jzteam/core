package core.cn.jzteam.cpu;

public class CpuTest {

    public static void main(String[] args) {
        CpuRunnable cpuRunnable = new CpuRunnable();
        new Thread(cpuRunnable).start();
        new Thread(cpuRunnable).start();
        // new Thread(cpuRunnable).start();
        // new Thread(cpuRunnable).start();
    }

    static class CpuRunnable implements Runnable {

        public void run() {
            int sum = 0;
            while (sum <= 10000) {
                sum += 1;

                // System.out.println(Thread.currentThread().getName() + ":" +
                // sum);

                if (sum == 10000) {
                    sum = 0;
                }
            }
        }

    }

}
