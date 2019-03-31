package linkedLIst;

public class DoubleLinkedListTest {
	public static void main(String[] args) {
		DoubleLinkedList a = new DoubleLinkedList();
		a.push(25);
		a.push(222);
		a.push(1);
		a.push(2);
		System.out.println("elements in list");
		a.disply();
		System.out.println("elements in reverse order");
		a.displyReverse();
		// a.remove(25);
		System.out.println("elements in list after removing (by giving data)");
		a.remove(222);
		a.disply();

		System.out.println("elements after removeing some elements");
		a.pop();
		a.pop();
		a.pop();
	//	a.pop();
		a.disply();
	}
}
