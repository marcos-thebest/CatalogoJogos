package Heranca.Games;

public class Jogos {

    // Atributos
    private String nomeDoJogo;
    private String desenvolvedoraDoJogo;
    private int anoDeLancamento;
    private String generoDoJogo;
    private double precoDoJogo;
    private boolean multiplayer;

    // Getters and Setters
    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public String getDesenvolvedoraDoJogo() {
        return desenvolvedoraDoJogo;
    }

    public void setDesenvolvedoraDoJogo(String desenvolvedoraDoJogo) {
        this.desenvolvedoraDoJogo = desenvolvedoraDoJogo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getGeneroDoJogo() {
        return generoDoJogo;
    }

    public void setGeneroDoJogo(String generoDoJogo) {
        this.generoDoJogo = generoDoJogo;
    }

    public double getPrecoDoJogo() {
        return precoDoJogo;
    }

    public void setPrecoDoJogo(double precoDoJogo) {
        this.precoDoJogo = precoDoJogo;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    // Metodos
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + this.getNomeDoJogo());
        System.out.println("Desenvolvedora: " + this.getDesenvolvedoraDoJogo());
        System.out.println("Ano de lancamento: " + this.getAnoDeLancamento());
        System.out.println("Genero: " + this.getGeneroDoJogo());
        System.out.println("Preco do " + this.getNomeDoJogo() + ":  " + this.getPrecoDoJogo());
        System.out.println("Multiplayer: " + this.isMultiplayer());
    }
}
