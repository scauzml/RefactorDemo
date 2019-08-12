package gildedRose;

public class isAgeBrieOrBackStageStrategy implements QualityStrategy {

    @Override
    public void changeQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }
}
