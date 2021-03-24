n=int(input("enter n value: "))
a=0
b=1
print(a,b,end=',')
if(n==0):
    print("Enter correct input")
elif(n==1):
    print(b)
else:
    for i in range(1,n+1):
            c=a+b
            a=b
            b=c
            if(i==n):
                print(b)
            else:
                print(b,end=',')
