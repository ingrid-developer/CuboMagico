/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambientes;

/**
 *
 * @author Ingrid Cruz
 */
public class Paisaje {
    
    int x;
    int y;
    String imagen;

    public Paisaje() {
    }
    
    public Paisaje(int x, int y, String imagen) {
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
