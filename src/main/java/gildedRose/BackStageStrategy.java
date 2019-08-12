package gildedRose;

public class BackStageStrategy implements QualityStrategy {

    @Override
    public void changeQuality(Item item) {
        if(item.quality<50){
            item.quality=item.quality+1;
           if(item.sellIn<11){
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

        item.sellIn=item.sellIn-1;
        if(item.sellIn<0){
            item.quality = item.quality - item.quality;
        }
    }
}
