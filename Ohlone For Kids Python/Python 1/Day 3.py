##Warm up Grade Input
# grade=int(input('Grade is:  '))
# if grade < 7:
#     print('You are in Elementary School.')
# elif grade >=7 and grade <= 8:
#     print('You are in Middle School.')
# elif grade >8 and grade <=12:
#     print( 'You are in High School.' )
# else:
#     print ( 'You have entered invalid grade!' )

                         ##Functions, Return Value, Parameter and Arguments, Calling Function inside function, Global and Local Variables

###Exercise 1 (Writing a Function)
# def hello():
#     print ('Hello World')
# hello ()
# hello()

##Exercise 2 (Return Command in Function:could only be used once every function, unlike print, which could be used multiple times)
# def hello ():
#     return ('Hello World')
# print (hello())
# def hello():
#     return ('Hi friends')
# print (hello())

##Exercise 3 (Parameters and values in function)
# def friends (name):
#     return name
# print (friends('John'))

#Exercise 4 (2 Parameters and 2 Values)
# def friends (greet, name):
#     return greet, name
# print (friends('Hello','John'))

#Exercise 5 (Writing Math Expression in Function)
# def addition (n1, n2, n3):
#     total=n1+n2+n3
#     return total
# print (addition(1,1,1))
# print (addition (23,45,556))

# #Exercise 6 (Do it Yourself)
# def triangle_area (base, height):
#     area=base*height
#     return area
# print (triangle_area(3,8))

# Exercise 7 (Calculate Cube Area with Functions)
# def cube_area (width, length, height):
#     cube_area=width*length*height
#     return cube_area
# print (cube_area(34,12,10))

#Exercise 8 (Variable Scope)
#Global variables: These are define outside the function. Local Variables: These are define inside the function.
# x=50
# t=20
# def addition():
#     global x
#     x=x+t
#     return x
# print(addition())

#Exercise 9 (increasing count with global variable in function)
# count=0
# print (count )
# def counter():
#     global count
#     count=count+1
#     print(count)
# counter()
# counter()
# counter()

#Exercise 10
# def salary ():
#     hours=int(input('Enter hours:  '))
#     rate=int(input('Enter rate:  '))
#     pay=hours*rate
#     print(pay)
# salary ()

#Exercise 11
def salary ():
    try:
         hours=int(input('Enter hours:  '))
         rate=int(input('Enter rate:  '))
         if hours <=40 and hours>0 and rate>0:
             pay = hours * rate
             print(pay)
         elif hours>40 and rate>0:
             pprint(pay)
    except:
        print('Invalid Entry')
salary ()