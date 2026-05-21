package Heranca.Games;

public class JogoTerror extends Jogos {

    // Atributos
    private boolean possuiJumpscare;
    private int nivelMedo;

    // Construtor
    public JogoTerror(String nome, String desenvolvedora, int ano, String genero, double preco, boolean multiplayer, boolean possuiJumpscare, int nivelMedo) {
        this.setNomeDoJogo(nome);
        this.setDesenvolvedoraDoJogo(desenvolvedora);
        this.setAnoDeLancamento(ano);
        this.setGeneroDoJogo(genero);
        this.setPrecoDoJogo(preco);
        this.setMultiplayer(multiplayer);
        this.possuiJumpscare = possuiJumpscare;
        this.nivelMedo = nivelMedo;
    }

    // Getters and Setters
    public boolean isPossuiJumpscare() {
        return possuiJumpscare;
    }

    public void setPossuiJumpscare(boolean possuiJumpscare) {
        this.possuiJumpscare = possuiJumpscare;
    }

    public int getNivelMedo() {
        return nivelMedo;
    }

    public void setNivelMedo(int nivelMedo) {
        this.nivelMedo = nivelMedo;
    }

    // Metodo com Override
    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome do jogo de terror: " + this.getNomeDoJogo());
        System.out.println("Desenvolvedora: " + this.getDesenvolvedoraDoJogo());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Genero: " + this.getGeneroDoJogo());
        System.out.println("Preço do " + this.getNomeDoJogo() + ":  " + this.getPrecoDoJogo());
        System.out.println("Multiplayer: " + this.isMultiplayer());
        System.out.println("Possui Jumpscare? " + this.isPossuiJumpscare());
        System.out.println("Nivel de medo: " + this.getNivelMedo());
    }

    @Override
    public String toString() {
        return "Nome do Jogo de Terror: " + this.getNomeDoJogo() + " (" + this.getDesenvolvedoraDoJogo() + ")";
    }
}
