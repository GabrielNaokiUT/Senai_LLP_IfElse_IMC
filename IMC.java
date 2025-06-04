import java.util.Scanner;

    public class IMC{
        public static void main(String args[]){
            Scanner leia = new Scanner(System.in);
            Float a, p, imc; 
            System.out.print("Digite sua altura em metros: ");
            a = leia.nextFloat();
            System.out.print("Digite seu peso em kg: ");
            p = leia.nextFloat();
            imc = p/(a * a);
            if (imc < 18.5){
                System.out.print("Abaixo do peso: IMC = " + imc);
            }
            else{
                if((imc >= 18.5) && (imc <= 25.9)){
                    System.out.print("Peso normal: IMC = " + imc);
                }
                else{
                    if((imc >= 25) && (imc <= 29.9)){
                        System.out.print("Sobrepeso: IMC = " + imc);
                    }
                    else{
                        System.out.print("Obesidade: IMC = " + imc);
                    }
                }
            }
        }
    }
