package src;

import java.time.LocalDate;
import java.util.Objects;

import enums.ServicePlan;

public class Customer implements Comparable{
    int customerId;
    String firstName;
    String lastName;
    String email;
    String password;
    double regAmount;
    LocalDate dob;
    ServicePlan plan;
    static int idGenerator;

    static {
        idGenerator = 0;
    }

    // overloaded constructor to set email as primary key(PK)
    public Customer(String email) {
        super();
        this.email = email;
    }

    // all fields constructor
    public Customer(String firstName, String lastName, String email, String password, double regAmount,
            LocalDate dob, ServicePlan plan) {

        customerId = ++idGenerator;

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.regAmount = regAmount;
        this.plan = plan;
        this.dob = dob;

    }
    
    public String getFirstName()
    {
    	return firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
                + email + ", password=" + password + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan
                + "]";
    }

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public int compareTo(Object o) {
		return email.compareTo(((Customer) o).getEmail());
	}    
}
