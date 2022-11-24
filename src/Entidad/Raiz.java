/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Kidver
 */
public class Raiz {

    private Double a;
    private Double b;
    private Double c;

    public Raiz() {
    }

        public Raiz(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Raiz{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
