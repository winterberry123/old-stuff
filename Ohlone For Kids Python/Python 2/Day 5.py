##Exercise 1 (playing music with pygame)
# import pygame
# from tkinter import *
# def play():
#     sound.play()
# def pause():
#     sound.stop()
# tk = Tk()
# b1 = Button(tk,text = 'Play',command = play)
# b1.pack()
# b2 = Button(tk,text = 'Pause',command = pause)
# b2.pack()
# pygame.mixer.pre_init(44100,-16,2,2048)  ##setup mixer to avoid sound lag
# pygame.init()  ##initialize pygame
# sound = pygame.mixer.Sound('sound1.wav')
# tk.mainloop()

##Exercise 2 (B'day stripe display mini project)
# from tkinter import *
# import time
# import pygame
# tk = Tk()
# tk.title("Happy B'Day")
# tk.geometry('770x450')
# tk.configure(background = 'black')
# wallpaper = PhotoImage(file='B-Day-wallpaper.PNG')
# photo = PhotoImage(file = 'Mickey.PNG')
# xpos = 850
# ypos = 270
# color = 'lime green'
# value = True
# def canvas():
#     global xpos, ypos, photo, color
#     canvas = Canvas(tk,width = 770,height = 420,bg = color)
#     canvas.create_image(390,200,image=wallpaper)
#     canvas.create_image(xpos,ypos,image=photo)
#     canvas.create_text(xpos, ypos, text='Happy Birthday Mickey Mouse!',
#                        font='TNR 20 bold italic', fill='dark red')
#     canvas.grid(row=3,column=1)
# canvas()
# def play():
#     global value, xpos, ypos, color
#     sound.play()
#     while value == True:
#         xpos = xpos-1
#         if xpos <-250:  ##This will reset x position of text
#             xpos = 850
#         canvas()
#         tk.update()
#         time.sleep(0.001)
# def stop():
#     global value
#     value = False  ##change the value to false to stop the loop
#     sound.stop()
#     tk.destroy()
# Button1 = Button(tk,text='Play',bg='green',fg = 'black',
#                  width = 110,height=1,command=play)
# Button1.grid(row=1,column=1)
# Button2=Button(tk,text='Exit',bg = 'brown', fg='black',width=110,height=1,command=stop)
# Button2.grid(row=2,column=1)
# pygame.mixer.pre_init()
# pygame.init()
# sound = pygame.mixer.Sound('sound1.wav')
# play()
# tk.mainloop()


