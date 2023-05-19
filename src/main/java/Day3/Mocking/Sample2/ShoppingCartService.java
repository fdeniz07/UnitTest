package Day3.Mocking.Sample2;

public class ShoppingCartService {

    private ProductManager productManager;

    public ShoppingCartService(ProductManager productManager) {
        this.productManager = productManager;
    }

    //!!! Test edilecek method
    public boolean addProductToCart(String productId) {
        int stockStatus = productManager.getStockStatus(productId);

        if (stockStatus > 0) {
            productManager.decreaseStock(productId);
            return true;
        } else return false;
    }
}
