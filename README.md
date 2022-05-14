## 디자인 패턴

- 프로그램을 설계할 때 발행했던 문제점들을 객체 간의 상호 관계 등을 이용해 해결할 수 있도록 하나의 규약 형태로 만들어 놓은 것
- 데이터 베이스 연결 모듈에 많이 사용
- 장점 : 사용하기가 쉽고 굉장히 실용적
- 단점 : 각 테스트마다 독립적인 인스턴스를 만들기 어려워 TDD 적용 시 어려움을 겪는다.
- 단점 : 모듈간의 결합을 강하게 만들 수 있다. => 의존성 주입을 통해 모듈간의 결합을 느슨하게 만들 수 있음.
  - 디커플링 : 메인과 하위 모듈 사이에 의존성 주입자(dependency injector)를 두어 메인 모듈이 간접적으로 의존성을 주입하도록 하는 것
  - 의존성 주입 : 상위 모듈은 하위 모듈에서 어떤 것도 가져올 수 없고 추상화에 의존해야한다는 원칙이 지켜져야 함.
  - 의존성 주입을 하면 모듈간의 의존성이 낮아져 각 모듈을 쉽게 교체할 수 있다. 테스팅도 쉽고 마이그레이션도 쉬워진다.
  - 의존성 주입의 단점 : 모듈이 분리되면서 클래스 수가 늘어나 프로젝트 복잡성이 증가될 수 있다.
