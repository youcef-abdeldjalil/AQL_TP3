
import org.example.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)

public class ProductServiceTest {
    @Mock
    private ProductApiClient productApiClientMock;
    @Test
    public void getProductTest() {
        when(productApiClientMock.getProduct("1")).thenReturn(new Product("1" ,"p1"));
        ProductService productService = new ProductService(productApiClientMock);
        productService.getProduct("1");
        verify(productApiClientMock).getProduct("1");

    }

}
