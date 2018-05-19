
package aula12;


public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void amitirSom() {
        System.out.println("Som de Ave");
    }
    public void fazerNinho(){
        System.out.println("Contruindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
            
    
}
