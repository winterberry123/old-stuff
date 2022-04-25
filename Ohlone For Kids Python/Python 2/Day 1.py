#Warm up
# def string_input():
#     string_1 = input('Write string 1: ')
#     string_2 = input('Write string 2:  ')
#     if string_1 == string_2:
#         print (string_1)
#     else:
#         print(string_1, '\n', string_2)
# string_input()

#Ex 1
# x = 10
# while x >=0:
#     print (x)
#     x = x-1   ##x is iteration variable
# print('Done')

#Ex 2
# x = 0
# while x <=10:
#     print ('Count x:  ', x)
#     x=x+1
# print ('Done', x)

#Ex 3
# x = 5
# while x<=10:
#     print ('Count x:  ',x)
# print ('Done', x)

#Ex 4
# x = 5
# while x==10:
#     print('Count x:  ', x)
# print('Done', x)

#Ex 5
# x = 10
# while x>=0:
#     print (x)
#     x = x-1
#     if x == 5:
#         break
# print('Done')
##note: this loop will stop when x value is equal to 5

#Ex 6
# while True:
#     name = input('Name or done:  ')
#     if name == 'done':
#         break
#     else:
#         print(name)
##Type done to break the loop

#Ex 7
# while True:
#     name = input('Name or done:  ')
#     if name == 'done':
#         break
#     if name == 'test':
#         continue
#     else:
#         print(name)

# #Ex 8
# for x in range (10,20):
#     print ('x', x)

#Ex 9
# for x in range (10,20):
#     print ('x', x)
#     if x == 10:
#         print ('banana', x)
#     if x == 12:
#         print ('apple', x)
#     if x == 14:
#         print ('orange', x)
#     if x == 16:
#         print ('mango', x)
#     if x == 18:
#         print ('pear', x)

#Ex 10
# students = ['John', 'Jenny', 'Jiya', 'Gita']
# for x in students:
#     print (x)

#Ex 11
# def employee():
#     name = input('Name:  ')
#     hour_pay = int(input ('Pay per hour:  '))
#     hours = int(input ('Hours:  '))
#     total_pay = int(hour_pay)*int(hours)
#     print ('Total pay: ', total_pay)
# while True:
#     employee()

#Ex 12
# def employee():
#     name = input('Name:  ')
#     hour_pay = int(input('Pay per hour:  '))
#     hours = int(input('Hours:  '))
#     total_pay = int(hour_pay) * int(hours)
#     print('Total pay: ', total_pay)
# while True:
#     try:
#         employee()
#     except:
#         print('Invalid Entry')
#         break

#RPS Game Logic
# import random
# print('Please capitalize the first letter of your entry. \n'
#       'There are three choices: Rock, Paper and Scissors.')
# while True:
#     item = ['Rock', 'Paper', 'Scissors']
#     comp_choice = random.choice(item)
#     user = input ('Choice:  ')
#     def rps():
#         if comp_choice == user:
#             print ("It's a tie.")
#         if comp_choice == 'Rock' and user == 'Scissors':
#             print ('Computer won!')
#         if comp_choice == 'Rock' and user == 'Paper':
#             print ('You won!')
#         if comp_choice == 'Scissors' and user == 'Paper':
#             print ('Computer won!')
#         if comp_choice == 'Scissors' and user == 'Rock':
#             print ('You won!')
#         if comp_choice == 'Paper' and user == 'Scissors':
#             print ('You won!')
#         if comp_choice == 'Paper' and user == 'Rock':
#             print ('Computer won!')
#     rps()
