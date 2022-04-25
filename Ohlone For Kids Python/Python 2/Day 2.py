##Warm up
# while True:
#     first_name=input('First Name:  ')
#     last_name=input('Last Name: ')
#     print (first_name, last_name)
#     question=input('Do you want to print more?')
#     if question=='no':
#         break

##Ex 1 counting in loop
# count = 0
# print ('Before loop count:', count)
# for x in [8,12,67,43,78,1]:
#     count = count + 1
#     print (count,x)
# print ('After loop count:', count)

##Ex 2 Summing in loop
# total = 0
# print ('Before loop total:', total)
# for x in [8,12,67,43,78,1]:
#     total = total + x
#     print (total, x)
# print('After loop total:', total)c

## Ex 3 Average in loop
# count = 0
# total = 0
# for x in [8,12,67,43,78,1]:
#     count = count + 1
#     total = total + x
#     print (total, count)
# average = total/count
# print ('Average', average)

## Ex 4 filtering large numbers
# for x in [8,12,67,43,78,1]:
#     if x >20:
#         print(x)

##Ex 5 filtering small numbers
# for x in [8,12,67,43,78,1]:
#     if x <30:
#         print(x)

##Ex 6 'None' value
# a = None
# print (a)

##Ex 7 finding smallest value
# smallest = None
# for x in [8,12,67,43,78,1]:
#     if smallest ==None:
#         smallest = x
#     elif x <smallest:
#         smallest = x
#     print (smallest,x)
# print ('Smallest:', smallest)

##Ex 8
# biggest = None
# for x in [8,12,67,43,78.1]:
#     if biggest == None:
#         biggest = x
#     elif x > biggest:
#         biggest = x
# print ('biggest number is :', biggest)

##Ex 9
# try:
#     count = 0
#     total = 0
#     while True:
#         num = input ('Enter a num or done:')
#         if num == 'done':
#             break
#         else:
#             count = count + 1
#             total = total + int(num)
#             average = total / count
#     print('Average:', average, 'Total:', total, 'Count:', count)
# except:
#     print ('Invalid Entry')

##Ex 10
# import random
# try:
#     while True:
#         x = random.randrange (0,100)
#         y = random.randrange (0,100)
#         print (x, "+", y)
#         total = input('Answer:')
#         if x+y == int(total):
#             print('Correct Answer!')
#         else:
#             print ('Wrong Answer!')
#         ch= input("More questions or no?")
#         if ch == 'no':
#             break
# except:
#     print('Invalid Entry')























