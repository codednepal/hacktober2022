Option Strict On

Module Program
    Public Sub main()
        Dim n As Integer
        Dim da As Date
        Dim bl As Boolean = True
        n = 12345
        da = Today
        Console.WriteLine(bl)
        Console.WriteLine(CSByte(bl))
        Console.WriteLine(CStr(bl))
        Console.WriteLine(CChar(CStr(da)))
        Console.ReadKey()
    End Sub
End Module
