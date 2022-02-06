import random
LETTERS = "\n ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
NLETTERS = 10
with open("../../resources/_42/letters.txt", "w") as file:
	for i in range(NLETTERS):
		print(random.choice(LETTERS), end="", file=file)
