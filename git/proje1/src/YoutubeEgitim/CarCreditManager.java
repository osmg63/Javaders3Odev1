package YoutubeEgitim;

public class CarCreditManager extends BaseCreditManager implements ICreditManager {
	

	@Override
	public void Calculate() {
		System.out.println("Araba kredisi hesaplandı.");
	}
	@Override
	public void Save() {
		System.out.println("Kaydedildi.");
	}

}

