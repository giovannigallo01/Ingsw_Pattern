package adapter;

public class LettoreVLC implements LettoreMultimedialeAvanzato{

	@Override
	public void eseguiVlc(String nomeFile) {
		System.out.println("[LETTORE VLC]: Riproduzione file vlc: " + nomeFile);
	}

	@Override
	public void eseguiMp4(String nomeFile) {}
}
