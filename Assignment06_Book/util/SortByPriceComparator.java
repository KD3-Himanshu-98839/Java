package util;

import java.util.Comparator;

import domain.Book;

public class SortByPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o2.getPrice(), o1.getPrice());
	}

}
