package prototype;

/**
 * @author Fcb
 * @date 2020/6/14
 * @description
 */
public class IPhoneX implements IPhone {

    private String name;

    private Double price;

    private Double size;

    public IPhoneX() {
    }

    public IPhoneX(IPhoneX iPhoneX) {
        //浅克隆
        this.name = iPhoneX.getName();
        this.price = iPhoneX.getPrice();
        this.size = iPhoneX.getSize();

        //深克隆:针对可变引用类型，重新创建
//        this.name = iPhoneX.getName();
//        this.price = iPhoneX.getPrice();
//        this.size = iPhoneX.getSize();
    }

    @Override
    public IPhone copy() {
        return new IPhoneX(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
