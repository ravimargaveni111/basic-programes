package linkedLIst;

public class LinkedList {
	Node head = null;
	Node current = null;

	void push(int data) {

		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
			// System.out.println(head.data);
		} else {
			current.nextNode = n;
			current = n;

		}
	}
	
//removing a element
  int remove(int data) {
	  Node t=null;
	  Node n=head;
	  if(head.data==data) {
		  head=head.nextNode;
	  }
	  while(n!=null) {
		  if(n.data==data) {
			  t.nextNode=n.nextNode;
			  break;
		  }
		  t=n;
		  n=n.nextNode;
	  }
	  return data;
  }
  
 // maximum element in list
  int max() {
	  int max=head.data;
	  Node temp=head;
	  while(temp!=null) {
		  if(temp.data>max) {
			  max=temp.data;
		  }
		  temp=temp.nextNode;
	  }
	  return max;
  }
 //size of list
  int size() {
	  int size=0;
	  Node temp=head;
	  while(temp!=null) {
		size++;
		temp=temp.nextNode;
		
	  }
	  return size;
  }
  //min element in list
  int min() {
	  int min=head.data;
	  Node temp=head;
	  while(temp!=null) {
		  if(temp.data<min) {
			  min=temp.data;
		  }
		  temp=temp.nextNode;
	  }
	  return min;
  }
	void display() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.nextNode;
		}

	}
}
