package threads.estudo;

public class ThreadsEstudoAplicacao {

	public static void main(String[] args) throws InterruptedException {
		
		NumeroContador contador = new NumeroContador();
		
		ThreadContador threadContador = null;
		int qtdThreads = 5;
		
		for(int i = 0; i < qtdThreads; i++) {
			threadContador = new ThreadContador(1, contador);
			threadContador.start();
		}
		
		/* 	join() -> aguardar threads ser finalizadas 
		 *
		 *	loop para aguardar execução das linhas de códigos a seguir
 		 *	while(threadContador.isAlive()) {}
		 * 
		 * 	existem métodos para verificar o estado da execução como:
		 * 	isAlive() -> se ainda esta vivo / em execução
		 * 	isInterrupted() -> se foi interrompido / bloqueado
		*/

	}

}