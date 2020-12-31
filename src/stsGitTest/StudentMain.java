package stsGitTest;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("유재석");
		System.out.println(p.name);
		Student s = new Student("아이유");
		System.out.println(s.name);
		s.grade = "a";
		s.department = "com";
		s.id = "1001";
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.department);
		
		
		// Child1 c = new Child1("유재석", "you@gmail.com");
		// c = s // 서로 클래스 타입이 다를경우 대입이 불가능함
		
		// person 클래스 변수 p에 학생 클래스의 객체를 대입
		// 객체지향 언어의 다형성 특성 때문에 부모 클래스의 변수에 자식클래스의 객체를 대입할수 있음
		p = s; 
		// 변수의 겉모양은 부모 클래스인 person 임
		// 변수의 속 알맹이는 자손 클래스인 student임. 결과값인 p.name도 student 객체의 값이 출력됨
		System.out.println(p.name);
		
		//persn 클래스 타입의 변수 p에 자손클래스 타입의 객체가 들어 있으므로 p.grade가 동작될거라 생각하지만
		//부모 클래스 객체로 잠시 모습이 변해있는 형태이기 때문에 자손 클래스 타입의 멤버들을 사용할수가 없음
//		p.grade = "A";
//		P.department = "Com";
// 내천 유리코 혜미 삼천
	}

}
