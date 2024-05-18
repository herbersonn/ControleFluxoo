package control;

public class Contador {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor, forneça dois números inteiros como parâmetros.");
            return;
        }

        try {
            int parametro1 = Integer.parseInt(args[0]);
            int parametro2 = Integer.parseInt(args[1]);

            contar(parametro1, parametro2);
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidade = parametro2 - parametro1;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
