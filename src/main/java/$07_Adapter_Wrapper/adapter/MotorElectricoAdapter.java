package $07_Adapter_Wrapper.adapter;

import $07_Adapter_Wrapper.IMotor;
import $07_Adapter_Wrapper.model.MotorElectrico;

public class MotorElectricoAdapter implements IMotor {

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void encender() {
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void apagar() {
        motorElectrico.desactivar();
        motorElectrico.desconectar();
    }
}
