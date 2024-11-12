// 묵시적 형 변환(자동 형 변환) 예제
public class ImplicitConversion {
    public static void main(String[] args) {

    // 크기가 작은 자료형에서 큰 자료형으로 대입
    byte bNum = 10;
    int iNum = bNum; // byte형 값이 int형 변수로 대입됨

    System.out.println(bNum);
    System.out.println(iNum);

    // 덜 정밀한 자료형에서 더 정밀한 자료형으로 대입
    int iNum2 = 20;
    float fNum = iNum2; // int형 값이 float형 변수로 대입됨

    System.out.println(iNum);
    System.out.println(fNum);

    // 연산 중의 자동 형 변환
    double dNum;
    dNum = fNum + iNum; // // dNum에 20.0 + 20.0이 계산되어 40.0 (double)으로 할당됨
    System.out.println(dNum);
    }
}
