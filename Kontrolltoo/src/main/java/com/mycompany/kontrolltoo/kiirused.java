/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kontrolltoo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;


public class kiirused {
    protected int x;
    protected int y;
    public kiirused(int x, int y){
      this.x=x;
      this.y=y;
      
    }
    public int getX(){return x;}
    public int getY(){return y;}
    
    //https://et.wikipedia.org/wiki/Harmooniline_keskmine
    public double keskmineKiirus(kiirused teine){
        double K = (2/(1.0/getX() +1.0/teine.getX()));
        return K;
    }
    ArrayList<Integer> kiirusedList = new ArrayList<>();
    public double keskminePikem(kiirused teine, kiirused kolmas,kiirused neljas, kiirused viies, kiirused kuues){
        kiirusedList.add(getX());
        kiirusedList.add(teine.getX());
        kiirusedList.add(kolmas.getX());
        kiirusedList.add(neljas.getX());
        kiirusedList.add(viies.getX());
        kiirusedList.add(kuues.getX());
        double summa = 0;
        
        for(int i=0; i<kiirusedList.size();i++){
            double test = kiirusedList.get(i);
            summa = summa + 1/test;
        }
        double keskmine = kiirusedList.size() / summa;
        return keskmine;
    }
    public String kiirusedPildile(kiirused teine, kiirused kolmas,kiirused neljas, kiirused viies, kiirused kuues) throws IOException{
        BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        //Graphics: drawLine(int x1, int y1, int x2, int y2)
        g.setColor(Color.black);
        g.fillRect(0, 0, 400, 300);
        g.setColor(Color.white);
        g.drawString("sinine = kiirus/kaugus",15,225);
        g.drawString("punane = aeg/kaugus",15,235);
        
        //aeg/kaugus
        g.setColor(Color.red);
        g.drawLine(10,200-getY()*5,60,200-teine.getY()*5);
        g.drawLine(60,200-teine.getY()*5,110,200-kolmas.getY()*5);
        g.drawLine(110,200-kolmas.getY()*5,160,200-neljas.getY()*5);
        g.drawLine(160,200-neljas.getY()*5,210,200-viies.getY()*5);
        g.drawLine(210,200-viies.getY()*5,260,200-teine.getY()*5);
        
        //kiirus/kaugus
        g.setColor(Color.blue);
        g.drawLine(10,200-getX(),60,200-teine.getX());
        g.drawLine(60,200-teine.getX(),110,200-kolmas.getX());
        g.drawLine(110,200-kolmas.getX(),160,200-neljas.getX());
        g.drawLine(160,200-neljas.getX(),210,200-viies.getX());
        g.drawLine(210,200-viies.getX(),260,200-teine.getX());
        
        g.setColor(Color.white);
        g.drawLine(10,0,10,300);
        g.drawLine(0,290,400,290);
        ImageIO.write(bi, "png", new File("kiirused.png"));
        return " ";
    }
}
