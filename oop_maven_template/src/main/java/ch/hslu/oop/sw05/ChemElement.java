package ch.hslu.oop.sw05;

public abstract class ChemElement {

    private String elementName;
    private float meltingPoint;
    private float boilingPoint;

    public ChemElement(String newElementName, float newMeltingPoint, float newBoilingPoint) {
        elementName = newElementName;
        meltingPoint = newMeltingPoint;
        boilingPoint = newBoilingPoint;
    }

    /**
     * @return String
     */
    public String getElementName(){
        return elementName;
    }


    /**
     * @param celsiusTemp
     * @return String
     */
    public String getAggregate(float celsiusTemp){
        if(celsiusTemp >= boilingPoint){
            return "gasförmig";
        }
        else if(celsiusTemp >= meltingPoint){
            return "flüssig";
        }
        else{
            return "fest";
        }
    }
}

