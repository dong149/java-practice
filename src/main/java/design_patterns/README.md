## 1. 전략패턴

여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환 가능하도록
하는 패턴이다.

여기서 추상적인 접근점은 Interface를 생각하면 된다.

사용자는 자신에게 맞는 전략을 취사선택하여 로직을 수행할 수 있게하는 방법이다.
게임을 예로 들면, 캐릭터는 공격이라는 작업을 수행함에 있어 무기를 상황에 맞게
선택해서 공격을 위임할 수 있다.

### 장점
가장 큰 장점은 확장성이다.

무기를 추가한다고 가정하면, Weapon 인터페이스만 간단하게 구현해서 사용하면 된다.

---

## 2. 어댑터 패턴

클라이언트의 요구 타입과 반환 타입이 다를지라도, 중간에 어댑터를 둠으로써,
적절히 가공하여 둘을 연결지어준다.

어댑터 패턴을 사용하면 전혀 다른 인자값을 가지고도 몇몇 알고리즘을 사용해서
로직을 사용가능하다.

```java 
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f)); // 200.0
        System.out.println(adapter.halfOf(100f)); // 50.0
    }
```
사용자는 twiceOf, halfOf 내부에서 어떤 알고리즘을 사용하든 상관없이
맞는 결과만 반환받으면 그만이다.

나중에 내부 로직을 바뀌어도 사용자입장에서는 크게 사용방법이 달라지지 않는다는 장점이 있다.


### 장점
연관없는 두 객체를 연결해서 원하는 요구사항을 수용한다면 생산성 측면에서도 더 높아질 수 있다.

이를 통해 우리는 매번 요구사항마다 새로운 알고리즘을 만들거나 타입별로 비슷한 알고리즘을 새로
구현할 필요 없이 기존의 알고리즘을 변형해 재활용할 수 있게 된다.

---

## 3. 템플릿 메소드 패턴

템플릿은 비유하자면, 일종의 붕어빵 틀, 타꼬야끼 틀과 비슷하다고 볼 수 있으며,
알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이
알고리즘을 재정의 하는 패턴이다.

템플릿 메서드를 사용해 하위 클래스에서 전체 구조를 변경하지 않고 알고리즘의 특정 단계를
재정의가능하다.

### 사용처
일정한 프로세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있다
ex) Spring Security 인증 및 인가과정

``` java

public static void main(String[] args) {
        AbstractSoldierConscription conscriptionStrategy = new NormalSoldierConscription();
        Soldier soldier = conscriptionStrategy.conscription();

        soldier.attack();
    }
```

각각의 상세 요구사항들을 모듈화 했기 때문에 재사용성을 높이고, 강화되거나
변경된 정책이나 요구사항을 적용하기가 더 편해진다.

---

## 4. 팩토리 메소드 패턴

객체를 만들어내는 부분을 서브 클래스에 위임하는 패턴
즉, new 키워드를 호출해 객체를 생성하는 역할을 서브 클래스에 위임하는 것이다.
결국 팩토리 메소드 패턴은 객체를 만들어내는 공장을 만드는 패턴이라고 할 수 있다.
팩토리 메소드 패턴에서는 인스턴스를 만드는 방법을 상위 클래스 측에서 결정하지만 구체적인 클래스명 까지는 결정짓지는 않는다.

구체적인 내용은 모두 하위 클래스에서 수행한다. 따라서 인스턴스 생성을 위한 골격과 실제의 인스턴스 생성의 클래스를 분리해서 생각할 수 있다.

---

## 5. 싱글톤 패턴

인스턴스가 한 개만 존재하는 것을 보장하는 패턴을 Sigleton Pattern이라 한다.

---

## 6. 프로토 타입 패턴

---

## 7. 빌더 패턴

복잡한 객체를 생성하는 방법을 정의하는 클래스와, 표현하는 방법을 정의하는 클래스를 별도로 분리하여,
서로 다른 표현이라도 이를 생성할 수 있는 동일한 절차를 제공하는 패턴이다.

생성해야 하는 객체가 Optional한 속성을 많이 가질 때 빛을 발휘한다.

---

## 8. 추상 팩토리 패턴

인풋으로 서브클래스에 대한 식별 데이터를 받는 것이 아니라 또 하나의 팩토리 클래스를 받는다.
(팩토리 메소드 패턴과 다름)

---

## 9. 브릿지 패턴

구현부에서 추상층을 분리하여, 각자 독립적으로 변형이 가능하고 확장이 가능하도록 한다.
즉, 기능과 구현에 대해서 두 개의 별도의 클래스로 구현한다.

### 어댑터 패턴과의 차이?

두 패턴 모두 Interface의 detail을 감추고자 하며, 구조적인 차이는 없다.

하지만, 목적이 다르다.

- 어댑터는 어떤 클래스의 인터페이스가 다른 코드에서 기대하는 것과 다를 때 ( 기능은 같은데 함수명이 다를 때 ) 어댑터를 중간에 두어 맞춰주는 것이다.
- 브릿지는 추상과 구현을 분리하는 것이다. ( 추상 클래스는 추상 클래스 대로, 구현은 구현 대로 변경해도 서로 영향을 주지 않도록 한다. )

## 10. 컴포지트 패턴

