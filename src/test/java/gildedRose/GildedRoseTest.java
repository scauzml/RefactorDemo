package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item1() {
        //given
        Item[] items=new Item[1];
        Item item1 = new Item("item1",1,20);
        items[0]=item1;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(19, item1.quality);
    }

    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item2() {
        //given
        Item[] items=new Item[1];
        Item item2 = new Item("Aged Brie",1,20);
        items[0]=item2;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(21, item2.quality);
    }

    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item3() {
        //given
        Item[] items=new Item[1];
        Item item3 = new Item("Backstage passes to a TAFKAL80ETC concert",7,20);
        items[0]=item3;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(22, item3.quality);
    }
    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item4() {
        //given
        Item[] items=new Item[1];
        Item item4 = new Item("Backstage passes to a TAFKAL80ETC concert",5,20);
        items[0]=item4;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(23, item4.quality);
    }
    @Test
    public void should_return_correct_sellIn_when_call_updateQuality_with_this_item5() {
        //given
        Item[] items=new Item[1];
        Item item = new Item("item5",5,60);
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(4, item.sellIn);
    }

    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item6() {
        //given
        Item[] items=new Item[1];
        Item item = new Item("item6",-5,60);
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(58, item.quality);
    }

    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item7() {
        //given
        Item[] items=new Item[1];
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-5,60);
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(0, item.quality);
    }

    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item8() {
        //given
        Item[] items=new Item[1];
        Item item = new Item("Aged Brie",-5,40);
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(42, item.quality);
    }
    @Test
    public void should_return_correct_quality_when_call_updateQuality_with_this_item9() {
        //given
        Item[] items=new Item[1];
        Item item = new Item("Sulfuras, Hand of Ragnaros",-5,40);
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        Assert.assertEquals(40, item.quality);
    }
}