/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopracticaagua;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {
    ArrayList <Jugador> jugadores= new ArrayList();
    private RevolverAgua revolver;

    public Juego() {
        
    }

    

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    
    
    public void llenarJuego(){
        Scanner leer= new Scanner(System.in);
        int id;
        String nom;
        boolean mojado=false;
        RevolverAgua r;
        String op;
        int cont=0;
        System.out.println("Ingreso los jugadores, Maximo 6:");
        
        do {
            System.out.println("Ingrese N° Id:");
            id=leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese nombre del jugador:");
            nom=leer.nextLine();
            Jugador jug=new Jugador(id,nom,mojado);
            jugadores.add(jug);
            cont++;
            System.out.println("Desea ingresar otro JUgaDor???:S=SI");
             op=leer.nextLine();
        } while (op.equalsIgnoreCase("s") && cont<6);
        
        
    }
    
    public void ronda(){
        //this.revolver.llenarRevolver();
        RevolverAgua revol=new RevolverAgua(0,0);
        System.out.println("Revolver Creado!!!!");
        revol.llenarRevolver();
        for(Jugador jug:jugadores){
            if(jug.disparo(revol)){
                System.out.println("El jugador "+jug.getNombre()+" fue mojado");
                break;
            }
            
        }System.out.println("Juego terminado!!!!");
    }
    
}
