package YoutubeEgitim;

public class CarCreditManager extends BaseCreditManager implements ICreditManager {
	

	@Override
	public void Calculate() {
		System.out.println("Araba kredisi hesapland─▒.");
	}
	@Override
	public void Save() {
		System.out.println("Kaydedildi.");
	}

}

