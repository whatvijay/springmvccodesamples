package controllers;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.CreditCardNumber;
public class Person {
	@NotEmpty
	private String name;
	@CreditCardNumber	
	private String contactNo;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContactNo() {
			return contactNo;
		}
		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}
		
}
