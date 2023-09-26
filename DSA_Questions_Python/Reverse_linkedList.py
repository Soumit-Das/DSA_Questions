class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseLinkedList(head):
    prev = None
    current = head

    while current is not None:
        next_node = current.next  
        current.next = prev     
        prev = current           
        current = next_node     

    return prev


def printLinkedList(head):
    current = head
    while current is not None:
        print(current.val, end=" -> ")
        current = current.next
    print("None")


head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
print("Original Linked List:")
printLinkedList(head)


head = reverseLinkedList(head)

print("Reversed Linked List:")
printLinkedList(head)
