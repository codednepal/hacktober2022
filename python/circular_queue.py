@@ -0,0 +1,74 @@
class CircularQueue:
    def __init__(self, size):
        self.size = size
        self.cqueue = [None] * self.size
        self.front = -1
        self.rear = -1

    def isFull(self):
        return (self.rear) % self.size == self.front and (self.cqueue.count(None) == 0)

    def isEmpty(self):
        return self.cqueue.count(None) == self.size

    def enqueue(self, item):
        if self.isFull():
            print("Queue is Full")
            return
        elif self.isEmpty():
            self.front = self.rear = 0

        self.cqueue[self.rear] = item
        self.rear  = (self.rear + 1) % self.size

    def dequeue(self):
        if self.isEmpty():
            print("Queue is empty")
            return
        print("Dequeued element is", self.cqueue[self.front])
        self.cqueue[self.front] = None
        self.front = (self.front + 1) % self.size

    def display(self):
        print(self.cqueue)

cq = CircularQueue(5)

while True:
    print("\n1. Insert")
    print("2. Delete")
    print("3. Display")
    print("4. Exit")
    choice = int(input("Enter your choice: "))
    if choice == 1:
        data = int(input("Enter the data: "))
        cq.enqueue(data)
    elif choice == 2:
        cq.dequeue()
    elif choice == 3:
        cq.display()
    elif choice == 4:
        break

# cq = CircularQueue(5)

# cq.enqueue(1)
# cq.enqueue(2)
# cq.enqueue(3)
# cq.enqueue(4)
# cq.enqueue(5)
# cq.enqueue(6)

# cq.display()

# cq.dequeue()
# cq.dequeue()
# cq.display()
# cq.enqueue(10)
# cq.enqueue(11)
# cq.dequeue()

# cq.display()

# cq.enqueue(13)
# cq.display()
