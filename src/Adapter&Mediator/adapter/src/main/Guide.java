package main;

/**
 * 指南的抽象类
 */

public abstract class Guide {
    private String type;

    public Guide(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * 交给子类去实现的抽象方法guide
     */
    public abstract void guide();
}
