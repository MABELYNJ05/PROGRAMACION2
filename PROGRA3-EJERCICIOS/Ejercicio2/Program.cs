using System;

namespace Ejercicio2
{
    class Program
    {

        static void Main(string[] args)
        {

            int[] arreglo = { 1, 2, 3, 4, 5 };
            int punteo = 0;

            Console.Write("Arreglo dado: ");

            for (int i = 0; i < arreglo.Length; i++)
            {                
                Console.WriteLine("\t"+arreglo[i]);
                if ((arreglo[i] % 2) != 0)
                {
                    if (arreglo[i] == 5)
                    {
                        punteo += 5;
                    }
                    else
                    {
                        punteo += 3;
                    }
                }
                else
                {
                    punteo++;
                }

            }

            Console.WriteLine("Punteo total: " + punteo);

        }
    }
}
