package module.everything.OOPS.assignments;

public class Assignment5 {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.changeChannels();
		tv.changeVolume();
		tv.connectToInternet();
		
	}
}

interface TVremote {
	public void changeChannels();
	public void changeVolume();
}

interface SmartTVremote extends TVremote{
	public void connectToInternet();
}

class TV implements SmartTVremote{

	@Override
	public void changeChannels() {
		System.out.println("TV change channels");
		
	}

	@Override
	public void changeVolume() {
		System.out.println("TV change volume");
		
	}

	@Override
	public void connectToInternet() {
		System.out.println("TV connect to internet");
		
	}
	
}
