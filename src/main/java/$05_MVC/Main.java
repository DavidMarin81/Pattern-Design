package $05_MVC;

import $05_MVC.controller.StudentController;
import $05_MVC.model.Student;
import $05_MVC.vista.StudentView;

public class Main {
    public static void main(String[] args) {

        //Se crea el model
        Student modelo = new Student("David", 42);

        //Se crea la vista
        StudentView vista = new StudentView();

        //Se crea el controlador
        StudentController controlador = new StudentController(modelo, vista);

        //Se muestran los datos
        controlador.updateVista();

        //Se modifican los datos
        modelo.setName("Xian");
        modelo.setAge(9);

        //Se muestran los datos actualizados
        controlador.updateVista();


    }
}
