### 도형의 넓이 구하기 + 추상화 
- 공통으로 구현할 수 있는 부분은 추상클래스인 Shape, 제각각 구현해야하는 부분은 구체 클래스인 Circle, Rectangle에서 구현
- 계산하다보면 PI의 값과 제곱, 제곱근 하는 부분이 필요할텐데
  - Pi : Math.PI
  - 제곱 : Math.pow()
  - 제곱근 : Math.sqrt()