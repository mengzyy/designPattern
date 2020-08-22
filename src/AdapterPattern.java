/**
 * WHAT-> 适配器模式：当现有的方法或者接口不能满足新的需要，但是我们又不想改变原有的接口,那么我们就需要使用适配器模式来对原来的接口进行适配
 * FEATURE-> 1. 类适配器模式 2.对象适配器模式 3. 接口适配器模式 （它们主要是通过在适配类中如何拿到待适配类来区别的）
 * HOW-> 暂时没有想好 他的应用场景
 *
 * @program: designPattern
 * @author: mengzy 18306299232@163.com
 * @create: 2020-08-22 21:44
 **/


/**
 * 通过类适配器模式的方式
 */
class TypeOneSrc {
    public int run() {
        System.out.println("输出220v电压");
        return 220;
    }
}

class AdapterPatternOne extends TypeOneSrc {

    public int adpter() {
        int src = super.run();
        System.out.println("适配后，电压为5v");
        return src - 215;
    }

}

/**
 * 通过对象适配器模式的方式
 */
class AdapterPatternTwo {
    TypeOneSrc typeOneSrc;

    public AdapterPatternTwo(TypeOneSrc typeOneSrc) {
        this.typeOneSrc = typeOneSrc;
    }

    public int adpter() {
        int src = typeOneSrc.run();
        System.out.println("适配后，电压为5v");
        return src - 215;
    }

}

/**
 * 通过接口适配器的方式
 */
interface Usb {
    int run();
}

class TypeThreeSrc implements Usb {

    @Override
    public int run() {
        System.out.println("输出220v电压");
        return 220;
    }
}

/**
 * 通过接口适配器模式的方式
 */
class AdapterPatternThree {
    Usb usb;

    public AdapterPatternThree(Usb usb) {
        this.usb = usb;
    }

    public int adpter() {
        int src = usb.run();
        System.out.println("适配后，电压为5v");
        return src - 215;
    }

}


public class AdapterPattern {

    public static void main(String[] args) {
        //输出220v电压
        //适配后，电压为5v
        AdapterPatternOne adapterPatternOne = new AdapterPatternOne();
        adapterPatternOne.adpter();
        //输出220v电压
        //适配后，电压为5v
        AdapterPatternTwo adapterPatternTwo = new AdapterPatternTwo(new TypeOneSrc());
        adapterPatternTwo.adpter();
        //输出220v电压
        //适配后，电压为5v
        AdapterPatternThree adapterPatternThree = new AdapterPatternThree(new TypeThreeSrc());
        adapterPatternThree.adpter();


    }

}
