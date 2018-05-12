package Overview;


class Room {
	
	float lh;
	float bh;
	void getdata(float a , float b)
	{
		lh = a;
		bh = b;
		
	}

}

class RoomArea {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float area;
		Room rm = new Room();
		rm.getdata(10, 20);
		
		area = rm.lh * rm.bh;
		
		System.out.println("Area : " +area);

	}

}
