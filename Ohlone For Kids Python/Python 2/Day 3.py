##Warm up
# print('Enter 2 numbers. First should be smaller.')
# begin_num = int(input('Enter starting number:'))
# end_num = int(input('Enter end number:'))
# count = 0
# total = 0
# for x in range (begin_num, end_num +1):
#     total = total+x
#     count = count + 1
# print ('Sum is ', total, '\nAverage is:', total/count)

##Exercise 1 (slicing)
# b = 'banana'
# print (b[0])
# print (b[5])
# print (b[0:5]) ##it will not include 5th position, as it is excluded. Last number doesn't count.
# print (b[:])

##Exercise 2 (len function for length)
# b = 'banana'
# print (len(b))

##Ex 3 (looping through a string)
# for x in 'banana':
#     print(x)

##Ex 4 (looping through a string variable)
# b = 'banana'
# for x in b:
#     print (x)

##Ex 5 (while loop with string)
# count = 0
# b = 'banana'
# while count < len(b):
#     print(b)
#     count +=1
# print (len(b))
# print (count)

##Ex 6 (String functions)
# a = 'ApPlE'
# b = a.lower()
# print (a)
# print (b)
# c = b.upper()
# print(c)
# d = b.capitalize()
# print (d)
# print(b.find('a'))
# print(b.find('A'))
# print('A' in a)

##Ex 7 (stripping whitespaces)
# line = '    Hi Ravi     '
# x = '!'
# print (x+line.rstrip()+x)  ##removes right side white space
# print (x+line.lstrip()+x) ##removes left side white space
# print (x+line.strip()+x)    ##removes both sides

##Ex 8 (some more string functions)
# t = 'Hi Ravi'
# print (t.replace('Ravi', 'Rina'))
# print(t.startswith('H'))
# print (t.endswith('i'))

##Ex 9 (sorting)
# students=['John','Siya','RIMA','neha','aidan','jayden','jenny','Anthony']
# for x in students:
#     if x.startswith('A'):
#         print('starts with uppercase A:', x)
# for x in students:
#     if x.endswith ('a'):
#         print('ends with lowercase a:', x)
# for x in students:
#     if 'a' in x:
#         print('Does have a lowercase a:',x)
#     else:
#         print('Does not have a lowercase a:',x)

##Ex 10 (Data analysis with string functions)
# data = 'from team@progressivekids.us on Feb 2 2017'
# at = data.find('@')
# print(at)
# ws = data.find(' ',at)
# print(ws)
# host=data[at+1:ws]
# print(host)

##Ex 11
# datalist = ['from team@gmail.com on Feb 2 2017',
#             'from team@yahoo.com on Feb 2 2017',
#             'from team@hotmail.com on Feb 2 2017',
#             'from team@progressivekids.com on Feb 2 2017']
# for data in datalist:
#     at = data.find('@')
#     ws = data.find(' ',at)
#     host = data[at+1:ws]
#     print(host)

##Ex 12
for x in 'banana':
    print (x)








