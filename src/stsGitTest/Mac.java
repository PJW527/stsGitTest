package stsGitTest;

public class Mac extends Character{
	

		@Override
		public void move() {
			System.out.println("맥크리가 이동합니다.");
		}
		@Override
		public void stop() {
			System.out.println("맥크리가 멈춥니다.");
		}
		@Override
		public void attack() {
			System.out.println("맥크리가 총으로 공격합니다.");
		}
		@Override
		public void skill() {
			System.out.println("맥크리가 하이눈을 사용합니다.");
		}


}
