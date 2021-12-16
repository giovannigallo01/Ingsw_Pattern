package adapter;

public class AdattatoreMultimediale implements LettoreMultimediale{

	LettoreMultimedialeAvanzato lettoreMultimedialeAvanzato;
	
	public AdattatoreMultimediale(String tipoFile) {
		if(tipoFile.equalsIgnoreCase("vlc")) {
			lettoreMultimedialeAvanzato = new LettoreVLC();
		}
		else if(tipoFile.equalsIgnoreCase("mp4")) {
			lettoreMultimedialeAvanzato = new LettoreMP4();
		}
	}

	@Override
	public void esegui(String tipoFile, String nomeFile) {
		if(tipoFile.equalsIgnoreCase("vlc")) {
			lettoreMultimedialeAvanzato.eseguiVlc(nomeFile);
		}
		else if(tipoFile.equalsIgnoreCase("mp4")) {
			lettoreMultimedialeAvanzato.eseguiMp4(nomeFile);
		}
	}
}
