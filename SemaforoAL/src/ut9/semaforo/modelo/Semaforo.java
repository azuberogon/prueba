package ut9.semaforo.modelo;

import javafx.scene.paint.Color;

/**
 * Modela un ut9.semaforo.modelo.Semaforo
 */
public class Semaforo {

    private Color color;

    /**
     * Constructor de la clase ut9.semaforo.modelo.Semaforo
     */
    public Semaforo() {

        color = Color.GREEN;
    }

    /**
     * Obtener el color del semáforo
     */
    public Color getColor() {

        return color;
    }

    /**
     * Actualizar color del semáforo
     */
    public void avanzar() {
        if(color == Color.GREEN){
            setColor(Color.RED);
        }
        else if(color == Color.RED){
            setColor(Color.ORANGE);
        }
        else{
            setColor(Color.GREEN);
        }
    }

    /**
     * Cambiar el color
     */
    public void setColor(Color color) {

        this.color = color;
    }

}
