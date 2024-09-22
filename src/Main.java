public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Motorista motorista = new Motorista();

        System.out.println("Testando o Carro:");
        motorista.ligar(carro);
        motorista.acelerar(carro, 10);
        System.out.println("Velocidade do carro: " + carro.getVelocidade() + " km/h"); // Deve imprimir 10
        motorista.frear(carro, 50); // Reduz em 50% a velocidade
        System.out.println("Velocidade do carro após frear: " + carro.getVelocidade() + " km/h");
        motorista.desligar(carro);


        Motocicleta moto = new Motocicleta();
        System.out.println("\nTestando a Motocicleta:");
        motorista.ligar(moto);
        motorista.acelerar(moto, 20);
        System.out.println("Velocidade da moto: " + moto.getVelocidade() + " km/h"); // Deve imprimir 20
        motorista.frear(moto, 25); // Reduz em 25% a velocidade
        System.out.println("Velocidade da moto após frear: " + moto.getVelocidade() + " km/h");
        motorista.desligar(moto);
    }
}
