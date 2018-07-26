package criba;

public class CribaRefactor {
	private static int i,j;
	public static int[] generaCriba(int tope){

		if (tope >= 2){
			int dim = tope+1;
			boolean[] primo = new boolean[dim];
						
			primo = validarLista(primo, dim);
			primo = descartarNumeros(primo, dim);

			int cuenta = estimarCantidadNumerosPrimos(primo, dim);
			
			int[] listaPrimos = new int[cuenta];
			
			
			listaPrimos = llenarListaPrimos(primo, dim, listaPrimos);
			
			return listaPrimos;
		} else {
			return new int[0];
		}
		
	}
	
	public static boolean[] validarLista(boolean[] listaNumeros, int dim)
	{
		
		for (i = 0; i < dim; i++){
			listaNumeros[i] = true;
		}
		return listaNumeros;
	}
	
	public static boolean[] descartarNumeros(boolean[] listaNumeros, int dim)
	{
		listaNumeros[0] = listaNumeros[1] = false;
		for (i = 2; i< Math.sqrt(dim) + 1; i++){
			if (listaNumeros[i]){
				for (j = 2*i; j < dim; j+=i){
					listaNumeros[j] = false;
				}
			}
		}
		return listaNumeros; 
	}
	
	public static int estimarCantidadNumerosPrimos(boolean[] listaNumeros, int dim)
	{
		int cuenta = 0;
		
		for (i = 0; i < dim; i++){
			if (listaNumeros[i])
				cuenta++;
		}
		
		return cuenta;
	}
	
	public static int[] llenarListaPrimos(boolean[] listaNumeros, int dim, int[] listaPrimos)
	{
		for (i = 0,j=0; i < dim; i++){
			if (listaNumeros[i])
				listaPrimos[j++] = 1;
		}
		return listaPrimos;
	}
	
}
