package Test2;
//Tester2.java

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tester2 {
	public static void main(String[] args) {
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();

		try {
			BufferedReader filein = new BufferedReader(new FileReader(new File("rental.dat")));
			String name = null;
			String line;
			int lineNo = 1;
			if (filein != null) { // not null if file exist
				while ((line = filein.readLine()) != null) {
					ArrayList<String> rental = new ArrayList<String>();
					StringTokenizer st = new StringTokenizer(line); //process each line
				    while (st.hasMoreTokens()) {
				    	name = st.nextToken();
				    	rental.add(name);
					}
					switch (lineNo) {
				    	case 1: {
				    			Car c1 = new Car("C001", "Car", 2, 5, true, true, 'M' , rental);
				    			vList.add(c1);
				    			break;
				    			}
				    	case 2: {
				    			Car c2 = new Car("C002", "Car", 1, 2, true, false, 'M' , rental);
				    			vList.add(c2);
				    			break;
				    			}
				    	case 3: {
				    			Car c3 = new Car("C002", "Car", 3, 3, false, false, 'S' , rental);
				    			vList.add(c3);
				    			break;
				    			}
				    	case 4: {
				    			Van v1 = new Van("V001", "Van", 1, 3, true, true, 12 , rental);
				    			vList.add(v1);
				    			break;
				    			}
				    	case 5:	{
								Van v2 = new Van("V002","Van", 2, 3, false, false, 7 , rental);
								vList.add(v2);
			    				break;
			    				}
				    	case 6:	{
								Van v3 = new Van("V002","Van", 1, 5, false, true, 12 , rental);
								vList.add(v3);
		    					break;
		    					}
				    	case 7:	{
				    			Bicycle b1 = new Bicycle("B001", "Bicycle", 2, 3, true, true, "normal" , rental);
				    			vList.add(b1);
				    			break;
				    			}
				    	case 8: {
				    			Bicycle b2 = new Bicycle("B002","Bicycle", 1, 2, true, true, "tandem" , rental);
				    			vList.add(b2);
				    			break;
				    			}
				    	case 9: {
				    			Bicycle b3 = new Bicycle("B003","Bicycle", 2, 2, false, true, "normal" , rental);
				    			vList.add(b3);
				    			break;
				    			}
				    	default:
				    }
				    lineNo++;
			    }
			}
			for (Vehicle v: vList){
				v.printDetails();
				System.out.println();
			}
			filein.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

