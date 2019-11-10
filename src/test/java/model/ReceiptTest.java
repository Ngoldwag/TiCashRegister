package model;
import CsLinkedList.CsLinkedList;
import org.junit.Test;
import service.CustomerCheckout;
import java.util.Date;
import static org.junit.Assert.*;

public class ReceiptTest {
    public Receipt receipt;
    private Item item1;
    private CustomerCheckout customerCheckout;

    @Test
    public void getStoreNameWhenNothingIsEnteredInstead_ThisWillFail(){
        receipt = new Receipt(null ,"7735551010");
        assertEquals(null,receipt.getStoreName() );
    }
    @Test
    public void getStoreNumberWhenInputIsCorrect(){
        receipt = new Receipt("Target" ,"7735551010");
        assertEquals("7735551010", receipt.getStoreNumber());

    }
    @Test
    public void getTotalPriceWhen2ofSameItemIsPurchased() throws IllegalAccessException {
        receipt = new Receipt("Ted's" ,"7735551010");
        item1 = new Item("Banana", .34);

        receipt.add(item1);
        receipt.add(item1);
        receipt.getTotalPrice();
        assertEquals(new Double(.68), receipt.getTotalPrice());

    }
    @Test
    public void getTotalItemWhenSomeITemsAreMoreThanOne() throws IllegalAccessException {
        receipt = new Receipt("Ted's" ,"7735551010");
        item1 = new Item("Banana", .34);
        receipt.add(item1);
        receipt.add(item1);
        assertEquals(new Integer(2), receipt.getTotalItems());


    }
    @Test
    public void DoesGetDateReallyWork()
    {
        receipt = new Receipt("storeName" ,"storeNum");
        Date date = new Date();
        assertEquals(date, receipt.getDate());
    }
    @Test
    public void getItemList() throws IllegalAccessException {
        receipt = new Receipt("Ted's", "7735551010");
        item1 = new Item("Banana", .34);
        receipt.add(item1);
        receipt.add(item1);
        CsLinkedList<Item> expectedList = new CsLinkedList<Item>();
        expectedList.add(item1);
        expectedList.add(item1);
        assertEquals(expectedList, receipt.getItemList());
    }




    }


}