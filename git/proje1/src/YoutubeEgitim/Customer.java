package YoutubeEgitim;

public class Customer {
	
	private int Id;
	private String FirstName;
	

	public Customer() {
		System.out.println("Musteri nesnesi baslatildi.");
	}
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

}
