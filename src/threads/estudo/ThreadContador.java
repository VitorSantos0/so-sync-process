package threads.estudo;

public class ThreadContador extends Thread {

	int segundos;
	NumeroContador numero;

	ThreadContador (int segundos, NumeroContador numero) {
		this.segundos = segundos*1000; // conversao para milisegundos
		this.numero = numero;
	}
	
	@Override
	public void run() {
		try {
			while(this.numero.getNumero() < this.numero.getLimite()) {
				Thread.sleep(this.segundos);
				this.numero.syncAdd(getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName()+" finalizada");
	}
	
}