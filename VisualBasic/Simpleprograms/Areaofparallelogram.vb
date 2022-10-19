Module Program
    Public Sub main()
        Dim base As Integer
        Dim height As Integer
        Console.WriteLine("enter base")
        base = Console.ReadLine()
        Console.WriteLine("enter height")
        height = Console.ReadLine()
        Dim area As Integer
        area = base * height
        Console.WriteLine("Aerea of Parallelogram {0}", area)
        Console.ReadKey()
    End Sub
End Module
