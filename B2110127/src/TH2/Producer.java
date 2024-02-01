package TH2;

public class Producer extends Thread {
	protected Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                warehouse.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
		
}
