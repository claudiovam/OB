public class Main {
  
  public static void main(String[] args) {
    
    // If
    System.out.println("\nIf:");
    int numeroIf = 2;
    if (numeroIf < 0) {
      System.out.println("Es negativo");
    } else if (numeroIf > 0) {
      System.out.println("Es positivo");
    } else {
      System.out.println("Es cero");
    }

    // While
    System.out.println("\nWhile:");
    int numeroWhile = 0;
    while (numeroWhile < 3) {
      numeroWhile++;
      System.out.println(numeroWhile);
    }

    // Do While
    System.out.println("\nDo While:");
    do {
      numeroWhile++;
      System.out.println(numeroWhile);
    } while (numeroWhile < 4);

    // For
    System.out.println("\nFor:");
    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println(numeroFor);
    }

    // Switch
    System.out.println("\nSwitch:");
    var estacion = "invierno";
    switch (estacion) {
      case "verano":
        System.out.println("Es verano");
        break;
      case "otoño":
        System.out.println("Es otoño");
        break;
      case "invierno":
        System.out.println("es invierno");
        break;
      case "primavera":
        System.out.println("Es primavera");
        break;
      default:
        System.out.println("No es una estacion");
    }
  }
}