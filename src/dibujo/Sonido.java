/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author FreddyAlc
 */
public class Sonido {
    
    Clip clip;
 
    /**
     * Loads a sound file from the resource folder
     */
    public Sonido(File Sound) {
 
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            
            //Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }

    public void play() {
        if( clip != null ) {
            clip.stop();
            clip.setFramePosition(0);
            clip.start();
        }
    }
 
  
    public void stop() {
        if( clip != null )
            clip.stop();
    }
 
  
    public void loop() {
        if( clip != null )
            clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
 

}
