package $07_Adapter_Wrapper.adapter;

import $07_Adapter_Wrapper.IMotor;
import $07_Adapter_Wrapper.model.MotorGasolina;

public class MotorGasolinaAdapter implements IMotor {

    private MotorGasolina motorGasolina;

    public MotorGasolinaAdapter(MotorGasolina motorGasolina) {
        this.motorGasolina = motorGasolina;
    }

    @Override
    public void encender() {
        motorGasolina.prender();
        motorGasolina.acelerarGasolina();
    }

    @Override
    public void apagar() {
        motorGasolina.decelerarGasolina();
        motorGasolina.apagar();
    }
}
