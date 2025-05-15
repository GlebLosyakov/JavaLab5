/*package com.example;

import java.util.LinkedList;
//import com.NewJFrame; 

class RecIntegralException extends Exception {
    public RecIntegralException(String message) {
        super(message);
    }
}

public class RecIntegral {
    private String lowerBound;
    private String upperBound;
    private String step;
    private LinkedList<String> earlBio;

    // Конструктор
    public RecIntegral(String lowerBound, String upperBound, String step) throws NewJFrame.RecIntegralException {
        double lower = Double.parseDouble(lowerBound);
        double upper = Double.parseDouble(upperBound);
        double stepValue = Double.parseDouble(step);

        if (lower < 0.000001 || lower > 1000000 || upper < 0.000001 || upper > 1000000 || stepValue < 0.000001 || stepValue > 1000000) {
            throw new NewJFrame.RecIntegralException("Значения должны быть в диапазоне от 0,000001 до 1000000.");
        }
        if (upper < lower) {
            throw new NewJFrame.RecIntegralException("Верхний предел должен быть больше нижнего");
        }
        if (stepValue > upper - lower) {
            throw new NewJFrame.RecIntegralException("Шаг должен быть меньше интервала между пределами");
        }
        
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.step = step;
        this.earlBio = new LinkedList<>();
        
        // Добавляем значения в список
        earlBio.add(lowerBound);
        earlBio.add(upperBound);
        earlBio.add(step);
    }
    
    // Геттеры
    public String getLowerBound() {
        return lowerBound;
    }

    public String getUpperBound() {
        return upperBound;
    }

    public String getStep() {
        return step;
    }

    public LinkedList<String> getEarlBio() {
        return earlBio;
    }
    }*/