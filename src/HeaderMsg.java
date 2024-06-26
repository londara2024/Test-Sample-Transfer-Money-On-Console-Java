public enum HeaderMsg {
    H_SUCCESS ("Data sent successfully"),
    H_ERROR ("Data sent error");

    private String msg;

    public String getMsg() {
        return msg;
    }
    HeaderMsg(String msg) {
        this.msg = msg;
    }
}
