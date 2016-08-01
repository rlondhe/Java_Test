import java.util.Scanner;

//building a linkedlist
public class Node extends linkedlist {

	 protected int data;
	 protected Node link;
	
public Node(){
	data=0;
	link=null;	
	}
public Node(int a, Node n){
	data=a;
	link=n;
}
public void setlink(Node n){
	link=n;
}
public void setdata(int a){
	data=a;
}
public Node getlink(){
	return link;
}
public int getData(){
	return data;
}


 public static void main(String[] args)
		    {             
		        Scanner s = new Scanner(System.in);
		        linkedlist list = new linkedlist(); 
		        System.out.println("Singly Linked List is:");
		        linkedlist.insertAtStart(s.nextInt());
		        linkedlist.insertAtEnd(s.nextInt());
		        linkedlist.insertnode(s.nextInt(),s.nextInt());
		        linkedlist.display();
		    }
		
		
		
		
		    }
		
	
	