import sys
from cx_Freeze import setup, Executable
setup(name = "Ball_Paddle_Game" ,
version = "0.1" ,
description = "Ball Paddle Game By Progressive Kids" ,
executables = [Executable("Ball Paddle Game.py", base ="Win32GUI")])