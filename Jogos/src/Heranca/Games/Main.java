package Heranca.Games;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando um arrayList para Jogos Online
        ArrayList<JogoOnline> listaDeJogosOnline = new ArrayList<>();

        JogoOnline primeiroJogoOnline = new JogoOnline("League of Legends", "Riot Games", 2009, "MOBA", 0.0, true, 5000000, "Brasil");

        JogoOnline segundoJogoOnline = new JogoOnline("Counter-Strike 2", "Valve", 2023, "FPS", 0.0, true, 1200000, "South America");

        JogoOnline terceiroJogoOnline = new JogoOnline("Valorant", "Riot Games", 2020, "FPS Tático", 0.0, true, 3000000, "Sao Paulo");

        JogoOnline quartoJogoOnline = new JogoOnline("Fortnite", "Epic Games", 2017, "Battle Royale", 0.0, true, 4000000, "NA-East");

        JogoOnline quintoJogoOnline = new JogoOnline("Minecraft", "Mojang", 2011, "Sandbox", 149.90, true, 800000, "Hypixel");

        JogoOnline sextoJogoOnline = new JogoOnline("World of Warcraft", "Blizzard", 2004, "MMORPG", 39.90, true, 900000, "Azralon");

        JogoOnline setimoJogoOnline = new JogoOnline("Genshin Impact", "HoYoverse", 2020, "Action RPG", 0.0, true, 2000000, "America");

        JogoOnline oitavoJogoOnline = new JogoOnline("Roblox", "Roblox Corporation", 2006, "Sandbox", 0.0, true, 6000000, "US-Eats");

        JogoOnline nonoJogoOnline = new JogoOnline("Call of Duty: Warzone", "Activision", 2020, "Battle Royale", 0.0, true, 2500000, "South America");

        JogoOnline decimoJogoOnline = new JogoOnline("EA Sports FC 25", "Electronic Arts", 2024, "Esporte", 349.90, true, 700000, "Brasil");

        // Adicionando os jogos Online dentro de um vetor (ArrayList)
        listaDeJogosOnline.add(primeiroJogoOnline);
        listaDeJogosOnline.add(segundoJogoOnline);
        listaDeJogosOnline.add(terceiroJogoOnline);
        listaDeJogosOnline.add(quartoJogoOnline);
        listaDeJogosOnline.add(quintoJogoOnline);
        listaDeJogosOnline.add(sextoJogoOnline);
        listaDeJogosOnline.add(setimoJogoOnline);
        listaDeJogosOnline.add(oitavoJogoOnline);
        listaDeJogosOnline.add(nonoJogoOnline);
        listaDeJogosOnline.add(decimoJogoOnline);

        for (int i = 0; i < listaDeJogosOnline.size(); i++) {
            listaDeJogosOnline.get(i).mostrarInformacoes();
        }

        for (int a = 0; a < listaDeJogosOnline.size(); a++) {
            System.out.println("\n" + a + " - " + listaDeJogosOnline.get(a));
        }

        System.out.println("\n==================================================");

        ArrayList<JogoTerror> listaDeJogosDeTerror = new ArrayList<>();

        JogoTerror primeiroJogoDeTerror = new JogoTerror("Resident Evil Viilage", "Capcom", 2021, "Survival Horror", 199.90, false, true, 9);

        JogoTerror segundoJogoDeTerror = new JogoTerror("Silent Hill 2", "Konami", 2001, "Terror Psicologico", 149.90, false, true, 10);

        JogoTerror terceiroJogoDeTerror = new JogoTerror("Outlast", "Red Barrels", 2013, "Terror", 59.90, false, true, 10);

        JogoTerror quartoJogoDeTerror = new JogoTerror("Amnesia: The Dark Descent", "Frictional Games", 2010, "Terror Psicológico", 37.99, false, false, 9);

        JogoTerror quintoJogoDeTerror = new JogoTerror("Dead Space", "EA", 2008, "Terror Sci-Fi", 249.90, false, false, 9);


        JogoTerror sextoJodoDeTerror = new JogoTerror("Alien: Isolation", "Crrative Assembly", 2014, "Survival Horror", 89.90, false, false, 10);

        JogoTerror setimoJogoDeTerror = new JogoTerror("The Evil Within", "tango Gameworks", 2014, "Survival Horror", 79.90, false, true, 9);

        JogoTerror oitavoNonoDeTerror = new JogoTerror("Phasmophobia", "Kinect Games", 2020, "Terror Cooperatibo", 32.99, true
                , true, 8);

        JogoTerror nonoJogoDeTerror = new JogoTerror("Five Nights at Freddys", "Scott Cawthon", 2014, "Terror", 19.90, false, true, 8);

        JogoTerror decimoJogoDeTerror = new JogoTerror("Until Dawn", "Supermassive Games", 2015, "Terror Interativo", 99.90, false, true, 8);

        listaDeJogosDeTerror.add(primeiroJogoDeTerror);
        listaDeJogosDeTerror.add(segundoJogoDeTerror);
        listaDeJogosDeTerror.add(terceiroJogoDeTerror);
        listaDeJogosDeTerror.add(quartoJogoDeTerror);
        listaDeJogosDeTerror.add(quintoJogoDeTerror);
        listaDeJogosDeTerror.add(sextoJodoDeTerror);
        listaDeJogosDeTerror.add(setimoJogoDeTerror);
        listaDeJogosDeTerror.add(oitavoNonoDeTerror);
        listaDeJogosDeTerror.add(nonoJogoDeTerror);
        listaDeJogosDeTerror.add(decimoJogoDeTerror);

        for (int b = 0; b < listaDeJogosDeTerror.size(); b++) {
            listaDeJogosDeTerror.get(b).mostrarInformacoes();
        }

        for (int c = 0; c < listaDeJogosDeTerror.size(); c++) {
            System.out.println("\n" + c + " - " + listaDeJogosDeTerror.get(c));
        }

        System.out.println("\n==================================================");

        ArrayList<JogoRPG> listaDeJogosRPG = new ArrayList<>();

        JogoRPG primeiroJogoRPG = new JogoRPG("The Witcher 3", "CD Projekt Red", 2015, "RPG", 129.90, false, true, 3);

        JogoRPG segundoJogoRPG = new JogoRPG("Skyrim", "Bethesda", 2011, "RPG", 149.90, false, true, 10);

        JogoRPG terceiroJogoRPG = new JogoRPG("Elder Ring", "FromSotfware", 2022, "Action RPG", 299.90, true, true, 10);

        JogoRPG quartoJogoRPG = new JogoRPG("Dark Souls 3", "FromSoftware", 2016, "Action RPG", 257.90, true, false, 9);

        JogoRPG quintoJogoRPG = new JogoRPG("Final Fantasy XV", "Square Enix", 2016, "JRPG", 192.90, false, true, 4);

        JogoRPG sextoJogoRPG = new JogoRPG("Dragon Age: Inquisition", "BioWare", 2014, "RPG", 89.90, true, true, 3);

        JogoRPG setimoJogoRPG = new JogoRPG("Baldur's Gate 3", "Larian Studios", 2023, "RPG Tatico", 199.90, true, true, 12);

        JogoRPG oitavoJogoRPG = new JogoRPG("Persona 5 Royal", "Atlus", 2019, "JRPG", 249.90, false, false, 5);

        JogoRPG nonoJogoRPG = new JogoRPG("Diablo IV", "Blizzard", 2023, "Action RPG", 349.90, true, true, 5);

        JogoRPG decimoJogoRPG = new JogoRPG("Genshin Impact", "HoYoverse", 2020, "Action RPG", 0.0, true, true, 8);

        listaDeJogosRPG.add(primeiroJogoRPG);
        listaDeJogosRPG.add(segundoJogoRPG);
        listaDeJogosRPG.add(terceiroJogoRPG);
        listaDeJogosRPG.add(quartoJogoRPG);
        listaDeJogosRPG.add(quintoJogoRPG);
        listaDeJogosRPG.add(sextoJogoRPG);
        listaDeJogosRPG.add(setimoJogoRPG);
        listaDeJogosRPG.add(oitavoJogoRPG);
        listaDeJogosRPG.add(nonoJogoRPG);
        listaDeJogosRPG.add(decimoJogoRPG);

        for (int d = 0; d < listaDeJogosRPG.size(); d++) {
            listaDeJogosRPG.get(d).mostrarInformacoes();
        }

        for (int e = 0; e < listaDeJogosRPG.size(); e++) {
            System.out.println("\n" + e + " - " + listaDeJogosRPG.get(e));
        }
    }
}
