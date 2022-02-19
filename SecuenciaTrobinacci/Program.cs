using System;

namespace SecuenciaTrobinacci
{
    class Program
    {
        static void tribonacci(int [] secuencia,int num)
        {
            int suma = 0;
            Console.WriteLine(secuencia[0] +"\n"+ secuencia[1]+"\n"+ secuencia[2]);

            for (int i=3; i<num; i++)
            {
                suma = secuencia[0] + secuencia[1] + secuencia[2];
                Console.WriteLine(suma);
                secuencia[0] = secuencia[1];
                secuencia[1] = secuencia[2];
                secuencia[2] = suma;
            }
            
        }

        static void Main(string[] args)
        {
            int [] secuencia = { 0, 0, 1 };

            tribonacci(secuencia,9);

        }
    }
}
