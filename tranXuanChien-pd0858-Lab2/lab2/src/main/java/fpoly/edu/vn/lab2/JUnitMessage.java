package fpoly.edu.vn.lab2;

public class JUnitMessage {
	private String message;

    public JUnitMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Đang tải: " + message);
        throw new ArithmeticException("Lỗi!");
    }


    public String printHiMessage() {
        return "HI! " + message;
    }
}
