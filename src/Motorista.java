public class Motorista {

    public void ligar(Veiculo veiculo){
        veiculo.ligar();
    }
    public void desligar(Veiculo veiculo){
        veiculo.desligar();
    }
    public void acelerar(Veiculo veiculo, int valor){
        veiculo.acelerar(valor);
    }
    public void frear(Veiculo veiculo, int percentual){
        veiculo.frear(percentual);
    }
}