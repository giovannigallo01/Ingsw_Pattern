package adapter;

public class LettoreMP4 implements LettoreMultimedialeAvanzato{

	@Override
	public void eseguiVlc(String nomeFile) {}

	@Override
	public void eseguiMp4(String nomeFile) {
		System.out.println("[LETTORE VLC]: Riproduzione file mp4: " + nomeFile);
	}
}
