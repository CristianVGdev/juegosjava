using System;
using System.Text;
using System.Threading;

class Game
{
    static void Main()
    {
        Console.OutputEncoding = Encoding.UTF8; // Permitir caracteres acentuados y símbolo de interrogación invertida

        Console.WriteLine("¡Bienvenido al juego de espera para la entrevista!");
        Console.WriteLine("Estás emocionado y nervioso, esperando esa llamada importante...");

        // Generar un número aleatorio para simular el tiempo de espera
        Random random = new Random();
        int tiempoEspera = random.Next(1, 10);

        Console.WriteLine("Estás esperando la llamada...");
        Thread.Sleep(tiempoEspera * 1000); // Simular el tiempo de espera en segundos

        // Verificar si recibiste la llamada
        bool recibisteLlamada = random.Next(0, 2) == 1;

        int puntuacion = 0;
        if (recibisteLlamada)
        {
            Console.WriteLine("¡Finalmente recibiste la llamada para la entrevista!");
            Console.WriteLine("¡Felicidades, estás un paso más cerca de conseguir el trabajo!");

            // Simular una pequeña conversación con el entrevistador
            Console.WriteLine("Entrevistador: Hola, ¿estás listo para la entrevista?");
            Console.WriteLine("Tú: ¡Claro! Estoy emocionado por esta oportunidad.");
            Console.WriteLine("Entrevistador: Genial, comencemos...");

            // Incrementar la puntuación
            puntuacion += 10;

            // Preguntas técnicas desafiantes sobre Java y C#
            string[] preguntas = { "En Java, ¿las interfaces pueden tener implementaciones por defecto?",
                                   "En C#, ¿las estructuras pueden heredar de otras estructuras?",
                                   "En Java, ¿una clase puede heredar de múltiples clases?",
                                   "En C#, ¿una clase sellada (sealed) puede ser heredada?",
                                   "En Java, ¿se pueden crear instancias de una interfaz?",
                                   "En C#, ¿se pueden crear objetos sin usar el operador 'new'?",
                                   "En Java, ¿todas las clases deben heredar de alguna clase base?",
                                   "En C#, ¿las clases abstractas pueden ser instanciadas?",
                                   "En Java, ¿una clase final puede ser extendida?",
                                   "En C#, ¿se pueden heredar métodos privados de una clase base?" };

            string[] respuestas = { "s", "n", "s", "n", "n", "s", "n", "n", "n", "n" };

            for (int i = 0; i < preguntas.Length; i++)
            {
                Console.WriteLine($"Entrevistador: {preguntas[i]}");
                Console.WriteLine("Tú (s/n): ");
                string respuesta = Console.ReadLine();

                if (respuesta.ToLower() == respuestas[i])
                {
                    Console.WriteLine("Entrevistador: ¡Excelente! Eso te da puntos adicionales.");
                    puntuacion += 5;
                }
                else
                {
                    Console.WriteLine("Entrevistador: ¡Vaya! Esa era una pregunta complicada.");
                    puntuacion -= 2;
                }
            }
        }
        else
        {
            Console.WriteLine("Oh no, no recibiste la llamada para la entrevista...");
            Console.WriteLine("No te desanimes, sigue intentándolo y preparándote para futuras oportunidades.");

            // Reducir la puntuación por no recibir la llamada
            puntuacion -= 10;
        }

        Console.WriteLine("¡Tu puntuación final es: " + puntuacion + " puntos!");

        // Establecer la meta
        int meta = 50;

        if (puntuacion >= meta)
        {
            Console.WriteLine("¡Felicidades! Alcanzaste la meta de " + meta + " puntos.");
            Console.WriteLine("¡Has ganado el juego y estás más cerca de conseguir el trabajo!");

            // Aquí podrías agregar más lógica para celebrar la victoria
        }
        else
        {
            Console.WriteLine("Sigue intentándolo, ¡tú puedes alcanzar la meta!");

            // Aquí podrías agregar más lógica para decidir si seguir esperando o finalizar el juego
        }

        Console.WriteLine("¡Gracias por jugar!");
    }
}
