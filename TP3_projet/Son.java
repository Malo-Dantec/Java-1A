import javax.sound.sampled.*;
public class Son {
    SourceDataLine sdl ;
    Son () {
        try {
            sdl = AudioSystem . getSourceDataLine(new AudioFormat (8000f, 8, 1, true, false));
            sdl.open (new AudioFormat (8000f, 8, 1, true, false));
            sdl.start();
            sdl.flush();
        }
        catch (LineUnavailableException e){}
    }
    public void pause () {
        try {
            Thread.sleep(100);
        }
        catch(InterruptedException e) {
        }
    }
    public void tone (int msecs) {
        byte [] buf = new byte [msecs *8];
        for (int i = 0; i < msecs * 8; ++ i) {
            double angle = i / (8000f / 440) * 2.0 * Math.PI;
            buf[i] = (byte)(Math.sin(angle) * 127.0);
        }
        sdl.write(buf, 0, 8 * msecs);
        sdl.drain();
    }
    public static void main (String [] args) throws Exception {
        Son r = new Son();
        r.tone(100);
        r.pause();
    }
}