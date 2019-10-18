package com.galvanize.shippingcard;

import junit.framework.TestCase;

import java.math.BigDecimal;

public class ShippingCardTest extends TestCase {
    /*Given that I visit the site, when I begin shopping then I expect my card to be empty*/
    private ShoppingCard shoppingCard;

    public void setUp() throws Exception {
        super.setUp();
        shoppingCard = new ShoppingCard();
    }

    public void testShoppingCardIsEmpty_ReturnTrue() throws Exception {
        //setup
        shoppingCard = new ShoppingCard();
        //exersise
        //assert
        assertEquals(true, shoppingCard.isEmpty());
        assertEquals(new BigDecimal(0.00), shoppingCard.getTotalPrice());
        assertEquals(0, shoppingCard.myLinkedList.size());
    }

    /*Give I have an empty card, when I add an Item, then I expect to see totalPrice
     reflect the price of the Item in my card, times the quantities of the Item*/
    public void testAddNewItem_emptyCard_changeTotalPrice() throws Exception {
        //setup
        ShoppingCard.Item item = new ShoppingCard.Item("name", 5, new BigDecimal(1.00));
        ShoppingCard.Item item2 = new ShoppingCard.Item("name2", 7, new BigDecimal(2.00));
        shoppingCard.myLinkedList.add(item);
        shoppingCard.myLinkedList.add(item2);
        //exersise
        //assert
        assertEquals(2, shoppingCard.myLinkedList.size());
        assertEquals(item, shoppingCard.myLinkedList.get(0));
        assertEquals(item2, shoppingCard.myLinkedList.get(1));
    }


    public void removeItem_emptyCard_changeTotalPrice() throws Exception {
        //setup
        ShoppingCard.Item item = new ShoppingCard.Item("name", 5, new BigDecimal(1.00));
        ShoppingCard.Item item2 = new ShoppingCard.Item("name2", 7, new BigDecimal(2.00));
        shoppingCard.myLinkedList.add(item);
        shoppingCard.myLinkedList.add(item2);
        //exersise
        shoppingCard.myLinkedList.remove(item);
        assertEquals(1, shoppingCard.myLinkedList.size());
        assertEquals(item2, shoppingCard.myLinkedList.get(0));
        //assert
        shoppingCard.myLinkedList.remove(item2);
        assertEquals(0, shoppingCard.myLinkedList.size());


    }

    /*Given I have an empty card, when I add more then one of an Item then I expect
ItemQuantities() to show the number of Items I have added*/
//    public void testAddRemove_emptyCard_changeTotalPrice() throws Exception {
        /*Given I have an empty card, when I add items, then I expect itemizedList()
    reflect the items I have added along with their price and quantity*/

            /*Given I have an empty card,  when I add more then one of an Item,
    Then I expect total price to reflect both the itemPrice and quantity*/

        /*Given I have a card with items that are not on sale, when I add Items that are on sale,
         * I expect onSaleItems() to include only the items on sale*/
//    }
}


