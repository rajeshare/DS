import java.util.ArrayList;

class CustomHashMap<K,V> {
	 private ArrayList<HashNode<K,V>> buckets;
	 private int bucketSize;
	 private int size;
	 
	 
	 public CustomHashMap() {
		 buckets=new ArrayList();
		 bucketSize=10;
		 size=0;
		 for(int i=0;i<bucketSize;i++) {
			 buckets.add(null);
		 }
	 }
	 
	 
	 public int size() {
		 return size;
		 
	 }
	 public boolean isEmpty() {
		 return size()==0;
	 }
	 
	 public void add(K k,V v) {
		 
		 
		 int hash =bucketIndex(k);
		 
		 
	        HashNode<K, V> head =buckets.get(hash); 

	        while (head != null) 
	        { 
	            if (head.k.equals(k)) 
	            { 
	                head.v = v; 
	                return; 
	            } 
	            head = head.next; 
	        } 
	  
		 size++;
		 
		 	HashNode<K,V> hashNode=new HashNode(k, v);
		 	
		 	hashNode.next=head;
		 	
		 	buckets.set(hash, hashNode);
		 	
		 	if(1.0*size/bucketSize>=0.7) {
	            ArrayList<HashNode<K, V>> temp = buckets; 
	            buckets = new ArrayList<>();
	            
	            bucketSize=2*bucketSize;
	            size=0;
	            for (int i = 0; i < bucketSize; i++) 
	            	buckets.add(null); 
	            
	            
	            for (HashNode<K, V> headNode : temp) 
	            { 
	                while (headNode != null) 
	                { 
	                    add(headNode.k, headNode.v); 
	                    headNode = headNode.next; 
	                } 
	            } 
		 	
		 	}
		 	
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 public int bucketIndex(K k) {
		int hash= k.hashCode();
		 return hash%bucketSize;
	 }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class HashNode<K,V>{
	
	K k;
	V v;
	HashNode<K,V> next;
	
	HashNode(K k,V v){
		this.k=k;
		this.v=v;
	}
}