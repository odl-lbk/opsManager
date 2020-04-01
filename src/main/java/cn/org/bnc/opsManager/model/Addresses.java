package cn.org.bnc.opsManager.model;

import java.util.List;

public class Addresses {
    List<Address> test;

    public List<Address> getTest() {
        return test;
    }

    public void setTest(List<Address> test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "test=" + test +
                '}';
    }
}
