package YoutubeEgitim;
public class CustomerManager{
	private Customer _customer;
	private ICreditManager _creditManager;
	public CustomerManager(Customer customer,ICreditManager creditManager){
		_customer=customer;
		_creditManager=creditManager;
	}
	public void customerSave() {
		System.out.println("Musteri kaydedildi:");
	}
	public void customerDelete() {
		System.out.println("Musteri silindi:");
	}
	public void GiveCredit() {
		_creditManager.Calculate();
		_creditManager.Save();
		System.out.println("kredi verildi");
	}
	
	
}
