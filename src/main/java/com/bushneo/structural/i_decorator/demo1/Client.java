package com.bushneo.structural.i_decorator.demo1;

/**
 * @author bushneo
 * @create 2019-01-01 18:05
 */
public class Client {

    public static void main(String[] args) {
          CarComponent ordinaryCar = new OrdinaryCarConcreteComponent();
        ordinaryCar.move();

          System.out.println("增加飞行功能：");
        FlyCarConcreteComponent flyCarConcreteComponent = new FlyCarConcreteComponent(ordinaryCar);
        flyCarConcreteComponent.move();

        System.out.println("增加潜水功能：");
        SwimmingCarConcreteComponent swimmingCarConcreteComponent = new SwimmingCarConcreteComponent(flyCarConcreteComponent);
        swimmingCarConcreteComponent.move();
        
        System.out.println("增加说话功能：");
        SpeakCarConcreteComponent speakCarConcreteComponent = new SpeakCarConcreteComponent(swimmingCarConcreteComponent);
        speakCarConcreteComponent.move();
        

    }
}
