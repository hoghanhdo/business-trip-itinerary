public class BusinessTripDomestic extends ApplicationFormat {

	private String date;
	private String from;
	private String to;
	private int charge;
	private String memo;

	public BusinessTripDomestic(String applicationDate, String applicationUser, String date, String from, String to,
			int charge) {
		super(applicationDate, applicationUser);
		this.date = date;
		this.from = from;
		this.to = to;
		this.charge = charge;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override

	public void printInfo() {
		System.out.println("-.-.-.-.-.-.- DOMESTIC BUSINESS TRIP DETAILS -.-.-.-.-.-.-");
		System.out.println("Date: " + date);
		System.out.println("Route: " + from + " ～ " + to);
		System.out.println("Fare: " + charge + " US Dollar");
		System.out.println("Note: " + memo);

	}
}
