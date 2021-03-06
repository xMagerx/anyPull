package hw10;

import java.util.Comparator;

public class SortByName implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
