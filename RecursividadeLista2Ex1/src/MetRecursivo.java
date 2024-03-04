
public class MetRecursivo {

	public int multiplicaSoma (int a, int b)
	{
		if( b <= 1)
		return a;
		return a + multiplicaSoma(a, b-1);
	}

	public int restoDivisao (int a, int b)
	{
		if(b > a)
		{
			return a;
		}

		a = a - b;

		return restoDivisao(a, b);
	}

	public int contaPares(int[] vet, int tam, int pares)
	{

		if (tam < 0)
		{
			return pares;
		}


		if( vet[tam] % 2 == 0)
		{
			pares++;
		}


		return contaPares(vet, tam - 1, pares);
	}

	public int fatorialDuplo(int a)
	{
		if (a <= 1)
		{
			return 1;
		}
		return a * fatorialDuplo(a - 2);
	}

	public static int calcularMDC(int x, int y) {
		if (x == y) {
			return x;
		} else if (x > y) {
			return calcularMDC(x - y, y);
		} else {
			return calcularMDC(y, x);
		}
	}


}

