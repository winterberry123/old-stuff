#Warm up
# def friends():
#     f1=input('Friend 1:  ')
#     f2=input('Friend 2: ')
#     f3=input('Friend 3:  ')
#     print('Your 3 best friends are:', f1,f2,f3)
#     print('Happy Holidays with Friends!!!')
# friends()

#Ex 1 (Creating Tk Widget)
# from tkinter import *
# tk = Tk()
# tk.geometry ('300x300')
# tk.title('First Tk')
# tk.mainloop()

#Ex 2(Creating Label Widget)
# from tkinter import *
# tk = Tk()
# tk.geometry ('300x300')
# tk.title('First Tk')
# label=Label(tk, text='This is my label in tkinter',
#             fg='green',
#             bg='red',
#             font='TNR 15 bold italic')
# label.pack()
# tk.mainloop()

#Ex 3 (using variable as text value in label)
# from tkinter import *
# tk = Tk()
# tk.geometry ('300x300')
# tk.title('First Tk')
# txt='Hi World'
# label=Label(tk,
#             text='This is my label in tkinter',
#             fg='green',
#             bg='red',
#             font='TNR 15 bold italic')
# label2=Label(tk, text=txt, fg='yellow',
#              bg='black',
#              font='TNR 15 bold italic')
# label2.pack()
# label.pack()
# tk.mainloop()

#Ex 4
# from tkinter import *
# tk = Tk()
# tk.geometry ('300x300')
# tk.title('First Tk')
# txt='Hi World'
# label=Label(tk,
#             text='This is my label in tkinter',
#             fg='green',
#             bg='red',
#             font='TNR 15 bold italic')
# label2=Label(tk, text=txt, fg='yellow',
#              bg='black',
#              font='TNR 15 bold italic')
# logo=PhotoImage(file="circle.PNG")
# label3=Label(tk, image=logo)
# label3.pack(side="right")
# label2.pack()
# label.pack()
# tk.mainloop()

#Ex 5
# from tkinter import *
# tk=Tk ()
# tk.geometry('300x300')
# button=Button(tk, text='print',
#               fg='blue',
#               bg='red', width=10)

#Ex 6
# from tkinter import *
# tk=Tk()
# tk.geometry('300x300')
# button=Button(tk, text='print',
#               fg='blue',
#               bg='red', width=10)
# def hello():
#     print('Hello Tkinter')
# button2=Button(tk, text='click',
#                fg='blue',bg='red', width=10,
#                command=hello)
# button2.pack()
# button.pack()

#Ex7
# from tkinter import *
# tk=Tk()
# tk.geometry('300x300')
# tk.title('First Tk')
# button=Button(tk, text='print',
#               fg='blue',
#               bg='red', width=10)
# def hello():
#     print('Hello Tkinter')
# button2=Button(tk,text='click', fg='blue',bg='red', width=10, command=hello)
# button3=Button(tk,text='Exit', fg='blue',
#                bg='red', width=10, command=exit)
# button3.pack()
# button2.pack()
# button.pack()
# tk.mainloop()

#Ex9
# from tkinter import *
# tk=Tk()
# tk.geometry('300x300')
# tk.title('First Tk')
# logo=PhotoImage(file="circle.PNG")
# button=Button(tk,image=logo, width=100, height=100)
# button.pack()
# tk.mainloop()