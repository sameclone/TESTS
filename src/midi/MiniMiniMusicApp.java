package midi;

import javax.sound.midi.*;

/**
 * Created by yevgeniya.zuyeva on 13.12.2016.
 */
public class MiniMiniMusicApp {
    public static void main(String[] args){
        MiniMiniMusicApp miniMiniMusicApp = new MiniMiniMusicApp();
        miniMiniMusicApp.play();

    }

    public void play(){
        try {
            Sequencer player  = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

    }
}
