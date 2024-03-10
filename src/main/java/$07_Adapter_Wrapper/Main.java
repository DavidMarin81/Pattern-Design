package $07_Adapter_Wrapper;

import $07_Adapter_Wrapper.adapter.MotorDieselAdapter;
import $07_Adapter_Wrapper.adapter.MotorElectricoAdapter;
import $07_Adapter_Wrapper.adapter.MotorGasolinaAdapter;
import $07_Adapter_Wrapper.model.MotorDiesel;
import $07_Adapter_Wrapper.model.MotorElectrico;
import $07_Adapter_Wrapper.model.MotorGasolina;

public class Main {
    public static void main(String[] args) {

        MotorDiesel motorDiesel = new MotorDiesel();
        MotorElectrico motorElectrico = new MotorElectrico();
        MotorGasolina motorGasolina = new MotorGasolina();

        IMotor motor1 = new MotorDieselAdapter(motorDiesel);
        IMotor motor2 = new MotorElectricoAdapter(motorElectrico);
        IMotor motor3 = new MotorGasolinaAdapter(motorGasolina);

        System.out.println("Motor Diesel");
        motor1.encender();
        motor1.apagar();

        System.out.println("Motor Electrico");
        motor2.encender();
        motor2.apagar();

        System.out.println("Motor Gasolina");
        motor3.encender();
        motor3.apagar();



    }
}
