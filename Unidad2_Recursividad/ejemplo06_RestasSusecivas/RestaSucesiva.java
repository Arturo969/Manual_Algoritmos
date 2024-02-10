package ejemplo06_RestasSusecivas;

public class RestaSucesiva {
	int c = 0;
	int d;
	
	public int restaSucesiva(int d, int D) {
	    this.d = d;
	    if (D == 0) {
	        System.out.println("División entre cero!!!!");
	        return -1;
	    } else {
	        if (d < D) {
	            return c;
	        } else {
	            c++;
	            d = d - D;
	            System.out.printf("\n\n-------------\n %d° Resta:\n-------------\n%d - %d = %d \n=============\n", c,
	                    this.d, D, d);
	            // Devuelve el resultado de la llamada recursiva
	            return restaSucesiva(d, D);
	        }
	    }
	}
}
