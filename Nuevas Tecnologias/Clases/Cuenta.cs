using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace BancoTp
{
    public class Cuenta
    {
        private String nombreTitular { get; set; }
        private double saldo { get; set; }
        private Boolean activa { get; set; }
        private String documentoTitular { get; set; }
        private String alias { get; set; }        
        private DateTime fechaCreacion { get; set; }
        
        public Cuenta(String nombreTitular, String documentoTitular)
        {
            this.nombreTitular = nombreTitular;
            this.documentoTitular = documentoTitular;
            this.saldo = 0;
            this.activa = false;
            this.alias = documentoTitular;            
            this.fechaCreacion = new DateTime();
            this.setFechaCreacionDefault();
        }

        private void setFechaCreacionDefault()
        {
            this.fechaCreacion = DateTime.Now;
        }
    
    }

}