### 학생들의 시험 점수를 관리하는 클래스_ StudentScore

### 모든 학생들의 시험 점수를 관리하는 _ allScore
- allScore는 방의 모든 StudentScore가 공동으로 접근하는 값
- allScores 배열은 static 변수로 선언되어야 모든 학생들의 점수를 공유할 수 있다.
- static 변수들은 static method로 호출되어야 정상적으로 다룰 수 있다.
- MyIndex와 SerialIndex는 allScores의 값을 수정할 때 유용하게 쓰일 수 있다.
  - SerialIndex는 static 변수로 선언되어야 모든 학생들이 공유한다.
  - 학생 객체가 생성될 때마다 1씩 증가
- **Arrays.copyOf** 라는 함수를 사용하면 배열의 크기를 늘리는데 유용

----------
- 주어진 StudentScore 클래스에는 static 배열 allScores와 인스턴스 변수 score가 있다. 
- allScores는 모든 학생들의 시험 점수를 저장하고, score는 개별 학생의 시험 점수를 저장
- serialIndex는 StudentScore 객체가 생성될 때마다 1씩 증가하며, myIndex는 객체 생성 시 serialIndex 값을 할당받는다.
- myIndex는 allScores 배열에서 해당 학생의 인덱스로 사용되어 allScores에서 값 수정을 할 값에 접근할 수 있다.
- getAllScores 메서드는 allScores 배열을 반환
- getScore 메서드는 해당 학생의 시험 점수를 반환하고, setScore 메서드는 매개변수로 받은 시험 점수를 설정
- setScore 메서드에서는 allScores 배열을 MyIndex를 사용하여 업데이트 하여야 한다.
- StudentScore 객체가 생성될 때마다 addScore로 새롭게 함수를 Arrays.copyOf 메서드를 호출하여 allScore를 새로운 Array에 복사하고, 새로운 값을 맨 뒤에 넣는다.
  - 맨 처음 null일 때는 length가 1인 Array를 생성하여 값을 대입