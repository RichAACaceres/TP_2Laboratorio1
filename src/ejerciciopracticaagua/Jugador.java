/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopracticaagua;

/**
 *
 * @author Usuario
 */
public class Jugador {
    private int iD;
    private String nombre;
    private boolean mojado;

    public Jugador(int iD, String nombre, boolean mojado) {
        this.iD = iD;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(RevolverAgua r){
        boolean t=r.mojar();
        if(!t){
            r.siguienteChorro();
            return false;
        }else{
            this.mojado=true;
            return true;
        }
    }
}
