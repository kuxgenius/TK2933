package Lab4AStage2;

public class VideoPlayer {
	private String videoClip;
	
	public VideoPlayer() {
		videoClip = "Mr.Bean's Holiday";
	}
	
	public VideoPlayer(String vc) {
		videoClip = vc;
	}
	
	public void setVideoClip(String vc) {
		videoClip = vc;
	}
	
	public String getVideoClip() {
		return videoClip;
	}
}
