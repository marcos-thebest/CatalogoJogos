<div align="center">

# 🎮 Catálogo de Jogos em Java

### Projeto de Orientação a Objetos aplicado na prática

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![POO](https://img.shields.io/badge/POO-Herança%20%7C%20Encapsulamento%20%7C%20Override-blue?style=for-the-badge)](https://github.com/marcos-thebest/CatalogoJogos)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)
[![Status](https://img.shields.io/badge/Status-Concluído-238636?style=for-the-badge)](https://github.com/marcos-thebest/CatalogoJogos)

---

![GitHub repo size](https://img.shields.io/github/repo-size/marcos-thebest/CatalogoJogos?color=1F6FEB&label=Tamanho%20do%20repositório)
![GitHub last commit](https://img.shields.io/github/last-commit/marcos-thebest/CatalogoJogos?color=238636&label=Último%20commit)
![GitHub stars](https://img.shields.io/github/stars/marcos-thebest/CatalogoJogos?color=DAA520&label=Stars)
![GitHub forks](https://img.shields.io/github/forks/marcos-thebest/CatalogoJogos?color=8B5CF6&label=Forks)

</div>

---

## 📋 Sobre o Projeto

O **Catálogo de Jogos** é um sistema desenvolvido em Java que organiza e exibe informações sobre diferentes categorias de jogos digitais. O projeto foi criado com foco na aplicação prática dos pilares da **Programação Orientada a Objetos**, utilizando uma hierarquia de classes que representa três tipos de jogos: Online, RPG e Terror.

> 🎬 **Assista ao projeto em funcionamento:**
> [![LinkedIn](https://img.shields.io/badge/Ver%20no%20LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/posts/marcos-vinicius-de-jesus-almeida_java-poo-programaaexaetoorientadaaobjetos-ugcPost-7462847784753475585-nKxr?utm_source=share&utm_medium=member_desktop&rcm=ACoAADyHbtoB5Vh_HP475E0QcrZQ85cvgl2SocE)

---

## 🧠 Conceitos de POO Aplicados

| Conceito | Como foi aplicado |
|----------|------------------|
| 🔗 **Herança** | `JogoOnline`, `JogoRPG` e `JogoTerror` estendem a classe `Jogos` |
| 🔒 **Encapsulamento** | Atributos `private` com getters e setters públicos |
| 🔁 **@Override** | Método `mostrarInformacoes()` sobrescrito em cada subclasse |
| 📦 **ArrayList** | Listas dinâmicas para armazenar cada categoria de jogo |
| 🔄 **Laços de repetição** | `for` percorre as listas e chama os métodos de exibição |

---

## 🏗️ Estrutura de Classes

```
Jogos (Superclasse)
│
├── nomeDoJogo
├── desenvolvedoraDoJogo
├── anoDeLancamento
├── generoDoJogo
├── precoDoJogo
├── multiplayer
├── mostrarInformacoes()
│
├── 🌐 JogoOnline extends Jogos
│   ├── jogadoresOnline
│   └── servidor
│
├── ⚔️  JogoRPG extends Jogos
│   ├── mundoAberto
│   └── quantidadeClasses
│
└── 👻 JogoTerror extends Jogos
    ├── possuiJumpscare
    └── nivelMedo
```

---

## 🎮 Jogos Cadastrados

<details>
<summary><strong>🌐 Jogos Online (clique para expandir)</strong></summary>

| Jogo | Desenvolvedora | Ano | Gênero | Jogadores Online |
|------|---------------|-----|--------|-----------------|
| League of Legends | Riot Games | 2009 | MOBA | 5.000.000 |
| Counter-Strike 2 | Valve | 2023 | FPS | 1.200.000 |
| Valorant | Riot Games | 2020 | FPS Tático | 3.000.000 |
| Fortnite | Epic Games | 2017 | Battle Royale | — |

</details>

<details>
<summary><strong>👻 Jogos de Terror (clique para expandir)</strong></summary>

| Jogo | Desenvolvedora | Ano | Nível de Medo |
|------|---------------|-----|--------------|
| Resident Evil Village | Capcom | 2021 | 9/10 |
| Silent Hill 2 | Konami | 2001 | 10/10 |
| Outlast | Red Barrels | 2013 | 10/10 |
| Amnesia: The Dark Descent | Frictional Games | 2010 | 9/10 |
| Dead Space | EA | 2008 | 9/10 |

</details>

---

## 💻 Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado) ou qualquer IDE Java

### Passo a passo

```bash
# Clone o repositório
git clone https://github.com/marcos-thebest/CatalogoJogos.git

# Abra o projeto no IntelliJ IDEA
# File → Open → selecione a pasta do projeto

# Execute a classe Main.java
# Clique com botão direito em Main.java → Run 'Main.main()'
```

---

## 📊 Estatísticas do Repositório

<div align="center">

[![GitHub Stats](https://github-readme-stats.vercel.app/api?username=marcos-thebest&show_icons=true&theme=dark&title_color=1F6FEB&icon_color=238636&text_color=E6EDF3&bg_color=0D1117&border_color=30363D&include_all_commits=true&count_private=true)](https://github.com/marcos-thebest)

[![Top Langs](https://github-readme-stats.vercel.app/api/top-langs/?username=marcos-thebest&layout=compact&theme=dark&title_color=1F6FEB&text_color=E6EDF3&bg_color=0D1117&border_color=30363D)](https://github.com/marcos-thebest)

</div>

---

## 📁 Estrutura do Projeto

```
CatalogoJogos/
│
├── src/
│   └── Heranca/
│       └── Games/
│           ├── Jogos.java         # Superclasse base
│           ├── JogoOnline.java    # Subclasse: jogos online
│           ├── JogoRPG.java       # Subclasse: jogos RPG
│           ├── JogoTerror.java    # Subclasse: jogos de terror
│           └── Main.java          # Ponto de entrada do programa
│
└── README.md
```

---

## 🔗 Conecte-se comigo

<div align="center">

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Marcos%20Vinicius-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marcos-vinicius-de-jesus-almeida)
[![GitHub](https://img.shields.io/badge/GitHub-marcos--thebest-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/marcos-thebest)

</div>

---

<div align="center">

Feito com ☕ e muito Java por **Marcos Vinicius**

</div>
