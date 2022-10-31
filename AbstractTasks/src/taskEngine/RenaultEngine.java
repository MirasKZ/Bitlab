package taskEngine;

public class RenaultEngine extends Engine{
    protected double extraTurboEnergy;
    public RenaultEngine(){
        super();
        this.extraTurboEnergy=0;
    }
    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy){
        super(engineVolume,cylinderAmount,engineWeight);
        this.extraTurboEnergy=extraTurboEnergy;
    }

    public double efficiency(){
        return 0.27;
    }
    public double throttleEnergy(){
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }
    public double breakEnergy(){
        return engineWeight*2.1;
    }
}
