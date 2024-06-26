import java.util.Scanner;

public class Main {

    public static void chooseMenu () {
        while (true) {
            System.out.println("1. Create Client");
            System.out.println("2. View Client");
            System.out.println("3. Transfers Service");
            System.out.println("4. History Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    initializeClient();
                    viewClient();
                    break;
                case 2:
                    viewClient();
                    break;
                case 3:
                    transfers();
                    break;
                case 4:
                    viewHistoryClient();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            if (choice == 5) {
                System.out.println("Application Exit");
                break;
            }
        }

    }

    public static void initializeClient() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Client Name: ");
        String clientName = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Pin Code: ");
        Integer pinCode = sc.nextInt();

        System.out.print("Enter Save Money: ");
        Double saveMoney = sc.nextDouble();

        Users user = new Users(clientName, phoneNumber, email, pinCode, saveMoney);
        RecodeClientPostMoney.users.add(user);
    }
    public static void viewHistoryClient() {
        String header = "";
        header += formatDiv("a------------------------------------------------------------------c\n");
        header += formatRow("|                        HISTORY OF TRANSFER                       |\n");
        header += formatDiv("a------------b----------------b----------------b-------------------c\n");
        header += formatRow("|  clientId  | clientNamePost |  clientNameGet |      saveMoney    |\n");
        header += formatDiv("d------------e----------------e----------------e-------------------f\n");
        System.out.print(header);

        for (int i = 0; i < RecodeClientPostMoney.historyTransfers.size(); i++)
        {
            String str1 = String.format("| %10s | %14s | %14s | %17s |",
                    RecodeClientPostMoney.historyTransfers.get(i).getOn(),
                    RecodeClientPostMoney.historyTransfers.get(i).getPostClient(),
                    RecodeClientPostMoney.historyTransfers.get(i).getGetClient(),
                    RecodeClientPostMoney.historyTransfers.get(i).getMoney());
            System.out.println(formatRow(str1));
        }

        System.out.println(formatDiv("g------------h----------------h----------------h-------------------i"));
    }
    public static void viewClient() {
        String header = "";
        header += formatDiv("a----------------------------------------------------------------------------------c\n");
        header += formatRow("|                                  LIST OF CLIENT                                  |\n");
        header += formatDiv("a------------b------------b--------------b---------------b------------b------------c\n");
        header += formatRow("|  clientId  | clientName |  phoneNumber |     email     |   pinCode  |  saveMoney |\n");
        header += formatDiv("d------------e------------e--------------e---------------e------------e------------f\n");
        System.out.print(header);

        for (int i = 0; i < RecodeClientPostMoney.users.size(); i++)
        {
            String str1 = String.format("| %10s | %10s | %10s | %10s | %10s | %10s |",
                    RecodeClientPostMoney.users.get(i).getClientId(),
                    RecodeClientPostMoney.users.get(i).getClientName(),
                    RecodeClientPostMoney.users.get(i).getPhoneNumber(),
                    RecodeClientPostMoney.users.get(i).getEmail(),
                    RecodeClientPostMoney.users.get(i).getPinCode(),
                    RecodeClientPostMoney.users.get(i).getSaveMoney());
            System.out.println(formatRow(str1));
        }

        System.out.println(formatDiv("g------------h------------h--------------h---------------h------------h------------i"));
    }
    public static void transfers () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Client Name Post: ");
        String clientPost = scanner.nextLine();

        System.out.print("Enter Client Name Get: ");
        String clientGet = scanner.nextLine();

        System.out.print("Enter Money: ");
        Double money = scanner.nextDouble();

        ServiceTransfer.transferOneToOne(clientPost, clientGet, money);
    }
    public static String formatRow(String str)
    {
        return str.replace('|', '\u2502');
    }
    public static String formatDiv(String str)
    {
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

    public static void main(String[] args) {
        System.out.println(" ========= :: Welcome :: ========");
        RecodeClientPostMoney recodeClientPostMoney = new  RecodeClientPostMoney();
        chooseMenu ();
    }

}