
public class IndiaTrafficSignal implements CentralTraffic,AustraliaTrafficSignal {

	public static void main(String[] args) {
		
		CentralTraffic c= new IndiaTrafficSignal();
		
		IndiaTrafficSignal i= new IndiaTrafficSignal();
		
		AustraliaTrafficSignal at=new IndiaTrafficSignal();
	
		
		c.RedSignal();
		c.GreenSignal();
		c.YellowSignal();
		i.BlackColour();
		i.RedSignal();
		
		at.RailSignal();
		System.out.println(c.i);
		System.out.println(at.i);
		

	}

	@Override
	public void GreenSignal() {
		System.out.println("You are in Green signal");
		
	}

	@Override
	public void RedSignal() {
		System.out.println("You are in red signal");
		
	}

	@Override
	public void YellowSignal() {
		System.out.println("You are in Yellow signal");
		
	}

	public void BlackColour()
	{
		System.out.println("You are in black color");
	}

	@Override
	public void RailSignal() {
		System.out.println("You are in Rail Signal");
		
	}
	
}
