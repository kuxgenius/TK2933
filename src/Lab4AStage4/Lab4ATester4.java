package Lab4AStage4;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

//Your program will be evaluated by this DriverMain class and several test cases.

public class Lab4ATester4 {
    public static void main(String[] args) {
		ArrayList<MobileDevice> phoneList = new ArrayList<MobileDevice>();
		String[] newStation = {"Hot.fm",  "Mix.fm", "Ikim.fm", "Ikim.fm", "Mix.fm"};
		Double[] newFrequency = {97.6, 94.5, 91.5, 91.5, 94.5};
		String[] newAudioClip = {"Setia", "Menang", "Kumohon", "Lullabies"};
		String[] newVideoClip = {"Boboiboy", "Allegiant", "Divergent", "Starwars"};

		try {
			Scanner filein = new Scanner(new File("mobilephone4.dat"));
		    String line;
		    String code = null;
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
				    	code = st.next();
				    	manufacturer = st.next();
				    	model = st.next();
				    	batteryStatus = st.nextInt();
				    	if(code.equals("Bp")){
				    		station = st.next();
				    		frequency = st.nextDouble();
				    		BasicPhone bp = new BasicPhone(manufacturer, model, batteryStatus, new RadioTuner(station, frequency));
				    		phoneList.add(bp);
				    	} else if (code.equals("Sp")){
				    		audioClip = st.next();
				    		videoClip = st.next();
				    		SmartPhone sp = new SmartPhone(manufacturer, model, batteryStatus, new AudioPlayer(audioClip), new VideoPlayer(videoClip));
				    		phoneList.add(sp);
				    	}
				    }
				}
			}
			int basic=0, smart=0;
			for (MobileDevice p: phoneList){
				p.printDetails();
			   	if (p instanceof BasicPhone){
			   		basic++;
			   		System.out.println("New station: " + newStation[basic-1]);
			   		System.out.println("New frequency: " + newFrequency[basic-1]);
			   		((BasicPhone) p).setRadioSetting(newStation[basic-1], newFrequency[basic-1]);
			   	} else if (p instanceof SmartPhone){
			   		smart++;
			   		System.out.println("New audioclip: " + newAudioClip[smart-1]);
			   		System.out.println("New videoclip: " + newVideoClip[smart-1]);
			   		((SmartPhone) p).setCurrentAudio(newAudioClip[smart-1]);
			   		((SmartPhone) p).setCurrentVideo(newVideoClip[smart-1]);
			   	}
			   	p.printDetails();
			   	System.out.println();				}
			} catch(Exception e) {
				e.printStackTrace();
	        }    }
}
