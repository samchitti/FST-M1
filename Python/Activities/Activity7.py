#calculate the sum of all the elements in a list.
numbers = input("Enter a sequence of comma separated values: ").split(", ")

sum = 0
for number in numbers:
  sum += number

print(sum)


# define the list
numbers = [1, 2, 3, 4, 5]

# initialize sum
total = 0

# loop through the list
for num in numbers:
    total += num

# print the result
print("Sum of elements:", total)
