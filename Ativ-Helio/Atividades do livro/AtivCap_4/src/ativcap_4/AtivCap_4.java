package ativcap_4;
import javax.swing.JOptionPane;
public class AtivCap_4 {

    public static void main(String[] args) {
       /*
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));

            double debitos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de débitos:"));

            double creditos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de créditos:"));

            double saldoFinal = saldoInicial - debitos + creditos;

            if (saldoFinal > 0) {
                JOptionPane.showMessageDialog(null, "Saldo positivo em R$" + saldoFinal);
            } else if (saldoFinal < 0) {
                JOptionPane.showMessageDialog(null, "Saldo negativo em R$" + saldoFinal);
            } else {
                JOptionPane.showMessageDialog(null, "Saldo zero.");
            }
    }
 */
       
       /*
       double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em quilogramas:"));

            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));

            double imc = calcularIMC(peso, altura);

            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + interpretarIMC(imc));
        }

        private static double calcularIMC(double peso, double altura) {
            return peso / (altura * altura);
        }

        private static String interpretarIMC(double imc) {
            if (imc < 18.5) {
                return "Abaixo do peso";
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidade leve";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidade moderado";
            } else {
                return "Obesidade mórbido";
            }
    }
       */
       /*
       int diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana (1 a 7):"));
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do espectador:"));
            double precoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço base do ingresso:"));

            double precoFinal = calcularPrecoFinal(diaSemana, idade, precoBase);

            JOptionPane.showMessageDialog(null, "O valor a pagar é de R$" + precoFinal);
        }
        private static double calcularPrecoFinal(int diaSemana, int idade, double precoBase) {
            double descontoDia = (diaSemana == 3) ? 0.5 : 0;
            double descontoIdade = (idade < 14) ? 0.5 : 0;

            return precoBase * (1 - descontoDia) * (1 - descontoIdade);
    }
}
       */
       /*
       double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));

            if (valor % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O quadrado do valor é: " + Math.pow(valor, 2));
            } else {
                JOptionPane.showMessageDialog(null, "O cubo do valor é: " + Math.pow(valor, 3));
            }
        }
    }
       */
       /*
       double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida (Km):"));
        double combustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustível (Litros):"));

        double consumo = distancia / combustivel;

        JOptionPane.showMessageDialog(null, "O consumo é de " + consumo + " Km/l.");

        if (consumo > 15) {
            JOptionPane.showMessageDialog(null, "O veículo não é econômico.");
        } else {
            JOptionPane.showMessageDialog(null, "O veículo é econômico.");
        }
    }
       */
       /*
         int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                JOptionPane.showMessageDialog(null, ano + " é um ano bissexto.");
            } else {
                JOptionPane.showMessageDialog(null, ano + " não é um ano bissexto.");
            }
    }
       */
       /*
       String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
            double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 6) {
                JOptionPane.showMessageDialog(null, nomeAluno + " foi aprovado com média " + media);
            } else {
                JOptionPane.showMessageDialog(null, nomeAluno + " foi reprovado com média " + media);
            }
    }
       */
       /*
       double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x:"));
            double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y:"));

            double parabola = x * x - 3 * x + 1;

            if (y > parabola) {
                JOptionPane.showMessageDialog(null, "O ponto está acima da parábola.");
            } else if (y < parabola) {
                JOptionPane.showMessageDialog(null, "O ponto está abaixo da parábola.");
            } else {
                JOptionPane.showMessageDialog(null, "O ponto pertence à parábola.");
            }
    }
       */
       /*
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else {
            int anosRestantes = 18 - idade;
            JOptionPane.showMessageDialog(null, "Você é menor de idade. Ainda faltam " + anosRestantes + " anos para ser maior.");
        }
    }
       */
       String nomeCandidato1 = JOptionPane.showInputDialog("Digite o nome do candidato 1:");
        int votosCandidato1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 1:"));

        String nomeCandidato2 = JOptionPane.showInputDialog("Digite o nome do candidato 2:");
        int votosCandidato2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 2:"));

        String nomeCandidato3 = JOptionPane.showInputDialog("Digite o nome do candidato 3:");
        int votosCandidato3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de votos do candidato 3:"));

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            JOptionPane.showMessageDialog(null, nomeCandidato1 + " venceu a eleição!");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            JOptionPane.showMessageDialog(null, nomeCandidato2 + " venceu a eleição!");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            JOptionPane.showMessageDialog(null, nomeCandidato3 + " venceu a eleição!");
        } else {
            JOptionPane.showMessageDialog(null, "A eleição terminou em empate.");
        }
    }
}

    
