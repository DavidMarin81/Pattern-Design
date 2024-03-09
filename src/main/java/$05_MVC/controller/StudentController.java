package $05_MVC.controller;

import $05_MVC.model.Student;
import $05_MVC.vista.StudentView;

public class StudentController {
    private Student modelo;
    private StudentView vista;

    public StudentController(Student modelo, StudentView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setStudentName(String name) {
        modelo.setName(name);
    }

    public void setStudentAge(int age) {
        modelo.setAge(age);
    }

    public void updateVista() {
        vista.printStudentDetails(modelo.getName(), modelo.getAge());
    }
}
