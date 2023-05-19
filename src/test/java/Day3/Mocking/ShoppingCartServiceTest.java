package Day3.Mocking;

import Day3.Mocking.Sample2.ProductManager;
import Day3.Mocking.Sample2.ShoppingCartService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ShoppingCartServiceTest {

    @Test
    public void testAddProductToCart() {

        ProductManager productManager = mock(ProductManager.class);

        //when(productManager.getStockStatus("ABC123")).thenReturn(0);
        when(productManager.getStockStatus("ABC123")).thenReturn(5);

        ShoppingCartService shoppingCartService = new ShoppingCartService(productManager);
        boolean result = shoppingCartService.addProductToCart("ABC123");
        //assertFalse(result);
        assertTrue(result);

        verify(productManager).getStockStatus("ABC123"); // bu sekilde geciyor.

        verify(productManager).decreaseStock("ABC123"); // eger ürün sayisi 0 ise, stoktan ürün düsmeyecegi icin decrease metodu cagrilmayacak ve test hata verecektir.
    }


}
