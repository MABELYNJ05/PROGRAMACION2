using System;

namespace SecuenciaTrobinacci
{
    class Program
    {        

        static void Main(string[] args)
        {
            Console.Write("Ingrese un número: ");
            int num = int.Parse(Console.ReadLine());

            int a = 0, b = 0, c = 1;
            int d = 0;
            Console.WriteLine("Secuencia Tribonacci: ");
            Console.WriteLine(a + "\n" + b + "\n" + c);

            for(int i =3; i<num; i++)
            {
                d = a + b + c;
                Console.WriteLine(d);
                a = b;
                b = c;
                c = d;
            }

        }
    }
}
