public class Hub {
    private Contenedor[][] m;

    public Hub(){
        this.m= new Contenedor[10][12];

    }

    public Contenedor[][] getM(){
        return m;
    }
    public void setM (Contenedor[][] m){
        if (m != null) this.m=m;
    }

    public String toString(){
        String S = new String();
        for(int i=0; i<m.length; i++){ //FILAS
            for(int j=0; j<m[i].length; j++){  //COLUMNAS DE LA FILA i
                if (m[i][j] == null) S+="[N]";
                else S+="["+m[i][j].getId()+"]";
            }
            S+="\n";
        }
        return S;
    }

    public Contenedor desapilar(int col){
        if(col<0 || col>=m[0].length) return null;
        for(int i=0; i<m.length; i++){
            if(m[i][col] != null){
                Contenedor aux= m[i][col];
                m[i][col]=null;
                return aux;
            }
        }
        return null;
    }






}







