public class SwitchCase {

    public static void main(String[] args) {
        int rank = 1;
        String medal;
        switch(rank) {
            case 1 : medal = "Gold"; break;
            case 2 : medal = "Silver"; break;
            case 3 : medal = "Bronze"; break;
            default : medal = "Failed";
        }
        System.out.println(rank + "등 메달은 " + medal + "입니다.");
    }
}
