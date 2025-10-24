print("Hello World")
print("Welcome to Python programming!")

print("Lets try by calculating prime numbers!")

n = int(input("Enter a number: "))
if n < 2:
    print(n, "is not a prime number.")
else:
    prima = True
    for i in range(2, n):
        if n % i == 0:
            prima = False
            break
if prima:
    print(n, "is a prime number.")
else:
    print(n, "is not a prime number.")

print("Thank you for using the prime number checker!")