//4. Note que a classe de teste deixou de funcionar após a adição do construtor. Faça os
//ajustes necessários para que ela volte a funcionar.

import javax.swing.JOptionPane;

public class Carro1Construtor {
    public static void main (String[] args) {
    
    CarroConstrutor carro1 = new CarroConstrutor(1.6, 1.2);
    
    String ignicao = String.format("Bem-vindo. Voce esta dirigindo um carro %.1f com freio %s.", carro1.getMotorizacao(), carro1.getTipoFreio());
    JOptionPane.showMessageDialog(null, ignicao);

    int opt = 0;

        do{
            opt = Integer.parseInt(JOptionPane.showInputDialog("(1)Acelerar\n(2)Frear\n(3)Desligar"));
            if(opt == 1) {
                carro1.setPedal();
                carro1.acelerarCarro();
            }
            else if(opt == 2) {
                carro1.setPedal();
                carro1.frearCarro();
            }
            else if(opt < 1 | opt > 3) JOptionPane.showMessageDialog(null, "Comando invalido!");
        } while(opt != 3);
    }
}
