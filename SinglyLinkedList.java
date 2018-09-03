package lab4;

public class SinglyLinkedList {

	Node hn=null;
	
	public void insertFirst(int data){
		Node n = new Node(data);
		if(hn ==null) {
	      hn=n;    	
	    }else {	
		n.next = hn;
		hn = n;
	    }
	}
	
	public void insertLast(int data) {
		Node n = new Node(data);
		if(hn == null) {
		  hn=n;
		}else {
		Node t;
		t=hn;
		while(t.next!=null) {
			t=t.next;	
		}
		t.next=n;
		}
	}
	
	public void insertPos(int p,int data) {
		Node n = new Node(data);
		if(p==1 && hn ==null) {
			hn=n;
		}
		
		else if(p==1 && hn!=null) {
			insertFirst(data);
		}else {
			Node t;
			t=hn;
			for(int i=1;i<p-1;i++){
				t=t.next;
			}
			n.next=t.next;
			t.next=n;
		}
	}
	
	public void isEmpty() {
		if(hn==null) {
			System.out.println("is empty"); 
		}else {
			System.out.println("is not empty");
		}
	}
	public void print() {
		Node t = hn;
		while(t!=null) {
			System.out.println("data :"+t.data);
			t=t.next;
		}
	}
	
	public void delFirst() {
		if(hn==null) {
			System.out.println("no element exists");
		}else {
			Node t = hn;
			hn=hn.next;
			t.next=null;
		}
	}
		
	public void delLast(){
     if(hn==null) {
    	 System.out.println("no element exists");
     }else {
    	 Node t= hn;
    	 while(t.next.next!=null) {
    		 t=t.next;
    	 }
    	 t.next=null;
     }
	}
    
	public void delPos(int p) {
      if(hn==null) {
    	  System.out.println("no element exists");
      }else if(p==1) {
    	  delFirst();
      }
      else {
    	  Node t = hn;
    	  for(int i=1;i<p-2;i++) {
    		  t = t.next;
    	  }
    	  Node a = t.next;
    	  t.next=t.next.next; 
    	  a.next=null;
    	 
      }
	}
	
	public void sort(int data) {
		Node t= hn;
		Node n = new Node(data);
		int cnt = count();
		if(hn==null) {
			hn=n;
		}
		else{		
		int p=1;
		while(t.data<data && t.next!=null) {
			t=t.next;
			p++;
		}
		if(t.next==null&&t.data<data) {
			insertLast(data);
		}else {
		insertPos(p,data);
		}
		}
		
	}
		
      public void isLastElement() {
     
    	  Node t = hn;
    	  while(t.next!=null){
    		  t=t.next;
    	  }
    	  System.out.println("The last element is :"+t.data);
      }
      
      public int count() {
    	  Node t = hn;
    	  int cnt =0;
    	  while(t!=null) {
    		  t= t.next;
    	      cnt++;
    	  }
    	  return cnt;
      }
      
      public void fromEnd(int l) {
    	  int cnt= count();
    	  Node t = hn;
    	  int p = cnt-l+1;
    	  while(p-->1) {
    		  t = t.next;
    	  }
    	  System.out.println(t.data);
      }
      
      public void evenPos() {
    	  Node t = hn;
    	  int p=1;
    	  while(t.next!=null) {
    		  t=t.next;
    		  p++;
    	  
    	  if(p%2==0) {
    		  System.out.println(t.data);
    	  }
    	  }
      }
     
      public void delten() {
    	  Node t =hn;
    	  if(hn.data==10) {
    		delFirst();  
    	  }
    	  while(t.next.data!=10) {
    		  t= t.next;
    	  }
    	  Node p = t.next;
    	  t.next=t.next.next;
          p.next = null;
      }
      
      public void middle() {
    	  
      }
		
	
} 

