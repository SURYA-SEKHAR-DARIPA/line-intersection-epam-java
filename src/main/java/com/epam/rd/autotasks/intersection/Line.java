package com.epam.rd.autotasks.intersection;

public class Line {
    int k,b;

    public Line(int k, int b) {
        this.k=k;
        this.b=b;
    }

    public Point intersection(Line other) {
        int x,y;
        if(other.k==k){
            return null;
        }
        x=(other.b-b)/(k-other.k);
        y=k*x+b;
        //throw new UnsupportedOperationException();
        return new Point(x,y);
    }

}
