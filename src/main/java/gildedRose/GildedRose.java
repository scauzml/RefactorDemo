package gildedRose;

public class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(AGED_BRIE) && !items[i].name.equals(BACKSTAGE)) {
                calculateQuality(items[i]);
            } else {
                calculateQuality(items[i]);
            }

            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                calculateQuality(items[i]);
            }
        }
    }

    private void calculateQuality(Item item) {
        item.qualityStrategy.changeQuality(item);
    }


}