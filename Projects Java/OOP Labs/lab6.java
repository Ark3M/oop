/*public class Menue {
    private int buttonWidth;//шширина кнопки
    private int buttonHeight;//высота кнопки
    private Color color1;//цвет
    private String s;//надпись
    private int transp = 0;// прозрачность

    //
    public Menue(){
        buttonWidth = 120;
        buttonHeight =60;
        color1 = Color.WHITE ;
        s = "Старт";
    }
    public void update(){
        if (GamePanel.mouseX >GamePanel.WIDTH/2 - buttonWidth/2 &&
                GamePanel.mouseX < GamePanel.WIDTH/2 + buttonWidth/2 &&
                GamePanel.mouseY > GamePanel.HEIGHT/2 - buttonHeight/2 &&
                GamePanel.mouseY < GamePanel.HEIGHT/2 + buttonHeight/2){// если курсор попал в кнопку
            transp = 60;
            if (GamePanel.leftMouse){
                GamePanel.state = GamePanel.STATES.PLAY;
            }
        }else {
            transp = 0;
        }
    }

    public void draw(Graphics2D g){
        g.setColor(color1);//передаём цвет
        g.setStroke(new BasicStroke(3));//обводка
        g.drawRect(GamePanel.WIDTH/2-buttonWidth/2,GamePanel.HEIGHT/2-buttonHeight/2,buttonWidth,buttonHeight);//квадрат по центру

        g.setColor(new Color(255,255,255, transp));//передаём цвет c прозрачностью
        g.fillRect(GamePanel.WIDTH/2-buttonWidth/2,GamePanel.HEIGHT/2-buttonHeight/2,buttonWidth,buttonHeight);//квадрат по центру

        g.setStroke(new BasicStroke(1));//обводка
        g.setColor(color1);//передаем цвет
        g.setFont(new Font("Consolas",Font.BOLD,40));//передаем шрифт
        long length = (int) g.getFontMetrics().getStringBounds(s,g).getWidth();//ширина строки
        g.drawString(s,(int)(GamePanel.WIDTH/2-length/2),(int)(GamePanel.HEIGHT/2+buttonHeight/4));//рисуем надпись
    }
}

КлассMenue
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.geom.AffineTransform;

        publicclassPlayer  {
//  нач координаты и размер объекта
private  double x;//координа х героя
private  double y;//координа y героя
private double w ; //ширина обьекта
private double h ; // высота объекта

private int speed;// скорость
private Color color1;// цвет

private double angl; // угол поворота
private double distX;// разница по х от мышки
private double distY;//
private double dist;// расстояние от мышки


// стаич прем - кавиши перемещения

public static boolean up;
public static boolean down;
public static boolean left;
public static boolean right;


private double dx;// смещение
private double dy;
public static boolean isFiring;//стрельба
public double health;// здоровье
private int rech;// длин перезаряд
        privatelongtimer_s = 0;// начальноевремядлятаймера
private long timer_f = 0;// конечное время
        privatelongtimer_d = 1000;// (количество миллисекунд) длительность таймера

        Image img = new ImageIcon("res/pl.png").getImage();//загрузка
        Image img1 = new ImageIcon("res/low_bat.png").getImage();//загрузка
public Rectangle getRect() { // получение прямоугоьников
        return new Rectangle((int) x, (int) y, 58, 74); //возвращаем конструктор с размером объекта
        }

// Constructor
public Player(){
        x = GamePanel.WIDTH / 2;// нач координаты героя
        y = 500;
        w = 58;
        h = 74;

        speed = 5;
        color1 = Color.WHITE;
        health = 3;
        //  расстояние от мышки до пули
        angl= 0;
        // смещение
        dx = 0;
        dy = 0;
        // нач знач клавиш
        up = false;
        down = false;
        left = false;
        right = false;
        isFiring = false;
        rech=0;
        }
//  гетеры
public double getX(){
        return  x;
        }
public double getY(){
        return  y;
        }
public double getW(){
        return  w;
        }
public double getH(){
        return  h;
        }

// - здоровья
public void hit() {
        health--;

        }

public   boolean timer_rech (){
        if (timer_s == 0) { //если таймер не запущен
        timer_s = System.currentTimeMillis();// получаем текущее время милсек
        timer_f = timer_s + timer_d; // конечное время трека
        timer1.start();// запуск таймера индикации перезарядки
//GamePanel.a_norech.play();  GamePanel.a_norech.setVolume();
        }

        if(timer_f<=System.currentTimeMillis()) { //если время звучания меньше текущювремени
        timer_s=0;// обнуляем счетчик

        return true;
        }
        else return false;
        }

        Timer timer1 = new Timer(2, new ActionListener() {

public void actionPerformed(ActionEvent e) {
        rech=rech+1;//код который нужно выполнить каждую ед времени
        //rech=rech+40;//код который нужно выполнить каждую ед времени
        if(rech>=160){
        timer1.stop();
        //GamePanel.a_norech.stop();
        //GamePanel.a_rech.sound();
        //GamePanel.a_rech.setVolume();
        }
        }
        });



// обновления
public void update(){

        distX =GamePanel.mouseX -x ;// разница по х от мышки
        distY =y - GamePanel.mouseY ;
        dist = (Math.sqrt(distX*distX + distY*distY));

        if (distX>0)  angl = Math.acos(distY/(Math.sqrt(distX*distX + distY*distY)));
        if (distX<0)  angl =- Math.acos(distY/(Math.sqrt(distX*distX + distY*distY)));


        if (health <=0){
        //killed = true;
        health = 0;}

// смещение героя по игровому полю
        if (up&&y>20){
        GamePanel.a_fly.play(); GamePanel.a_fly.setVolume();
        GamePanel.a_fly.timer_play ();
        y -=  speed;
        }
        if (down && y <GamePanel.HEIGHT -h){
        GamePanel.a_fly.play(); GamePanel.a_fly.setVolume();
        GamePanel.a_fly.timer_play ();
        y += speed;
        }
        if (left && x >0){
        GamePanel.a_fly.play(); GamePanel.a_fly.setVolume();
        GamePanel.a_fly.timer_play ();
        x -= speed;
        }
        if (right && x <GamePanel.WIDTH -w){
        GamePanel.a_fly.play(); GamePanel.a_fly.setVolume();
        GamePanel.a_fly.timer_play ();
        x += speed;
        }
        if(up && left || up && right || down && left || down && right){
        dy = dy * Math.sin(Math.toRadians(45));
        dx = dx * Math.cos(Math.toRadians(45));
        }
        y += dy;
        x += dx;

        dy = 0;
        dx = 0;




        if (isFiring == true && GamePanel.wave.magazine >0) { // если стрельба true
        if(timer_rech ()) {
        GamePanel.bullets.add(new Bullet());//звук выстрела
        GamePanel.a_bul.sound();// играть звук
        GamePanel.a_bul.setVolume();//громкость
        isFiring = false;//запрет для стрельбы
        GamePanel.wave.magazine--; // опустошаем магазин при выстреле
        rech = 0;
        timer_rech ();

        }
        }
        }

// отрисовка героя
public void draw(Graphics2D g){

        Color bacColor = new Color(255, 0,0 );//созд обьект клсса цвет
        g.setColor(bacColor);// передаём цвет граф объекту
        g.fillRect(45, 5, 110, 20);//рисуем прямоугольную область
        g.fillRect(245, 5, 190, 20);//рисуем прямоугольную область
        g.fillRect(495, 5, 100, 20);//рисуем прямоугольную область


        g.drawImage(img1,750,3,null);//отрисовываем элемент в координатах
        Color batColor = new Color(5, 255,0 );//созд обьект клсса цвет
        g.setColor(batColor);// передаём цвет граф объекту
        g.fillRect(760, 7, (0 + rech), 23);//рисуем прямоугольную область

        g.setColor(Color.WHITE);//задаем цвет объекту Соlor
        Fontfont = newFont("Arial",Font.ITALIC,20);//Создём объект класса фонт (передаем в конструктор параметры)
        g.setFont(font);//устанвливаем наш шрифт
        ((Graphics2D) g).drawString("жизнь  "+(int)health ,50,22 );//отрисовываем строку
        ((Graphics2D) g).drawString(" патроны  "+ GamePanel.wave.magazine,250,22 );//отрисовываем строку
        ((Graphics2D) g).drawString(" враги "+ GamePanel.enemies.size(),500,22 );//отрисовываем строку

        // ВРАЩЕНИЕ
        AffineTransform origXform; // создаем объект класса AffineTransform
        origXform = g.getTransform(); // получаем текущее значение
        AffineTransform newXform = (AffineTransform)(origXform.clone()); // клонируем текущее значение
        newXform.rotate(angl,x+29,y+25) ; // вертим полученное изображ
        g.setTransform(newXform); // ставим трансформированное изображение
        g.drawImage(img,(int)x,(int)y,null); // здесь рисуем картинку
        g.setTransform(origXform); // возвращаем старое значение
        }
        }

        КлассMenue
        import javax.swing.JFrame;

public class GameStart {
    public static void main(String[] args) {
        GamePanel panel = new GamePanel();// создаём объект панель
        JFrame startFrame = new JFrame("game");// создаем окно с названием
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// закрытие окна при клике крестика
        startFrame.setContentPane(panel); // перенос в фрейм панели с GamePanel
        //startFrame.add(panel);
        startFrame.setLocationRelativeTo(null);//полоение фрейма по центру
        startFrame.pack();//размер фрейма как и размер его компонентов

        panel.start();// заускаем поток панели
// окно видемо
        startFrame.setVisible(true);

    }

}
*/
