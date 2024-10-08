- 묵시적 형변환을 활용하여 부모 클래스 타입의 변수에 자식 클래스 객체를 저장할 수 있다.
- 묵시적 형변환된 변수를 다시 자식 클래스 타입으로 형변환하여 해당 자식 클래스의 메소드를 호출할 수 있다.
- super 키워드를 사용하여 부모 클래스의 메소드를 호출할 수 있다.
- @Overriding을 사용하여 자식 클래스에서 부모 클래스 메소드를 오버라이딩 할 수 있다.

- 전체 도형을 나타내는 클래스 Shape
- 하위 클래스 Circle, Rectangle
- 각각 넓이 구하는 방식은 서로 다르고,
- Info는 공통 부분이 있고, 다른 부분도 있

#### 출력
```java
Shape1 면접 크키: 50.24
Shape2 면접 크키: 12.0
------------------------
도형의 색상: 빨강
도형의 면적: 50.24
원의 반지름: 4.0
------------------------
도형의 색상: 파랑
도형의 면적: 12.0
사각형의 가로 길이: 3.0
사각형의 세로 길이: 4.0
```


#### 해설
- circle 클래스는 shape 클래스를 상속받고, radius라는 인스턴스 변수와 getArea 메소드를 오버라이딩하여 원의 면적 계산
- 또한, printCircleInfo 메소드를 추가하여 원의 반지름을 출력
- Rectangle 클래스도 Shape 클래스를 상속받고, width와 height라는 인스턴스 변수와 getArea 메소드를 오버라이딩하여 사각형의 면적 계산
- printRectangleInfo 메소드는 사각형의 가로,세로 길이를 출력
- printCircleInfo 와 printRectangleInfo는 각각 Shape의 super.printInfo()를 재사용
- color는 shape의 속성이여서 super()로 생성자를 호출