public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 11_540;
        int bonus = service.calculate(price);
        System.out.println("Вам начислено " + bonus + " миль");
    }
}