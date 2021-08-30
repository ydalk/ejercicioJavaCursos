public class Estudiante extends Persona {

    // Inserte acá el método constructor
    public Estudiante(String id, String nombre, String email, String idioma) {
        super(id, nombre, email, idioma);
    }

    // Inserte acá la implementación del método abstracto de la clase padre
    public void dirigir() {
        switch (idioma) {
            case "English":
                setUrl(url + "/English/estudiante");
                break;
            case "Español":
                setUrl(url + "/Español/estudiante");
                break;
            case "French":
                setUrl(url + "/French/estudiante");
                break;
            case "Portugues":
                setUrl(url + "/Portugues/estudiante");
                break;
            default:
                break;
        }

    }
}
