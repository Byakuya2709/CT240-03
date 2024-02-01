package TH2;

public class Consumer extends Thread {
	private Warehouse warehouse;
	public Consumer(Warehouse warehouse) {
	        this.warehouse = warehouse;
	    }
 @Override
	    public void run() {
	        while (true) {
	            try {
	                Thread.sleep(3000); 
	                warehouse.consume();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
