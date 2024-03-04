def reverse_string_recursive(input_str):
    # Base case: if the string is empty or has only one character
    if len(input_str) <= 1:
        return input_str
    
    # Recursive case: reverse the substring excluding the first character
    # and concatenate the first character at the end
    return reverse_string_recursive(input_str[1:]) + input_str[0]

# Example usage:
original_str = input('enter the string')
reversed_str = reverse_string_recursive(original_str)

print("Original String:", original_str)
print("Reversed String:", reversed_str)
