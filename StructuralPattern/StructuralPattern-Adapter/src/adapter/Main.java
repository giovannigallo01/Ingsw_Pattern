package adapter;

public class Main {

	public static void main(String[] args) {
		Multimedia file1 = new Multimedia("Alone", "mp3");
        Multimedia file2 = new Multimedia("Over the Horizon", "mp4");
        Multimedia file3 = new Multimedia("50 special Video", "vlc");
        Multimedia file4 = new Multimedia("Corrupted", "avi");
        LettoreAudio lettoreAudio = new LettoreAudio();

        lettoreAudio.esegui(file1.getFormato(), file1.getNome());
        lettoreAudio.esegui(file2.getFormato(), file2.getNome());
        lettoreAudio.esegui(file3.getFormato(), file3.getNome());
        lettoreAudio.esegui(file4.getFormato(), file4.getNome());
	}
}
