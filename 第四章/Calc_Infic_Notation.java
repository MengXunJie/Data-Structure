package ������;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calc_Infic_Notation {
	/**�������ȼ�*/
	public static final Map<Character,Integer> basic =new HashMap<Character,Integer>();
	static {
		basic.put('-', 1);
		basic.put('+', 1);
		basic.put('*', 2);
		basic.put('/', 2);
		basic.put('(', 0); 
		
	}
	
//	public String toSuffix(String infix) {
//		List<String>queue = new ArrayList<String>();//��������������������Լ���������ʽ
//		List<Character>stack=new ArrayList<Character>();//����ջ���ڴ�����������ջ�л����
//		
//		char[] charArr=infix.trim().toCharArray();//�ַ��������ڲ�����ֻ����
//		String standard="+-*/";//�жϱ�׼�����ʽ�л���ֵ������
//		char ch='&';//ѭ�������ڱ��浱ǰѭ������
//	    int len=0;//���ڼ�¼���鳤��
//	    for(int i=0;i<charArr.length;i++) {
//	    	ch=charArr[i];
//	    	if(Character.isDigit(ch)) {
//	    		len++;
//	    	}
//	    	else if(Character.isLetter(ch)) {
//	    		len++;
//	    	}
//	    	else if(Character.isSpaceChar(ch)) {
//	    		if(len>=0) {
//	    			queue.add(String.valueOf(Arrays.copyOfRange(charArr,i-len,i)));
//	    			len=0;
//	    		}
//	    		continue;
//	    	}
//	    	else if(standard.indexOf(ch)!=-1) {
//	    		if(len>0) {
//	    			queue.add(String.valueOf(Arrays.copyOfRange(charArr,i-len,i)));
//	    			len=0;
//	    		}
//	    		if(ch=='(') {
//	    			stack.add(ch);
//	    		}
//	    		if(!stack.isEmpty()) {
//	    			int size = stack.size()-1;
//	    			boolean flags=false;
//	    			if(size>=0&&ch==')'&&stack.get(size)!='(') {
//	    				queue.add(String.valueOf(stack.remove(size)));
//	    				size--;
//	    			}
//	    		}
//	    		if(ch !=')')
//	    			stack.add(ch);
//	    	}
//	    		
//	    		
//	    		
//	    		
	    		
	    		
//	    }
//	}
}
