package demo.domain

import spock.lang.Specification

class OrderSpec extends Specification{
    def "Test for get Quantity"(){
        given:"Create order instance"
        Order order = new Order()

        and: "Initialise set quantity"
        order.setQuantity(5)

        when: "Check get quantity"
        int testGetQuantity = order.getQuantity()

        then: "return int"
        testGetQuantity == 5
    }
    def "Test for set Quantity"(){
        given:"Create two order instance"
        Order order = new Order()
        Order testSetQuantity = new Order()

        when: "Check set quantity"
        testSetQuantity = order.setQuantity(5)

        then: "return order object"
        testSetQuantity.getQuantity() == 5
    }
    def "Test for get Item Name"(){
        given:"Create order instance"
        Order order = new Order()

        and: "Initialise set item name"
        order.setItemName("Coffee")

        when: "Check get item name"
        String testGetItemName = order.getItemName()

        then: "return string"
        testGetItemName == "Coffee"
    }
    def "Test for set Item Name"(){
        given:"Create two order instance"
        Order order = new Order()
        Order testSetItemName = new Order()

        when: "Check set Item Name"
        testSetItemName = order.setItemName("Coffee")

        then: "return order object"
        testSetItemName.getItemName() == "Coffee"
    }
    def "Test for get Price"(){
        given:"Create order instance"
        Order order = new Order()

        and: "Initialise set Price"
        order.setPrice(5.0d)

        when: "Check get Price"
        double testGetPrice = order.getPrice()

        then: "return double"
        testGetPrice == 5.0d
    }
    def "Test for set Price"(){
        given:"Create two order instance"
        Order order = new Order()
        Order testSetPrice = new Order()

        when: "Check set Price"
        testSetPrice = order.setPrice(5.0d)

        then: "return order object"
        testSetPrice.getPrice() == 5.0d
    }
    def "Test for get priceWithTex"(){
        given:"Create order instance"
        Order order = new Order()

        and: "Initialise set price With Tex"
        order.setPriceWithTex(10.0d)

        when: "Check get price With Tex"
        double testGetPriceWithTex = order.getPriceWithTex()

        then: "return double"
        testGetPriceWithTex == 10.0d
    }
    def "Test for set Price With Tex"(){
        given:"Create two order instance"
        Order order = new Order()
        Order testSetPriceWithTex = new Order()

        when: "Check set Price With Tex"
        testSetPriceWithTex = order.setPriceWithTex(10.0d)

        then: "return order object"
        testSetPriceWithTex.getPriceWithTex() == 10.0d
    }
}

