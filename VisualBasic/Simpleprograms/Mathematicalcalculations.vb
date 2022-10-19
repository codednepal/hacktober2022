Module Program
    Public Sub main()
        Dim a, b As Integer
        Dim add, diff, product, divide As Integer
        Console.WriteLine("enter first number")
        a = Console.ReadLine()
        Console.WriteLine("enter second number")
        b = Console.ReadLine()

        add = a + b
        diff = a - b
        product = a * b
        divide = a / b
        Console.WriteLine("Addition is {0}", add)
        Console.WriteLine("subraction is {0}", diff)
        Console.WriteLine("Product is {0}", product)
        Console.WriteLine("Division is {0}", divide)
    End Sub
End Module
