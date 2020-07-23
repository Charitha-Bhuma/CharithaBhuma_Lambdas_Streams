package Lambda;


import java.util.*; 
import java.util.function.Predicate; 

class StartWithA { 
    public static void main(String args[]) { 
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter number of strings : ");
    	int n = sc.nextInt(); 
        List<String> array = new ArrayList<String>(); 
        int i;
        System.out.println("Enter strings : ");
        for(i = 0; i < n; i++) {
        	array.add(sc.next());
        }
        List<String> finalList = filterStrings(array, (String s) -> s.startsWith("a") && s.length() == 3);
        System.out.println("The final list is : " + finalList);
    }
    public static List<String> filterStrings(List<String> array, Predicate<String> predicate) {
    	List<String> finalList = new ArrayList<>();
    	for(String st : array) {
    		if(predicate.test(st)) {
    			finalList.add(st);
    		}
    	}
    	
    	return finalList;
    }
}
