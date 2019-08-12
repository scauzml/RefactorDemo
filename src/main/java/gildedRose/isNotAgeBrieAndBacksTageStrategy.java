package gildedRose;

public class isNotAgeBrieAndBacksTageStrategy implements QualityStrategy {
    @Override
    public void changeQuality(Item item) {
        if (item.quality > 0) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.quality = item.quality - 1;
            }
        }
    }
}
