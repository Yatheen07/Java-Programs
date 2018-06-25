# -*- coding: utf-8 -*-
"""
Created on Mon Jun 25 12:51:25 2018

@author: kmy07
"""


#a = str( input("Enter String ") )
a = "yatheen is a dumb joker"
array = a.split(" ")
# array =  list(set(list(a))) uncomment this if you want freq of character

print(array)

for i in range(len(array)):
    print("Freq of " + str(array[i]) + " = " + str(array.count(array[i])))

