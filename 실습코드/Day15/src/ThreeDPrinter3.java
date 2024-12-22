public class ThreeDPrinter3 {
    private Object material;

    public void setMaterial(Object material) {
        this.material = material;
    }

    public Object getMaterial() {
        return material;
    }

    public static void main(String[] args) {
        ThreeDPrinter3 printer = new ThreeDPrinter3(); // material 변수의 자료형을 Object로 사용한  ThreeDPrinter3 객체 생성
        Powder p1 = new Powder(); // Powder 객체 생성
        printer.setMaterial(p1); // p1을 printer의 material로 설정 -> 이때 타입은 Object

        Powder p2 = (Powder)printer.getMaterial();
        // material을 Powder 타입으로 변환
        // 직접 형 변환을 해야 함
    }
}
