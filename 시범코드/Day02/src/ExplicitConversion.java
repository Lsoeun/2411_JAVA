// 명시적 형 변환(강제 형 변환) 예제
public class ExplicitConversion {
    public static void main(String[] args) {

        // 바이트 크기가 큰 자료형에서 작은 자료형으로 대입
        int iNum = 10;
        byte bNum = (byte)iNum; // 강제로 형을 바꾸려면 바꿀 형을 괄호를 써서 명시해야 함

        // 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입
        double dNum = 3.14;
        int iNum2 = (int)dNum; // 실수 자료형 double을 정수 자료형 int로 형 변환

        // 연산 중 강제 형 변환
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형변환되어 더해짐
        int iNum4 = (int)(dNum1 + fNum2); // 두 실수의 합이 먼저 계산되고 형 변환됨
        System.out.println(iNum3);
        System.out.println(iNum4);
    }
}
