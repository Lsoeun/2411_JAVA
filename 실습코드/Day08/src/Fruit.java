public class Fruit {
    public int fruitNo; // 과일 고유번호
    public String fruitName; // 과일 이름

    public Fruit(int fruitNo, String fruitName) {
        this.fruitNo = fruitNo;
        this.fruitName = fruitName;
    }

    public void setFruitNo(int fruitNo) {
        this.fruitNo = fruitNo;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public Fruit getSelf() {
        return this;
    }
}
