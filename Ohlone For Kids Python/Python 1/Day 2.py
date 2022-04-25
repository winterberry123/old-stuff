#Conditions

#Warm Up (add two variables together)
# Var1=int(input('var 1:  '))
# Var2=int(input('var 2:  '))
# total=int(Var1)+int(Var2)
# print('total is:  ', (total))

#Condition Operators (notes)
#== equal to, |= not equal to, > greater than, < less than, >= greater or equal to, <=less or equal to

#Exercise 1 (if statement)
# age=15
# if age>= 15:    ##this means if age is greater than or equal to 15 then print should work
#     print('You are too big for Joke')

#Exercise 2 (if statement)
# age=15
# if age <=10:
#     print ('you are too young for joke')
# print ('Done')

#Exercise 3 (Nested if statement)
# age=15
# if age >= 10:  ##first this condition
#     if age <=13:  ##then this one
#         print('you are as old as I am')    ##if both are true then print will work.
# print('Done')

#Exercise 4(else statement) Else statement is always placed last in conditions.
# age=15
# if age>=15:
#     print ('you are too old for joke')
# else:
#     print('Done')
    ##note: else statement does not take any arguments and if nothing runs it will run.

#Exercise 5(if, elif statement)
##elif is a combination of if and else. It always comes after if statement and before else.
# age=15
# if age<=10:
#     print('you are too small for joke')
# elif age>=10:
#     print('Done')

#Exercise 6(if, elif, else statement)
# salary=4000
# if salary>4000:
#     print('You are high paid.')
# elif salary==4000:
#     print('Your salary is 4000.')
# else:
#     print('Your salary needs to be more.')
#
#Exercise 7 (Logical operators 'not')
# a='apple'
# if a is not 'Banana': ##program will look for this condition to be true.
#     print (a)
# else:
#     print('banana')

#Exercise 8 (Logical operators'and')
##with and operator all the conditions have to be true.
# b='banana'
# f='fruit'
# if b=='banana' and f=='vegetable':
#     print('Banana is vegetable.')
# else:
#     print('Banana is fruit.')

#Exercise 9(Logical operators 'or')
##Use exercise 8 code and replace 'and' with 'or' and see the output.
# b='banana'
# f='fruit'
# if b == 'banana' or f == 'vegetable':
#     print ( ' Banana is vegetable. ' )
# else:
#     print ('Banana is fruit.')
##prints out Banana is fruit. Banana is vegetable.

#Exercise 10
##try and except is used to avoid user errors. Write below code and spell the number when prompted for input, then check the output.
# num = input('num:  ')
# try:
#     num2 = int(num)
# except:
#     num2 = 'invalid number'
# print(num2)

#Exercise 11 (Do it yourself)
# degree =int(input('Triangle Degree:  '))
# if degree >90 and degree<180:
#     print('Triangle is obtuse!')
# elif degree==90:
#     print('right')
# elif degree<90 and degree>=0:
#     print('acute')
# else:
#     print('Invalid entry')

#Exercise 12 (Do it yourself)
# grade= int(input('Grade is:  '))
# if grade>=91 and grade<=100:
#     print ('A')
# elif grade>=81 and grade<=90:
#     print ('B')
# elif grade>=71 and grade<=80:
#     print ('C')
# elif grade>=61 and grade<=70:
#     print ('D')
# elif grade<=60 and grade>=0:
#     print ('F')
# elif grade>100:
#     print ('Too big number')
# else:
#     print ('Invalid number')