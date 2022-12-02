/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author leo
 */
public class Pentagono extends Poligono{
     private float apotema, altura,lado;

    public Pentagono(float apotema, float altura, float lado) {
        this.apotema = apotema;
        this.altura = altura;
        this.lado = lado;
    }

    public Pentagono() {
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public float area(){
        return (perimetro()*apotema)/2;
    }
    
    public float perimetro(){
        return 5*lado;
    }

    @Override
    public String toString() {
        return "Pentagono{" + "apotema=" + apotema + ", altura=" + altura + ", lado=" + lado + '}';
    }
}
