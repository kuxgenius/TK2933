package Lab4AStage1;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Lab4ATester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MobileDevice> phoneList = new ArrayList<MobileDevice>();
		try {
			Scanner filein = new Scanner(new File("mobilephone1.dat"));
			String line;
			String manufacturer = null;
			String model = null;
			int batteryStatus = 0;
			int lineNo = 0;													
			if (filein != null) { // not null if file exist
				while (filein.hasNextLine()) { //has more line to read
					lineNo++;
					line = filein.nextLine();
					Scanner st = new Scanner(line);
				    while (st.hasNext()) {
				         manufacturer = st.next();
						 model = st.next();
						 batteryStatus = st.nextInt();
					     MobileDevice mymobile = new MobileDevice(manufacturer,model,batteryStatus);
					     mymobile.printDetails();
					     System.out.println();
					}
				    st.close();
			    }
			}
		
			for (MobileDevice p: phoneList){
				p.printDetails();
				System.out.println("");
			}
			filein.close();
		} catch (IOException e){
			e.printStackTrace();
		} 
	}
}
