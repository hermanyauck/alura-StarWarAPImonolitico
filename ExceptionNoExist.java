public class ExceptionNoExist extends RuntimeException{
    private String mensaje = "Esa no la registro. Aunque esta no deberia ser una excepcion sino un aviso."+
            "Por esto golang no implementa excepciones";

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
