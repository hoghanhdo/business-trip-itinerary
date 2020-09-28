public class BusinessTripInter extends ApplicationFormat {

	private String date;
	private String fromCountry;
	private String from;
	private String toCountry;
	private String to;
	private double moveTime;
	private int charge;
	private String memo;

	public BusinessTripInter(String applicationDate, String applicationUser, String date, String fromCountry, String from, String toCountry,
			String to, double moveTime, int charge) {
		super(applicationDate, applicationUser);
		this.date = date;
		this.fromCountry = fromCountry;
		this.from = from;
		this.toCountry = toCountry;
		this.to = to;
		this.moveTime = moveTime;
		this.charge = charge;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

	public String getFromCountry() {
		return fromCountry;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	public String getToCountry() {
		return toCountry;
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

	public double getMoveTime() {
		return moveTime;
	}

	public void setCharge(double moveTime) {
		this.moveTime = moveTime;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override

	public void printInfo() {
		System.out.println("-.-.-.-.-.-.- INTERNATIONAL BUSINESS TRIP DETAILS -.-.-.-.-.-.- ");
		System.out.println("Date: " + date);
		System.out.println("Route: " + from + "[" + fromCountry + "] ～ " + to + "[" + toCountry + "]");
		System.out.println("Fare: " + charge + " US Dollar");
		System.out.println("Travel Time: " + moveTime + " hours");
		System.out.println("Note: " + memo);
	}


}
