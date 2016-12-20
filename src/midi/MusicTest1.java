package midi;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by yevgeniya.zuyeva on 13.12.2016.
 */
public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Gotta Sequencer!");
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
            System.out.println("Fail!");
        }
    }

    public static void main(String[] args){
        MusicTest1 musicTest1 = new MusicTest1();
        musicTest1.play();
    }
}
