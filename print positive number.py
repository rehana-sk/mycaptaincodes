l=[]
n=int(input("Enter number of elements: "))
for i in range(1,n+1):
    ele=int(input())
    l.append(ele)
for i in l:
    if(i!=n and i>=0):
        print(i,end=",")
    elif(i==n and i>=0):
        print(i)
