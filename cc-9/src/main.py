def max_adjacent(elements):
    previous = 0
    current = 0
    for element in elements:
        temp = current
        current = max(current, previous + element)
        previous = temp
    return current

print(max_adjacent([2, 4, 6, 2, 5]))