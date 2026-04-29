package Pekan4_2511533002;

public class AntrianKafe_2511533002 {
    int front; 
    int rear;  
    int max;   
    String[] queue; 

    public AntrianKafe_2511533002(int kapasitas) {
        this.max = kapasitas;
        this.queue = new String[this.max];
        this.front = -1;
        this.rear = -1;
    }

    boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    boolean isFull() {
        return (rear == max - 1);
    }

    void enqueue(String namaPelanggan) {
        if (isFull()) {
            System.out.println("Antrian penuh! Mohon tunggu pesanan lain selesai.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = namaPelanggan;
            System.out.println("Pesanan atas nama " + namaPelanggan + " masuk ke antrian.");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada pesanan untuk diproses.");
        } else {
            String pesananSelesai = queue[front];
            System.out.println("Pesanan atas nama " + pesananSelesai + " telah selesai dibuat.");
            front++; 

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Antrian pesanan kosong!");
        } else {
            System.out.println("Daftar Antrian Pesanan:");
            int nomor = 1;
            for (int i = front; i <= rear; i++) {
                System.out.println(nomor + ". " + queue[i]);
                nomor++;
            }
        }
    }

    void Reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dibalik.");
        } else {
            int i = front;
            int j = rear;
            while (i < j) {
                String temp = queue[i];
                queue[i] = queue[j];
                queue[j] = temp;
                i++;
                j--;
            }
            System.out.println("Urutan antrian pesanan berhasil dibalik.");
        }
    }
}