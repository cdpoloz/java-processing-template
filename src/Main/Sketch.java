package Main;

import Update.MainUpdate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import processing.core.PApplet;

/**
 * @author CPZ
 */
public class Sketch extends PApplet {
    
    @Override
    public void settings() {
        size(960, 540);
        smooth(8);
    }
    
    @Override
    public void setup() {        
        frameRate(60);
        //noCursor();        
    }

    @Override
    public void draw() {
        update();
        display();
    }
    
    private void update() {
        MainUpdate update = new MainUpdate();
        //update.setup(
        FutureTask tarea = new FutureTask(update);
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.submit(tarea);
        //resultado = (Object) tarea.get();
        es.shutdown();
    }

    private void display() {
        background(0);
    }
}