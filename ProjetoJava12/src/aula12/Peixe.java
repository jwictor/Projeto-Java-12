
package aula12;


public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancia");
    }

    @Override
    public void amitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
}
