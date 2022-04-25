##PROJECT OBJECTIVE
##Build a digital stopwatch that keeps track of the time in tenths of a second
##Stopwatch should have four buttons to start, stop, reset, and exit
##Stopwatch should have counter stating number of turns and points payer receives

from tkinter import *
import time
counter = 0
state = True
turns = 0
points = 0

def format (counter):
    global winzero
    minutes = (int(counter)//600)
    seconds = (int(counter)//10) % 60
    second1 = seconds % 10
    second10 = seconds//10
    winzero = int(counter) % 10
    return str(minutes)+':'+str(second10)+str(second1)+'.'+str(winzero)
# print(format(0))
# print(format(10))
# print(format(150))
# print(format(45))
# print(format(65))
# print(format(78))
def start():
    global state,counter
    state=True
    while state==True:
        counter = str(int(counter)+1)
        canvas()
        tk.update()
        time.sleep(0.1)
def stop():
    global points, turns, state, counter, winzero
    counter=counter
    if state==True and winzero == 0:
        points=points+1
        turns=turns+1
        canvas()
    elif state == True:
        turns=turns+1
        canvas()
    state = False
    if turns==10:
        canvas.create_text(200,30,text='run out of turns,points=winning points',
                           font='TNR 50 bold')
def reset():
    global counter, turns, points
    counter=0
    turns=0
    points=0
    canvas()
def enter_key(event):
    start()
tk=Tk()
tk.title('Stopwatch Game')
tk.geometry('620x300')
tk.configure(background='lime green')
frame = Frame(tk)
frame.grid(row=1,column=1)
frame2=Frame(tk)
frame2.grid(row=1,column=2)
button1 = Button(frame2, text='Start',command=start,
                 width=10,bg='green',font='TNR 20 bold')
button1.grid(row=1,column=1)
button2 = Button(frame2, text='Stop',command=stop,
                 width=10,bg='blue',font='TNR 20 bold')
button2.grid(row=2,column=1)
button3 = Button(frame2, text='Reset',command=reset,
                 width=10,bg='yellow',font='TNR 20 bold')
button3.grid(row=3,column=1)
button4 = Button(frame2, text='Exit',command=tk.destroy,
                 width=10,bg='purple',font='TNR 20 bold')
button4.grid(row=4,column=1)
canvas = Canvas(frame, width=400,height=300,bg='red')
canvas.create_text(200,150,text=format(counter),font='TNR 50 bold')
canvas.grid(row=1,column=1)
canvas.create_text(200,30,text='Points:'+str(points)+'\nTurns:'
                   +str(turns),font='TNR 15 bold')
def canvas():
    canvas = Canvas(frame,width=400, height=300,bg='red')
    canvas.grid(row=1,column=1)
    canvas.create_text(200,150,text=format(counter),font='TNR 50 bold')
    canvas.grid(row=1,column=1)
    canvas.create_text(250,30,text='Points:'+str(points)+
                       '\nTurns:'+str(turns),font='TNR 15 bold')
frame.bind_all('<Return>', enter_key)
tk.mainloop()