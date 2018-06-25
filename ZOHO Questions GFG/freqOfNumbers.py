# -*- coding: utf-8 -*-
"""
Created on Mon Jun 25 12:41:36 2018

@author: yatheen!
"""
ar_size = int( input("Enter array size ") )
array = []

for i in range(0,ar_size):
    array.append(int(input()))

array = sorted(array)
print(array)
    
for i in range(ar_size):
    print("Freq of " + str(array[i]) + " = " + str(array.count(array[i])) )

