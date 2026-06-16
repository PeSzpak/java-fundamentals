package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Adega {

    static Scanner ler = new Scanner(System.in);
    static ArrayList<Vinho> vinhos = new ArrayList<>();
    static ArrayList<Espumante> espumantes = new ArrayList<>();
    static ArrayList<Uisque> uisques = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("=-=-=-=-=-= Adega POO =-=-=-=-=-=");
            System.out.println("1  - Cadastrar");
            System.out.println("2  - Listar por tipo");
            System.out.println("3  - Listar todos");
            System.out.println("4  - Buscar por nome");
            System.out.println("5  - Servir");
            System.out.println("6  - Remover");
            System.out.println("7  - Classificacao de consumo");
            System.out.println("8  - Simular jantar");
            System.out.println("9  - Total de garrafas");
            System.out.println("10 - Bebidas disponiveis para jantar");
            System.out.println("0  - Sair");
            System.out.print("Escolha: ");
            opcao = ler.nextInt();
            ler.nextLine();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            switch (opcao) {
                case 1: cadastrar(); break;
                case 2: listarPorTipo(); break;
                case 3: listarTodos(); break;
                case 4: buscarPorNome(); break;
                case 5: servir(); break;
                case 6: remover(); break;
                case 7: exibirClassificacoes(); break;
                case 8: simularJantar(); break;
                case 9: totalGarrafas(); break;
                case 10: listarParaJantar(); break;
                case 0: System.out.println("Encerrando sistema..."); break;
                default: System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
        ler.close();
    }

    static void cadastrar() {
        System.out.println("1 - Vinho  |  2 - Espumante  |  3 - Uisque");
        System.out.print("Escolha: ");
        int tipo = ler.nextInt();
        ler.nextLine();

        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("Regiao: ");
        String regiao = ler.nextLine();
        System.out.print("Preco: ");
        double preco = ler.nextDouble();
        System.out.print("Teor alcoolico (%): ");
        double teor = ler.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int estoque = ler.nextInt();
        ler.nextLine();

        if (tipo == 1) {
            System.out.println("Tipo (tinto / branco / rose): ");
            String tipoVinho = ler.nextLine();
            vinhos.add(new Vinho(nome, tipoVinho, regiao, preco, teor, estoque));
            System.out.println("Vinho cadastrado com sucesso!");

        } else if (tipo == 2) {
            System.out.print("Uva: ");
            String uva = ler.nextLine();
            System.out.println("Classificacao (brut / demi-sec / moscatel): ");
            String classificacao = ler.nextLine();
            espumantes.add(new Espumante(nome, uva, classificacao, regiao, preco, teor, estoque));
            System.out.println("Espumante cadastrado com sucesso!");

        } else if (tipo == 3) {
            System.out.println("Tipo (puro malte / single malt / blended malt): ");
            String tipoU = ler.nextLine();
            System.out.print("Idade (anos): ");
            int idade = ler.nextInt();
            ler.nextLine();
            uisques.add(new Uisque(nome, tipoU, idade, regiao, preco, teor, estoque));
            System.out.println("Uisque cadastrado com sucesso!");

        } else {
            System.out.println("Opcao invalida.");
        }
    }

    static void listarPorTipo() {
        System.out.println("1 - Vinhos  |  2 - Espumantes  |  3 - Uisques");
        System.out.print("Escolha: ");
        int tipo = ler.nextInt();
        ler.nextLine();

        if (tipo == 1) {
            if (vinhos.isEmpty()) { System.out.println("Nenhum vinho cadastrado."); return; }
            System.out.println("--- Vinhos ---");
            for (int i = 0; i < vinhos.size(); i++) { System.out.print(i + " - "); vinhos.get(i).exibir(); }

        } else if (tipo == 2) {
            if (espumantes.isEmpty()) { System.out.println("Nenhum espumante cadastrado."); return; }
            System.out.println("--- Espumantes ---");
            for (int i = 0; i < espumantes.size(); i++) { System.out.print(i + " - "); espumantes.get(i).exibir(); }

        } else if (tipo == 3) {
            if (uisques.isEmpty()) { System.out.println("Nenhum uisque cadastrado."); return; }
            System.out.println("--- Uisques ---");
            for (int i = 0; i < uisques.size(); i++) { System.out.print(i + " - "); uisques.get(i).exibir(); }

        } else {
            System.out.println("Opcao invalida.");
        }
    }

    static void listarTodos() {
        if (vinhos.isEmpty() && espumantes.isEmpty() && uisques.isEmpty()) {
            System.out.println("A adega esta vazia.");
            return;
        }
        System.out.println("--- Vinhos ---");
        if (vinhos.isEmpty()) System.out.println("Nenhum vinho cadastrado.");
        else for (Vinho v : vinhos) v.exibir();

        System.out.println("--- Espumantes ---");
        if (espumantes.isEmpty()) System.out.println("Nenhum espumante cadastrado.");
        else for (Espumante e : espumantes) e.exibir();

        System.out.println("--- Uisques ---");
        if (uisques.isEmpty()) System.out.println("Nenhum uisque cadastrado.");
        else for (Uisque u : uisques) u.exibir();
    }

    static void buscarPorNome() {
        System.out.print("Nome: ");
        String busca = ler.nextLine().toLowerCase();
        boolean encontrado = false;

        for (Vinho v : vinhos) {
            if (v.getNome().toLowerCase().contains(busca)) { v.exibir(); encontrado = true; }
        }
        for (Espumante e : espumantes) {
            if (e.getNome().toLowerCase().contains(busca)) { e.exibir(); encontrado = true; }
        }
        for (Uisque u : uisques) {
            if (u.getNome().toLowerCase().contains(busca)) { u.exibir(); encontrado = true; }
        }
        if (!encontrado) System.out.println("Nenhuma bebida encontrada com esse nome.");
    }

    static void servir() {
        System.out.print("Nome da bebida a servir: ");
        String busca = ler.nextLine().toLowerCase();
        boolean encontrado = false;

        for (Vinho v : vinhos) {
            if (v.getNome().toLowerCase().contains(busca)) { v.servir(); encontrado = true; break; }
        }
        if (!encontrado) for (Espumante e : espumantes) {
            if (e.getNome().toLowerCase().contains(busca)) { e.servir(); encontrado = true; break; }
        }
        if (!encontrado) for (Uisque u : uisques) {
            if (u.getNome().toLowerCase().contains(busca)) { u.servir(); encontrado = true; break; }
        }
        if (!encontrado) System.out.println("Bebida nao encontrada.");
    }

    static void remover() {
        System.out.println("1 - Vinho  |  2 - Espumante  |  3 - Uisque");
        System.out.print("Escolha: ");
        int tipo = ler.nextInt();
        ler.nextLine();

        if (tipo == 1) {
            if (vinhos.isEmpty()) { System.out.println("Nenhum vinho cadastrado."); return; }
            for (int i = 0; i < vinhos.size(); i++) { System.out.print(i + " - "); vinhos.get(i).exibir(); }
            System.out.print("Indice para remover: ");
            int idx = ler.nextInt(); ler.nextLine();
            if (idx >= 0 && idx < vinhos.size()) {
                System.out.println(vinhos.get(idx).getNome() + " removido.");
                vinhos.remove(idx);
            } else System.out.println("Indice invalido.");

        } else if (tipo == 2) {
            if (espumantes.isEmpty()) { System.out.println("Nenhum espumante cadastrado."); return; }
            for (int i = 0; i < espumantes.size(); i++) { System.out.print(i + " - "); espumantes.get(i).exibir(); }
            System.out.print("Indice para remover: ");
            int idx = ler.nextInt(); ler.nextLine();
            if (idx >= 0 && idx < espumantes.size()) {
                System.out.println(espumantes.get(idx).getNome() + " removido.");
                espumantes.remove(idx);
            } else System.out.println("Indice invalido.");

        } else if (tipo == 3) {
            if (uisques.isEmpty()) { System.out.println("Nenhum uisque cadastrado."); return; }
            for (int i = 0; i < uisques.size(); i++) { System.out.print(i + " - "); uisques.get(i).exibir(); }
            System.out.print("Indice para remover: ");
            int idx = ler.nextInt(); ler.nextLine();
            if (idx >= 0 && idx < uisques.size()) {
                System.out.println(uisques.get(idx).getNome() + " removido.");
                uisques.remove(idx);
            } else System.out.println("Indice invalido.");

        } else {
            System.out.println("Opcao invalida.");
        }
    }

    static void exibirClassificacoes() {
        if (vinhos.isEmpty() && espumantes.isEmpty() && uisques.isEmpty()) {
            System.out.println("A adega esta vazia.");
            return;
        }
        System.out.println("--- Classificacao de consumo ---");
        ArrayList<Bebida> todas = new ArrayList<>();
        todas.addAll(vinhos);
        todas.addAll(espumantes);
        todas.addAll(uisques);

        for (Bebida b : todas) {
            System.out.println(b.getNome() + " -> " + b.classificarConsumo());
        }
    }

    static void simularJantar() {
        System.out.print("Numero de convidados: ");
        int pessoas = ler.nextInt();
        ler.nextLine();

        System.out.println("Tipo de prato:");
        System.out.println("1 - Carne bovina");
        System.out.println("2 - Carne suina");
        System.out.println("3 - Massa");
        System.out.println("4 - Frutos do mar");
        System.out.println("5 - Ave");
        System.out.println("6 - Churrasco");
        System.out.print("Escolha: ");
        int prato = ler.nextInt();
        ler.nextLine();

        String pratNome, bebidaTipo, tipoSugerido;
        int garrafas;

        switch (prato) {
            case 1:
                pratNome = "Carne bovina";
                bebidaTipo = "Vinho";
                tipoSugerido = "Tinto";
                garrafas = (int) Math.ceil(pessoas / 2.0);
                break;
            case 2:
                pratNome = "Carne suina";
                bebidaTipo = "Vinho";
                tipoSugerido = "Rose";
                garrafas = (int) Math.ceil(pessoas / 2.0);
                break;
            case 3:
                pratNome = "Massa";
                bebidaTipo = "Vinho";
                tipoSugerido = "Tinto ou Branco";
                garrafas = (int) Math.ceil(pessoas / 1.0);
                break;
            case 4:
                pratNome = "Frutos do mar";
                bebidaTipo = "Espumante";
                tipoSugerido = "Brut";
                garrafas = (int) Math.ceil(pessoas / 3.0);
                break;
            case 5:
                pratNome = "Ave";
                bebidaTipo = "Vinho";
                tipoSugerido = "Branco";
                garrafas = (int) Math.ceil(pessoas / 1.0);
                break;
            case 6:
                pratNome = "Churrasco";
                bebidaTipo = "Uisque";
                tipoSugerido = "Puro malte ou Single malt";
                garrafas = (int) Math.ceil(pessoas / 6.0);
                break;
            default:
                System.out.println("Opcao invalida.");
                return;
        }

        System.out.println();
        System.out.println("Quantidade de pessoas: " + pessoas);
        System.out.println("Tipo de prato: " + pratNome);
        System.out.println();
        System.out.println("Sugestao:");
        System.out.println("Bebida: " + bebidaTipo);
        System.out.println("Tipo: " + tipoSugerido);
        System.out.println("Quantidade recomendada: " + garrafas + " garrafas");
        System.out.println();

        Bebida exemplo = null;
        if (bebidaTipo.equals("Vinho") && !vinhos.isEmpty()) {
            for (Vinho v : vinhos) {
                if (v.getTipo().toLowerCase().contains(tipoSugerido.toLowerCase().split(" ")[0])) {
                    exemplo = v;
                    break;
                }
            }
            if (exemplo == null) exemplo = vinhos.get(0);
        } else if (bebidaTipo.equals("Espumante") && !espumantes.isEmpty()) {
            exemplo = espumantes.get(0);
        } else if (bebidaTipo.equals("Uisque") && !uisques.isEmpty()) {
            exemplo = uisques.get(0);
        }

        if (exemplo != null) {
            System.out.println("Dica de consumo: " + exemplo.classificarConsumo());
        } else {
            Bebida temp;
            if (bebidaTipo.equals("Vinho")) temp = new Vinho("", tipoSugerido.split(" ")[0], "", 0, 0, 0);
            else if (bebidaTipo.equals("Espumante")) temp = new Espumante("", "", tipoSugerido, "", 0, 0, 0);
            else temp = new Uisque("", tipoSugerido, 12, "", 0, 0, 0);
            System.out.println("Dica de consumo: " + temp.classificarConsumo());
        }
    }

    static void totalGarrafas() {
        int totalVinhos = 0, totalEspumantes = 0, totalUisques = 0;
        for (Vinho v : vinhos) totalVinhos += v.getQuantidadeEstoque();
        for (Espumante e : espumantes) totalEspumantes += e.getQuantidadeEstoque();
        for (Uisque u : uisques) totalUisques += u.getQuantidadeEstoque();

        System.out.println("--- Total de garrafas ---");
        System.out.println("Vinhos:     " + totalVinhos + " garrafas");
        System.out.println("Espumantes: " + totalEspumantes + " garrafas");
        System.out.println("Uisques:    " + totalUisques + " garrafas");
        System.out.println("Total geral: " + (totalVinhos + totalEspumantes + totalUisques) + " garrafas");
    }

    static void listarParaJantar() {
        System.out.println("Tipo de jantar:");
        System.out.println("1 - Carne bovina  (vinho tinto)");
        System.out.println("2 - Carne suina   (vinho rose)");
        System.out.println("3 - Massa         (vinho tinto ou branco)");
        System.out.println("4 - Frutos do mar (espumante brut)");
        System.out.println("5 - Ave           (vinho branco)");
        System.out.println("6 - Churrasco     (uisque)");
        System.out.print("Escolha: ");
        int jantar = ler.nextInt();
        ler.nextLine();

        boolean encontrado = false;
        System.out.println("--- Bebidas disponiveis para esse jantar ---");

        switch (jantar) {
            case 1:
                for (Vinho v : vinhos) {
                    if (v.getTipo().equalsIgnoreCase("tinto") && v.getQuantidadeEstoque() > 0) {
                        v.exibir(); encontrado = true;
                    }
                }
                break;
            case 2:
                for (Vinho v : vinhos) {
                    if ((v.getTipo().equalsIgnoreCase("rose") || v.getTipo().equalsIgnoreCase("rosé"))
                            && v.getQuantidadeEstoque() > 0) {
                        v.exibir(); encontrado = true;
                    }
                }
                break;
            case 3:
                for (Vinho v : vinhos) {
                    if ((v.getTipo().equalsIgnoreCase("tinto") || v.getTipo().equalsIgnoreCase("branco"))
                            && v.getQuantidadeEstoque() > 0) {
                        v.exibir(); encontrado = true;
                    }
                }
                break;
            case 4:
                for (Espumante e : espumantes) {
                    if (e.getClassificacao().equalsIgnoreCase("brut") && e.getQuantidadeEstoque() > 0) {
                        e.exibir(); encontrado = true;
                    }
                }
                break;
            case 5:
                for (Vinho v : vinhos) {
                    if (v.getTipo().equalsIgnoreCase("branco") && v.getQuantidadeEstoque() > 0) {
                        v.exibir(); encontrado = true;
                    }
                }
                break;
            case 6:
                for (Uisque u : uisques) {
                    if (u.getQuantidadeEstoque() > 0) {
                        u.exibir(); encontrado = true;
                    }
                }
                break;
            default:
                System.out.println("Opcao invalida.");
                return;
        }

        if (!encontrado) System.out.println("Nenhuma bebida disponivel no estoque para esse jantar.");
    }
}