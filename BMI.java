class BMI extends BodyData{
	public int age;
	
	public BMI(String a,double b,double c,String d,int e){
		super(a,b,c,d);
		age = e;
	}
	
	public void DataDisplay2(){
		DataDisplay();
		System.out.println("�N��F"+age);
	}
	
	public double BMICalculation(){
		double a = height/100;
		return weight/(a*a);
	}
	
	public void AdultsBodyFatness(){
		if(BMICalculation()<18.5){
			System.out.println("��̏d(�����^)");
			return;
		}else if((BMICalculation()>=18.5)&&(BMICalculation()<25)){
			System.out.println("���ʑ̏d");
			return;
		}else if((BMICalculation()>=25)&&(BMICalculation()<30)){
			System.out.println("�얞�i1�x�j");
			return;
		}else if((BMICalculation()>=30)&&(BMICalculation()<35)){
			System.out.println("�얞�i2�x�j");
			return;
		}else if((BMICalculation()>=35)&&(BMICalculation()<40)){
			System.out.println("�얞�i3�x�j");
			return;
		}else{
			System.out.println("�얞�i4�x�j");
			return;
		}
	}
	
	public double LaurelCalculation(){
		return weight*10000000/(height*height*height);
	}
	
	public void ChildrenBodyFatness(){
		if(LaurelCalculation()<100){
			System.out.println("�₹");
			return;
		}else if((LaurelCalculation()>=100)&&(LaurelCalculation()<115)){
			System.out.println("�₹����");
			return;
		}else if((LaurelCalculation()>=115)&&(LaurelCalculation()<145)){
			System.out.println("����");
			return;
		}else if((LaurelCalculation()>=145)&&(LaurelCalculation()<160)){
			System.out.println("�얞����");
			return;
		}else{
			System.out.println("�얞");
			return;
		}
	}
	
	public double KaupCalculation(){
		return weight*10000/(height*height);
	}
	
	public void InfantsBodyFatness(){
		if(KaupCalculation()<13){
			System.out.println("�₹");
			return;
		}else if((KaupCalculation()>=13)&&(KaupCalculation()<15)){
			System.out.println("�₹����");
			return;
		}else if((KaupCalculation()>=15)&&(KaupCalculation()<18)){
			System.out.println("����");
			return;
		}else if((KaupCalculation()>=18)&&(KaupCalculation()<20)){
			System.out.println("�얞����");
			return;
		}else{
			System.out.println("�얞");
			return;
		}
	}
	
	public void DodyFatness(){
		if((age>=1)&&(age<=5)){
			InfantsBodyFatness();
		}else if((age>=6)&&(age<=15)){
			ChildrenBodyFatness();
		}else if(age>=16){
			AdultsBodyFatness();
		}else{
			System.out.println("����s�\");
		}
	}
}