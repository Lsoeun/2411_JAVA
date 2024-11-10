# 2411_JAVA
2024년 11월 자바 기초 저녁반

## 실습환경 구축하기
### 자바 설치하기
- [JDK 다운로드](https://www.oracle.com/java/technologies/downloads/) (오라클 웹사이트 접속)
- [JDK 문서 다운로드](https://www.oracle.com/java/technologies/javase-jdk18-doc-downloads.html)

#### JDK 용어 설명
- JDK (Java Development Kit): 자바 애플리케이션을 개발하고 실행하는 데 필요한 컴파일러(javac), 자바 런타임 환경(JRE), 표준 라이브러리, 디버깅 도구 등을 포함한 소프트웨어 개발 키트입니다.
- JRE (Java Runtime Environment): 자바 애플리케이션을 실행하는 데 필요한 최소한의 환경을 제공하며, JVM(Java Virtual Machine)과 기본 라이브러리로 구성됩니다.
- JVM (Java Virtual Machine): 자바 바이트코드를 실행하는 가상 머신으로, 자바 프로그램이 어떤 플랫폼에서도 실행될 수 있게 해 줍니다.

#### 자바 다운로드 후 설치하기
- 자바 기본 설치 경로는 C:/Program Files/Java/jdk-21입니다.
- 경로 변경 시 [Change...] 버튼을 눌러 원하는 경로로 설치 가능합니다.
<img src="https://github.com/user-attachments/assets/a71d2e63-de07-4760-80d3-9c07f8fab795" width="450" height="300"/>
<img src="https://github.com/user-attachments/assets/2b154e8a-0fc2-4020-8c69-872f7f029921" width="700" height="600"/>


#### 환경변수 설정하기
- JAVA_HOME은 JDK가 설치된 경로입니다.  설치 경로를 시스템 변수에 설정을 하면 현재 사용자뿐 아니라 다른 사용자 계정으로도 해당 변수를 사용할 수 있습니다. 또한, 다른 프로그램에서 JAVA_HOME 환경 변수를 이용해 JDK의 위치를 찾기도 합니다.
<img src="https://github.com/user-attachments/assets/ea4bc7ef-9980-4c7c-bf8d-477324a1dfc4" width="400" height="300"/>
<img src="https://github.com/user-attachments/assets/da9c3170-e0a3-475d-848b-62cc626c7c68" width="400" height="300"/>
<img src="https://github.com/user-attachments/assets/ca2959b8-d4b4-4fe7-a673-36ed88a02b64" width="600" height="300"/>

#### 새 시스템 변수 추가
<img src="https://github.com/user-attachments/assets/c4c22f12-75e3-485c-aec1-baa3d963ec3f" width="550" height="200"/><br>
<img src="https://github.com/user-attachments/assets/4dd65e2d-fd4d-4553-8dc8-31894f171184" width="300" height="300"/>


#### Path 시스템 변수 편집
<img src="https://github.com/user-attachments/assets/9efebb3a-80a1-4b52-9c2c-7a5e793b3505" width="400" height="350"/>
<img src="https://github.com/user-attachments/assets/9d00a954-4259-4f85-9e34-f31761635fd5" width="400" height="350"/>
<img src="https://github.com/user-attachments/assets/62ce81c2-6bdd-4135-8dc2-8d714088cc11" width="400" height="350"/>
<img src="https://github.com/user-attachments/assets/33fce867-9a26-45ee-92bc-0ae2d6e9e58b" width="400" height="350"/>


#### 자바 설정 확인
<img src="https://github.com/user-attachments/assets/7b6aafc7-a6f2-4b41-9626-be5103688d1a" width="600" height="300"/>

### 인텔리제이 설치하기
- [인텔리제이 다운로드](https://www.jetbrains.com/ko-kr/idea/download/#section=windows) (Community 버전 다운로드)
<img src="https://github.com/user-attachments/assets/dbc19ca7-e260-4738-b1a3-5f1c745bd328" width="400" height="300"/>
<img src="https://github.com/user-attachments/assets/83ece107-e08d-450f-9bf0-5b760fe52e7c" width="400" height="300"/>
<img src="https://github.com/user-attachments/assets/706cb51e-196e-42a4-959e-12fa016cf115" width="400" height="300"/>
<img src="https://github.com/user-attachments/assets/af393761-153b-4537-8399-369f08ba2ecc" width="400" height="300"/>
<br>
- Create Desktop Shortcut : 바로가기 생성 여부<br>
- Update PATH variable(restart needed) : 윈도우 환경변수 자동으로 추가<br>
- Update Context menu : 프로젝트로 폴더 열기<br>
- Create Association : 자바 사용 ( 사용할 환경 선택 )<br>
<br>

## 학습환경 구축하기
### 노션 설치하기
- [노션 다운로드](https://www.notion.so/) (노션 공식 웹사이트 접속)
- [노션 사용방법 참고](https://blog.naver.com/PostView.naver?blogId=kairoskyk&logNo=223427075393)
<img src="https://github.com/user-attachments/assets/99dc833c-4cfb-4361-89d5-644f535ac5d0" width="450" height="300"/>
<img src="https://github.com/user-attachments/assets/a175740f-2cf0-4160-8310-c3b68b5ce72b" width="450" height="300"/>
<img src="https://github.com/user-attachments/assets/3af1b7d8-2290-4267-b4bb-319d78772eaa" width="450" height="300"/>
