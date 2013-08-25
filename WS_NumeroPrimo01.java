package numeroPrimo01;

/**
 *
 * @author Lucas F. Buozi
 *
 * lista de números primos usados para testes:
 * http://www.ime.unicamp.br/~ftorres/ENSINO/CURSOS/primos.pdf
 *
 */
import java.util.Arrays;
import javax.jws.WebService;

@WebService(serviceName = "WS_NumeroPrimo01")
public class WS_NumeroPrimo01 {

    public String ePrimo(int numero) {
        boolean ePrimo = false;
        int cont = 0;
        // um número par maior que 2 nunca será primo, então não é necessário continuar. 1 não é primo
        if ((numero % 2 > 0 || numero == 2) && numero > 1) {
            // baseado no Crivo de Eratóstenes, será verificado se o número terá divisor até sua raiz quadrada
            for (int i = 1; i < Math.sqrt(numero) + 1; i++) {
                if (numero % i == 0) {
                    //contagem de divisores
                    cont++;
                    // verifica se há 1 divisor, não é primo e encerra
                    ePrimo = (cont < 2);
                    if (!ePrimo) {
                        break;
                    }
                }
            }
        }
        return ("Número " + numero + (ePrimo ? " " : " não ") + "é primo.");
    }
}