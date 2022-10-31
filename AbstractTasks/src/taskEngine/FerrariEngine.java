package taskEngine;

public class FerrariEngine extends Engine{
    public FerrariEngine(){
        super();
    }
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight){
        super(engineVolume,cylinderAmount,engineWeight);
    }
    public double efficiency(){
        return 0.25;
    }
    public double throttleEnergy(){
        return (double) engineVolume*cylinderAmount*100;
    }

    public double breakEnergy(){
        return (double) engineWeight*2;
    }

}
