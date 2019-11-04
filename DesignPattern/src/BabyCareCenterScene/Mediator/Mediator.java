package BabyCareCenterScene.Mediator;

/**
 * Mediator接口，交由{@link BabyCareCenter}实现
 */

public interface Mediator {
    void cancellation(Colleague parent, Colleague child);

    void register(Colleague colleague);

    void offerHelp(Colleague colleague);
}
