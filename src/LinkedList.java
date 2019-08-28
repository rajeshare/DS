public class LinkedList {
	public static void main(String[] args) {
		LinkedListNode l = new LinkedListNode();
		l.addLast(11);
		l.addLast(12);
		l.addLast(13);
		l.addLast(14);
		l.addLast(15);
		l.addLast(16);
		l.addLast(17);
		l.addLast(18);
		l.addLast(19);
		l.addLast(20);

		//l.print();
	//	l.reverse();
		//l.print();
		
		LinkedListNode res=alternateNumber(l);
		
		res.print();
	}
	
	public static LinkedListNode alternateNumber(LinkedListNode list) {
		
		Node1 cur=list.head;
		Node1 slow=cur;
		Node1 fast=cur;
		
	
		while(slow.n!=null&&fast!=null&&fast.n!=null&&fast.n.n!=null) {
			slow=slow.n;
			fast=fast.n.n;
		}
		
		Node1 node2=slow;
		Node1 prv=null,nex;
		while(node2!=null) {
			nex=node2.n;
			node2.n=prv;
			prv=node2;
			node2=nex;
		}
		
		 node2=prv;
		
		
		LinkedListNode res=new LinkedListNode();
		
		
		
		while(cur!=null && node2!=null) {
			
			res.addLast(cur.d);
			res.addLast(node2.d);
			cur=cur.n;
			node2=node2.n;
			
		}
		return res;
		
	}
	

}

class Node {
	int d;
	Node1 n;

	Node(int a) {
		this.d = a;
		this.n = null;
	}
}

class LinkedListNode {

	Node1 head, tail;
	int size;

	public Node1 addLast(int a) {
		Node1 node = new Node1(a);
		Node1 cur=head,prev = null;
		if(head==null) {
			head=node;
			return head;
		}
		while(cur!=null) {
			prev=cur;
			cur=cur.n;
		}
		prev.n=node;
		return head;
	}

	
	public Node1 addFirst(int a) {
		Node1 node = new Node1(a);
		
		node.n=head;
		head=node;
		
		return head;
	}
	
	
	
	public void print() {
		Node1 cur = head;
		System.out.println("print head");
		while (cur != null) {
			System.out.println(cur.d);
			cur = cur.n;
		}
	}
	
	public String toString() {
		Node1 cur = head;
		System.out.println("print head");
		while (cur != null) {
			System.out.println(cur.d);
			cur = cur.n;
		}
		return cur.toString();
	}

	// 1->2->3

	public Node1 reverse() {
		Node1 cur=head,prev = null,next;
		
		while(cur!=null) {
			next=cur.n;
			cur.n=prev;
			prev=cur;
			cur=next;
		}
		
		head=prev;
		
		return head;
	}
}
