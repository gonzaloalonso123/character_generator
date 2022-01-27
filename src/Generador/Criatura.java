
package Generador;

import java.util.Random;


public class Criatura {
    private int nivel;
    private String nombre;
    private String det;
    private String icono;
    
    public Criatura()
    {
        Random r = new Random();
        this.nivel = r.nextInt(3) + 1;
        this.nombre = MaquinaCreativa.nuevoNombre(nivel);
        this.det = MaquinaCreativa.nuevaDescripcion(nivel);
        
        switch(nivel)
        {
        case 1:
            this.icono = "/Imagenes/bestia" + (r.nextInt(13) + 1) + ".png"; break; 
        case 2:
        	this.icono = "/Imagenes/guerrero" + (r.nextInt(8) + 1) + ".png"; break;
        case 3:
        	this.icono = "/Imagenes/legendario" + (r.nextInt(14) + 1) + ".png"; break;
        }
        
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDet() {
        return det;
    }

    public void setDet(String det) {
        this.det = det;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
}
