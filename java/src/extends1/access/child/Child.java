package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicvalue = 1;
        protectedvalue = 2;//상속관계 or 같은 패키지안에서만 호출가능. 지금은 상속 관계라서 가능
        //defaultvalue = 1; 다른 패키지라서 안됨
        //privatevalue 도 안됨

        publicmethod();
        protectedmethod();
        //defaultmethod();
        //privatemethod();

        printparent();
    }
}
