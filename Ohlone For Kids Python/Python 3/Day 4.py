##Warm up
# a = {'apple':4,'banana':6,'mango':9,'apricot':2}
# for key,values in a.items():
#     if key.startswith('a'):
#         print(key,values)

##Ex 1 (Moving Rectangle)
# from tkinter import *
# import time
# tk = Tk()
# tk.geometry ('500x500')
# tk.configure (background = 'blue')
# canvas = Canvas(tk,width=400,height=400)
# canvas.pack()
# x = 3
# y = 3
# rec = canvas.create_rectangle(200,100,240,140,fill='red',outline='green')
# while True:
#     canvas.move(rec,x,y)  ##to move rectangle
#     tk.update()  ##to prepare canvas for animation
#     time.sleep(0.01)  ##time lap

##Ex 2 (Identifying sides with coords()method)
# from tkinter import *
# import time
# tk = Tk()
# tk.geometry ('500x500')
# tk.configure (background = 'blue')
# canvas = Canvas(tk,width=400,height=400)
# canvas.pack()
# x = 3
# y = 3
# rec = canvas.create_rectangle(200,100,240,140,fill='red',outline='green')
# while True:
#     canvas.move(rec, x, y)
#     tk.update()
#     time.sleep(0.05)
#     rec_pos = canvas.coords(rec)
#     print (rec_pos) ##to get x and y position of object
#     if rec_pos [1] <= 0:
#         y = 3
#     if rec_pos [3] >= 400:
#         y = -3
#     if rec_pos [0] <= 0:
#         x = 3
#     if rec_pos [2] >= 400:
#         x = -3

##Ex 3 (identifying other objects on canvas)
# from tkinter import *
# import time
# tk = Tk()
# tk.geometry ('500x500')
# tk.configure (background = 'blue')
# canvas = Canvas(tk,width=400,height=400)
# canvas.pack()
# x = 1
# y = 3
# rec = canvas.create_rectangle(200,100,240,140,fill='red',outline='green')
# p = canvas.create_rectangle(50,320,350,330,fill = 'blue')
# while True:
#     ppos = canvas.coords(p)
#     canvas.move(rec, x, y)
#     tk.update()
#     time.sleep(0.01)
#     rec_pos = canvas.coords(rec)
#     # print (rec_pos) ##to get x and y position of object
#     if rec_pos [1] <= 0:
#         y = 3
#     if rec_pos [3] >= 400:
#         y = -3
#     if rec_pos [0] <= 0:
#         x = 1
#     if rec_pos [2] >= 400:
#         x = -1
#     if rec_pos[0] <= ppos[2] and rec_pos[2] >= ppos[0] and rec_pos[3] >= ppos[1]:
#         y = -3

##Ex 4 (identifying other objects while they are moving)
from tkinter import *
import time
tk = Tk()
tk.geometry ('500x500')
tk.configure (background = 'blue')
canvas = Canvas(tk,width=400,height=400)
canvas.pack()
x = 3
x2 = 1
y = 3
rec = canvas.create_rectangle(200,100,240,140,fill='red',outline='green')
p = canvas.create_rectangle(50,320,350,330,fill = 'blue')
while True:
    ppos = canvas.coords(p)
    canvas.move(rec, x, y)
    canvas.move(p,x2,0)
    tk.update()
    time.sleep(0.01)
    rec_pos = canvas.coords(rec)
    print (rec_pos) ##to get x and y position of object
    if rec_pos [1] <= 0:
        y = 3
    if rec_pos [3] >= 400:
        y = -3
    if rec_pos [0] <= 0:
        x = 3
    if rec_pos [2] >= 400:
        x = -3
    if rec_pos[0] <= ppos[2] and rec_pos[2] >= ppos[0] and rec_pos[3] >= ppos[1]:
        y = -3
    p_pos = canvas.coords(p)
    if p_pos [3]<=0:
        x2 = 1
    if p_pos [2] >=400:
        x2= -1

##Ex 5 (adding sound with pygame)
# import pygame
# from tkinter import *
# tk = Tk()
# def play():
#     s.play()  ##this is pygame command to play sound
# button = Button(tk,text = 'play',command=play)
# button.pack()
# pygame.init()  ##initializes pygame
# s = pygame.mixer.Sound('sound.wav')
# tk.mainloop()  ##while loops don't need this to run

##Ex 6 (moving ball with beep)
# from tkinter import *
# import pygame
# tk = Tk()
# tk.geometry ('500x500')
# tk.configure (background = 'blue')
# canvas = Canvas (width = 200, height = 200, bg = 'black')
# canvas.pack()
# b = canvas.create_oval(50,50,70,70, fill = 'white')
# pygame.init()
# data=pygame.mixer.Sound('c:/windows/media/Chimes.wav')
# def move():
#     canvas.move(b,6,6)
#     data.play()
#     tk.update()
# b1 = Button(tk,text = 'Play',command = move)
# b1.pack()
# tk.mainloop()

## Ex 7 (do it yourself- when rectangle touches the borders, it should make a beep sound)
# from tkinter import *
# import pygame
# import time
# tk = Tk()
# tk.geometry ('500x500')
# tk.configure (background = 'blue')
# canvas = Canvas(tk,width=400,height=400)
# canvas.pack()
# x = 3
# y = 3
# rec = canvas.create_rectangle(200,100,240,140,fill='red',outline='green')
# pygame.init()
# s = pygame.mixer.Sound('sound.wav')
# while True:
#     canvas.move(rec, x, y)
#     tk.update()
#     time.sleep(0.05)
#     rec_pos = canvas.coords(rec)
#     print (rec_pos) ##to get x and y position of object
#     if rec_pos [1] <= 0:
#         y = 3
#         s.play()
#     if rec_pos [3] >= 400:
#         y = -3
#         s.play ()
#     if rec_pos [0] <= 0:
#         x = 3
#         s.play()
#     if rec_pos [2] >= 400:
#         x = -3
#         s.play()




















