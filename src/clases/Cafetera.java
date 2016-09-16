/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sony
 */
public class Cafetera {
private int capacidad_maxima;
private int cantidad_actual;

    public Cafetera(int capacidad_maxima, int cantidad_actual) {
        this.capacidad_maxima = capacidad_maxima;
        this.cantidad_actual = cantidad_actual;
    }
    
    public Cafetera() {
        this.capacidad_maxima = 1000;
        this.cantidad_actual = 0;
    }

    public int getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

public void llenar(){
int aux;
aux= this.capacidad_maxima = this.cantidad_actual;
this.setCapacidad_maxima(aux);

}

public void ajustar(){
int aux;
if(this.getCantidad_actual()>this.getCapacidad_maxima()){
this.setCantidad_actual(this.capacidad_maxima);
}
else{}   
   
}

public void servir(int tazas){
int aux;    
if(tazas > this.getCantidad_actual()){
this.setCantidad_actual(0);
}    
else{
aux= this.cantidad_actual - tazas;
this.setCantidad_actual(aux);   
}       
}

public void vaciar(){
this.setCantidad_actual(0);   
}
 
public void agregar(int nueva_cantidad){
int aux;
aux= this.cantidad_actual + nueva_cantidad;
this.setCantidad_actual(aux);
    
}

}
