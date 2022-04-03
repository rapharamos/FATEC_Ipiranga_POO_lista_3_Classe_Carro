// 3. Rescreva a classe do exercício 1 adicionando a ela um construtor que recebe valores
// a serem atribuídos às duas variáveis de instância da classe carro.

import javax.swing.JOptionPane;
public class CarroConstrutor {

    private int pedal = 0;
    private double velocidade = 0;
    private double motorizacao = 1;
    private double freio = 1;
    private String tipoFreio;

    CarroConstrutor(double motorizacao, double freio){
        this.motorizacao = motorizacao;
        this.freio = freio;
        if(this.freio > 0) tipoFreio = "ABS";
        else tipoFreio = "a disco";
    }   

    public void setPedal () {
        while (pedal <= 0 | pedal > 4){
            pedal = Integer.parseInt(JOptionPane.showInputDialog("Aperte o pedal para frear:\n(1)Um pouquinho\n(2)De leve\n(3)Forte\n(4)Fundo"));
        };
    }

    public void acelerarCarro () {
        if(pedal == 1) velocidade = 10 * motorizacao;
        else if(pedal == 2) velocidade = 25 * motorizacao;
        else if(pedal == 3) velocidade = 40 * motorizacao;
        else if(pedal == 4) velocidade = 55 * motorizacao;
        String s = String.format("O carro esta a %.0f km/h", velocidade);
        JOptionPane.showMessageDialog(null, s);
        pedal = 0;
    }

    public void frearCarro () {
        if(pedal == 1) velocidade = velocidade * (1/freio);
        else if(pedal == 2) velocidade = velocidade * (0.5/freio);
        else if(pedal == 3) velocidade = velocidade * (0.25/freio);
        else if(pedal == 4) velocidade = 0;
        String s = String.format("O carro esta a %.0f km/h", velocidade);
        JOptionPane.showMessageDialog(null, s);
        pedal = 0;
    }
   
    public Double getMotorizacao() {
        return this.motorizacao;
    }

    public Double getFreio() {
        return this.freio;
    }

    public String getTipoFreio() {
        return this.tipoFreio;
    }
}