package Lab4AStage3;

public class SmartPhone extends MobileDevice{
	private AudioPlayer aPlayer;
	private VideoPlayer vPlayer;
	
	public SmartPhone(String ma,String mo,int bs,AudioPlayer ap,VideoPlayer vp) {
		super(ma,mo,bs);
		aPlayer = ap;
		vPlayer = vp;
	}
	
	public void currentAudioPlaying() {
		System.out.println("Audio playing: "+aPlayer.getAudioClip());
	}
	
	public void currentVideoPlaying() {
		System.out.println("Video playing: "+vPlayer.getVideoClip());
	}
	
	public void printDetails() {
		System.out.println("Smart phone details");
		super.printDetails();
		currentAudioPlaying();
		currentVideoPlaying();
	}
}
