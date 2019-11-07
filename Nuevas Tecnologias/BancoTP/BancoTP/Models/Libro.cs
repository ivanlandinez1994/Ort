
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace BancoTP.Models
{
    public class Libro
    {
        [Key]
        public int Id { get; set; }
        [Required(ErrorMessage ="xx")][MaxLength(200, ErrorMessage ="Superaste 200 chars")]
        public string Titulo { get; set; }

    }
}
