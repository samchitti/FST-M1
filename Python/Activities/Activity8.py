#list checker
# Given list of numbers
numList = [10, 20, 30, 40, 10]
print("Given list is ", numList)

# Get first element in list
firstElement = numList[1]
# Get last element in list
lastElement = numList[-2]

# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)