#Python dictionary that contains a bunch of fruits and their prices.
fruit_shop = {
    "apple": 10, 
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

input = input("What are you looking for? ").lower()

if(input in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")