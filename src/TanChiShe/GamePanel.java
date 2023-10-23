package TanChiShe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//游戏面板
public class GamePanel extends JPanel implements KeyListener , ActionListener {
    //定义蛇的数据结构
    int length;
    int[]snakeX = new int[600];//蛇的x坐标
    int[]snakeY = new int[500];//25*25
    String fx ="R";//初始方向
    int score;//成绩

    //食物坐标
    int foodx;
    int foody;
    Random random =new Random();


    //游戏当前状态
    boolean isStart = false;//默认不开始
    boolean isFail = false;//默认不失败

    public GamePanel(){
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//获得当前的键盘监听
        timer.start();//游戏一开始就启动
    }

    //初始化方法
    public void init(){
        length = 3;
        snakeX[0] = 100;//头
        snakeY[0] = 100;

        snakeX[1] = 75;
        snakeY[1] = 100;

        snakeX[2] = 50;
        snakeY[2] = 100;

        fx = "R";

        //食物随机分布
        foodx = 25+25*random.nextInt(34);
        foody = 75+25*random.nextInt(24);

        score=0;
    }
//定时器
    Timer timer=new Timer(100,this);//100毫秒刷新一次

    //绘制面板
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        //绘制静态面板
        this.setBackground(Color.WHITE);
        Date.header.paintIcon(this,g,25,11);//画到那个上面+用哪只画笔画,头部广告栏
        g.fillRect(25,75,850,600);//默认游戏界面
        //画积分
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度: "+length,750,35);
        g.drawString("分数: "+score,750,50);

        //画食物
        Date.food.paintIcon(this,g,foodx,foody);

        if(fx.equals("R")){
            Date.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (fx.equals("L")) {
            Date.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        } else if (fx.equals("U")) {
            Date.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (fx.equals("D")){
            Date.down.paintIcon(this,g,snakeX[0],snakeY[0]);
        }

        //画小蛇
        //Date.right.paintIcon(this,g,snakeX[0],snakeY[0]);

        for (int i = 1; i < length; i++) {
            Date.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }


        //游戏状态
        if(isStart==false){
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏！",300,300);
        }
        if(isFail==true){
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("失败，按下空格重新开始",300,300);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
//键盘监听
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode==KeyEvent.VK_SPACE){
            if(isFail){
                isFail=false;
              init();
            }else {
                isStart = !isStart;//取反

            }
            repaint();
        }
        //小蛇移动
        if(keyCode==KeyEvent.VK_UP){
            fx="U";
        } else if (keyCode==KeyEvent.VK_RIGHT) {
            fx="R";
        } else if (keyCode==KeyEvent.VK_LEFT) {
            fx="L";
        } else if (keyCode==KeyEvent.VK_DOWN) {
            fx="D";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
//事件监听定时器，固定时间刷新
    @Override
    public void actionPerformed(ActionEvent e) {

        if(isStart&&isFail==false){

            //开始才动
            //右移
            for (int i = length-1; i >0 ; i--) {
                snakeX[i]=snakeX[i-1];
                snakeY[i]=snakeY[i-1];
            }

            //走向+边界判断
            if (fx.equals("R")){
                snakeX[0] = snakeX[0]+25;
                if (snakeX[0]>850) snakeX[0] = 25;
            }else if (fx.equals("L")){
                snakeX[0] = snakeX[0]-25;
                if (snakeX[0]<25) snakeX[0] = 850;
            }else if (fx.equals("U")){
                snakeY[0] = snakeY[0]-25;
                if (snakeY[0]<75) snakeY[0] = 650;
            }else if (fx.equals("D")){
                snakeY[0] = snakeY[0]+25;
                if (snakeY[0]>650) snakeY[0] = 75;
            }
            if(snakeX[0]==foodx&&snakeY[0]==foody){
                length++;
                score+=10;
                //再次随机
                foodx = 25+25*random.nextInt(34);
                foody = 75+25*random.nextInt(24);
            }
            //失败判定
            for (int i = 1; i < length; i++) {
                if(snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i]){
                    isFail=true;
                    break;
                }
            }

            repaint();
        }
        timer.start();
    }
}


