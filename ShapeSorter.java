package PA11;
import java.util.ArrayList;
import java.util.Comparator;
public class ShapeSorter {
	private static int compare(double d1, double d2) { // You may find this method useful, although not mandatory
		if(d1 > d2) {
			return 1;
		}
		else if (d1 < d2) {
			return -1;
		}
		else {
			return 0;
		}
	}
	// add the three methods here
	public static void insertionSort(ArrayList<IShape> list,Comparator<IShape> comparator) {
		for (int i = 1; i < list.size(); i++) {
			IShape temp = list.get(i);
			int j = i;
			while (j > 0 && comparator.compare(list.get(j - 1),temp ) > -1 ) {	
				list.set(j, list.get(j - 1));
				j--;
			}
		list.set(j, temp);
		}
	}				
	public static void sortBySurfaceArea(ArrayList<IShape> list) {
		Comparator<IShape> comparator = new Comparator<IShape>() {
			@Override
			public int compare(IShape arg0, IShape arg1) {
				return arg0.surfaceArea() <= arg1.surfaceArea() ? -1 : 1;
			}
		};
		insertionSort(list, comparator);
	}
	public static void sortByTypeAndVolume(ArrayList<IShape> list) {
		Comparator<IShape> comparator = new Comparator<IShape>() {
			@Override
			public int compare(IShape arg0, IShape arg1) {
				int comparetype = arg0.type().compareTo(arg1.type());
				if (0 != comparetype)
					return comparetype;
				return arg0.volume() <= arg1.volume() ? -1 : 1;
			}
		};	
		insertionSort(list, comparator);
	}	
}