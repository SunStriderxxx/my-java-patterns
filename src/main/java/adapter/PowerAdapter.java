package adapter;

/**
 * @author Fcb
 * @date 2020/6/17
 * @description 适配器模式，新增adapter 实现目标接口，再传入已有的类进行适配。
 * 在spring中，adviceAdapter用到了适配器模式，spring中存在多种类型的通知，每种通知有自己对应的适配器，在适配器中转换成对应的拦截器
 * 参考文档 https://juejin.im/post/5ba28986f265da0abc2b6084
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }


    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
