##Ex 1 (writing in a text file through python)
# writefile = open('example.txt', 'w')
# text = 'I am writing through python script'
# writefile.write(text)
# writefile.close()  ##this saves the file

##Exercise 2(appending to a file)
# text = 'I am appending to the file new text'
# appendfile = open('example_1.text','a')
# appendfile.write('\n')
# appendfile.write(text)
# appendfile.close()

##Exercise 3(writing multiple lines with 'for loop')
# for x in range(20):
#     text = 'I am writing through python file:'+str(x)
#     savefile=open('example_2.txt','a')
#     savefile.write('\n')
#     savefile.write(text)
#     savefile.close()

##Exercise 4 (reading a file with '.read()')
# readfile = open('example_3.txt','r')
# print (readfile.read())

##Exercise 5 (reading a file with 'readlines()')
# readfile = open('example_3.txt','r')
# print (readfile.readlines())
##compare the output for both read commands. Readlines() has '\n' for newlines and it gets printed as list (under square[]brackets)

##Exercise 6 (reading file through a for loop)
# readfile = open('example_3.txt','r')
# for x in readfile:
#     print(x)

##Exercise 7 (counting lines in file)
# count = 0
# readfile = open('example_3.txt','r')
# for x in readfile:
#     count = count+1
# print(count)

##Exercise 8 (read file as string with read() method and len function)
# readfile = open('example_3.txt','r')
# rfile = readfile.read()
# print (rfile)
# print(len(rfile))  ##length of file

##Exercise 9 (read file as list with readlines() method and len function)
# readfile = open('example_3.txt','r')
# rfile = readfile.readlines()
# print (rfile)
# print (len(rfile))

##Exercise 10 (reading file with for loop and startswith() function)
# readfile = open('example_3.txt','r')
# for x in readfile:
#     if x.startswith('I'):
#         print (x)
##this will print lines that start with I only

##Ex 11 (string.strip() for removing whitespace or newline)
# readfile = open('example_3.txt','r')
# for x in readfile:
#     x = x.strip()
#     if x.startswith('I'):
#         print (x)
##this removes the whitespace between the 2 lines

# ##Ex 12 (not startswith())
# readfile = open ('example_3.txt','r')
# for x in readfile:
#     x = x.strip()
#     if not x.startswith('I'):
#         print (x)

##Ex 13 ('in' and 'not in' operators)
# readfile = open('example_3.txt','r')
# for x in readfile:
#     x = x.strip()
#     if '@' in x:
#         print (x)

##Ex 14 (making a name list)
# while True:
#     student_name=input('Student Name:')
#     if student_name=='done':
#         break
#     else:
#         grade = input('Grade:')
#         school_name = input('School Name:')
#         line = (student_name+'\t'+grade+'\t'+school_name)
#         savefile=open('example_4.txt','a')
#         savefile.write(line)
#         savefile.write('\n')
#         savefile.close()
# readfile = open('Name_list.txt','r')
# name = input('Enter name you want to search:')
# for x in readfile:
#     x=x.strip()
#     if x.startswith(name):
#         print(x)








