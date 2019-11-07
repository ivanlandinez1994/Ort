using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace BancoTp
{
    public class Persona
    {
        String nombre { get; set; }
        String apellido { get; set; }
        String dni { get; set; }
        String usuario { get; }
        String contrasenia { get; }
        Rol rol { get; set; }
        Direccion direccion { get; set; }
        String telefonoContacto { get; set; }
        String email { get; set; }
        DateTime fechaNacimiento { get; set; }
        String genero { get; set; }        
        Cuenta cuenta { get; set; }

        public Persona(String nombre, String apellido, String dni)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.usuario = "";
            this.contrasenia = "";
            this.setDefaultRol();
            this.direccion = new Direccion();
            this.telefonoContacto = new telefonoContacto();
            this.email = "";
            this.fechaNacimiento = new DateTime(0, 0, 0);
            this.genero = "";            
            this.cuenta = new Cuenta();
        }

        private void setDefaultRol()
        {
            this.rol = Rol.USUARIO;
        }

        public Boolean esContrasenia(String contrasenia)
        {
            if (this.contrasenia.Equals(contrasenia))
            {
                return true;
            }
            return false;
        }

        public Boolean esUsuario(String usuario)
        {
            if (this.usuario.Equals(usuario))
            {
                return true;
            }
            return false;
        }



    }
}