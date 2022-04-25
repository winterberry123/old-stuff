#Warm up
# def cubed():
#     num1=int(input('Enter number:  '))
#     cube=num1*num1*num1
#     print ('Cube for ', num1, 'is', cube)
# cubed()

# #Exercise 1
# a='I am text'
# print (a)
#
# #Exercise 2( Multiple Lines with "'..."')
# print ('''I am text
# I am called a string
# I can be written in multiple line''')

#Exercise 3 (\n for new line)
# print ('I am text \n I am called a string \n I can be written in multiple line')
#
# #Exercise 4 (\t for tab)
# print ('John\t Collin\t Rohan')

#Exercise 5
# print ('John \t Collin\t Rohan\n Sam\t Jacob\t Jayden')

#Ex 6(Concatenation of 2 strings)
# a=' I am string '
# b= 'I am string too'
# print (a+b)
# print (a+' '+b)

# #Exercise 7
# x=34
# y=50.50
# c='these are numbers'
# print(x, 'and', y, c)
# #or
# print (str(x)+' '+str(y)+' '+c)

#Ex 8
# penny = int(input('How many pennies:   '))
# dime = int(input('How many dimes:  '))
# dollar = (penny + (dime*10))/100
# print('Dollars are: '+str(dollar))

#Ex 9
# import random
# numbers=random.randrange (0,10)
# print (numbers)

#Ex 10
# import random
# num1= random.randrange (0,4)
# comp_num=random.randrange (0,5)
# print ('your number is', num1)
# print ('your computer number is', comp_num)

#Ex 11
# def number_guess():
#     import random
#     num1 = random.randrange(0, 4)
#     comp_num = random.randrange(0, 5)
#     print('your number is', num1)
#     print('your computer number is', comp_num)
#     if comp_num==num1:
#         print ('Correct Guess! You chose: ', num1, 'commputer chose: ', comp_num)
#     else:
#         print('Wrong guess')
#         print('You chose ', num1)
#         print ('Computer Chose', comp_num)
# number_guess()

# #Ex 12
# def student_points():
#     name=input('Name:  ')
#     math=int(input('Math Grade:  '))
#     english=int(input('English Grade:  '))
#     science=int(input('Science Grade:  '))
#     print(name+' report card')
#     print('Math:\t', math)
#     print('English:\t', english)
#     print('Science:\t', science)
# student_points()

