package ativcap_5;
import javax.swing.JOptionPane;
public class AtivCap_5 {
    public static void main(String[] args) {
     /*
        int quantidadeDiaria;
        int quantidadeProduzidaAno = 0;
        int menorProducaoDiaria = Integer.MAX_VALUE;
        int dia = 1;

        JOptionPane.showMessageDialog(null, "Digite a quantidade produzida diariamente ao longo do ano (-1 para encerrar):");

        while (true) {
            String input = JOptionPane.showInputDialog("Quantidade do dia " + dia + " (ou -1 para encerrar):");

            try {
                quantidadeDiaria = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
                continue;
            }

            if (quantidadeDiaria == -1) {
                break;
            }

            quantidadeProduzidaAno += quantidadeDiaria;

            if (quantidadeDiaria < menorProducaoDiaria) {
                menorProducaoDiaria = quantidadeDiaria;
            }

            dia++;
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade produzida no ano: " + quantidadeProduzidaAno + "\n" +
                        "Menor produção diária: " + (menorProducaoDiaria == Integer.MAX_VALUE ? "N/A" : menorProducaoDiaria));
    }
}   
    */
     /*
     int limite = 100;
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i * i <= limite; i++) {
            int quadrado = i * i;
            resultado.append(quadrado);

            // Adicionar uma vírgula e um espaço se não for o último número
            if (i * i < limite) {
                resultado.append(", ");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
     */
     /*
     String input = JOptionPane.showInputDialog("Digite o valor de N:");
            int n = Integer.parseInt(input);

            double soma = 0;

            // Calcular a soma da série
            for (int i = 1; i <= n; i++) {
                soma += 1.0 / (2 * i);
            }

            // Exibir o resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, "A soma da série para N = " + n + " é: " + soma);
    }
}
     */
     /*
     String input = JOptionPane.showInputDialog("Digite o número de iterações para calcular Pi:");
            int iteracoes = Integer.parseInt(input);

            double piAproximado = calculaPi(iteracoes);

            JOptionPane.showMessageDialog(null, "Valor aproximado de Pi: " + piAproximado);
        }

        private static double calculaPi(int iteracoes) {
            double pi = 0.0;

            for (int i = 0; i < iteracoes; i++) {
                double termo = 4.0 / (2 * i + 1);

                // Alternar sinal a cada termo
                if (i % 2 == 0) {
                    pi += termo;
                } else {
                    pi -= termo;
                }
            }

            return pi;
    }
     */
     /*
     String input = JOptionPane.showInputDialog("Digite um número:");
            double numero = Double.parseDouble(input);

            double resultado = Math.pow(numero, 5);

            JOptionPane.showMessageDialog(null, "O número elevado à quinta potência é: " + resultado);
    }
}
     */
     /*
      String inputBase = JOptionPane.showInputDialog("Digite a base (X):");
            double base = Double.parseDouble(inputBase);

            String inputExpoente = JOptionPane.showInputDialog("Digite o expoente (Y):");
            int expoente = Integer.parseInt(inputExpoente);

            double resultado = Math.pow(base, expoente);

            JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é: " + resultado);
        }
    }
     */
     /*
      int i = 1;

        while (i < 20) {

            i += 2;

            JOptionPane.showMessageDialog(null, "Passei por aqui!");

            quad(1);

            JOptionPane.showMessageDialog(null, 13);
     
            JOptionPane.showMessageDialog(null, "Ufa, cheguei aqui!");
        }
    }

    public static void quad(int x) {

        JOptionPane.showMessageDialog(null, x * x);
    }
}
     */
     /*
      int x = 30;
        int y = 0;

       
        while (x < 10) {
     
            x++;
            y--;

            JOptionPane.showMessageDialog(null, x + " " + y);
        }
    }
     */
     /*
     int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da série:"));
        double soma = 0;

 
        for (int i = 1; i <= n; i++) {
         
            double termo = (i * i) / (i + 1);

            soma += termo;
        }

        // Mostrar a soma
        JOptionPane.showMessageDialog(null, "A soma da série é: " + soma);
    }
}
     */
     
     int quantidadeNegativos = 0;

            for (int i = 0; i < 5; i++) {
            
                String input = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + ":");
                double valor = Double.parseDouble(input);

                if (valor < 0) {
                    quantidadeNegativos++;
                }
            }

            JOptionPane.showMessageDialog(null, "Quantidade de valores negativos: " + quantidadeNegativos);
        }
    }