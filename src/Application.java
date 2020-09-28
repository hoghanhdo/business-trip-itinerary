import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<ApplicationFormat> applicationFormatArray = new ArrayList<ApplicationFormat>();
        registBusinessTrip(applicationFormatArray);
        displayBusinessTrip(applicationFormatArray);
    }

    private static void registBusinessTrip(List<ApplicationFormat> applicationFormatArray) {
        String applicationDate;
        String applicationUser;
        String date;
        String from;
        String to;
        String fromCountry;
        String toCountry;
        int charge;
        double moveTime;
        String memo;

        while (true) {
            String applicationType = StandardInputReader.getInputString("Please select application type " +
                    "\n" +
                    "[1] Domestic business trip application" +
                    "\n" +
                    "[2] Overseas business trip application" +
                    "\n" +
                    "[0] Quit" +
                    "\n");
            try {
                int intApplicationType = Integer.parseInt(applicationType);
                if (intApplicationType == 0) {
                    break;
                } else if (intApplicationType == 1) {
                    applicationDate = StandardInputReader.getInputString("Application day: ");
                    applicationUser = StandardInputReader.getInputString("Applicant: ");
                    date = StandardInputReader.getInputString("Business Trip Day: ");
                    from = StandardInputReader.getInputString("Point of departure: ");
                    to = StandardInputReader.getInputString("Destination: ");
                    while (true) {
                        try {
                            charge = StandardInputReader.getInputInt("Fare: ");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Input! Fare should be numeric.");
                        }
                    }
                    memo = StandardInputReader.getInputString("Note: ");
                    BusinessTripDomestic businessTrip = new BusinessTripDomestic(applicationDate, applicationUser, date, from, to, charge);
                    businessTrip.setMemo(memo);
                    applicationFormatArray.add(businessTrip);

                } else if (intApplicationType == 2) {
                    applicationDate = StandardInputReader.getInputString("Application day: ");
                    applicationUser = StandardInputReader.getInputString("Applicant: ");
                    date = StandardInputReader.getInputString("Business Trip Day: ");
                    fromCountry = StandardInputReader.getInputString("Point of departure[Country]: ");
                    from = StandardInputReader.getInputString("Destination[Airport]: ");
                    toCountry = StandardInputReader.getInputString("Destination[Country]: ");
                    to = StandardInputReader.getInputString("Destination[Airport]: ");
                    while (true) {
                        try {
                            charge = StandardInputReader.getInputInt("Fare: ");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Input! Fare should be numeric.");
                        }
                    }
                    while (true) {
                        try {
                            moveTime = StandardInputReader.getInputDouble("Travel Time: ");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Input! Travel Time should be numeric.");
                        }
                    }
                    memo = StandardInputReader.getInputString("Note: ");
                    BusinessTripInter businessTripInter = new BusinessTripInter(applicationDate, applicationUser, date, fromCountry, from, toCountry, to, moveTime, charge);
                    businessTripInter.setMemo(memo);
                    applicationFormatArray.add(businessTripInter);
                } else {
                    System.out.println("Invalid Input");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please select 1 or 2 or 0.");
            }
        }
    }

    private static void displayBusinessTrip(List<ApplicationFormat> applicationFormatArray) {
        for (int i = 0; i < applicationFormatArray.size(); i++) {
            ApplicationFormat tripInfo = applicationFormatArray.get(i);
            tripInfo.printHeader();
            tripInfo.printInfo();
        }
    }
}

