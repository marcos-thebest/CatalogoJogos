package Heranca.Games;

public class JogoRPG extends Jogos {

    // Atributos
    private boolean mundoAberto;
    private int quantidadeClasses;

    // Construtor
    public JogoRPG(String nome, String desenvolvedoraDoJogo, int anoDeLancamento, String generoDoJogo, double precoDoJogo, boolean multiplayer, boolean mundoAberto, int quantidadeClasses) {
        this.setNomeDoJogo(nome);
        this.setDesenvolvedoraDoJogo(desenvolvedoraDoJogo);
        this.setAnoDeLancamento(anoDeLancamento);
        this.setGeneroDoJogo(generoDoJogo);
        this.setPrecoDoJogo(precoDoJogo);
        this.setMultiplayer(multiplayer);
        this.setMundoAberto(mundoAberto);
        this.setQuantidadeClasses(quantidadeClasses);
    }

    // Getters and Setters
    public boolean isMundoAberto() {
        return mundoAberto;
    }

    public void setMundoAberto(boolean mundoAberto) {
        this.mundoAberto = mundoAberto;
    }

    public int getQuantidadeClasses() {
        return quantidadeClasses;
    }

    public void setQuantidadeClasses(int quantidadeClasses) {
        this.quantidadeClasses = quantidadeClasses;
    }

    // Metodo com Override
    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome do jogo RPG: " + this.getNomeDoJogo());
        System.out.println("Desenvolvedora: " + this.getDesenvolvedoraDoJogo());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Genero: " + this.getGeneroDoJogo());
        System.out.println("Preço do " + this.getNomeDoJogo() + ":  " + this.getPrecoDoJogo());
        System.out.println("Multiplayer: " + this.isMultiplayer());
        System.out.println("Mundo aberto: " + this.isMundoAberto());
        System.out.println("Quantidade de classes: " + this.getQuantidadeClasses());
    }

    @Override
    public String toString() {
        return "Nome do jogo RPG: " + this.getNomeDoJogo() + " (" + this.getDesenvolvedoraDoJogo() + ")";
    }
}
