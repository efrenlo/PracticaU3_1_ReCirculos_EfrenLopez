package mx.edu.ittepic.practicau3_1_recirculos_efrenlopez;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Circulo {
    //float x,y;
    CountDownTimer t;
    //float Incremento;
    float xc, yc;
    float incrementoxc,incrementoyc;
    int tama;
    int color;



    public Circulo(float posx,float posy, final Lienzo l, int c,int ta){
        xc = posx;
        yc = posy;
        tama = ta;
        color = c;



        t = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                //revotar en pantalla

                xc+=incrementoxc;
                if(xc >=l.getWidth()-70){
                    incrementoxc *= -1;
                }
                if(xc<=50){
                    incrementoxc *= -1;
                }
                ///////////////////

                yc+=incrementoyc;
                if(yc >=l.getHeight()-70){
                    incrementoyc *= -1;
                }
                if(yc<=50){
                    incrementoyc *= -1;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {

                //para volve a empezar
                start();
            }
        };
        //hace que funcione en sugundo plano
        t.start();


    }
    public void pintar(Canvas c, Paint p){//necesito que s einvoque edes el ondrow, solo el ondrod tiene al canvas y a paint
        //ontener copia como? por parametros, recibo una copia que c y p y puedo hacer lo mismi se trae lo mismo que el lienzo en ondrow
        p.setColor(color);
        c.drawCircle(xc,yc,tama,p);//primer circulo
        //c.drawCircle(xc-80,yc+80,120,p);
        //c.drawCircle(x+80,y+60,80,p);


    }

    public void incrementar(float incremenx, float incremeny){
        incrementoxc = incremenx;
        incrementoyc = incremeny;
        //hace que funcione en sugundo plano
        t.start();
    }

}