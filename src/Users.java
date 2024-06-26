import java.util.Random;

public class Users {
    private String clientId;
    private String clientName;
    private String phoneNumber;
    private String email;
    private Integer pinCode;
    private Double saveMoney;

    public String getClientId() {
        if (clientId == null) {
            Random random = new Random();
            int y = random.nextInt(100);
            if (y < 10) {
                clientId = "0" + y;
            } else {
                clientId = String.valueOf(y);
            }
        }
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Double getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(Double saveMoney) {
        this.saveMoney = saveMoney;
    }

    public Users(String clientName, String phoneNumber, String email, Integer pinCode, Double saveMoney) {
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.pinCode = pinCode;
        this.saveMoney = saveMoney;
        getClientId();
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "User{" +
                "clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", pinCode=" + pinCode +
                ", saveMoney=" + saveMoney +
                '}';
    }
}
