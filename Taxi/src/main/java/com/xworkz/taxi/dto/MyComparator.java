package com.xworkz.taxi.dto;

import java.util.Comparator;

public class MyComparator implements Comparator<TaxiDto>{

	@Override
	public int compare(TaxiDto o1, TaxiDto o2) {
		if(o1.getEarnings()<o2.getEarnings()) {
			return -1;
		}
		return 0;
	}
}

