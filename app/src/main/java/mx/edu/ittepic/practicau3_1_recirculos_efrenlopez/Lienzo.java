package mx.edu.ittepic.practicau3_1_recirculos_efrenlopez;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {

    Circulo cir1,cir2,cir3,cir4,cir5;

    public Lienzo(Context context) {
        super(context);

        //pasando valores
        cir1 = new Circulo(300,500,this,Color.MAGENTA,160);//mandamos parametro de "x" y "y" ademas de pasar todo el metodo
        cir2 = new Circulo(700,200,this,Color.GREEN,120);//mandamos parametro de "x" y "y" ademas de pasar todo el metodo
        cir3 = new Circulo(300,800,this,Color.BLACK,100);
        cir4 = new Circulo(300,800,this,Color.GRAY,50);
        cir5 = new Circulo(300,800,this,Color.YELLOW,80);


        //incrementado la velocidad de cada circulo
        cir1.incrementar(5,5);
        cir2.incrementar(10,10);
        cir3.incrementar(15,15);
        cir4.incrementar(20,20);
        cir5.incrementar(25,25);





    }
    public void onDraw(Canvas c){ //dibujar
        Paint p = new Paint();

        c.drawColor(Color.BLUE);
        cir1.pintar(c,p);
        cir2.pintar(c,p);
        cir3.pintar(c,p);
        cir4.pintar(c,p);
        cir5.pintar(c,p);


    }

}

