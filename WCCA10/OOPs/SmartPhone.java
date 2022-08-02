class SmartPhone
{
int ram;
String imei;
int storage;
Simcard sim1;
Simcard sim2;
//Simcard a1=new Simcard ("jio",9767240176L);
//Simcard a2=new Simcard ("vi",93673240176L);
void insertsim1(Simcard sim1)
{
if(this.sim1==null)
this.sim1=sim1;
else
System.out.println("SIM slot is not available");
}
void insertsim2(Simcard sim2)
{
if(this.sim2==null)
this.sim2=sim2;
else
System.out.println("SIM slot is not available");
}
void removesim1(Simcard sim1)
{
if(this.sim1!=null)
sim1=null;
else
System.out.println("it is already empty");
}
void removesim2(Simcard sim2)
{
if(this.sim2!=null)
sim2=null;
else
System.out.println("it is already empty");
}
void isslotempty()
{
if(sim1==null&&sim2!=null)
System.out.println("only slot 1 is avialable");
else if(sim1!=null&&sim2==null)
System.out.println("only slot 2 is avialable");
else if(sim1==null&&sim2==null)
System.out.println("both slot are avialable");
else
System.out.println("both slot are occupied");
}
SmartPhone(int ram,String imei,int storage)
{
this.ram=ram;
this.imei=imei;
this.storage=storage;
}
void display()
{
System.out.println("Ram:"+ram);
System.out.println("IMEI:"+imei);
System.out.println("Storage:"+storage);
if(sim1!=null)
sim1.display();
//a1.display();
if(sim2!=null)
sim2.display();
//a2.display();
}
}



