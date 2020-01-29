
class queuee1 {
	int[] array;
	int front;
	int end;

	public queuee1() {

		array = new int[5];
		front = 0;
		end = 0;

	}

	public queuee1(int n) {
		array = new int[n];
		front = 0;
		end = 0;
	}

	public void enqueue(int n) throws Exception {
		if (isfull()) {
			throw new Exception("queue is full");
		}

		array[(front + end) % array.length] = n;
		end++;
	}

	public int dequeue() throws Exception {
		if (isempty()) {
			throw new Exception("queue is empty");
		}
		int n = array[front];
		front = (front + 1) % array.length;
		end--;
		System.out.println("---------------");
		return n;
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
			int idx = (i + front) % array.length;
			System.out.print(array[idx] + " < ");
		}
		System.out.println();
//			System.out.print("****************************");
	}

	public int size() {
		return end;
	}
}

public class circularqueue {
	public static void main(String[] args) throws Exception {
		queuee1 m = new queuee1();
		// m.getfront();
		m.enqueue(1);
		m.enqueue(2);
		// System.out.println(m.size());
		m.enqueue(3);
		m.enqueue(4);
		m.enqueue(5);
		m.display();
		System.out.println(m.dequeue() + ".......");
		m.display();
		System.out.println(m.dequeue());

//			m.display();
//			System.out.println("---------------");
		m.dequeue();
		m.display();

		m.enqueue(1);
		m.display();
		m.dequeue();
		m.display();
		m.enqueue(2);
		m.display();

		m.display();

	}
}
