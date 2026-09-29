player1=input("Player 1: Enter Rock, Paper, Scissors:")
player2=input("Player 2: Enter Rock, Paper, Scissors:")
if player1 == player2:
    print("It's a tie!")
elif player1 == "Rock":
    if player2 == "Scissors":
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")
elif player1 == "Paper":
    if player2 == "Rock":
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")
elif player1 == "Scissors":
    if player2 == "Paper":
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")

#Game2 - Secret Number Guessing Game
SecretNumber = int(input("Ramesh: Enter a secret number: "))
print("\n" * 50)  # Clear screen -prints new lines 
print("Suresh: Start guessing!")
guess = 0
attempts = 0
while guess != SecretNumber:
    guess = int(input("Suresh: Enter your guess: "))
    attempts += 1
    if guess < SecretNumber:
        print("Too low! Try again.")
    elif guess > SecretNumber:
        print("Too high! Try again.")
    else:
        print(f"Congratulations! Suresh guessed the secret number {SecretNumber} in {attempts} attempts.")



#Game3 - Number Guessing Game
Player1 = input("Rani: Enter a secret number between 1 and 10:")
Player2 = int(input("Vani: Guess the secret number between 1 and 10:"))
if Player2 == int(Player1):
    print("Vani guessed the secret number correctly!")
else:
    print("Vani guessed the wrong number. The secret number was " + Player1 + ".")  
if Player2 < int(Player1):
    print("Vani's guess is too low.")
else:
    print("Vani's guess is too high.")