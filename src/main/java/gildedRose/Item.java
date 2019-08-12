package gildedRose;

public class Item {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public String name;

    public int sellIn;

    public int quality;
    public QualityStrategy qualityStrategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
//        if (!this.name.equals(AGED_BRIE) && !this.name.equals(BACKSTAGE)) {
//            this.qualityStrategy=new isNotAgeBrieAndBacksTageStrategy();
//        }else {
//            this.qualityStrategy=new isAgeBrieOrBackStageStrategy();
//        }
//        if (this.sellIn < 0) {
//            this.qualityStrategy=new SellInLessZeroStrategy();
//        }
        if (this.name.equals(AGED_BRIE)) {
            this.qualityStrategy=new AgedBireStrategy();
        }
        else if (this.name.equals(BACKSTAGE)) {
            this.qualityStrategy=new BackStageStrategy();
        }
       else if (this.name.equals(SULFURAS)) {
            this.qualityStrategy=new SulfurasStrategy();
        }else {
           this.qualityStrategy=new OtherNameStategy();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public QualityStrategy getQualityStrategy() {
        return qualityStrategy;
    }

    public void setQualityStrategy(QualityStrategy qualityStrategy) {
        this.qualityStrategy = qualityStrategy;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
