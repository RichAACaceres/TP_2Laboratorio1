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
public class RevolverAgua {
   private int pActual;
   private int pAgua;

    public RevolverAgua(int pActual, int pAgua) {
        this.pActual = pActual;
        this.pAgua = pAgua;
    }

    

    public int getpActual() {
        return pActual;
    }

    public void setpActual(int pActual) {
        this.pActual = pActual;
    }

    public int getpAgua() {
        return pAgua;
    }

    public void setpAgua(int pAgua) {
        this.pAgua = pAgua;
    }
   
    public void llenarRevolver(){
        this.pActual=(int)(Math.random()*5);
        this.pAgua=(int)(Math.random()*5);
        System.out.println(this.pActual+" "+this.pAgua);
    }
    
    public boolean mojar(){
        System.out.println(pActual+" "+pAgua);
        if (this.pActual==this.pAgua) {
            return true;
        }return false;
    }
    
    public void siguienteChorro(){
        if (this.pActual<5) {
            this.pActual=this.pActual+1;
        }else {
            this.pActual=0;
        }
        System.out.println("posicion actual"+this.pActual);
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "pActual=" + pActual + ", pAgua=" + pAgua + '}';
    }
    
    
}
