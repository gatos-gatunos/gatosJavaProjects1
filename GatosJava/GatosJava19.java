package gatosjava19;
public class GatosJava19 {
    int saldoGatuno;
    public GatosJava19(int saldoInicialGatuno){
       saldoGatuno =  saldoInicialGatuno;
    }
    public void revisionDeBalanceGatuno(){
       System.out.println("Hola");
       System.out.println("Tu saldo es: "+saldoGatuno);
    }
    public void depositoGatuno(int cantidadParaDepositarGatunamente){
       saldoGatuno = cantidadParaDepositarGatunamente + saldoGatuno;
       System.out.println("Usted solo deposito: "+cantidadParaDepositarGatunamente);
    }
    public int retiroGatuno(int catidadGatunaParaRetirar){
       saldoGatuno = saldoGatuno - catidadGatunaParaRetirar;
       System.out.println("Usted solo retiro: "+catidadGatunaParaRetirar);
       return catidadGatunaParaRetirar;
    }
    public String paraStringGatuno(){
        return "estos los ahorros de la cuenta gatuna "+saldoGatuno+"salvados";
   
    }
    public static void main(String[] args) {
        GatosJava19 ahorrosGatunos = new GatosJava19(2000); 
        ahorrosGatunos.revisionDeBalanceGatuno();
        ahorrosGatunos.retiroGatuno(300);
        ahorrosGatunos.revisionDeBalanceGatuno();
        ahorrosGatunos.depositoGatuno(600);
        System.out.println(ahorrosGatunos);
    }
}
