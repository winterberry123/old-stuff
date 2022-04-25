from tkinter import *
import random
secret_number = random.randrange (0, 101)
counter = 7
def number_guess():
    ##game logic will go here
    global counter, secret_number, canvas_text, canvas
    counter = counter - 1
    guess = int(entry.get())
    try:
        if guess > secret_number and counter > 0:
            canvas_text = 'Remaining Guess:\t'+\
                str(counter)+'\nGuess is:\t' + \
                str(guess) + '\nLower!'
            create_canvas()
        elif guess < secret_number and counter > 0:
            canvas_text = 'Remaining Guess:\t'+\
                str(counter)+'\nGuess is:\t' + \
                str(guess) + '\n Higher'
            create_canvas()
        elif guess == secret_number:
            canvas_text = 'Number of remaining guess is:\t'+\
                str(counter)+'\nGuess is:\t'+ \
                str(guess) + '\nSecret number is:\t' +\
                str(secret_number)+'\nCorrect Guess'
            create_canvas()
        elif counter==0:
            canvas_text = 'Game Over!'+'\nSecret Number was:\t'+\
                str(secret_number)
            create_canvas()
        entry.delete(0, END)
    except:
        print('Invalid Entry')
def new_game():
    ##this will reset the game for new player
    global counter, secret_number, canvas_text, canvas
    counter = 7
    secret_number = random.randrange (0,101)
    canvas_text = 'New Game: Range is 0 to 100'+'\nNumber of remaining guess is 7'
    create_canvas()
def new_game2():
    ##this will reset the game for new player
    global counter, secret_number, canvas_text, canvas
    counter = 10
    secret_number = random.randrange (0,1000)
    canvas_text = 'New Game: Range is 0 to 1000'+'\nNumber of remaining guess is 10'
    create_canvas()
def enter_key(event):
    number_guess()
tk = Tk()
tk.title('Guess the Number Game')
frame = Frame(tk)
frame.pack()
label = Label (frame, text = 'Enter Your Number Guess Here', \
               font = 'TNR 15', fg = 'green', height = 3)
label.pack()
entry = Entry(frame, font = 'bold 20')
entry.pack ()
button1 = Button(frame, text = 'Enter', width = 20, command= number_guess,\
                 bg = 'pink', font = 'TNR 10')
button1.pack()
button2 = Button(frame, text = 'Play Again', command = new_game,\
                 width = 20, bg= 'purple', font = 'TNR 10')
button2.pack()
button4 = Button(frame, text = '1000 Range', command = new_game2, \
                 width=20, bg='blue', font='TNR 10')
button4.pack()
button3 = Button(frame, text = 'Exit', command=tk.destroy,\
                 width = 20, bg='red', font = 'TNR 10')
button3.pack()
canvas = Canvas(frame, width = 300, height = 200, bg = 'light blue')
canvas.pack()
def create_canvas():
    global canvas_text, canvas
    canvas.delete(ALL)
    canvas.create_text(150,100, text = canvas_text, fill = 'red', \
                       font ='TNR 12')
logo = PhotoImage(file='logo.PNG')
label2 = Label(frame, image=logo)
label2.pack(side='left')
label3 = Label(frame, text = 'Developed by:\n Joyce',\
               font ='TNR 10', fg = 'black')
label3.pack(side = 'right')
frame.bind_all('<Return>', enter_key)
tk.mainloop()






















