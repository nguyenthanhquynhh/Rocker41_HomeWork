package managerstudent;

import java.util.Date;

public class Fee {
    private int feeId;
    private String mountOfMoney;
    private Date payFee;
    private String statusPay;

    public Fee(int feeId, String mountOfMoney, Date payFee, String statusPay) {
        this.feeId = feeId;
        this.mountOfMoney = mountOfMoney;
        this.payFee = payFee;
        this.statusPay = statusPay;
    }

    public int getFeeId() {
        return feeId;
    }

    public void setFeeId(int feeId) {
        this.feeId = feeId;
    }

    public String getMountOfMoney() {
        return mountOfMoney;
    }

    public void setMountOfMoney(String mountOfMoney) {
        this.mountOfMoney = mountOfMoney;
    }

    public Date getPayFee() {
        return payFee;
    }

    public void setPayFee(Date payFee) {
        this.payFee = payFee;
    }

    public String getStatusPay() {
        return statusPay;
    }

    public void setStatusPay(String statusPay) {
        this.statusPay = statusPay;
    }

    public void checkStatusPay(){

    }

    public void updateInforPay(){

    }

    public void statisticfeeSemester(){

    }
}
