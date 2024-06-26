import java.util.ArrayList;
import java.util.List;

public class RecodeClientPostMoney {
    public static List<Users> users = new ArrayList<Users>();
    public static List<HistoryTransfer> historyTransfers = new ArrayList<HistoryTransfer>();
    public RecodeClientPostMoney() {
        Users users1 = new Users("sun", "096-852-9658", "sun@gmail.com", 1234,  1000.0);
        Users users2 = new Users("san", "098-852-9658", "san@gmail.com", 7891,  10000.0);
        Users users3 = new Users("sok", "099-852-9658", "sok@gmail.com", 4567,  100000.0);
        users.add(users1);
        users.add(users2);
        users.add(users3);
    }
}
