package trie;

public class Trie2Example {

	public static void main(String[] args) {
		
		Trie2 t=new Trie2();
		
		t.insert("raj");
		
		System.out.println(t.get("raj"));

	}

}

class Trie2 {
	Trie2Node root;
	
	public Trie2() {
		root =new Trie2Node();
	}

	public boolean get(String string) {
		
		Trie2Node cur=root;
		int index;

		for(int level=0;level<string.length();level++) {
			
			index=string.charAt(level)-'a';
			
			if(cur.child[index]!=null) {
				cur=cur.child[index];
			}
		}
		
		return (cur!=null&&cur.endofword);
		
	}

	public void insert(String string) {
		
		int index;
		Trie2Node cur=root;

		for(int level=0;level<string.length();level++) {
			
			index=string.charAt(level)-'a';
			
			if(cur.child[index]==null) {
				cur.child[index]=new Trie2Node();
			}
			cur=cur.child[index];
		}
		cur.endofword=true;
		
	}

}

class Trie2Node {
	boolean endofword;
	Trie2Node[] child;

	public Trie2Node() {
		child = new Trie2Node[26];
	}
}
