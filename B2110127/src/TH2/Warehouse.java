package TH2;

import java.io.IOException;
import java.util.Scanner;

public class Warehouse {
	protected int max;
	protected int product;
	public Warehouse(int max) {
		this.product=0;
		this.max=max;
	}
	 public synchronized void produce() {
		 while (product == max) {
			 try {
				System.out.println("Kho đầy - ngưng sản xuất");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	            product++;
	            System.out.println("Sản xuất sản phẩm #" + product);
	            notifyAll();
	    }
	 public synchronized void consume() {
		 		while (product == 0) {
					 try {
						System.out.println("Kho hết hàng, tạm dừng tiêu thụ");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
		 		 
	            System.out.println("Tiêu thụ sản phẩm #" + product);
	            product--;
	            notifyAll();
	    }

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException, IOException{
	
		       System.out.println("Nhấn Enter để bắt đầu - bấm phím 1 để kết thúc.");
		       System.in.read();
		       
		        Warehouse warehouse = new Warehouse(5);
		        Thread producerThread = new Thread(new Producer(warehouse));
		        Thread consumerThread = new Thread(new Consumer(warehouse));
		       
		        producerThread.start();
		        consumerThread.start();
		
		        int i=System.in.read();
		        if(i==1) {
		        	System.exit(0);
				
		        }
	
		    
		      
		    
		}}
