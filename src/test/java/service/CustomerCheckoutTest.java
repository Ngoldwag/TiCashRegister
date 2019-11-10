package service;

import CsLinkedList.CsLinkedList;
import model.Item;
import model.Receipt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;

import static javax.print.attribute.TextSyntax.verify;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CustomerCheckoutTest {
    private CustomerCheckout customerCheckout;

    @Mock
    Receipt receipt;

    @Test
    public void testWithMocking() throws IllegalAccessException {
        CsLinkedList<Item> list = new CsLinkedList<Item>();
        list.add(new Item("", .1 ));

       when(receipt.getStoreName()).thenReturn("store");
       when(receipt.getItemList()).thenReturn(list);
       CustomerCheckout customerCheckout = new CustomerCheckout("", "");
       customerCheckout.scanAnItem(new Item());

       verify(receipt.add(new Item());
       customerCheckout.scanAnItem(new Item(), 10);

       verify(receipt, times(10 )).add(any(Item.class));
       customerCheckout.endTransaction();
    }

}