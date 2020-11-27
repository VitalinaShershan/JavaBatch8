package com.syntax.class21;

public class DavitParent extends DavitGrandParent {
    DavitParent() {

        System.out.println("Constructor from Parent");
    }

    DavitParent(int money) {
        super(money);

    }


}
