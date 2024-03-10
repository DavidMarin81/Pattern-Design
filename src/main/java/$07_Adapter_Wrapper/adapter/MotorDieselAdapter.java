package $07_Adapter_Wrapper.adapter;

import $07_Adapter_Wrapper.IMotor;
import $07_Adapter_Wrapper.model.MotorDiesel;

public class MotorDieselAdapter implements IMotor {

    private MotorDiesel motorDiesel;

    public MotorDieselAdapter(MotorDiesel motorDiesel) {
        this.motorDiesel = motorDiesel;
    }

    @Override
    public void encender() {
        motorDiesel.arrancar();
        motorDiesel.acelerarDiesel();
    }

    @Override
    public void apagar() {
        motorDiesel.frenarDiesel();
        motorDiesel.apagar();
    }
}
