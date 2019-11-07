using BancoTP.Models;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BancoTP.DateBase
{
    public class LibreriaDBContext : DbContext
    {
        public LibreriaDBContext(DbContextOptions<LibreriaDBContext> options) : base(options)
        {
        }

        public DbSet<Libro> Libros { get; set; }
    }
}
