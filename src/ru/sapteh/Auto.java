package ru.sapteh;

public class Auto {
    private int id;
    private String mark;
    private String model;
    private String proizvoditel;
    private String year;
    private String color;


    public Auto(int id,String mark,String model,String proizvoditel,String year,String color){
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.proizvoditel = proizvoditel;
        this.year = year;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }
    public String getProizvoditel(){
        return proizvoditel;
    }
    public String getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s",getId(),getMark(),getModel(),getProizvoditel(),getYear(),getColor());
    }
}
