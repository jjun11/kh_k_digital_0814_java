package 인터페이스활용;

public class InterfaceEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();
        Customer customer2 = (Customer) seller; // 다운캐스팅이라 한다.
        customer2.buy();
        customer2.sell();

    }
}
