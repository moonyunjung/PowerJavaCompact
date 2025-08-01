package main;

import lib.Calculator; //원하는 패키지 멤버만을 import한다.
//import lib.*; //패키지 전체를 import한다. //권장하지않음. 사용하지 않는 class와 이름이 같은 class를 만들 수 없다.

public class PackageTest {

	public static void main(String[] args) {
		//Calculator obj = new Calculator(); //compile error! //다른 패키지에 있으면 class이름만 가지고 객체 만들 수 없음.
		//lib.Calculator obj = new lib.Calculator(); //패키지 이름을 포함하는 완전한 이름으로 참조한다.
		
		Calculator obj = new Calculator();
		System.out.println(obj.add(100, 200));

	}

}
