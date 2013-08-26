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
        boolean ePrimo = numero>1;
        // baseado no Crivo de Eratóstenes, será verificado se o número terá divisor até sua raiz quadrada
        for (int i = 2; i < Math.sqrt(numero) + 1; i++) {
            if (numero % i == 0 && numero > 2) {
                // verifica se há 1 divisor, não é primo e encerra
                ePrimo = (false);
                break;
            }
        }
        return ("Número " + numero + (ePrimo ? " " : " não ") + "é primo.");
    }
}
