package exemplo;
//Aula 4.2
public class Codigo {
	public void metodoA(){
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				for (int m = 0; m < 100; m++) {
					//código
				}
			}
		}
	}
	public void metodoB(){
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				//código
			}
		}
		for (int m = 0; m < 100; m++) {
			//código
		}
	}
	public void metodoC(){
		for (int i = 0; i < 100; i++) {
			//código
		}
		for (int j = 0; j < 100; j++) {
			//código
		}
		for (int m = 0; m < 100; m++) {
			//código
		}
	}
}
