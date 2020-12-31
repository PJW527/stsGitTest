package stsGitTest;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p1 = new Parent1();
		p1.output1();
		p1.output2();
		
		Child1 c1 = new Child1("유재석", "you@naver.com");
		c1.output1();
		c1.output2();
		// 상속받은 child1에서 output2 메서드를 오버라이딩 할수 없기 때문에 부모 클래스인 parent1의 output2 메서드를 그대로 사용함
		
		System.out.println(c1.name);
		c1.name = "아이유";
		System.out.println(c1.name);
		System.out.println(c1.email);
		//c1.email = "iu@naver.com";   // 파이널 변수라 오류가 뜸
		//System.out.println(c1.email);
		
		// parent2 클래스는 final을 사용하여 다른 클래스가 상속받을수 없음
		Parent2 p2 = new Parent2();
		p2.output();
	}

}
