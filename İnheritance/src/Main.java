

public class Main {

	public static void main(String[] args) {
		

		
		

		
		ýndividualCustomer individualCustomer = new ýndividualCustomer();
		
		individualCustomer.customerNumber="555531";
	CorporateCustomer corporateCustomer = new CorporateCustomer()	;
	corporateCustomer.customerNumber="25513";
	
	
	SandikaManager sandikaManager1 =new SandikaManager();

	sandikaManager1.customerNumber="111";

		Customer []customers = {corporateCustomer,sandikaManager1,individualCustomer};
	
		CustomerManager customerManager = new CustomerManager();
		
customerManager.addMultiple(customers);
	}

}
