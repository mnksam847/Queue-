

/fifo
class queuee {
	int[] array;
	int front;
	int end;

	public queuee() {

		array = new int[5];
		front = 0;
		end = 0;

	}

	public queuee(int n) {
		 array = new int[n];
		 front = 0;
		end = 0;
	}

	public void enqueue(int n) throws Exception {
		if (isfull()) {
			throw new Exception("queue is full");
		}
		
		array[end] = n;
		end++;
	}

	public int dequeue() throws Exception {
		if (isempty()) {
			throw new Exception("queue is empty");
		}
		int i = array[0];

		for (int j = 0; j < end-1; j++) {
			array[j] = array[j + 1];
		}
//		array[end] = 0;
		end--;
//	front++;
		return i;
	}

	public boolean isfull() {
		return end == array.length;
	}

	public boolean isempty() {
		return size() == 0;
	}

	public int getfront() {
		return array[front];
	}

	public void display() {
		System.out.println("****************************");
		for (int i = 0; i < end; i++) {
			System.out.print(array[i]+" < ");
		}
		System.out.println();
		System.out.print("****************************");
	}

	public int size() {
		return end;
	}
}

public class queue {
	public static void main(String[] args) throws Exception {
queuee m=new queuee();
//m.getfront();
m.enqueue(1);
m.enqueue(2);
//System.out.println(m.size());
m.enqueue(3);
m.enqueue(4);
m.enqueue(5);
m.display();
System.out.println(m.dequeue());
m.display();
m.dequeue();
m.enqueue(1);
m.display();
m.dequeue();
m.enqueue(2);
m.display();


	}
}
