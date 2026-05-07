package Pekan4_2511533002;

public class QueueArray_2511533002 {
	int front_3002,rear_3002,size_3002;
	int capacity_3002;
	int array_3002[];
	
	public QueueArray_2511533002(int capacity) {
		this.capacity_3002 = capacity;
		front_3002 = this.size_3002 = 0;
		rear_3002 = capacity - 1;
		array_3002 = new int [this.capacity_3002];
		
	}
	
	boolean isFull_2511533002 (QueueArray_2511533002 queue) {
		return (queue.size_3002 == queue.capacity_3002) ;
	
	}
	
	boolean isEmpty_2511533002 (QueueArray_2511533002 queue) {
		return (queue.size_3002 == 0) ;
		
	}
	
	void enqueue_2511533002 ( int item ) {
		if (isFull_2511533002 (this)) 
			return ;
		this.rear_3002 = (this.rear_3002 + 1 ) % this.capacity_3002;
		this.array_3002 [this.rear_3002] = item;
		this.size_3002 = this.size_3002 + 1;
		System.out.println(item + " enqueued to queue");
	}
	int dequeue_3002 () {
		if (isEmpty_2511533002 (this))
			return Integer.MIN_VALUE;
		int item = this.array_3002[this.front_3002];
		this.front_3002 = (this.front_3002 + 1 )  % this.capacity_3002;
		this.size_3002 = this.size_3002 - 1;
		return item;		
	}
	int front_3002() {
		if(isEmpty_2511533002(this) )
		return Integer.MIN_VALUE;
		
		return this.array_3002[this.front_3002];
		
	}
	int rear_3002() {
		if (isEmpty_2511533002(this))
			return Integer.MIN_VALUE;
		return this.array_3002 [this.rear_3002];
			
	}
	// mencetak elemen antrian
	void display_2511533002 () {
		int i_3002;
		if ( front_3002 == rear_3002) {
			System.out.println("\nAntrian kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for (i_3002 = front_3002; i_3002 < rear_3002; i_3002++) {
			System.out.printf(" %d <-- " , array_3002[i_3002]);
		}
		return;
	}

}