
package gatosjava20;
public class GatosJava20 {
    public static void main(String[] args) {
    double aguaGatunaRecomendableConsumo = 8;
    double diasEnRetoGatuno = 30;
    double tuAguaGatunaTomada = 235.5;
    double totalDeAguaGatunaRecomendada = aguaGatunaRecomendableConsumo * diasEnRetoGatuno;
    boolean estaElRetoDeAguaGatunaCompletado = tuAguaGatunaTomada >= totalDeAguaGatunaRecomendada;
    System.out.println(estaElRetoDeAguaGatunaCompletado);
    }
    
}
