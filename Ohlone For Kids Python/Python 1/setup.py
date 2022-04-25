import sys
from cx_Freeze import setup, Executable
setup(name = "Guess _Game" ,
version = "0.1" ,
description = "Guess the Number Game By Progressive Kids" ,
executables = [Executable("number_guess_game.py", base ="Win32GUI")])