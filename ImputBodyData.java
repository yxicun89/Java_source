import java.util.Scanner;
class ImputBodyData{
	public static void main(String[] args){
		System.out.println("���Ȃ��̐g�̃f�[�^����ɔ얞�x���v�����܂�");
		System.out.println("���Ȃ��̐g�̃f�[�^����͂��Ă�������");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���O�́H�H");
		String name = stdIn.next();
		System.out.println("�g���͉�cm�ł����H");
		double height = stdIn.nextDouble();
		System.out.println("�̏d�͉�kg�ł����H�H");
		double weight = stdIn.nextDouble();
		System.out.println("���ʂ́H");
		String sex = stdIn.next();
		System.out.println("���΂ł����H");
		int age = stdIn.nextInt();
		BMI bmi = new BMI(name,height,weight,sex,age); //������new BMI������B
		System.out.println("���Ȃ��̐g�̃f�[�^�͉��L�ɂȂ�܂��B");
		bmi.DataDisplay2(); //������Display������B
		System.out.println("���Ȃ��̔얞�x�͉��L�ɂȂ�܂��B");
		bmi.DodyFatness(); //������DodyFatness������B
	}
}