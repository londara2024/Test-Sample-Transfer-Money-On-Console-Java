

public class ServiceTransfer {
    public static void transferOneToOne (String clientNameTSP, String clientNameTSR, Double money) {

        Integer clientIndex1 = 0, clientIndex2 = 0;
        Boolean isCheck1 = false, isCheck2 = false;

        if (money == null) {
            System.out.println("Invalid money!!!");
        }

        if (clientNameTSP == null || clientNameTSR == null) {
            System.out.println("Invalid client name!!!");
        }

        assert clientNameTSP != null;
        if (clientNameTSP.equals(clientNameTSR)) {
            System.out.println("Invalid clientNameTSR!!!");
        }

        for (int index = 0; index < RecodeClientPostMoney.users.size() ; index++) {
            if (RecodeClientPostMoney.users.get(index).getClientName().equals(clientNameTSP)) {
                clientIndex1 = index;
                isCheck1 = true;
            }
            if (RecodeClientPostMoney.users.get(index).getClientName().equals(clientNameTSR)) {
                clientIndex2 = index;
                isCheck2 = true;
            }
        }

        if (isCheck1 && isCheck2) {

            Double total = 0.0;

             Users postClient = RecodeClientPostMoney.users.get(clientIndex1);
             total = postClient.getSaveMoney() - money;
             postClient.setSaveMoney(total);

             Users getClient  = RecodeClientPostMoney.users.get(clientIndex2);
             total = getClient.getSaveMoney() + money;
             getClient.setSaveMoney(total);

             RecodeClientPostMoney.users.set(clientIndex1,postClient);
             RecodeClientPostMoney.users.set(clientIndex2,getClient);

             HistoryTransfer historyTransfer = new HistoryTransfer(postClient.getClientName(), getClient.getClientName(), money);
             RecodeClientPostMoney.historyTransfers.add(historyTransfer);

        } else {
            System.out.println("Invalid Post Client or Get Client. Please check client name again.");
        }

    }


}
