package model;

public class Persona {

  private String usuario;
  private String contrasenia;

  public Persona(){

  }

  public Persona(String usuario, String contrasenia) {
    this.usuario = usuario;
    this.contrasenia = contrasenia;
  }

  public String getUsuario() {
    return this.usuario;
  }

  // public void setUsuario(String usuario) {
  //   this.usuario = usuario;
  // }

  public String getContrasenia() {
    return this.contrasenia;
  }

  // public void setContrasenia(String contrasenia) {
  //   this.contrasenia = contrasenia;
  // }

  @Override
  public String toString() {
    return "{" +
      " usuario='" + getUsuario() + "'" +
      ", contrasenia='" + getContrasenia() + "'" +
      "}";
  }

}
