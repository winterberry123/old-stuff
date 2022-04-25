##Ex 1 (creating lines)
# from tkinter import *
# tk =Tk()
# canvas=Canvas(tk,width=300, height=200, bg = 'yellow')
# canvas.pack()
# canvas.create_line(150,0,150,200,fill = 'red', width = 5)
# tk.mainloop()
##note: beginning x position and y positions are 150 and 0, ending x and y positions are 150 and 200.

##Ex 2 (do it yourself)
# from tkinter import *
# tk =Tk()
# canvas=Canvas(tk,width=300, height=200, bg = 'yellow')
# canvas.pack()
# canvas.create_line(150,0,150,200,fill = 'red', width = 5)
# canvas.create_line(0,100,300,100,fill='red',width=5)
# tk.mainloop()

##Ex 3 (creating rectangles)
# from tkinter import *
# tk = Tk()
# canvas=Canvas(tk,width=300,height=200,bg='yellow')
# canvas.pack()
# canvas.create_rectangle(100,50,250,150,fill='red',outline='green')
# tk.mainloop()

##Ex 4 (multiple rectangles with random)
# from tkinter import *
# import random
# import time
# tk=Tk()
# canvas=Canvas(tk,width=400,height=400,bg='yellow')
# canvas.pack()
# def random_rectangle():
#     x1=random.randrange(400)
#     y1=random.randrange(400)
#     color = ['red','green','yellow','blue']
#     color = random.choice(color)
#     canvas.create_rectangle(x1,y1,x1+20,y1+20, fill=color)
# for x in range (100):
#     random_rectangle(
#     time.sleep(0.3)
#     tk.update()
# tk.mainloop()

##Ex 5 (drawing arcs)
# from tkinter import *
# tk = Tk()
# canvas=Canvas(width=200,height=200)
# canvas.pack()
# canvas.create_rectangle(10,10,100,100,fill='green')
# canvas.create_arc(10,10,100,100,extent=359,style=ARC,
#                   outline='red',width=5)
# canvas.create_arc(50,50,200,200,extent=180,style=ARC,
#                    outline='red',width=5)
# tk.mainloop()

##Ex 6 (drawing polygons)
# from tkinter import *
# tk = Tk()
# canvas=Canvas(tk,width=200,height=200)
# canvas.pack()
# canvas.create_polygon(10,10,100,10,100,200,fill='green'
#                       ,outline='red')
# canvas.create_polygon(100,100,200,100,100,300,fill='green',
#                       outline='red')
# tk.mainloop()

##Ex 7 (creating circles)
# from tkinter import *
# tk = Tk()
# canvas=Canvas(width=200,height=200,bg='yellow')
# canvas.pack()
# canvas.create_oval(10,10,100,100,fill='green',outline='red')
# canvas.create_oval(100,100,200,200,
#                    fill='blue',outline='red')
# tk.mainloop()

##Ex 8 (moving circle)
# from tkinter import *
# import time
# tk=Tk()
# tk.title('Moving Circles')
# canvas=Canvas(width=400,height=400,bg='yellow')
# canvas.pack()
# b1=canvas.create_oval(10,10,50,50,fill='green')
# b2=canvas.create_oval(390,390,350,350,fill='red')
# for x in range(0,80):
#     canvas.move(b1,4,4)  ##b1 is id b2 is x & y 4
#     canvas.move(b2,-4,-4)
#     tk.update()
#     time.sleep(0.1)
# tk.mainloop()

##Ex 9 (moving circle application)
from tkinter import *
import time
def create_circle():
    b1=canvas.create_oval(10,10,50,50,fill='green')
    b2=canvas.create_oval(390,390,350,350,fill='red')
    b3=canvas.create_oval(10,390,50,350,fill='green')
    b4=canvas.create_oval(390,10,350,50,fill='red')
    for x in range(0, 80):
        canvas.move(b1, 4, 4)
        canvas.move(b2, -4, -4)
        canvas.move(b3, 4, -4)
        canvas.move(b4, -4, 4)
        tk.update()
        time.sleep(0.001)
tk=Tk()
tk.title('Moving circles')
canvas=Canvas(width=400,height=400,bg='yellow')
canvas.pack()

def clear():
    canvas.delete(ALL)
button1=Button(tk,text='play',command=create_circle,width=50)
button1.pack()
button2=Button(tk,text='clear',command=clear,width=50)
button2.pack()
button3=Button(tk,text='delete',command=tk.destroy,width=50)
button3.pack()
tk.mainloop()





