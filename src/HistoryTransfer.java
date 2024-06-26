import java.util.Random;

public class HistoryTransfer {
    private String on;
    private String postClient;
    private String getClient;
    private Double money;

    public HistoryTransfer(String postClient, String getClient, Double money) {
        this.postClient = postClient;
        this.getClient = getClient;
        this.money = money;
        getOn();
    }

    public String getOn() {
        if (on == null) {
            Random random = new Random();
            int y = random.nextInt(1000);
            if (y < 10) {
                on = "0" + y;
            } else {
                on = String.valueOf(y);
            }
        }
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public String getPostClient() {
        return postClient;
    }

    public void setPostClient(String postClient) {
        this.postClient = postClient;
    }

    public String getGetClient() {
        return getClient;
    }

    public void setGetClient(String getClient) {
        this.getClient = getClient;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "HistoryTransfer{" +
                "on=" + on +
                ", postClient='" + postClient + '\'' +
                ", getClient='" + getClient + '\'' +
                ", money=" + money +
                '}';
    }
}
