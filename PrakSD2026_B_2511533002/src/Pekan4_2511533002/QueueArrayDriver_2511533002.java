package Pekan4_2511533002;

public class QueueArrayDriver_2511533002 {

	public static void main(String[] args) {
		QueueArray_2511533002 queue = new QueueArray_2511533002 (1000);
		queue.enqueue_2511533002(10);
		queue.enqueue_2511533002(20);
		queue.enqueue_2511533002(30);
		queue.enqueue_2511533002(40);
		System.out.println("item di depan " + queue.front_3002 () );
		System.out.println("item di belakang " + queue.rear_3002() );
		System.out.println("tampilkan queue");
		queue.display_2511533002();
		System.out.println();
		System.out.println(queue.dequeue_3002() + " dihapus dari queue");
		System.out.println("item di depan " + queue.front_3002 () );
		System.out.println("item di belakang " + queue.rear_3002() );
		System.out.println("tampilkan queue setelah satu data dihapus");
		queue.display_2511533002();
		 
		
		
	}

}