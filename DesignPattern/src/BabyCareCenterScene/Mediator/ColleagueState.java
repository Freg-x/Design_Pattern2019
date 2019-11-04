package BabyCareCenterScene.Mediator;

/**
 * 枚举类，用于表示不同的聚散状态
 */

public enum ColleagueState {
    SEPARATION("I can't find my family members"),
    REUNION("Thanks to BabyCareCenterScene! We're reunited!");

    private String description;

    /**
     * 构造函数
     * @param description 状态描述语
     */
    ColleagueState(String description) {
        this.description = description;
    }

    /**
     * 返回状态描述语
     * @return 状态描述语
     */
    public String toString() {
        return description;
    }

}
