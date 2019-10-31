package service;

import model.Receipt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CustomerCheckoutTest {

    private CustomerCheckout customerCheckout;

    private Receipt receipt;
    @Test
    public void firstTestWeWrite() {

        receipt = new Receipt("storeName" ,"storeNum");

        assertEquals("storeNum", receipt.getStoreNumber());
    }

    public int add (int x, int y) {
        return x + y;
    }

}