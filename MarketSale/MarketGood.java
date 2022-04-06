package MarketSale;

public class MarketGood {
    private String name; // 상품명
    private int retailPrice; // 상품 출시 가격
    private int discountRate; // 할인율 단위: %

    //생성자
    public MarketGood(String name, int retailPrice) {
        this(name, retailPrice, 0);
    }
    public MarketGood(String name, int retailPrice, int discountRate) {
        if (discountRate < 0 || discountRate >100) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
        this.name = name;
        this.retailPrice =  retailPrice;
    }
    // private 메소드
    public String getName() {
        return name;
    }
    public int getRetailPrice() {
        return retailPrice;
    }
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
    public int getDiscountRate() {
        return discountRate;
    }
//    MarketGood 제품 정보를 가져온 뒤에 계산해야함.
    public int getDiscountedPrice() {
        double discountedPrice; // 할인률 100으로 나눴을 때, double 로 계산 후
        discountedPrice = retailPrice - (retailPrice * (discountRate / 100.0));
        return (int) discountedPrice; // 다시 int 로 바꿔 소숫점 아리 자르기
        //or
//        return (int) (retailPrice * (1 - discountRate / 100.0));
    }
}