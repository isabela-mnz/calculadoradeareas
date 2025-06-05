public static class Main {
        public static void main (String [] args) {
            int opcao;
            Scanner scanner = new Scanner(System.in);

            String menu = """
                    Escolha uma destas opções:
                    1. Calcular a área do quadrado
                    2. Calcular a área do circulo
                    0. Sair""";

            while (true) {
                System.out.println(menu);
                opcao = scanner.nextInt();

                if (opcao == 1) {
                    System.out.println("Digite o valor escolhido para calcular a área: ");
                    double lado = scanner.nextDouble();
                    double areaDoQuadrado = lado * lado;
                    System.out.println("O valor da área do quadrado é de: " + areaDoQuadrado);
                    break;
                } else if (opcao == 2) {
                    System.out.println("Digite o valor escolhido para calcular a área: ");
                    double raio = scanner.nextDouble();
                    double areaDoCirculo = Math.PI * raio * raio;
                    System.out.println("O valor da área do circulo é de: " + areaDoCirculo);
                    break;
                } else if (opcao == 0) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("Opção inválida, tente novamente");
                }
                scanner.close();
