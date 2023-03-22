public class Contenedor1 {
    public class Contenedor {
        private int prioridad;
        private int tamano;
        private String contenido;

        public Contenedor(int prioridad, int tamano, String contenido) {
            this.prioridad = prioridad;
            this.tamano = tamano;
            this.contenido = contenido;
        }

        public int getPrioridad() {
            return prioridad;
        }

        public int getTamano() {
            return tamano;
        }

        public String getContenido() {
            return contenido;
        }
    }

        public int compare(Contenedor c1, Contenedor c2) {
            return Integer.compare(c2.getPrioridad(), c1.getPrioridad());
        }
    };




