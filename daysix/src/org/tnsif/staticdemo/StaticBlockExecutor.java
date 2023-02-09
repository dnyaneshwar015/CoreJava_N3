package org.tnsif.staticdemo;

public class StaticBlockExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StaticBlock.getName());
		StaticBlock sb=new StaticBlock();
		sb.setNum(143);
		System.out.println(sb.getNum());
	}

}

/*OUTPUT
Dnyaneshwar
143
*/