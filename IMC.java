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
                System.out.print("Abaixo do peso: IMC menor que 18,5.");
            }
            else{
                if((imc >= 18.5) && (imc <= 25.9)){
                    System.out.print("Peso normal: IMC entre 18,5 e 24,9.");
                }
                else{
                    if((imc >= 25) && (imc <= 29.9)){
                        System.out.print("Sobrepeso: IMC entre 25 e 29,9.");
                    }
                    else{
                        System.out.print("Obesidade: IMC igual ou superior a 30.");
                    }
                }
            }
        }
    }
