public abstract class Persona {

    // Inserte acá los atributos
    public String id;
    public String nombre;
    public String email;
    public String idioma;
    public String url = "educursos.com";

    // Inserte acá el método constructor
    public Persona(String id, String nombre, String email, String idioma) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.idioma = idioma;

    }

    public static void main(String[] args) throws Exception {
        Estudiante e1 = new Estudiante("01", "carolina", "caro@mail.com", "Portugues");

        e1.dirigir();
        System.out.println(e1.id);
        System.out.println(e1.nombre);
        System.out.println(e1.email);
        System.out.println(e1.idioma);
        System.out.println(e1.url);
    }

    // Inserte acá los SETTERS Y GETTERS

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Inserte acá el método abstracto
    public abstract void dirigir();
}
