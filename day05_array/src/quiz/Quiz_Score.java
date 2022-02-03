package quiz;


import java.util.Arrays;
import java.util.Scanner;

public class Quiz_Score {
	static class Student implements Comparable<Student>{
		private String name;
		private int kor, eng, com, sum;
		private double avg;
		char grade;
	
		public Student(String name, int kor, int eng, int com) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.com = com;
			this.sum = kor + eng + com;
			this.avg = (double)sum/3;
			setGrade(this.avg);

		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getCom() {
			return com;
		}
		public void setCom(int com) {
			this.com = com;
		}
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public double getAvg() {
			return avg;
		}
		public void setAvg(double avg) {
			this.avg = avg;
		}
		
		public char getGrade() {
			return grade;
		}
		public void setGrade(char grade) {
			this.grade = grade;
		}
		public void printAll() {
			System.out.print("이름: " + this.name + "\n국어: " + this.kor +"\n영어: " + this.eng 
					+"\n전산: " + this.com + "\n평균: " +this.avg + "\n등급: " +this.grade +"\n\n");
		}
		void setGrade(double avg) {
			int key = (int)(avg / 10);
			switch (key) {
			case 10:
				this.grade = 'A';
				break;
			case 9:
				this.grade = 'B';
				break;
			case 8:
				this.grade = 'C';
				break;
			case 7:
				this.grade = 'D';
				break;
			default :
				this.grade='F';
			}
			
				
		}

		@Override
		public int compareTo(Student o) {
			return (int) (this.avg - o.avg);
		}
		
	}
	
	public static void main(String[] args) {
		// 성적표 국어, 영어, 전산, 이름 입력 받아서 총점, 평균
		Scanner sc = new Scanner(System.in);
		
		Student[] st = new Student[3];
		String name="";
		int kor = 0, eng = 0, com = 0;
		int cnt = 0; 
		while(cnt < st.length) {//			
			System.out.print("이름입력:");
			name =sc.next();
			System.out.print("국어점수:");
			kor =sc.nextInt();
			System.out.print("영어점수:");
			eng =sc.nextInt();
			System.out.print("전산점수:");
			com =sc.nextInt();
			st[cnt] = new Student(name, kor, eng, com);
			System.out.println();
			if(kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100)
				System.out.println("점수를 정상적으로 입력해주세요");
			else
				cnt++;
		}
//		
		Arrays.sort(st);
		for (int i = 0; i < st.length; i++) {
			st[i].printAll();
		
		}
	}
}