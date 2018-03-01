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
    public double keskmineKiirus(kiirused teine){
        int K = (getX() + teine.getX())/2;
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
        int summa = 0;
        double keskmine = 0;
        for(int i=0; i<kiirusedList.size();i++){
            summa = summa + kiirusedList.get(i);
        }
        keskmine = summa / kiirusedList.size();
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
        
        g.setColor(Color.red);
        g.drawLine(0,200-getY()*5,50,200-teine.getY()*5);
        g.drawLine(50,200-teine.getY()*5,100,200-kolmas.getY()*5);
        g.drawLine(100,200-kolmas.getY()*5,150,200-neljas.getY()*5);
        g.drawLine(150,200-neljas.getY()*5,200,200-viies.getY()*5);
        g.drawLine(200,200-viies.getY()*5,250,200-teine.getY()*5);
        
        g.setColor(Color.blue);
        g.drawLine(0,200-getX(),50,200-teine.getX());
        g.drawLine(50,200-teine.getX(),100,200-kolmas.getX());
        g.drawLine(100,200-kolmas.getX(),150,200-neljas.getX());
        g.drawLine(150,200-neljas.getX(),200,200-viies.getX());
        g.drawLine(200,200-viies.getX(),250,200-teine.getX());
        
        g.setColor(Color.white);
        g.drawLine(10,0,10,300);
        g.drawLine(0,290,400,290);
        ImageIO.write(bi, "png", new File("kiirused.png"));
        return " ";
    }
}
