package Lab4AStage2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4ATester2 {

	public static void main(String[] args) {
		ArrayList<MobileDevice> phoneList = new ArrayList<MobileDevice>();
		try {
			Scanner filein = new Scanner(new File("mobilephone2.dat"));
			String line;
			String manufacturer = null;
			String model = null;
			int batteryStatus = 0;
			String station = null;
			double frequency = 0.0;
			String audioClip = null;
			String videoClip = null;
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
						 if (lineNo > 5){
							 audioClip = st.next();
							 videoClip = st.next();
							 SmartPhone sp = new SmartPhone(manufacturer, model, batteryStatus, new AudioPlayer(audioClip), new VideoPlayer(videoClip));
							 phoneList.add(sp);
						 } else {
							 station = st.next();
							 frequency = Double.parseDouble(st.next());
							 BasicPhone bp = new BasicPhone(manufacturer, model, batteryStatus, new RadioTuner(station, frequency));
						     phoneList.add(bp);
						 }
					}
				    st.close();
			    }
			}
			for (MobileDevice p: phoneList){
				p.printDetails();
				System.out.println();
			}
			filein.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
