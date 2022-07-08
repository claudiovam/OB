public class Main {
  
  public static void main(String[] args) {
    // primera parte
    int resultado = suma(1, 2, 3);
    System.out.println(resultado);
  
    // segunta parte
    Coche miCoche = new Coche();
    miCoche.AniadirPuerta();
    System.out.println(miCoche.puertas);
  }

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }
}

class Coche {
  
  public int puertas = 0;
  
  public void AniadirPuerta() {
    this.puertas++;
  }
}
