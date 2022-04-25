##import modules
from tkinter import *
import random
import time
import pygame

##define global variables
x = 3
y = 2
x2 = 0
direction = None
counter = 0
tone = 'sound.wav'

##write functions
def ball_move():
    global x, y, state, ball, counter, score
    score = canvas.create_text(300,20,text="Score: 0")
    while True:
        ppos = canvas.coords(p)
        ball_pos = canvas.coords(ball)
        if ball_pos[0] <= 0:
            x = 1
        if ball_pos[2] >= 400:
            x = -1
        if ball_pos[1] <= 0:
            y = 3
        if ball_pos[3] >= 400:
            canvas.delete(ALL)
            canvas.create_text(200, 200, text="Game Over")
            break
        if ball_pos[0]+10 <= ppos[2] and ball_pos[2]-10>=ppos[0] and ball_pos[3]<=ppos[3] and ball_pos[3] >= ppos[1]:
            y = -3
            canvas.delete(score)
            counter += 1
            txt = "Score:" + str(counter)
            score = canvas.create_text(300, 20, text=txt)
            m.play()
        # if score == 7:
        #     canvas.delete(ALL)
        #     canvas.create_text(300,30,text="You win")
        #     break
        paddle_move()
        canvas.move(ball, x, y)
        tk.update()
        time.sleep(0.02)
def paddle_key(event):
    global x2, direction
    if event.keysym == "Left":
        x2 = -2
        direction = 'left'
    if event.keysym == "Right":
        x2 = 2
        direction = 'right'
def paddle_move():
    global x2,p
    ppos = canvas.coords(p) ##gets coordination points of paddle
    if ppos[0]<=0 and direction=='left':
        x2 = 0
    if ppos[2]>=400 and direction=='right':
        x2 = 0
    canvas.move(p,x2,0)
def play():
    global ball, p, counter
    canvas.delete(ALL)
    counter = 0
    ball = canvas.create_oval(200,100,220,120,fill='red',outline='green')
    p = canvas.create_rectangle(150,320,250,330,fill='white',outline='white')
    ball_move()

##create tkinter window
tk = Tk()
tk.title("Ball Paddle Game by Joyce")
tk.resizable (0,0)
tk.wm_attributes('-topmost',1)

##create buttons and canvas
label = Label(tk,font='40',text='Use Left or Right arrow keys to move paddle!',fg='red')
label.grid(row=1,column=1)
label2 = Label(tk,text = 'Created by Progressive Kids')
label2.grid(row = 5, column=1)
redbutton = Button(tk,width = 60,text = "QUIT",fg='red',command=tk.destroy)
redbutton.grid(row = 4,column = 1)
greenbutton = Button(tk,width=60,text='Play',fg='green',command=play)
greenbutton.grid(row = 2, column = 1)
canvas = Canvas(tk,width=400, height=400, bd=2, highlightthickness=0,
                bg='light blue')
canvas.grid(row=3,column=1)
ball = canvas.create_oval(200,100,220,120,fill='red',outline='green')
p= canvas.create_rectangle(100,320,200,330,fill='white',outline='white')
canvas.bind_all('<KeyPress>',paddle_key)

##pygame initialization

pygame.init()
m = pygame.mixer.Sound(tone)

##tk.mainloop()
tk.mainloop()