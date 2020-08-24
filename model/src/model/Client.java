package model;

public class Client {
	
	private String name;
	private String surname;
	private int accountNumber;
	private String accountPassword;
	

	public Client(BankAccount bankAccount, String name, String surname, int accountNumber, String accountPassword)
	  {
		  this.name = name;
		  this.surname = surname;
		
	  }

	  public String getName()
	  {
	      return name;
	  }

	  public String getSurname()
	  {
	    return surname;
	  }
	  public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountPassword() {
			return accountPassword;
		}

		public void setAccountPassword(String accountPassword) {
			this.accountPassword = accountPassword;
		}

		@Override
		public String toString() {
			return "Client [name=" + name + ", surname=" + surname + ", accountNumber=" + accountNumber
					+ ", accountPassword=" + accountPassword + ", getName()=" + getName() + ", getSurname()="
					+ getSurname() + ", getAccountNumber()=" + getAccountNumber() + ", getAccountPassword()="
					+ getAccountPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		
}
