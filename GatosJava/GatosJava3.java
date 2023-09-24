
package gatosjava3;
public class GatosJava3 {
    public static void main(String[] args) {
    int numeromarcas = 65;
    if(numeromarcas < 50){
        System.out.println("Hay un fallo en el sistema.");
    }else if(numeromarcas >= 50 && numeromarcas < 60 ){
        System.out.println("Grado D.");
    }else if(numeromarcas >= 60 && numeromarcas < 70){
        System.out.println("Grado C.");
    }else if(numeromarcas >= 70 && numeromarcas < 80){
        System.out.println("Grado B.");
    }else if(numeromarcas >= 80 && numeromarcas < 90){
        System.out.println("Grado A");
    }else if(numeromarcas >= 90 && numeromarcas < 100){
        System.out.println("Grado +A");
    }else{System.out.println("!Es invalido¡");
    }
    }
}
