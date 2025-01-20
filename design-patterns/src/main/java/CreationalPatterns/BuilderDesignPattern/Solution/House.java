package CreationalPatterns.BuilderDesignPattern.Solution;

public class House
{
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    //Constructor
    public House(String foundation)
    {

    }

    private House(HouseBuilder houseBuilder) {
        this.foundation = houseBuilder.foundation;
        this.structure = houseBuilder.structure;
        this.roof = houseBuilder.roof;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasGarden = houseBuilder.hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
    //public House(String roof)

    public static class HouseBuilder
    {
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }
        //Optional Paramters

        public HouseBuilder setGarden(boolean hasGarden)
        {
            this.hasGarden=hasGarden;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build()
        {
            return new House(this);
        }
    }

}
