package WenDang.java06.compare;

public class Order {
    private String orderName;
    private String date;
    private product prod;

    public Order() {
    }

    public Order(String orderName, String date) {
        this.orderName = orderName;
        this.date = date;
    }

    public product getProd() {
        return prod;
    }

    public void setProd(product prod) {
        this.prod = prod;
    }

    public String getOrderName() {
        return orderName;
    }

    public static void main(String[] args) {
        product prod = new product("笔记本","1200","1");
        Order order= new Order("张三","20151212");
        order.setProd(prod);
        System.out.println("订单用户："+order.orderName);
        System.out.println("此订单的详细商品如下：");
        product pro = order.getProd();
        System.out.println("商品名称："+pro.getName()+"商品价格："+pro.getPrice()+"商品购买数量"+pro.getNum());

    }
}
