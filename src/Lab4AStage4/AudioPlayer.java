package Lab4AStage4;

public class AudioPlayer {
	private String audioClip;
	
	public AudioPlayer() {
		audioClip = "You Raise Me Up";
	}
	
	public AudioPlayer(String ac) {
		audioClip = ac;
	}
	
	public void setAudioClip(String ac) {
		audioClip = ac;
	}
	
	public String getAudioClip() {
		return audioClip;
	}
}
