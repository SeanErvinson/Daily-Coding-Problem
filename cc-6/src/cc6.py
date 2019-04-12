# Couldn't solve this
# Answers from github.com/subsr97

class Node:
    def __init__(self, value):
        self.value = value
        self.both = 0


class ArrayList:
    def __init__(self):
        self.head = Node(None)
        self.tail = Node(None)

    def add(self, element):
        new_node = Node(element)
        if self.head == None:
            self.head = self.tail = new_node
        else:
            new_node.both = get_pointer(self.tail)
            self.tail.both = new_node.both ^ self.tail.both
            self.tail = new_node

    def get(self, index):
        current_node = self.head
        previous_address = 0

        for i in range(0, index-1):
            hold_address = get_pointer(current_node)
            current_node = dereference_pointer(previous_address ^ current_node.both)
            previous_address = hold_address
            if current_node.both == previous_address and i < ind-2:
                print("Invalid index.")
                return None
        return current_node