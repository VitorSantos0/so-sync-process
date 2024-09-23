package threads.estudo;

public class NumeroContador {

	int numero;
	int limite;
	
	NumeroContador() {
		this.numero = 0;
		this.limite = 10;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getLimite() {
		return this.limite;
	}
	
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	/*
	 * Incremento padrão
	 */
	public void add(String thread) {
		if(this.numero < this.limite)
			this.numero++;
		System.out.println(thread+" -> contador: "+this.numero);
	}
	
	/*
	 * Incremento com sincronismo
	 */
	public synchronized void syncAdd(String thread) {
		if(this.numero < this.limite)
			this.numero++;
		System.out.println(thread+" -> contador: "+this.numero);
	}
	
}