package adapter;

public class LettoreAudio implements LettoreMultimediale{

	AdattatoreMultimediale adattatoreMultimediale;

	@Override
	public void esegui(String tipoFile, String nomeFile) {
		if(tipoFile.equalsIgnoreCase("mp3")) {
			System.out.println("[LETTOREAUDIO]: File mp3 eseguito: " + nomeFile);
		}
		else if(tipoFile.equalsIgnoreCase("mp4") || tipoFile.equalsIgnoreCase("vlc")) {
			adattatoreMultimediale = new AdattatoreMultimediale(tipoFile);
			adattatoreMultimediale.esegui(tipoFile, nomeFile);
		}
		else {
			System.out.println("[LETTOREAUDIO]: File: "+ tipoFile + " in formato non supportato");
		}
	}
}
