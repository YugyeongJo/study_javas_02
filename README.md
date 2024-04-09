## java_mysql

<details>
<summary>Java 기본 세팅</summary>

#### Main package
- java:17

#### CLI with Dockerfile and compose.xml : duration 150.4s
```
# --project-name is docker container name
~$ docker-compose --project-name java_mysql up -d --build
```
#### samples
- [src/Sameple.java](./src/Sample.java)

</details>

<br/>

#### JAVA 개념 정리
- [JAVA 개념 정리](https://github.com/YugyeongJo/study_javas/wiki)

<br/>

## JAVA file 정리
<details>
<summary>JAVA Basic</summary>

|구분|파일명|적용내용|파일내용|비고|
|--|--|--|--|--|
|1|[Main](./src/main/java/co_templates/Main.java)|기본 template|기본 template <br> print()|파일명과 class명 일치 필수 <br> System.out.println()|
|2|[DataTypes](./src/main/java/co_templates/DataTypes.java)|datatype(int, bool, string, float)|기본적인 datatype|변수 선언 시 datatype 지정 필수|
|3|[Scanners](./src/main/java/co_templates/Scanners.java)|scanner|scanner 활용하여 외부 입력값 받기||
|4|[Booleans](./src/main/java/co_templates/Booleans.java)|datatype(boolean)|논리자료형 datatype <br> && / ! |&& : and <br> ! : not 의미|
|5|[Ifs](./src/main/java/co_templates/Ifs.java)|if 구문|if 구문||
|6|[LoopsFors](./src/main/java/co_templates/LoopsFors.java)|for 구문|for 구문 <br> 1) for-loop <br> 2) for-each|for-loop : range 범위를 가지고 for문 적용 <br> for-each : list 자체를 넣어서 for문 적용|
|7|[LoopsWhiles](./src/main/java/co_templates/LoopsWhiles.java)|while & break 구문|while & break 구문||
|8|[DataTypeStrings](./src/main/java/co_templates/DataTypeStrings.java)|datatype(string)|문자형 datatype <br> length() / concat() / replaceAll()|length() : 길이 확인 <br> concat() : 결합 <br> 대체|
|9|[DataTypeArrayLists](./src/main/java/co_templates/DataTypeArrayLists.java)|arraylist <br> add(), get(), size(), remove(), set(), clear()|arraylist 형태(List)로 data 저장, 출력, 삭제, 교체|순서 포함 O|
|10|[DatatypeHashMaps](./src/main/java/co_templates/DatatypeHashMaps.java)|hashmap <br> put(), get(), size(), remove(), clear(), keyset(), values()|hashmap 형태(Dictionary)로 data 저장, 출력, 삭제, key값만 출력, value값만 출력|순서 포함 X, 랜덤으로 출력|
|11|[TypeCastIntegers](./src/main/java/co_templates/TypeCastIntegers.java)|Integer.parseInt()|string타입의 숫자를 int타입으로 변환||
|12|[OopCasts](./src/main/java/co_templates/OopCasts.java)|casting datatype|object를 활용하여 data의 다양한 객체타입 지정|data 활용시 casting 필요|
|14|[MethodsMain](./src/main/java/co_templates/MethodsMain.java)|function 기본 구조|function 기본 구조||
|15|[MethodsSubs](./src/main/java/co_templates/MethodsSubs.java)|Main에서 function 호출|Main에서 function 호출||
|16|[TryCatchsMain](./src/main/java/co_templates/TryCatchsMain.java)|Try Catch 구문|Try Catch 구문|Catch로 빠졌을 경우 (Exception e) 활용|
|17|[TryCatchsSubs](./src/main/java/co_templates/TryCatchsSubs.java)|Try Catch 구문|Try Catch 구문|Catch로 빠졌을 경우 (Exception e) 활용|
|18|[PolymorphismMain](./src/main/java/co_templates/PolymorphismMain.java)|polymorphism 다형성|polymorphism 다형성||
|19|[PolymorphismAnimal](./src/main/java/co_templates/PolymorphismAnimal.java)|polymorphism 다형성|polymorphism 다형성||
|20|[PolymorphismDog](./src/main/java/co_templates/PolymorphismDog.java)|polymorphism 다형성|polymorphism 다형성||
|21|[PolymorphismPig](./src/main/java/co_templates/PolymorphismPig.java)|polymorphism 다형성|polymorphism 다형성||

</details>

<details>
<summary>Quest</summary>

|구분|파일명|적용내용|파일내용|비고|
|--|--|--|--|--|
|1|[Additions](./src/main/java/quests/Additions.java)|Scanner|Scanner 사용하여 입력받은 값 합산하기||
|2|[ForsIfs](./src/main/java/quests/ForsIfs.java)|For 구문 <br> 지수연산|입력값 지수연산하여 4의 배수인지 확인하기||
|3|[WhilesIfsBreak](./src/main/java/quests/WhilesIfsBreak.java)|While & break 구문|점수에 따른 학점 계산하기||
|4|[pollsWithoutDB](./src/main/java/quests/pollsWithoutDB.java)|ArrayList(add, get) <br> for-loop문 <br> for-each문|영화 선호도 설문조사하기||
|5|[problemsWithoutDB](./src/main/java/quests/problemsWithoutDB.java)|ArrayList(add, get) <br> HashMap(put)|문제 출제 후 답항 입력받기||
|6|[AdditionsMain](./src/main/java/quests/AdditionsMain.java)<br>[AdditionsSub](./src/main/java/quests/AdditionsSub.java)|Scanner, function|입력값 합산 function으로 호출하기||
|7|[ArithmeticsMain](./src/main/java/quests/ArithmeticsMain.java)<br>[AdditionsSub](./src/main/java/quests/AdditionsSub.java)<br>[ArithmeticsInputOutput](./src/main/java/quests/ArithmeticsInputOutput.java)|try-catch, fucntion|try-catch문 활용한 사칙연산 function 호출||
|9|||||
|10|||||

</details>

<br/>

## Coding Test
<details>

  <summary>백준</summary>

  |구분|소스|문제설명|출처|
  |--|--|--|--|
  |입출력과 사칙연산|[JAVA](./src/codingtests/Beakjoon/B2557.java)|Hello World!를 출력|[백준 2557](https://www.acmicpc.net/problem/2557)|

</details>

<details>
  <summary>프로그래머스</summary>
  
  |NO|구분|소스|문제설명|출처|
  |--|--|--|--|--|
  |1|입문문제|[JAVA](./src/codingtests/programmers/P120810.java)|나머지 구하기|[프로그래머스 120810](https://school.programmers.co.kr/learn/courses/30/lessons/120810)|
  
</details>