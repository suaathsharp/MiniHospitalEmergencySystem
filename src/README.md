Mini Hospital Emergency Management System

CIT300 – Data Structures and Algorithms

This project is a Mini Hospital Emergency Management System developed using Java. The system demonstrates the use of four important data structures to manage patient information, emergency patients, completed treatments, and patient visit history.

Data Structures Used

1. Binary Search Tree (BST)

The Binary Search Tree is used to store and manage patient records.

Each patient is identified using the Patient ID as the key.

Operations implemented:

- Insert patient
- Search patient by Patient ID
- Delete patient
- In-order traversal

Patient information includes:

- Patient ID
- Name
- Age
- Contact Number
- Medical Condition

2. Queue

The Queue is used to manage emergency waiting patients.

The queue follows the FIFO (First In, First Out) principle.

Operations implemented:

- Enqueue patient
- Dequeue patient
- Display waiting patients
- Check whether the queue is empty

3. Stack

The Stack is used to store completed treatment records.

The stack follows the LIFO (Last In, First Out) principle.

Operations implemented:

- Push treatment
- Pop latest treatment
- Display completed treatments
- Check whether the stack is empty

4. Singly Linked List

The Singly Linked List is used to store patient visit history.

Each visit contains:

- Visit ID
- Visit Date
- Doctor Name
- Diagnosis
- Treatment

Operations implemented:

- Add visit
- Remove visit
- Search visit
- Display visit history

Project Structure

MiniHospitalEmergencySystem/
│
├── src/
│   └── model/
│       ├── Main.java
│       ├── Patient.java
│       ├── PatientBST.java
│       ├── EmergencyQueue.java
│       ├── Treatment.java
│       ├── EmergencyStack.java
│       ├── Visit.java
│       └── VisitHistory.java
│
├── README.md
└── .gitignore

Technologies Used

- Java
- Object-Oriented Programming
- Data Structures and Algorithms
- Git
- GitHub
- Visual Studio Code

Testing

The system was tested using "Main.java".

The following operations were tested:

- BST insertion
- BST searching
- BST deletion
- BST in-order traversal
- Queue enqueue and dequeue
- Stack push and pop
- Linked List add, search and remove
- Display operations
- Empty data structure handling

All implemented data structures were successfully tested.

GitHub Development

The project was developed progressively using separate GitHub commits for the major implementation stages.

The development included:

1. Created project structure
2. Implemented patient BST
3. Added BST search and deletion
4. Implemented emergency queue
5. Implemented treatment stack
6. Implemented patient visit linked list
7. Added complete system testing
8. Added project README

Conclusion

This project demonstrates how different data structures can be applied to solve practical problems in a hospital emergency management system.

The Binary Search Tree manages patient records, the Queue manages emergency waiting patients, the Stack stores completed treatments, and the Singly Linked List maintains patient visit history.