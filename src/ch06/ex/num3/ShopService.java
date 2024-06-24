package ch06.ex.num3;

public class ShopService {

    private static ShopService shopService = new ShopService();

    private ShopService() {
    }

    public static ShopService getShopService() {
        return shopService;
    }
}
