
public class linkedlist {

	
		protected static Node start;
		protected static Node end;
		public static int size;
		
		linkedlist(){
			start=null;
			end= null;
			size=0;
		}
		public static void insertAtStart(int val)
	    {
	        Node nptr = new Node(val, null);    
	        size++ ;    
	        if(start == null) 
	        {
	            start = nptr;
	            end = start;
	        }
	        else 
	        {
	            nptr.setlink(start);
	            start = nptr;
	        }
	    }
		  public static void insertAtEnd(int val)
		    {
		        Node nptr = new Node(val,null);    
		        size++ ;    
		        if(start == null) 
		        {
		            start = nptr;
		            end = start;
		        }
		        else 
		        {
		            end.setlink(nptr);
		            end = nptr;
		        }
		    }
			public static void insertnode(int value, int pos ){
				 Node nptr = new Node(value, null);                
			        Node ptr = start;
			        pos = pos - 1 ;
			        for (int i = 1; i < size; i++) 
			        {
			            if (i == pos) 
			            {
			                Node tmp = ptr.getlink() ;
			                ptr.setlink(nptr);
			                nptr.setlink(tmp);
			                break;
			            }
			            ptr = ptr.getlink();
			        }
			        size++ ;
			    }
			
			
			public static void display()
		    {
		        System.out.print("\nSingly Linked List = ");
		        if (size == 0) 
		        {
		            System.out.print("empty\n");
		            return;
		        }    
		        if (start.getlink() == null) 
		        {
		            System.out.println(start.getData() );
		            return;
		        }
		        Node ptr = start;
		        System.out.print(start.getData()+ "->");
		        ptr = start.getlink();
		        while (ptr.getlink() != null)
		        {
		            System.out.print(ptr.getData()+ "->");
		            ptr = ptr.getlink();
		        }
		        System.out.print(ptr.getData()+ "\n");
		    }
	}


