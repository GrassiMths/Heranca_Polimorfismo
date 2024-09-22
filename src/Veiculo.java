public class Veiculo {


    protected String motor;
    protected int velocidade;

    public Veiculo(){
        this.motor = "Desligado";
        this.velocidade = 0;
    }

    public void ligar(){
        motor = "Ligado";
        System.out.println("Veiculo ligado.");
    }
    public void desligar(){
        motor = "desigado";
        System.out.println("Veiculo Desligado.");
    }
    public void acelerar (int valor){
        velocidade += valor;
        System.out.println("O veiculo acelerou " + valor + "Km/h");
    }
    public void frear (int percentual){
        velocidade -= (velocidade * percentual / 100);
        System.out.println("O veiculo freou em " + percentual + "%.");
    }


    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
