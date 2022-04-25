##Ex 1 (smooth move and identifying borders)
# from tkinter import *
# import time
# x_vel = 0
# y_vel = 0
# direction = None
# tk = Tk()
# canvas = Canvas(width=600, height = 600, bg ='blue')
# canvas.pack(expand=YES,fill=BOTH)
# rect = canvas.create_rectangle(10,10,100,100,outline='yellow',fill='yellow')
# def on_keypress(event):
#     global direction, x_vel, y_vel
#     if event.keysym == "Left":
#         direction = 'left'
#         x_vel = -2
#         y_vel = 0
#     if event.keysym == "Right":
#         direction = "right"
#         x_vel = 2
#         y_vel = 0
#     if event.keysym == "Up":
#         direction = "up"
#         x_vel = 0
#         y_vel = -2
#     if event.keysym == "Down":
#         direction = 'down'
#         x_vel = 0
#         y_vel = 2
# def move ():
#     global x_vel, canvas
#     global y_vel
#     global direction
#     w = canvas.winfo_width()   ##this will get the current width of canvas
#     h = canvas.winfo_height()    ##this will get the current height of canvas
#     rectid = canvas.coords(rect)    ##for x, y coordination position
#     if rectid[0] <= 0 and direction == 'left':
#         x_vel = 0
#     if rectid[2] >= w and direction == 'right':
#         x_vel = 0
#     if rectid [1] <=0 and direction == 'up':
#         y_vel = 0
#     if rectid[3] >= h and direction == 'down':
#         y_vel = 0
#     canvas.move(rect, x_vel, y_vel)
# canvas.bind_all('<KeyPress>', on_keypress)
# while True:
#     move()
#     tk.update()
#     time.sleep(.01)
# tk.mainloop()


##Ex 2 (drawing application)
from tkinter import *
n=3
color = 'black'
def red ():
    global color
    color = 'red'
def green ():
    global color
    color = 'green'
def yellow ():
    global color
    color = 'yellow'
def blue ():
    global color
    color = 'blue'
def black ():
    global color
    color = 'black'
def lightblue ():
    global color
    color='light blue'
def bg():
    global color
    canvas.config(bg=color)
tk = Tk()
tk.title("Painting Application by <Joyce>")
frame = Frame(tk)
frame.pack()
r = Button(frame, bg = 'red',command = red, width = 5)
r.pack(side = LEFT)
r = Button(frame, bg = 'green',command = green, width = 5)
r.pack(side = LEFT)
r = Button(frame, bg = 'yellow',command = yellow, width = 5)
r.pack(side = LEFT)
r = Button(frame, bg = 'blue',command = blue, width = 5)
r.pack(side = LEFT)
r = Button(frame, bg = 'black',command = black, width = 5)
r.pack(side = LEFT)
t = Button(frame, bg='light blue',command = lightblue,width=5)
t.pack(side = LEFT)
a = Button(frame, text = 'Bg Color',command = bg, width = 6)
a.pack(side = LEFT)
canvas = Canvas(tk,width=500,height=300,bg='white',cursor='dot')
canvas.pack(expand = YES, fill = BOTH)
def paint(event):
    global color,n
    x1,y1 = (event.x - n),(event.y-n)
    x2,y2 = (event.x +n),(event.y+n)
    canvas.create_oval(x1,y1,x2,y2,fill=color,outline=color)
def small():
    global n
    n=3
def medium():
    global n
    n=7
def large():
    global n
    n=20
canvas.bind("<B1-Motion>",paint)
def clear():
    canvas.delete(ALL)
clear = Button(frame, text="Clear",command=clear,width=4)
clear.pack(side=RIGHT)
def erase():
    global color,n
    color = 'white'
    n=5
e = Button(frame,text='Erase',command=erase,width=4)
e.pack(side=RIGHT)
m = Button(frame, text='Medium Brush',command=medium,width=11)
m.pack(side=RIGHT)
s = Button(frame, text='Small Brush',command=small,width=9)
s.pack(side=RIGHT)
l = Button(frame, text='Large Brush', command = large, width = 9)
l.pack(side=RIGHT)
message = Label(tk,text="Press and Drag the mouse to draw\nDrag mouse to erase")
message.pack(side=BOTTOM)
tk.mainloop()













