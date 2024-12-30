def funCall() :
    print("message from funCall")
    localVariableForMethod = 10
    print(a,"from method funCall")
    if(1):
        print("inside if")
    else:
        print("inside else")

# inter , string , float , double , char , boolean
# int , str , float , double , char , bool
a = 10
b = "Hello"
c = 10.5
d = 10.5
e = 'A'
f = True

# List
arr = [1,2,3,4,5]
arr1 = ["Hello","World"]

print(arr)
print(arr1)
print(a,b,c,d,e,f,"-------->",arr,arr1)

funCall()

# Output
print("end of the program")