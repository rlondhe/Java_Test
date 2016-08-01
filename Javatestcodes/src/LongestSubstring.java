import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {

	public static int main(String[] args) {
		
		System.out.println("Enter a string:");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		    
		    int max = 0;
		 
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		    int start=0;
		 
		    for(int i=0; i<s.length(); i++){
		        char c = s.charAt(i);
		        if(map.containsKey(c)){
		            max = Math.max(max, map.size());    
		            while(map.containsKey(c)){
		                map.remove(s.charAt(start));
		                start++;
		            }
		 
		            map.put(c, i);
		        }else{
		            map.put(c, i);
		        }
		    }
		 
		    max = Math.max(max, map.size());  
		 
		    return max;
		}
		
		

	}


