import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("black");
		colors.add("white");
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("brown");
		
		int i=0;
		while ( i < colors.size()) {
			if (colors.get(i).contains("e")) {
				colors.remove(i);
				i--;
			}
			i++;
		}
		System.out.println("array list Colors that do not contain the letter 'e' are: "+colors);
		
		
		
		String[] colors1 = {"black","white","red"};
		
		
		int j=0;
		while ( j < colors1.length) {
			if (colors1[j].contains("e")) {
				if(colors1[j].equals("white")) {
					colors1[j]="brown";
				}
				else if(colors1[j].equals("red")) {
					colors1[j]="gray";
				}
				
				
			}
			System.out.println("array Colors that do not contain the letter 'e' are: "+colors1[j]);
			j++;
		}
		
	
		
		
		
		
		
		
		
		
		
		//for (int j=0;j<10;j++) {
		//	System.out.println();
		//}
		
		
		//for (String word : colors) {
		//	System.out.println(word);
		
		
			
			
		
	//}
		
		
		HashMap<String, String> capitalCities = new HashMap<>();
		capitalCities.put("England","London");
		capitalCities.put("Ireland","Dublin");
		capitalCities.put("Croatia","Zagreb");
		capitalCities.put("Netherlands","Amsterdam");
		
		System.out.println(capitalCities.get("Croatia"));
		
		capitalCities.replace("Netherlands", "Den Haag");
		System.out.println(capitalCities.get("Netherlands"));
		
		capitalCities.put("Germany","Berlin");
		
		Iterator<String> citiesKeysIterator = capitalCities.keySet().iterator();
		Iterator<String> citiesIterator = capitalCities.values().iterator();
		
		
		while(citiesIterator.hasNext()) {
			System.out.println(citiesKeysIterator.next() + " "+citiesIterator.next());
		}
		
		System.out.println("---");
		
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(33);
		ages.add(31);
		ages.add(20);
		ages.add(17);
		ages.add(88);
		ages.add(50);
		
		ages.sort(null);
		
		 
		
		
		

}}
