package java07;

public class SwitchString {
    public static void main(String[] args) {
        String command = "start";

        switch (command) {
            case "start":
                System.out.println("開始");
                break;
            case "stop":
                System.out.println("停止");
                break;
            default:
                System.out.println("不明なコマンド");
        }
    }
}
