package linkedLIst;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.push(5);
		a.push(3);
		a.push(2);
		a.push(9);
		a.push(25);
		a.push(201);
		System.out.println("elements in list");
		// a.remove(5);
		a.display();

		System.out.println("removing element : " + a.remove(25));

		System.out.println("elements in list after removing element 25 are :");
		a.display();
		System.out.println("maximum element in list  : " + a.max());
		System.out.println("minimum element in list  : " + a.min());
		System.out.println("size of list   : " + a.size());

	}
}
