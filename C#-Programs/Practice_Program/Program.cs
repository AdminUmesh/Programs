using System;

class Program
{
    static bool running = true;
    static void Main(string[] args)
    {

        while (running)
        {
            Console.WriteLine("Select an option:");
            Console.WriteLine("1. Hello World");
            Console.WriteLine("2. Odd/Even");
            Console.WriteLine("3. Exit");
            Console.Write("Enter your choice: ");
            string choice = Console.ReadLine();

            switch (choice)
            {
                case "1":
                    HelloWorld();
                    break;
                case "2":
                    OddEven();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    Console.WriteLine("Invalid choice. Please enter a valid option.");
                    break;
            }

            Console.WriteLine();
        }
    }

    static void HelloWorld()
    {
        Console.WriteLine("Hello, World!");
        running = false;
    }

    static void OddEven()
    {
        Console.Write("Enter a number: ");
        if (int.TryParse(Console.ReadLine(), out int number))
        {
            if (number % 2 == 0)
            {
                Console.WriteLine($"{number} is even.");
            }
            else
            {
                Console.WriteLine($"{number} is odd.");
            }
        }
        else
        {
            Console.WriteLine("Invalid input. Please enter a numeric value.");
        }
        running = false;
    }

    static void Check_Num_is_Included_or_not()
    {
       //In this method implement Group by serial no in TakeAway
        running = false;
    }
}
