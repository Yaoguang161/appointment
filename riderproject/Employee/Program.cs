using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee employee1 = new Employee();
            employee1.set("张三", "20180001");
            Employee employee2 = new Employee();
            employee2.set("李四", "20180002");
            Employee employee3 = new Employee();
            employee3.set("王五", "20180003");
            employee1.Show();
            employee2.Show();
            employee3.Show();
        }
    }
}
