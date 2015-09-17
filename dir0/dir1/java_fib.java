//This is NOT my code; it is copied from stackoverflow
//This code is just for the purpose of learning how to automatically grab code from git

public int fibonacci(int n)  {
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacci(n - 1) + fibonacci(n - 2);
}
