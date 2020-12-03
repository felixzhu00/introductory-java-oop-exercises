import java.util.ArrayList;
import java.util.Scanner;
public class Lab25Part2{
	public static ArrayList<String> mergeList(ArrayList<String> lst1,ArrayList<String> lst2){
		ArrayList<String> merge = new ArrayList<String>();
		merge.addAll(lst1);
		merge.addAll(lst2);
		
		for(int i = 0; i < merge.size()-1; i++) {
			for(int j = 0; j < merge.size()-i-1; j++) {
				if(merge.get(j).compareTo(merge.get(j+1)) > 0) {
					String temp = merge.get(j);
					merge.set(j, merge.get(j+1));
					merge.set(j+1, temp);
				}
			}
		}
		return merge;
	}
	public static void main(String[] args) {
		ArrayList<String> lst1 = new ArrayList<String>();
		lst1.add("Austin");
		lst1.add("Dallas");
		lst1.add("San Francisco");

		ArrayList<String> lst2 = new ArrayList<String>();
		lst2.add("Boston");
		lst2.add("Chicago");
		lst2.add("Denver");
		lst2.add("Seattle");
		
		ArrayList<String> lst3 = mergeList(lst1,lst2);
		
		for(String x: lst3) {
			System.out.print(x + ((x.equals(lst3.get(lst3.size()-1)))? "" : ", "));
		}
	}
}
