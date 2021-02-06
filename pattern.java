class Pattern
{
 Public static void main(String[] args)
 {
   int n=5;
  int tenp=0;
   for(int i=n;i>=1;i--)
   {
   for(int j=n;j>=i;j--)
   {
    System.out.print(j+" ");
    temp=j;
    }
    for(int k=n-i+1;k<n;k++)
    {
     System.out.print(temp+" ");
    }
    System.out.println();
    }
   }
  }
