package ativcap_3;
import javax.swing.JOptionPane;
public class AtivCap_3 {
    public static void main(String[] args) {
    /*   
     double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terreno:"));
            double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno:"));

            double area = calcularAreaTerreno(comprimento, largura);

            JOptionPane.showMessageDialog(null, "A área do terreno é: " + area + " metros quadrados.");
        }

        private static double calcularAreaTerreno(double comprimento, double largura) {
            return comprimento * largura;
        }
    }
*/
    
/*
     int quantidadeCavalos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos:"));

        int quantidadeFerraduras = calcularQuantidadeFerraduras(quantidadeCavalos);

        JOptionPane.showMessageDialog(null, "São necessárias " + quantidadeFerraduras + " ferraduras.");

        private static int calcularQuantidadeFerraduras(int quantidadeCavalos) {
            return quantidadeCavalos * 4;
        }
    }
    */

/*
 int quantidadePaes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pães franceses:"));
        int quantidadeBroas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de broas:"));

        double valorTotal = calcularValorTotal(quantidadePaes, quantidadeBroas);
        double valorPoupanca = calcularValorPoupanca(valorTotal);

        JOptionPane.showMessageDialog(null, "A arrecadação total é de R$" + valorTotal +  "\nO valor a ser guardado na poupança é de R$" + valorPoupanca);
        }
        private static double calcularValorTotal(int quantidadePaes, int quantidadeBroas) {
            double valorPaes = quantidadePaes * 0.12;
            double valorBroas = quantidadeBroas * 1.50;

            return valorPaes + valorBroas;
        }
        private static double calcularValorPoupanca(double valorTotal) {
            return valorTotal * 0.10;
        }
    }
*/

/*
 String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        int diasDeVida = calcularDiasDeVida(idade);

        JOptionPane.showMessageDialog(null, nome + " possui " + diasDeVida + " dias de vida.");

        private static int calcularDiasDeVida(int idade) {
        return idade * 365;
         }
    }
*/

/*
 double precoLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro da gasolina:"));
        double valorPagamento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento:"));

        double litrosAbastecidos = calcularLitrosAbastecidos(precoLitro, valorPagamento);

        JOptionPane.showMessageDialog(null, "Você conseguiu abastecer " + litrosAbastecidos + " litros de gasolina.");

        private static double calcularLitrosAbastecidos(double precoLitro, double valorPagamento) {
            return valorPagamento / precoLitro;
        }
    }
*/

/*
double pesoPrato = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do prato (em quilos):"));

            double valorPagar = calcularValorPagar(pesoPrato);

            JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + valorPagar);

        private static double calcularValorPagar(double pesoPrato) {
            return pesoPrato * 12.00;
        }
    }

*/

/*
int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));

            int diasPassados = calcularDiasPassados(dia, mes);

            JOptionPane.showMessageDialog(null, "Desde o início do ano passaram-se " + diasPassados + " dias.");


        private static int calcularDiasPassados(int dia, int mes) {
            return (mes - 1) * 30 + dia;
        }
    }
*/

/*
 double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

            double media = calcularMediaPonderada(nota1, nota2, nota3);

            JOptionPane.showMessageDialog(null, "A média ponderada é: " + media);

        private static double calcularMediaPonderada(double nota1, double nota2, double nota3) {
            return (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;
        }
    }

*/

/*
 int qtdPequenas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas pequenas:"));
            int qtdMedias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas médias:"));
            int qtdGrandes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas grandes:"));

            double valorArrecadado = calcularValorArrecadado(qtdPequenas, qtdMedias, qtdGrandes);

            JOptionPane.showMessageDialog(null, "O valor arrecadado é R$" + valorArrecadado);

        private static double calcularValorArrecadado(int qtdPequenas, int qtdMedias, int qtdGrandes) {
            return qtdPequenas * 10 + qtdMedias * 12 + qtdGrandes * 15;
        }
    }
*/


double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do primeiro ponto:"));
            double y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do primeiro ponto:"));

            double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do segundo ponto:"));
            double y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do segundo ponto:"));

            double distancia = calcularDistanciaEntrePontos(x1, y1, x2, y2);

            JOptionPane.showMessageDialog(null, "A distância entre os pontos é: " + distancia);

        private static double calcularDistanciaEntrePontos(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        }
    }
