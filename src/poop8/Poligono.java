package poop8;

public abstract class Poligono {
    
    public Poligono() {
        
    }
    
    public abstract float area();
    
    public abstract float perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
}
