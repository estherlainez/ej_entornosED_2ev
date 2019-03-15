package code;
/**
 * En esta clase buscamos el minimo comun multiplo de unos numeros
 * @author Esther
 *
 */

public class MinimoComunMultiplo {
  public MinimoComunMultiplo() {}

  public int candidatosMcM(int[] args) {
    if (args.length < 2) {
      throw new IllegalArgumentException(
        "Hacen falta dos o más números"
      );
    }

    if (algunoEsCero(args)) {
      throw new IllegalArgumentException(
        "Los números no pueden ser cero"
      );
    }

    args = abs(args);

    int max = max(args);
    int d = max;

    while (true) {
      if (esMinimoComunMultiplo(d, args)) {
        return d;
      }

      d += max;
    }
  }
/**
 * @return valor booleano que nos detecta si hay algun cero o no
 */
  private boolean algunoEsCero(int[] ints) {
    for (int d : ints) {
      if (d == 0) {
        return true;
      }
    }

    return false;
  }

  
  private static int[] abs(int[] ints) {
    int[] abs = new int[ints.length];

    for (int i = 0; i < ints.length; i += 1) {
      abs[i] = Math.abs(ints[i]);
    }

    return abs;
  }
  
/**
 * @return maximo
 * metodo que nos devuelve el valor maximo
 */
  private int max(int[] ints) {
    int max = ints[0];

    for (int i = 1; i < ints.length; i += 1) {
      max = Math.max(max, ints[i]);
    }

    return max;
  }
  
/**
 * @param nos verificara el valor d
 * @return nos devuelve un valor booleano comprobando la variable d
 */
  private boolean esMinimoComunMultiplo(int d, int[] ints) {
    for (int i = 0; i < ints.length; i += 1) {
      if (d % ints[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
