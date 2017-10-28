package hw10;

import java.util.Comparator;


public class SortByPrice implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getPrice()>o2.getPrice()){
			return 1;
		}else if(o1.getPrice()<o2.getPrice()){
			return -1;
		}else{
			return 0;
		}
	}

}
