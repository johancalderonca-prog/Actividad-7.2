package org.example.biblioteca;

public class Main {

        public static void main(String[] args) {

            MaterialBiblioteca[] materiales = new MaterialBiblioteca[3];

            materiales[0] = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "Novela");
            materiales[1] = new Revista("National Geographic", "Varios", 2023, 150);
            materiales[2] = new Tesis("IA en Educación", "Juan Pérez", 2022, "Universidad Nacional");

            // Polimorfismo en acción
            for (MaterialBiblioteca material : materiales) {
                material.mostrarInfo();
            }
        }
    }
}
