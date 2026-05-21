package Heranca.Games;

public class JogoOnline extends Jogos {

    // Atributos
    private int jogadoresOnline;
    private String servidor;

    // Construtor
    public JogoOnline(String nome, String desenvolvedoraDoJogo, int anoDeLancamento, String generoDoJogo, double precoDoJogo, boolean multiplayer, int jogadoresOnline, String servidor) {
        this.setNomeDoJogo(nome);
        this.setDesenvolvedoraDoJogo(desenvolvedoraDoJogo);
        this.setAnoDeLancamento(anoDeLancamento);
        this.setGeneroDoJogo(generoDoJogo);
        this.setPrecoDoJogo(precoDoJogo);
        this.setMultiplayer(multiplayer);
        this.setJogadoresOnline(jogadoresOnline);
        this.setServidor(servidor);
    }

    // Getters and Setters
    public int getJogadoresOnline() {
        return jogadoresOnline;
    }

    public void setJogadoresOnline(int jogadoresOnline) {
        this.jogadoresOnline = jogadoresOnline;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    // Metodo com Override
    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome do jogo online: " + this.getNomeDoJogo());
        System.out.println("Desenvolvedora: " + this.getDesenvolvedoraDoJogo());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Genero: " + this.getGeneroDoJogo());
        System.out.println("Preço do " + this.getNomeDoJogo() + ":  " + this.getPrecoDoJogo());
        System.out.println("Multiplayer: " + this.isMultiplayer());
        System.out.println("Quantidade de Jogadores online: " + this.getJogadoresOnline());
        System.out.println("Servidor: " + this.getServidor());
    }

    @Override
    public String toString() {
        return "Nome do Jogo: " + this.getNomeDoJogo() + " (" + this.getDesenvolvedoraDoJogo() + ")";
    }
}
