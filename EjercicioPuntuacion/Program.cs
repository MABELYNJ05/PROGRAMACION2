using System;

namespace EjercicioPuntuacion
{
    class Program
    {
        static void puntuacion(int [] arreglo)
        {
            int puntos = 0;

            for(int i=0; i<arreglo.Length; i++)
            {
                if ((arreglo[i] % 2) != 0)
                {
                    if (arreglo[i] == 5)
                    {
                        puntos += 5;
                    }
                    else
                    {
                        puntos += 3;
                    }
                }
                else
                {
                    puntos++;
                }

            }

            Console.WriteLine(puntos);
        }

        static void Main(string[] args)
        {

            int[] arreglo = { 1,2,3,4,5};
            puntuacion(arreglo);

        }
    }
}
