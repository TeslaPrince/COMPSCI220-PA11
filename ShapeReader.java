package PA11;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class ShapeReader {
	public static ArrayList<IShape> readShapes(String filePath) throws FileNotFoundException {
		ArrayList<IShape> a = new ArrayList<IShape>();
		Scanner sc = new Scanner(new FileInputStream(filePath));
		double r;
		double h;
		double l;
		double w;
		while(sc.hasNext()) {
			  String name = sc.next();
			  char role = name.charAt(1);
			  switch (role) {
			  	case'Y':
			  		r= sc.nextDouble();
			  		h= sc.nextDouble();
			  		a.add(new Cylinder(name, r, h));
			  		break;
			  	case'P':
			  		r= sc.nextDouble();
			  		a.add(new Sphere(name, r));
			  		break;
			  	case'U':
			  		l = sc.nextDouble();
			  		w = sc.nextDouble();
			  		h = sc.nextDouble();
			  		a.add(new Cuboid(name, l,w,h));
			  		break;	
			  	default:
			  		break;
			  }  
		}
		sc.close();
		return a;
	}
}