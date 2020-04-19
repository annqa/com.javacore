package extralesson;

public class Fish {
    private int size;
    private String name;
    public boolean isFreshWater;

    public double calculateSizeInInches(){
        return size/2.54;
    }

    public Fish (int size, String name, boolean waterType) {
this.size=size;
this.name=name;
this.isFreshWater=waterType;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setFreshWater(boolean freshWater) {
        isFreshWater = freshWater;
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }


}
