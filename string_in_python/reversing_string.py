String = input("enter a string ")
print(String[::-1])
# reversing a string using functions and loops 
def reverse_string (input_str):
    reversed_string =""
    for char in reversed(input_str):
        reversed_string += char
    return reversed_string 
orginal_str = input("enter the string ")
reversed_string = reverse_string(orginal_str)
print ("reversed_str:", reversed_string)
## reversing using recursions 
def reverse_string_by_recursion(input_str):
    if len(input_str) <= 1:
        return (input_str)
    return reverse_string_by_recursion(input_str[1:]) + input_str[0]
orginal_str = input("enter the string ")
reverse_string_by_recursion = reverse_string_by_recursion(orginal_str)
print ("reversed_str:", reverse_string_by_recursion)

    