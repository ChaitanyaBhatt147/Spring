package in.co.rays.ioc;

public class Payment {
	private Double balence;

	public Payment() {
	}

	public Double getBalence() {
		return balence;
	}

	public void setBalence(Double balence) {
		this.balence = balence;
	}

	public Payment(Double balence) {
		this.balence = balence;
	}

	public double makePayment(double amount) {
		balence = balence - amount;
		return balence;
	}
}
