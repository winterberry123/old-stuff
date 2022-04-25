##Warm up
# while True:
#     import random
#     num1 = random.randrange(0,50)
#     num2 = random.randrange(50,99)
#     player_answer = input('what is '+str(num1)+ '+'+ str(num2))
#     writefile = open('answers.txt','a')
#     if player_answer == 'done':
#         break
#     else:
#         player_answer = int(player_answer)
#         if player_answer == num1+num2:
#             writefile.write('\n->Right Answer!')
#         else:
#             writefile.write('\n->Wrong Answer!')
#     writefile.close()

##Ex 1 (list)
# friends = ['ram','john','siya','riya']
# school_list = ['pen','pencil','eraser']
# print (friends)
# print (school_list)

##Ex 2 (nested list)
# x = [12,[12,34],89,1]
# print (x)

##Ex 3 (empty list)
# a = []
# b = list ()
# print (a)
# print (b)

##Ex 4 (looping through list)
# numbers = [12,45,67,89,0,11]
# print (numbers)
# for x in numbers:
#     print('x is ',x)

##Ex 5 (index in list)
# friends = ['ram','john','siya','riya']
# print (friends[0])
# print (friends[1])
# print (friends[2])
# print (friends[3])
##note: first position is 0 in a list

##Ex 6 (replacing values in list)
# friends = ['ram','john','siya','riya']
# friends [0] = 'rima'
# friends [2] = 'sara'
# friends [3] = 'rachel'
# print (friends)

##Ex 7 (range and len function in list)
# friends = ['ram','john','siya','riya']
# print (range(4))
# print (len(friends))
# print (range(len(friends)))
# for x in range (len(friends)):
#     print (friends,x)

##Ex 8 (range and len function in list)
# friends = ['ram','john','siya','riya']
# for x in range(len(friends)):
#     print (friends[x],x)

##Ex 9 (concatenating list)
# a = [12,34,67,1,0]
# b = ['ram','sita','sis','hema']
# print (a+b)
# for x in a+b:
#     print (x)

##Ex 10 (slicing list)
# a = [12,34,67,1,0]
# b = ['ram','sita','sis','hema']
# print (a[4:5])       ##prints only the 4th position -- 0
# print (a[0:2])        ##prints only the 0th and 1st position -- 12,34
# print (a[4:])
# print (a[:3])
# print (b[1:5])
# print (b[1:3])
# print (a[0:3]+b[1:3]) ##using a comma won't put them in one bracket, so use plus sign.
##note: only prints out the first number and the number before last number

##Ex 11 (appending list)
# school_list = ['pen','pencil','eraser']
# school_list.append('sharpener') ##adds 'sharpener' into the list
# print (school_list)

##Ex 12 ('in' and 'not in' operator with list)
# school_list = ['pen','pencil','eraser']
# print ('pen' in school_list) ##prints out True
# print ('pen' not in school_list) ##prints out False

# ##Ex 13 (do it yourself toy list)
# toy_list = []
# while True:
#     new_toy=input('Enter a toy or type done: ')
#     if new_toy == 'done':
#         break
#     else:
#         toy_list.append(new_toy)
# print(toy_list)

##Ex 14 (do it yourself: enhance Ex 13)
# toy_list = []
# while True:
#     new_toy=input('Enter a toy or type done: ')
#     if new_toy == 'done':
#         break
#     if new_toy in toy_list:
#         continue  ##doesn't add the same toy in the list--basically makes sure the toys don't duplicate
#     else:
#         toy_list.append(new_toy)
# print(toy_list)

##Ex 15 (built-in functions for numeric list)
# nums = [3,5,6,12,9,34,23,1]
# print (len(nums)) ##gives the number of numbers in the list (8)
# print (max(nums)) ##gives the max number in the list
# print (min(nums)) ##gives the min number in the list
# print (sum(nums)) ##gives the sum of all the numbers in list
# print (sum(nums)/len(nums))

##Ex 16
# numlist = []
# while True:
#     nums = input('Enter a number or type done to end loop: ')
#     if nums == 'done':
#         break
#     nums = int(nums)
#     numlist.append(nums)
# if len(numlist) == 0:
#     print ('Empty List')
# else:
#     print ('Average is: ', sum(numlist)/len(numlist))

##Ex 17 (try and except to enhance Ex 16)
# numlist = []
# while True:
#     try:
#         nums = input('Enter a number or type done to end loop: ')
#         if nums == 'done':
#             break
#         nums = int(nums)
#         numlist.append(nums)
#     except:
#         print ('Invalid entry')
# if len(numlist) == 0:
#     print ('Empty List')
# else:
#     print ('Average is: ', sum(numlist)/len(numlist))

# ##Ex 18 (enhance Ex 17 by making it into function)
# def list_average():
#     numlist = []
#     while True:
#         try:
#             nums = input('Enter a number or type done to end loop: ')
#             if nums == 'done':
#                 break
#             nums = int(nums)
#             numlist.append(nums)
#         except:
#             print ('Invalid entry')
#     if len(numlist) == 0:
#         print ('Empty List')
#     else:
#         print ('Average is: ', sum(numlist)/len(numlist))
# list_average()

























