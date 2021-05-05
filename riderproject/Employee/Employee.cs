using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    public class Employee
    {
        string name;
        string id;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }
     
        public string Id
        {
            get { return id; }
            set { id = value; }
        }
        public void set(string name, string id)
        {
            this.name = name;
            this.id = id;
        }
        public void Show()
        {
            Console.WriteLine("员工：{0},编号：{1},", name, id);
        }

    }
}
