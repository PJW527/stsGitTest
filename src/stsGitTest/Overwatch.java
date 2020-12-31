package stsGitTest;

public class Overwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p  = new Player();   // 부모 클래스
		Tracer t = new Tracer();    // 자식 클래스
		Character c;
		
		p.cMove(t);
		p.cStop(t);
		p.cAttack(t);
		p.cSkill(t);
		
		Genzi g = new Genzi();    // 자식 클래스
		
		p.cAttack(g);
		p.cMove(g);
		p.cSkill(g);
		p.cStop(g);
		
		
		c = new Mac(); // c로 넘겨준 다음에 맥크리를 대입
		p.cAttack(c);
		p.cMove(c);
		p.cSkill(c);
		p.cStop(c);
		
		c = t; // c로 넘겨준 다음에 트레이서로 대입
		p.cAttack(c);
		p.cMove(c);
		p.cSkill(c);
		p.cStop(c);
		
		
		
	}

}
