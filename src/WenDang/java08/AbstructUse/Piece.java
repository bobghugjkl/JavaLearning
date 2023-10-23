package WenDang.java08.AbstructUse;
//这是一个抽象父类
public abstract class Piece {
    //定义棋子的行进方法
    public abstract void runWay();
    //定义棋子进攻的方法
    public void attack(){
        System.out.println("吃掉下面的棋子");

    }

}
