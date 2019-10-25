using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace BancoTP.Controllers
{
    public class AccessController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public ActionResult Enter(String user, String password)
        {
            try
            {

                return Content("1");
            }
            catch (Exception ex)
            {
                return Content("Fucking Error" + ex.Message );
            }
        }
    }
}