/**
 * WHAT->策略模式：当我们需要某一种功能，这种功能可能有多种实现，在这里这个多种实现就是多种策略, 在策略模式中，我们需要定义一共接口，通过这个接口呢来实现多种策略
 * 在上下文对象中，我们通过定义的接口来调用具体的策略方法实现，类似于多态的思想。
 * FEATURE->无
 * HOW->在java中，实现线程池中有一个参数叫做拒绝策略，这个策略就是一发接口，我们可以通过这个接口来实现不同的策略
 *
 * @program: designPattern
 * @author: mengzy 18306299232@163.com
 * @create: 2020-08-22 22:02
 **/

/**
 * 定义一共旅游类
 */
interface Travel {
    void startRun();
}

/**
 * 定义策略：自行车
 */
class Bike implements Travel {
    @Override
    public void startRun() {
        System.out.println("我使用单车来旅游，虽然比较慢，但是可以欣赏风景");
    }
}

/**
 * 定义策略：汽车
 */
class Car implements Travel {
    @Override
    public void startRun() {
        System.out.println("我使用汽车来旅游，快速到达目的地，简单高效");
    }
}

class xiaoming {
    /*定义策略*/
    Travel travel;

    public xiaoming(Travel travel) {
        this.travel = travel;
    }

    public void happy() {
        System.out.println("工作比较累，去旅行把");
        this.travel.startRun();
    }

}

public class StrategyPattern {
    public static void main(String[] args) {
        xiaoming xiaoming = new xiaoming(new Bike());
        xiaoming xiaoming2 = new xiaoming(new Car());
        xiaoming.happy();
        xiaoming2.happy();
    }

}
