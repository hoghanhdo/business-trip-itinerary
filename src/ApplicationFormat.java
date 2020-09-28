public abstract class ApplicationFormat {

	private static int managedNumber = 1;
	private int applicationNumber;
	private String applicationDate;
	private String applicationUser;

	public ApplicationFormat(String applicationDate, String applicationUser) {
		this();
		this.applicationDate = applicationDate;
		this.applicationUser = applicationUser;
	}

	public ApplicationFormat() {
		applicationNumber = managedNumber;
		managedNumber++;
	}

	public static int getManagedNumber () {
		return managedNumber;
	}

	public int getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(String applicationUser) {
		this.applicationUser = applicationUser;
	}

	public void printHeader() {
		System.out.println();
		System.out.println("======== Application Information ========");
		System.out.println("・Application No: " + applicationNumber);
		System.out.println("・Application Date: " + applicationDate);
		System.out.println("・Applicant: " + applicationUser);
		System.out.println();
	}

	public abstract void printInfo();
}
