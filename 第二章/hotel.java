package �ڶ���;

public class hotel {
	public static final java.util.Scanner INPUT
    = new java.util.Scanner(System.in);
    private String[]name;
    private boolean[]num;
    
    public hotel() {
    	name=new String[10];
    	num=new boolean[10];
    	
    }
    public void chickIn(int b,String a) {
    	name[b]=a;
    	num[b]=true;
    	
    }
    public void chickOut(int b) {
    	name [b]=null;
    	num[b]=false;
    }
    public void play() {
    	while(!(this.isFull())){
    	System.out.println("ס���밴1���˷��밴2");
    	int type=INPUT.nextInt();
    	if(type==1) {
    	System.out.println("����ľ�ס���Ϊ(true�����Ѿ�������ס�ˣ�false����δ������ס)");
    		for(int a=0;a<10;a++) {
    			System.out.print("����"+a+" ");
    			System.out.print(num[a]);
    		}
    		System.out.println("������ס��һ�䣿");
    		int room=INPUT.nextInt();
    		/**����*/
    		assert num[room]==false:"�����Ѿ�������ס��";
    		System.out.println("��������������");
        	String a=INPUT.next();
    		this.chickIn(room,a);
    		
    	}
    	else if(type==2) {
    		System.out.println("������Ҫ���ļ䷿���������ķ����");
    		int c=INPUT.nextInt();
    		this.chickOut(c);
    	}
    	}
    }
    public boolean isFull() {
    	int i=0;
    	for(boolean a:num) {
    		if (a==true) {
    			i++;
    		}
    	}
    	if(i==10) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
	public static void main(String[] args) {
	hotel a=new hotel();
	a.play();

	}

}
