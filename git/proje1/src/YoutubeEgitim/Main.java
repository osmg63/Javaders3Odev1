package YoutubeEgitim;

public class Main {

	public static void main(String[] args) {

		/*CreditManager creditManager = new CreditManager();
		Customer customer = new Customer();
		CustomerManager customerManager = new CustomerManager(customer);
		Company company = new Company();
		Person person= new Person();
		
		company.setFirstName("lenova");
		company.setTaxNumber(27001);
		company.setId(00001);
		
		person.setFirstName("osman");
		person.setId(00002);
		person.setNationalIdentiy("12156");
				
		
		customerManager.customerSave();
		customerManager.customerDelete();
		creditManager.save();
		company.setTaxNumber(1212);
		*/
		CustomerManager customerManager = new CustomerManager(new Customer(),new CarCreditManager());
		
		customerManager.customerSave();
		customerManager.GiveCredit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
