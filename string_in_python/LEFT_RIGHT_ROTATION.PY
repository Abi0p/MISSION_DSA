def leftrotate(s, d):
    temp = s[d:] + s[0:d]
    return temp

def rightrotate(s, d):
    return leftrotate(s, len(s) - d)

if __name__ == "__main__":
    s = input("Enter the string: ")
    d = int(input("Enter the integer: "))  # Convert input to int

    print("Right rotated string:", rightrotate(s, d))
    print("Left rotated string:", leftrotate(s, d))
