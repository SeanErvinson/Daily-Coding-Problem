using System;
using System.Collections.Generic;

namespace src
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = { 10, 15, 21, 5, 6, 3, 7 };
            int target = 13;
            System.Console.WriteLine(IsSum(numbers, target));
        }

        private static bool IsSum(int[] numbers, int target)
        {
            HashSet<int> set = new HashSet<int>();
            foreach (var number in numbers)
            {
                var missing = Math.Abs(target - number);
                if (set.Contains(number))
                    return true;
                set.Add(missing);
            }
            return false;
        }
    }
}
