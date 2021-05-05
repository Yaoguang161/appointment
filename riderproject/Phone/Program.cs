using System;
using System.Runtime.CompilerServices;

namespace ConsoleApplication3
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            CellPhone phone = new CellPhone();
            phone.Number = "13888888888";
            phone.Brand = "iphonex";
            Console.WriteLine("该用户手机号码为:{0},型号为:{1}",phone.Number,phone.Brand);
            phone.Dial();
            CellPhone.Call();
            CellPhone e = new CellPhone();
            e.Number = "13876543210";
            phone.Dial(e);
        }
    }
}