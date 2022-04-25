##Warm up
# num1=[25,89,1,0,3,65,22]
# num2=[34,78,0,2,22,67,90]
# num3=[]
# for n in num1:
#     if n in num2:
#         print(n)
#         num3.append(n)
#     else:
#         continue
# print(num3)

##Ex 1 (Tuple is not replaceable)
# nums = (1,4,2,1,6,9)
# nums[4] = 30
# nums.append(30)
##note:you will see traceback error as tuple is not replaceable. append/sort/reverse method are not suppported in tuple

# ##Ex 2 (Tuple to list and vice versa)
# nums = (1,4,2,1,6,9)
# numlist = list(nums)  ##converts tuple into list
# numlist[4] = 30
# nums = tuple(numlist)  ##converts list into tuple
# print(nums)
# print(numlist)

##Ex 3 (Tuples and assignments)
# a,b,c = 12,13,14
# print (a)
# print (b)
# print (c)

##Ex 4 (Dictionary is a collection of 'key' and 'value' pairs)
# stuff = {'pen':2,'eraser':1}  ##curly braces for dictionaries
# print (stuff)
# print (stuff['eraser'])  ##this prints value (1) for key 'eraser' only.

##Ex 5 (Empty Dictionary)
# stuff2 = {}
# stuff3 = dict()
# print (stuff2)
# print (stuff3)
# stuff4 = {'toy':'lego','name':'siya','game':'soccer','grade':3}
# print (stuff4)

##Ex 6 (Adding Key and Value)
# count = {}
# count['ram']=1
# print(count)
# count['ram']=count['ram']+4
# print(count)
# del count['ram']  ##deleting specific key
# print(count)
# del count  ##deleting count dictionary
# print(count)  ##error because count dictionary has been deleted

# ##Ex 7
# stuff = {}
# stuff ['pen']=4
# stuff ['eraser'] = 3
# stuff ['sharpener']=1
# print(stuff)
# print('ball' in stuff)
# stuff['ball']=3
# print('ball' in stuff)
# stuff['pen']=stuff['pen']+3
# print(stuff['pen'])

# ##Ex 8 (converting list in dictionary)
# count = {}
# name_list = ['ram','ram','siya','nima','siya','siya','ritu']
# for n in name_list:
#     if n not in count:
#         count[n]=1
#     else:
#         count[n]=count[n]+1
# print(count)
##basically makes the value the number of times the name coumes in the list

##Ex 9 (get() method in dictionary)
# count = {}
# name_list = ['ram ']
# for n in name_list:
#     count[n]=count.get(n,0)+1
# print (count)
##output will be the same as Ex 5, same thing as Ex 8, just different method

##Ex 10
# count = {'ram':2,'ritu':1,}
# name_list = ['ram','ram','siya','nima','siya','siya','ritu','sam','john']
# for n in name_list:
#     print (n,count.get(n,0))
##It will print duplicate values also. Look for sam and john. Both have 0 value as they are not in dicitonary

##Ex 11 (set() method and sorted() method)
# count = {'ram':2, 'ritu':1,'siya':3,'nima':1}
# name_list = ['ram','ram','siya','nima','siya','siya','ritu','sam','john']
# for n in sorted (set(name_list)):
#     print (n,count.get(n,0))
##Note: set() method removes the duplicates. sorted() method sorts in alphabetical or numeric order

##Ex 12 (.items() method in dictionary)
# count = {'ram':2, 'ritu':1,'siya':3,'nima':1}
# for keys, values in count.items():
#     print (keys,values)

##Ex 13 (one more way to print keys and values)
# bdict = {'t':2,'o':3,'f':4,'r':12,'m':2}
# for key in bdict:
#     print (key,bdict[key])
##Note: this also prints keys and values

##Ex 14 (converting dictionary in list)
# bdict = {'t':2,'o':3,'f':4,'r':12,'m':2}
# blist = list(bdict)
# print (blist)  ##it takes only keys from dict

##Ex 15 (some more dictionary methods)
# bdict = {'t':2,'o':3,'f':4,"r":12,'m':2}
# print(bdict.keys())
# print (bdict.values())
# print (bdict.items())

##Ex 16 (getting the largest value)
# bdict = {'t':2,'o':3,'f':4,'r':12,'m':2}
# bigvalue = None
# bigkey = None
# for key,value in bdict.items():
#     if bigvalue is None or value > bigvalue:
#         bigvalue = value
#         bigkey = key
# print(bigkey,bigvalue)





















