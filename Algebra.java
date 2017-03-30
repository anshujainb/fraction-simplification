import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Algebra {
		 public Map<Character,Integer> countRepeat(String s1 ) {
			
			char[] ch= s1.toCharArray();
			//char[] ch2=s2.toCharArray();
			int count=0;
			int j=0;
			int flag=0;
			HashMap<Character,Integer> charArr = new HashMap<>();
			int[] counted= new int[ch.length]; // array of checked elements for repetition

			for(char x:ch){      //traversing the main array
				for(int m=0; m<ch.length; m++){  // traversing the checked elements' array i.e. "counted" 
					if(x==counted[m]){      // if no. is already checked
						flag=1;
					}
				}
					if(flag==0){
						for(int i=0; i<ch.length; i++){ //if no is not checked then count for no of repetitions
							if(x==ch[i]){
								count++;
							}
					
						}
					
						//System.out.println("repeats of "+ x +" is " + count);
						charArr.put(x, count);
						

						}
					
					
				if(j<ch.length){ //copying the checked elements into "counted" array
					counted[j]=x;
					j++;
					
				}
				count=0;
				flag=0;
			}
			
			Map<Character,Integer > sortedArr = new TreeMap<>(charArr);
			//print(sortedArr);
			return sortedArr;
			
		}
		 
		 public void print(Map<Character,Integer> sortedArr){
			  Iterator<Character> keySetIterator = sortedArr.keySet().iterator(); 
			 while(keySetIterator.hasNext()){ 
			 Character key = keySetIterator.next(); 
			 System.out.println("key: " + key + " value: " + sortedArr.get(key)); 
			 }
		 }
		
		
			
		public void CheckCommonElement(Map<Character,Integer>Map1,Map<Character,Integer>Map2,char[] ch1, char[] ch2){
			ArrayList<Character> arrayList1 = new ArrayList<>();
			ArrayList<Character> arrayList2 = new ArrayList<>();
			for(char c: ch1){
				arrayList1.add(c);
			}
			for(char c: ch2){
				arrayList2.add(c);
			}
		//	ArrayList<char[]> arrayList2 = new ArrayList<>(Arrays.asList(ch2));
			
			for (char y : Map1.keySet())
	        {
	            if (Map2.containsKey(y)) {  //comparing map1 keys with map2
	            		if(Map1.get(y)>Map2.get(y)){ //comparing values of keys of map1 and map2
	            			int j=Map2.get(y);
	            			while(j>0){
	            				
	            				int i=arrayList2.indexOf(y);
	            				arrayList2.remove(i);
	            				int k=arrayList1.indexOf(y);
	            				arrayList1.remove(k);
	            				j--;
	            				
	            				
	            			}
	            			
	            		}
	            		
	            		else if(Map1.get(y)<Map2.get(y)){
	            			int j=Map1.get(y);
	            			while(j>0){
	            				
	            				int i=arrayList2.indexOf(y);
	            				arrayList2.remove(i);
	            				int k=arrayList1.indexOf(y);
	            				arrayList1.remove(k);
	            				j--;
	            			}
	            			
	            		}
	            		
	            		else{
	            			int j=Map1.get(y);
	            			while(j>0){
	            				
	            				int i=arrayList2.indexOf(y);
	            				arrayList2.remove(i);
	            				int k=arrayList1.indexOf(y);
	            				arrayList1.remove(k);
	            				j--;
	            			}
	            			
	            		}
	            		
	            }
	        }
			for(char c: arrayList1){
            	System.out.print("Numerator:"+c);
            }
            System.out.println();
            
            for(char c: arrayList2){
            	System.out.print("Denominator:"+c);
            }
		}
}
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            		
	            			
	            
	         
	            
	            
	        
		
	        
	        
			
		 
	     
		
	        



		/*else if(Map1.get(y)<Map2.get(y){
		int j=Map1.get(y);
		while(j>0){
			
			int i=arrayList2.indexOf(y);
			arrayList2.remove(i);
			int k=arrayList1.indexOf(y);
			arrayList1.remove(k);
			j--;
		}
	
	}
		
	else{
		int j=Map1.get(y);
		while(j>0){
			
			int i=arrayList2.indexOf(y);
			arrayList2.remove(i);
			int k=arrayList1.indexOf(y);
			arrayList1.remove(k);
			j--;
		}
	}*/





