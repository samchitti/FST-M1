#Odd or Even Numbers
num = input("Enter a number: ")
if int(num) % 2 == 0: # divisible by 2 means even number
    print(num + " is an even number.")
else:
    print(num + " is an odd number.")


num = input("Enter a number: ")
if int(num) % 1 == 0: # divisible by 1 means it's a whole number
    print(num + " is a whole number.")  
else:
    print(num + " is not a whole number.")


num = input("Enter a number: ")
if int(num) % 3 == 0: # divisible by 3 means multiple of 3
    print(num + " is a multiple of 3.")
else:
    print(num + " is not a multiple of 3.")