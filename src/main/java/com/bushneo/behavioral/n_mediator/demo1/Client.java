package com.bushneo.behavioral.n_mediator.demo1;

/**
 * @author bushneo
 * @create 2019-01-05 12:21
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new President();

        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Finacial finacial = new Finacial(mediator);

        development.handleByMyself();
        development.handleByOther();
    }

}
