package YoutubeEgitim;

public abstract class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
	System.out.println("Ogretmen kredisi hesaplandi.");
	}
	
}
