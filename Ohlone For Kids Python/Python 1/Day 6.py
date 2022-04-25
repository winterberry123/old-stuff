#Warm up
# from tkinter import *
# def name():
#     label=Label(tk,
#                 text='Progressive Kids')
#     label.pack()
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Frame-TK')
# button=Button (tk,
#                text='Print Name',
#                command=name)
# button.pack()
# tk.mainloop()

#Ex 1 (Creating Entry Widget)
# from tkinter import *
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Tk-Window')
# entry=Entry(tk, font='TNR 15 bold')
# entry.pack()
# tk.mainloop()

#Ex 2 (Printing Entry Widget input on IDLE)
# from tkinter import *
# def name():
#     x=entry.get()
#     print(x)
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Tk-Window')
# entry=Entry(tk, font='TNR 15 bold')
# entry.pack()
# button=Button(tk, text='Enter', command=name)
# button.pack()
# tk.mainloop()

#Ex 3 (Creating Canvas Widget)
# from tkinter import *
# def name():
#     x=entry.get()
#     print(x)
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Tk-Window')
# entry=Entry(tk, font='TNR 15 bold')
# entry.pack()
# button=Button(tk, text='Enter', command=name)
# button.pack()
# canvas=Canvas(tk, width=200, height=200, bg='red')
# canvas.pack()
# tk.mainloop()

#Ex 4 (Printing Text on canvas)
# from tkinter import *
# def name():
#     x=entry.get()
#     print(x)
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Tk-Window')
# entry=Entry(tk, font='TNR 15 bold')
# entry.pack()
# button=Button(tk, text='Enter', command=name)
# button.pack()
# canvas=Canvas(tk, width=200, height=200, bg='red')
# canvas.create_text(100,100,text='text',font='TNR 20 bold italic')
# canvas.pack()
# tk.mainloop()

#Ex 5 (Bring Text on Canvas from Entry Widget)
# from tkinter import *
# def name():
#     x=entry.get()
#     # print(x)
#     canvas.create_text(50, 40, text=x, font='TNR 10 bold italic')
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Tk-Window')
# entry=Entry(tk, font='TNR 15 bold')
# entry.pack()
# button=Button(tk, text='Enter', command=name)
# button.pack()
# canvas=Canvas(tk, width=200, height=200, bg='red')
# # canvas.create_text(100,100,text='text',font='TNR 20 bold italic')
# canvas.pack()
# tk.mainloop()

#Ex 6 (deleting text and reprinting it)
# from tkinter import *
# def name():
#     x=entry.get()
#     # print(x)
#     canvas.delete(ALL)
#     canvas.create_text(50, 40, text=x, font='TNR 10 bold italic')
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Tk-Window')
# entry=Entry(tk, font='TNR 15 bold')
# entry.pack()
# button=Button(tk, text='Enter', command=name)
# button.pack()
# canvas=Canvas(tk, width=200, height=200, bg='red')
# # canvas.create_text(100,100,text='text',font='TNR 20 bold italic')
# canvas.pack()
# tk.mainloop()

#Ex 7 (create a list of names on canvas)
# from tkinter import *
# y=10
# def name():
#     global y
#     y=y+20
#     x=entry.get()
#     # print(x)
#     # canvas.delete(ALL)
#     canvas.create_text(50, y, text=x, font='TNR 10 bold italic')
# tk=Tk()
# tk.geometry('200x200')
# tk.title('Tk-Window')
# entry=Entry(tk, font='TNR 15 bold')
# entry.pack()
# button=Button(tk, text='Enter', command=name)
# button.pack()
# canvas=Canvas(tk, width=200, height=200, bg='red')
# # canvas.create_text(100,100,text='text',font='TNR 20 bold italic')
# canvas.pack()
# tk.mainloop()

#Ex 8 (Grading Rubrics)
# from tkinter import *
# def grading():
#     points=int(entry.get())
#     if points>=91 and points<=100:
#         txt=('Grade:\t A')
#     elif points>=81 and points<=90:
#         txt=('Grade:\t B')
#     elif points>=71 and points<=80:
#         txt=('Grade:\t C')
#     elif points >=61 and points<=70:
#         txt=('Grade:\t D')
#     elif points<60:
#         txt=('Grade:\t F')
#     elif points>100:
#         txt=('Too big Number')
#     canvas.delete(ALL)
#     canvas.create_text(100,100,text=txt,font='TNR 20 bold italic')
# tk=Tk()
# tk.geometry('300x300')
# tk.title('My Grading Rubrics')
# label=Label(tk, text='Get your grade', fg='red', bg='yellow')
# label.pack()
# entry=Entry(tk)
# entry.pack()
# button=Button(tk, text='Get Grade', fg='blue', bg='red', width=10, command=grading)
# button.pack()
# canvas=Canvas(tk, width=200, height=200)
# canvas.pack()
# tk.mainloop()














