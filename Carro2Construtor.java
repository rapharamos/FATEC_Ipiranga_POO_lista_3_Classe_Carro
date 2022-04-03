//Escreva uma classe de teste que:
//Instancia dois veículos.
//Obtém valores para seus atributos e os atribui adequadamente.
//Chama cada um dos métodos que você criou.
//Exibe os valores das variáveis, usando os métodos getters.

import javax.swing.JOptionPane;

public class Carro2Construtor {
    public static void main (String[] args) {
    
    CarroConstrutor carro2 = new CarroConstrutor(2.0, 1.2);
    
    String ignicao = String.format("Bem-vindo. Voce esta dirigindo um carro %.1f com freio %s.", carro2.getMotorizacao(), carro2.getTipoFreio());
    JOptionPane.showMessageDialog(null, ignicao);

    int opt = 0;

        do{
            opt = Integer.parseInt(JOptionPane.showInputDialog("(1)Acelerar\n(2)Frear\n(3)Desligar"));
            if(opt == 1) {
                carro2.setPedal();
                carro2.acelerarCarro();
            }
            else if(opt == 2) {
                carro2.setPedal();
                carro2.frearCarro();
            }
            else if(opt < 1 | opt > 3) JOptionPane.showMessageDialog(null, "Comando invalido!");
        } while(opt != 3);
    }
}
