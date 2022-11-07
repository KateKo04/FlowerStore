package flowers;

import java.awt.*;

public enum FlowerColor {
    RED("#FF0000");
    private String stringRepresentation;


    FlowerColor(String stringRepresentation){
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString(){
        return stringRepresentation;
    }

    public String getColor(){
        return stringRepresentation;
    }

}
