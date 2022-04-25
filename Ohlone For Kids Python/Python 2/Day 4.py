##Warm up
# names = ['Alisa','eisen','Benjamin','Romya','andy','aiden']
# for x in names:
#     if x.startswith ('A') or x.startswith ('a') or x.endswith ('n'):
#         print (x.capitalize())

##Ex 1 (creating and deleting text on canvas)
# from tkinter import *
# tk = Tk()
# tk.title ('Deleting Text')
# tk.geometry ('250x250')
# tk.configure(background='yellow')
# canvas = Canvas(tk,width=200,
#                 height = 200,
#                 bg='red')
# canvas.pack()
# txt = canvas.create_text(100,100,text='Hi')
# def txt_del():
#     canvas.delete(txt)
# button = Button(tk,text = 'Delete',
#                 command = txt_del)
# button.pack()
# tk.mainloop()

##Ex 2 (deleting all text on canvas)
# from tkinter import *
# tk = Tk()
# tk.title ('Deleting Text')
# tk.geometry ('250x250')
# tk.configure(background='yellow')
# canvas = Canvas(tk,width=200,
#                 height = 200,
#                 bg='red')
# canvas.pack()
# txt = canvas.create_text(100,100,text='Hi')
# txt2 = canvas.create_text (120,120,text='Hi')
# def txt_del():
#     canvas.delete(ALL)
# button = Button(tk,text = 'Delete',
#                 command = txt_del)
# button.pack()
# tk.mainloop()

##Ex 3 (changing x and y position of text)
# from tkinter import *
# tk = Tk()
# canvas = Canvas(tk,width = 500, height = 500, bg='red')
# canvas.pack()
# x=20
# y=20
# def txt_print():
#     global x,y
#     x=x+20  ##It will increase the value of x and y by 20 everytime function is run
#     y=y+20
#     canvas.create_text(x,y,text='Hello World', font = 'TNR 20 bold')
# button1 = Button(tk, text='Print', command = txt_print, width = 20)
# button1.pack()
# def txt_del():
#     global x,y
#     canvas.delete(ALL)
#     x = 20
#     y = 20
# button2 = Button(tk,text = 'delete', command = txt_del)
# button2.pack()
# tk.mainloop()

##Ex 4 (automatic print and delete)
# import time
# from tkinter import *
# tk = Tk()
# canvas = Canvas (tk,width=500,height=500,bg='red')
# canvas.pack()
# x = 0
# y = 0
# def txt_print():
#     global x, y
#     while True:
#         x = x+2
#         y=y+2
#         canvas.create_text(x,y,text = 'Hi World',font='TNR 20 bold', fill = 'light blue')
#         tk.update()
#         time.sleep(0.1)
#         if x >=480 or y>=480:
#             canvas.delete(ALL)
#             x = 0
#             y = 0
# button1=Button(tk,text='play',command=txt_print)
# button1.pack()
# button2=Button(tk,command = tk.destroy)
# button2.pack()
# tk.mainloop()

##Ex 5 (displaying photos on canvas)
# from tkinter import *
# import time
# tk=Tk()
# photo = PhotoImage(file = 'stars.png')
# canvas = Canvas (tk,width=300, height=300,bg='red')
# canvas.pack()
# canvas.create_image(100,100,image=photo)
# tk.mainloop()

##Ex 6 (moving photo with dynamic x/y position)
# from tkinter import *
# import time
# tk = Tk()
# canvas=Canvas(tk, width = 500, height = 500)
# canvas.pack()
# photo = PhotoImage(file = 'Mickey.PNG')
# X = 0
# Y = 270
# while True:
#     X = X+5
#     if X>520:
#         X=0
#     canvas.delete (ALL) ##This deletes image
#     canvas.create_image(X,Y,image = photo)  ##This code creates the image
#     tk.update()
#     time.sleep(0.1)
# tk.mainloop()

##Ex 7 (creating image with random)
# from tkinter import *
# import time
# import random
# tk=Tk()
# canvas=Canvas(width=500, height=500)
# canvas.pack()
# photo=PhotoImage(file = 'Mickey.PNG')
# while True:
#     x = random.randrange(100,400)
#     y = random.randrange(100,400)
#     canvas.delete(ALL)
#     canvas.create_image(x,y,image = photo)
#     tk.update()
#     time.sleep(1.0)
# tk.mainloop()

##Ex 8 (creating image on random position and moving it)
# from tkinter import *
# import time
# import random
# tk=Tk()
# canvas=Canvas(width=500, height=500)
# canvas.pack()
# photo=PhotoImage(file = 'Mickey.PNG')
# while True:
#     x = random.randrange(100,400)
#     y = random.randrange(100,400)
#     canvas.delete(ALL)
#     canvas.create_image(x,y,image = photo)
#     move = random.randrange(-3,3)
#     for n in range(60):
#         canvas.delete(ALL)
#         x = x+move
#         y = y+move
#         canvas.create_image(x,y,image = photo)
#         tk.update()
#     time.sleep(0.1)
#     tk.update()
#     time.sleep(1.0)
# tk.mainloop()







