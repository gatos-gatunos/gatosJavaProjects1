
package gatosjava15;
public class GatosJava15 {
    public static void main(String[] args) {
    double gatosSubTotales = 30;    
    double gatosTax = 0.0875;
    double gatosTotales = gatosSubTotales + (gatosSubTotales * gatosTax);
    double porGato = gatosTotales/4;
    System.out.println(gatosTotales);
    System.out.println(porGato);
    }
}
