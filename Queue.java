import java.util.Scanner;

public class Queue {

	static QueueClass obj = new QueueClass();

	public static void main(String[] args) {

		int val = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================" + "\n Please enter your choice" + "\n 1. Add element in Queue"
				+ "\n 2. Remove element from Queue" + "\n 3. Display Queue" + "\n 4. Exit"
				+ "\n===========================");
		val = sc.nextInt();

		switch (val) {
		case 1:
			System.out.println("Enter the element ");
			int temp = sc.nextInt();
			obj.EnQueue(temp);
			main(null);
		case 2:
			obj.DeQueue();
			main(null);
		case 3:
			obj.Display();
			main(null);
		case 4:
			System.out.println("--------Thank You--------");
			return;
		}

	}

}

class QueueClass extends Queue {
	int size = 5;
	int arr[] = new int[size];
	int front, rare;

	QueueClass() {
		front = -1;
		rare = -1;
	}

	public boolean isFull() {
		if ((front == 0) & (rare == size - 1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void EnQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		} else {
			if (front == -1) {
				front = 0;
			}
			rare++;
			arr[rare] = value;
			System.out.println(value + " is added successfully");

		}

	}

	public void DeQueue() {
		int value;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		} else {
			value = arr[front];
			if (front >= rare) {
				front = -1;
				rare = -1;
			} else {
				front++;
			}
		}
		System.out.println(value + " is deleted successfully");
	}

	public void Display() {

		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		} else {
			System.out.println("Elements in Queue:- ");
			for (int i = front; i <= rare; i++) {
				System.out.println(arr[i]);
			}
		}

	}

}
