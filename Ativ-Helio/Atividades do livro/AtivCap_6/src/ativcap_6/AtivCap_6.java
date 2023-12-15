package ativcap_6;
import javax.swing.*;
import javax.swing.JOptionPane;
public class AtivCap_6 {

    public static void main(String[] args) {
      /*
        int[] registros = new int[30];

        for(int i = 0; i < registros.length; i++) {
            int quantidadeDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
            registros[i] = quantidadeDeCarros;
        }
   
        int maiorVolume = 0;
        int diaDoMaiorVolume = 0;
            for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorVolume) {
                maiorVolume = registros[i];
             diaDoMaiorVolume = i + 1;
            }
        }
   
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram no mês de setembro foi de " + maiorVolume + " no dia " + diaDoMaiorVolume);
    }
}
        /*
        int[] registros = new int[30];

        for (int i = 0; i < registros.length; i++) {
            int quantidadeDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de carros que passaram no dia " + (i + 1)));
                registros[i] = quantidadeDeCarros;
        }
 
        int maiorVolume = 0;
        int diaDoMaiorVolume = 0;
        int menorVolume = Integer.MAX_VALUE;
        int diaDoMenorVolume = 0;
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] > maiorVolume) {
                maiorVolume = registros[i];
                diaDoMaiorVolume = i + 1;
            } else if (registros[i] < menorVolume) {
                menorVolume = registros[i];
                diaDoMenorVolume = i + 1;
            }
        }
 
        JOptionPane.showMessageDialog(null, "O maior volume de carros que passaram no mês de setembro foi de " + maiorVolume + " no dia "
                + diaDoMaiorVolume + "\nO menor volume de carros que passaram no mês de setembro foi de " + menorVolume + " no dia " + diaDoMenorVolume);
    }
}
        */
      /*
       double[] saldos = new double[20];

        for (int i = 0; i < saldos.length; i++) {
            saldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do cliente " + (i + 1)));
        }

        for (double saldo : saldos) {
            JOptionPane.showMessageDialog(null, "Saldo: " + String.format("%.2f", saldo));
        }
    }
      */
      /*
      double[][] A = new double[3][2];
      double[][] B = new double[2][3];

      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < A[i].length; j++) {
              A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A[" + i + "][" + j + "]:"));
          }
      }
      for (int i = 0; i < B.length; i++) {
          for (int j = 0; j < B[i].length; j++) {
              B[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B[" + i + "][" + j + "]:"));
          }
      }

      double[][] C = new double[A.length][B[0].length];
      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < B[0].length; j++) {
              for (int k = 0; k < A[0].length; k++) {
                  C[i][j] += A[i][k] * B[k][j];
              }
          }
      }

      for (int i = 0; i < C.length; i++) {
          for (int j = 0; j < C[0].length; j++) {
              JOptionPane.showMessageDialog(null, "C[" + i + "][" + j + "]: " + C[i][j]);
          }
      }
      */
      /*
      int[][] matriz = new int[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 2;
                }
            }
        }
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                JOptionPane.showMessageDialog(null, "matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
      */
      /*
       double[][] A = new double[5][5];
        double[][] B = new double[5][5];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A[" + i + "][" + j + "]:"));
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B[" + i + "][" + j + "]:"));
            }
        }

        double[][] C = new double[5][5];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = 0;
            }
        }
   
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    for (int l = 0; l < B[k].length; l++) {
                        if (A[i][j] == B[k][l]) {
                            C[i][j] = 1;
                        }
                    }
                }
            }
        }
     
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                JOptionPane.showMessageDialog(null, "C[" + i + "][" + j + "]: " + C[i][j]);
            }
        }
      */
      /*
       double[] precosIniciais = new double[15];

        double[] precosFinais = new double[15];

        for (int i = 0; i < precosIniciais.length; i++) {
            precosIniciais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no início da semana:"));
        }

        for (int i = 0; i < precosFinais.length; i++) {
            precosFinais[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i + 1) + " no fim da semana:"));
        }

        double[] variacoes = new double[15];
        for (int i = 0; i < variacoes.length; i++) {
            variacoes[i] = precosFinais[i] - precosIniciais[i];
        }

        double[] precosMedios = new double[15];
        for (int i = 0; i < precosMedios.length; i++) {
            precosMedios[i] = (precosIniciais[i] + precosFinais[i]) / 2;
        }

        for (int i = 0; i < precosMedios.length; i++) {
            JOptionPane.showMessageDialog(null, "Preço médio do produto " + (i + 1) + ": " + String.format("%.2f", precosMedios[i]));
        }
    }
      */
      /*
      int numDisciplinas = 5;
        int numNotasPorDisciplina = 4;

        double notaMaisAlta = Double.MIN_VALUE;

        for (int i = 1; i <= numDisciplinas; i++) {
            // Loop interno para iterar sobre as notas da disciplina atual
            for (int j = 1; j <= numNotasPorDisciplina; j++) {
                // Solicitar a nota ao usuário usando JOptionPane
                String input = JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":");

                // Converter a entrada para double
                double nota = Double.parseDouble(input);

                // Verificar se a nota é a mais alta
                if (nota > notaMaisAlta) {
                    notaMaisAlta = nota;
                }
            }
        }
    
        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notaMaisAlta);
    }
}
      */
      /*
       int numDisciplinas = 5;
        int numNotasPorDisciplina = 4;

        double notaMaisAlta = Double.MIN_VALUE;
        int disciplinaNotaMaisAlta = 0;

        for (int i = 1; i <= numDisciplinas; i++) {
    
            for (int j = 1; j <= numNotasPorDisciplina; j++) {
      
                String input = JOptionPane.showInputDialog("Digite a nota " + j + " da disciplina " + i + ":");

                double nota = Double.parseDouble(input);

                if (nota > notaMaisAlta) {
                    notaMaisAlta = nota;
                    disciplinaNotaMaisAlta = i;
                }
            }
        }
     
        JOptionPane.showMessageDialog(null, "A nota mais alta é: " + notaMaisAlta + " na disciplina " + disciplinaNotaMaisAlta);
    }
}
      */
      int maxCheques = 10;

        double[] valoresCheques = new double[maxCheques];

        int numeroCheques;
        do {
            String input = JOptionPane.showInputDialog("Informe o número de cheques usados no mês (até " + maxCheques + " cheques):");
            numeroCheques = Integer.parseInt(input);
        } while (numeroCheques <= 0 || numeroCheques > maxCheques);

        for (int i = 0; i < numeroCheques; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor do cheque " + (i + 1) + ":");
            valoresCheques[i] = Double.parseDouble(input);
        }

        double maiorValor = valoresCheques[0];
        double menorValor = valoresCheques[0];

        for (int i = 1; i < numeroCheques; i++) {
            if (valoresCheques[i] > maiorValor) {
                maiorValor = valoresCheques[i];
            }
            if (valoresCheques[i] < menorValor) {
                menorValor = valoresCheques[i];
            }
        }

        StringBuilder listaValores = new StringBuilder("Valores dos cheques:\n");
        for (int i = 0; i < numeroCheques; i++) {
            listaValores.append("Cheque ").append(i + 1).append(": ").append(valoresCheques[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, listaValores.toString() + "Maior valor: "
                + maiorValor + "\n" + "Menor valor: " + menorValor);
    }
}
        
