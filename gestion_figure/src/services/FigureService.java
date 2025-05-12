package services;

import java.util.ArrayList;

import entity.Figure;

public class FigureService {
    private ArrayList<Figure> figures =new ArrayList<>();

    public ArrayList<Figure> listerFigures() {
        return figures;
    }

    public void creerFigure(Figure figure){
        figures.add(figure);
    }

    
}
