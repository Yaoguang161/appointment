using System;
using System.Diagnostics.Eventing.Reader;
using System.Globalization;

namespace ConsoleApplication3
{ 
    public class CellPhone
    {
         public string brand;
         public string price;
         private string number;

         public string Brand
         {
             get => brand;
             set => brand = value;
         }

         public string Price
         {
             get => price;
             set => price = value;
         }

         public string Number
         {
             get => number;
             set => number = value;
         }

         public static void Call()
         {
             Console.WriteLine("拨打紧急电话");
         }

         public void Dial()
         {
             Console.WriteLine("打10086查询余额");
         }

         public void Dial(CellPhone e)
         {
             Console.WriteLine("用户{0}打电话给用户{1}",this.number,e.Number);
         }
        
         
    }
    
}