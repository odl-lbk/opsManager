package cn.org.bnc.opsManager.entity;

public class UserListEntity {
    private int index;
    private String user;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserListEntity{" +
                "index=" + index +
                ", user='" + user + '\'' +
                '}';
    }
}
