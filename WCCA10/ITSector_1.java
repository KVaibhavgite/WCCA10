class ITSector_1 
{
	public static void main(String[] args) 
	{
		Qspiders q=new Students();
		q.institute();
		System.out.println();

		Trainers t=(Trainers)q;
		t.institute();
		t.classes();

		System.out.println();

		Students s=(Students)t;
		s.Study();
		s.classes();
		s.institute();


		System.out.println("Hello World!");
	}
}
