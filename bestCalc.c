//calcAsFunction Modified as Best

#include<stdio.h>
#include <stdlib.h>


float calculate(int,int,char);


int main()
{
    int a,b;
    float result;
    char op;

    printf("Enter two numbers :\n");
    scanf("%d %d",&a,&b);

    printf("Enter +, -, *, /: ");
    scanf(" %c",&op);
	
	result = calculate(a,b,op);
	
	printf("The result is %f \n ",result);
	return 0;
}

float calculate(int a, int b, char op)
{
switch(op)
	{
		case '+' : return(a+b);
		case '-' : return(a-b); 
		case '*' : return(a*b);
		case '/' : return(a/b);
			
		default: printf("Invalid\n"); exit(0);
    }

}