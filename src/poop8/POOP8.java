package poop8;

public class POOP8 {

    public static void main(String[] args) {
        Poligono poligono;
        Triangulo triangulo = new Triangulo();
        poligono=triangulo;
        System.out.println(poligono);
        poligono=new Cuadrilatero();
        System.out.println(poligono);
        poligono=new Pentagono();
        System.out.println(poligono);
        /*
       //Poligono poligono = new Poligono();
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Poligono poligono = new Cuadrilatero();
        Object objeto = poligono;
        System.out.println(objeto);
        //System.out.println("" + poligono + cuadrilatero + triangulo);
        
        InstrumentoMusical instrumento = new InstrumentoDeViento();
       // System.out.println(instrumento);
      
        
        System.out.println(Math.PI);
        System.out.println(Meses.DOS);*/
        
        
    }
}
