# Coding Challenge #5

### Language
Today's language is Python

## Instruction
cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.

Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
Implement car and cdr.

## Example
car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

## Contributing
Feel free to contribute to this project.