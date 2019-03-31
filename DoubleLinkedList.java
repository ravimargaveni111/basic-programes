package linkedLIst;

public class DoubleLinkedList {
	Node1 current = null;
	Node1 head = null;

	void push(int data) {
		Node1 n = new Node1();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextNode = n;
			n.previous = current;
			current = n;
		}

	}

//removing last node which we added
	void pop() {
		Node1 n = current;
		current = n.previous;
		current.nextNode = null;
	}

	// removing node based on data
	int remove(int data) {
		Node1 t = null;
		Node1 n = head;
		while (n != null) {
			if (n.data == data) {
				t.nextNode = n.nextNode;
				break;
			}
			t = n;
			n = n.nextNode;
		}
		return data;
	}

//	 number of nodes in list
	int size() {
		int size = 0;
		Node1 temp = head;
		while (temp != null) {
			size++;
			temp = temp.nextNode;
		}
		return size;
	}

	// maximum element in list
	int max() {
		int max = head.data;
		Node1 temp = head;
		while (temp != null) {
			if (temp.data > max) {
				max = temp.data;
			}
			temp = temp.nextNode;
		}
		return max;
	}

	// min element in list
	int min() {
		int min = head.data;
		Node1 temp = head;
		while (temp != null) {
			if (temp.data < min) {
				min = temp.data;
			}
			temp = temp.nextNode;
		}
		return min;
	}

	void disply() {
		Node1 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.nextNode;
		}
	}

	void displyReverse() {
		Node1 n = current;
		while (n != null) {
			System.out.println(n.data);
			n = n.previous;
		}

	}

}
