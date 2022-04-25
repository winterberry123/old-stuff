# ##Ex 1 (identifying mouse click location)
# from tkinter import *
# tk = Tk()
# def callback(event):
#     print("clicked at",event.x,event.y) ##event.x is x position of mouse,event.y is y position
# frame = Frame(tk, width=200, height=200)
# frame.bind("<Button-1>",callback)     ##Button-1 is left click
# frame.pack()
# tk.mainloop()


##Ex 2 (capturing keyboard events/prints keys like a b c with bind_all method)
# from tkinter import *
# tk = Tk()
# def key(event):
#     print("pressed",repr(event.char))
# def callback(event):
#     print("clicked at",event.x,event,y)
# frame = Frame(tk,width=300,height=300)
# frame.bind_all("<Key>",key)  ##this code will identify the key pressed
# frame.bind_all("<Button-1>",callback)
# frame.pack()
# tk.mainloop()


##Ex 3 (creating circle on click)
# from tkinter import *
# tk = Tk()
# canvas = Canvas(tk, width=200, height=200, bg="yellow")
# canvas.pack()
# canvas.create_oval(80,80,120,120, fill="red")
# def click(event):
#     canvas.delete(ALL)
#     x = event.x
#     y=event.y
#     canvas.create_oval(x-20,y-20,x+20,y+20,fill="red")
# canvas.bind("<Button-1>",click)
# tk.mainloop()


##Ex 4 (create all circles together)
# import random
# from tkinter import *
# tk = Tk()
# canvas = Canvas(tk, width=200, height=200, bg="yellow")
# canvas.pack()
# canvas.create_oval(80,80,120,120, fill="red")
# def click(event):
#     colors = ['red', 'blue', 'yellow', 'pink', 'green']
#     color = random.choice(colors)
#     # canvas.delete(ALL)
#     x = event.x
#     y=event.y
#     canvas.create_oval(x-20,y-20,x+20,y+20,fill=color)
# canvas.bind("<Button-1>",click)
# tk.mainloop()


##Ex 5 (changing circle color on click and deleting circle on double click)
# from tkinter import *
# import random
# tk = Tk()
# canvas = Canvas(tk,width=400,height=400)
# canvas.create_oval(80,80,120,120,fill='blue')
# canvas.pack()
# def click():
#     for n in range(40):
#         color = ['red','blue','green','yellow','purple']
#         color = random.choice(color)
#         x = random.randrange(400)
#         y = random.randrange(400)
#         canvas.create_oval(x-20,y-20,x+20,y+20,fill=color)
# def one_click(event):
#     canvas.itemconfig(CURRENT,fill='orange')
#     canvas.update_idletasks()
# def double_click(event):
#     canvas.delete(CURRENT)
#     canvas.update_idletasks()
# canvas.bind("<Button-1>",one_click)
# canvas.bind("<Double-Button-1>",double_click)
# click()
# tk.mainloop()


##Ex 6 (drawing on canvas with <B1-Motion>)
# from tkinter import *
# tk = Tk()
# tk.title("Painting using Ovals")
# canvas = Canvas(width=500,height=500)
# canvas.pack(expand = YES, fill = BOTH)
# def paint(event):
#     x1, y1 = (event.x-10),(event.y-10)
#     x2,y2 = (event.x + 10), (event.y + 10)
#     canvas.create_oval(x1,y1,x2,y2,fill = 'light blue')
# canvas.bind("<B1-Motion>",paint)
# # print("press and drag the mouse to paint")
# tk.mainloop()


##Ex 7 (Moving triangle with keys)
# from tkinter import *
# tk = Tk()
# tk.title("moving triangles")
# canvas=Canvas(width=400,height=400)
# canvas.pack(expand=YES,fill=BOTH) ##Expand makes canvas full screen
# t = canvas.create_polygon(10,10,10,60,50,35)
# def movetriangle(event):
#     if event.keysym =="Up":
#         canvas.move(t,0,-3)
#     elif event.keysym == "Down":
#         canvas.move(t,0,3)
#     elif event.keysym == "Left":
#         canvas.move(t,-3,0)
#     else:
#         canvas.move(t,3,0)
# canvas.bind_all('<KeyPress-Up>',movetriangle)
# canvas.bind_all('<KeyPress-Down>',movetriangle)
# canvas.bind_all('<KeyPress-Left>',movetriangle)
# canvas.bind_all('<KeyPress-Right>',movetriangle)
# tk.mainloop()



##Challenge
# from tkinter import *
# import random
# tk = Tk()
# canvas = Canvas(width=400,height=400)
# canvas.create_oval(80,80,120,120)
# canvas.pack(expand=YES,fill=BOTH)
# def click():
#     for n in range(40):
#         x = random.randrange(400)
#         y = random.randrange(400)
#         canvas.create_oval(x - 20, y - 20, x + 20, y + 2)
#         canvas.itemconfig(ALL, fill='orange')
# def one_click(event):
#     color = ['red', 'orange', 'yellow', 'green', 'blue', 'purple']
#     color = random.choice(color)
#     canvas.itemconfig(ALL, fill=color)
#     canvas.update_idletasks()
# def function_name(event):
#     canvas.delete(CURRENT)
# canvas.bind("<Motion>",function_name)
# canvas.bind("<Button-1>",one_click)
# click()
# tk.mainloop()


































