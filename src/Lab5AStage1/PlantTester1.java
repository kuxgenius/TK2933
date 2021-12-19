//PlantTester1.java
package Lab5AStage1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlantTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Plant> plantList = new ArrayList<Plant>();
		try {
			Scanner filein = new Scanner(new File("plantlist.dat"));

			String code = null;
			String line;
			String name = null;
			String climate = null;
			String type = null;
			double initHeight = 0;
			String propagationMethod = null;
			boolean hasSeeds = false;
			String pollinationAgent = null;
			if (filein != null) { // not null if file exist
				while (filein.hasNextLine()) { //has more line to read
					line = filein.nextLine();
					Scanner st = new Scanner(line);				
				    while (st.hasNext()) {
				    	code = st.next();
;				    	name = st.next();
				    	climate = st.next();
				    	type = st.next();
				    	if (code.equals("as")){
				    		initHeight = Double.parseDouble(st.next());
				    		propagationMethod = st.next();
							AsexualPlant ap = new AsexualPlant(name, climate, type, initHeight, propagationMethod);
							plantList.add(ap);
						} else if(code.equals("se")){
							if (st.next().equals("true"))
								hasSeeds = true;
							else
								hasSeeds = false;
							pollinationAgent = st.next();
							SexualPlant sp = new SexualPlant(name, climate, type, hasSeeds, pollinationAgent);
							plantList.add(sp);
						}
				    }
			    }
			}
			for (Plant p: plantList){
				p.printDetails();
				System.out.println();
			}
			filein.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
