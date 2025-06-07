package Ejercicio_2;

import java.awt.*;
import java.awt.event.*;

public class Ventana extends Frame {
    private TextField fCedula, fNombre, fApellido;

    public Ventana() {
        setTitle("Examen");
        setSize(600, 300);
        setLocationRelativeTo(null);

        Panel pTop = new Panel(new FlowLayout());
        Panel pCent = new Panel(new GridLayout(3, 2));
        Panel pBajo = new Panel(new FlowLayout());

        add(pTop, BorderLayout.NORTH);
        add(pCent, BorderLayout.CENTER);
        add(pBajo, BorderLayout.SOUTH);

        pTop.add(new Button("Agregar"));
        pTop.add(new Button("Modificar"));
        pTop.add(new Button("Eliminar"));

        pCent.add(new Label("Cédula:"));
        fCedula = new TextField();
        pCent.add(fCedula);

        pCent.add(new Label("Nombre:"));
        fNombre = new TextField();
        pCent.add(fNombre);

        pCent.add(new Label("Apellido:"));
        fApellido = new TextField();
        pCent.add(fApellido);

        Button bGuardar = new Button("Guardar");
        pBajo.add(bGuardar);
        pBajo.add(new Button("Cancelar"));


        bGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fCedula.getText().isEmpty() || fNombre.getText().isEmpty() || fApellido.getText().isEmpty()) {
                    System.out.println("Esta vacio");
                }
                else {
                    System.out.println("Cedula: " + fCedula.getText()+ "|Nombre: " + fNombre.getText()+ "|Apellido: " + fApellido.getText());
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}