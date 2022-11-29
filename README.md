# Deque
![anod](https://user-images.githubusercontent.com/37725645/204134248-216e9431-2eac-44f0-98f8-a09d7729dc84.png)

Deque supports both stack and queue operations, it can be used as both. The Deque data structure supports clockwise and anticlockwise rotations in O(1) time which can be useful in certain applications. Also, the problems where elements need to be removed and or added to both ends can be efficiently solved using Deque. For example see the Maximum of all subarrays of size k problem., 0-1 BFS, and Find the first circular tour that visits all petrol pumps.

## Circular array implementation of Deque:
For implementing deque, we need to keep track of two indices, front, and rear.

## Working: 
Create an empty array ‘arr’ of size N
initialize front = -1 , rear = 0 
### Inserting the First element in the deque, at either front or rear will lead to the same result:
![deque-Copy-2](https://user-images.githubusercontent.com/37725645/204134357-67035c72-3eec-41b6-b918-108edbb67eb3.png)

## Insert Elements at the Rear end of Deque:
a). First we check deque if Full or Not 
b). IF Rear == Size-1 
     then reinitialize Rear = 0 ;
     Else increment Rear by ‘1’
     and push current key into Arr[ rear ] = key 
     Front remain same.   
     
## Insert Elements at the Front end  of Deque:
a). First we check deque if Full or Not
b). IF Front == 0 || initial position, move Front
     to points last index of array
     front = size – 1
     Else decremented front by ‘1’ and push 
     current key into Arr[ Front] = key 
     Rear remain same
    
    
 ![deque](https://user-images.githubusercontent.com/37725645/204134440-31357e66-7fb0-4417-b10a-aa641d602885.png)


## Delete Element From Rear end of Deque: 
First Check deque is Empty or Not

If deque has only one element
front = -1 ; rear =-1;

Else IF Rear points to the first index of array
it’s means we have to move rear to points 
last index [ now first inserted element at 
front end become rear end ]  

rear = size-1;
Else || decrease rear by ‘1’  rear = rear-1;


## Delete Element From the Front end of Deque:
a). first Check deque is Empty or Not
b).  If deque has only one element
      front = -1 ; rear =-1 ;

Else IF front points to the last index of the array
it’s means we have no more elements in array so 
we move front to points first index of array
front = 0 ;

Else || increment Front by ‘1’  
front = front+1;

![deque-Copy](https://user-images.githubusercontent.com/37725645/204134539-99cfdfd0-af1b-461f-ac99-4b9187036dc4.png)

____________________________________________________________________________________________________________________________________________________________________

Problem: Design a Data Structure a SpecialQueue which supports following operations enqueue, deque, getMin() or getMax() where getMin() operation takes O(1) time.
Example: 
 

Let the data to be inserted in queue be -
4, 2, 1, 6

Operation     Queue       Output
push(4)         4           -
push(2)        4, 2         -
push(1)       4, 2, 1       -
getMin()      4, 2, 1       1
push(6)      4, 2, 1, 6     -
pop()         2, 1, 6       4
pop()          1, 6         2
pop()            6          1
getMin()         6          6

// Notice the getMin() function call
// It returns the minimum element 
// of all the values present in the queue

Approach: The idea is to use Doubly ended Queue to store in increasing order if the structure is to return the minimum element and store in decreasing order if the structure is to return the maximum element. The operations of the Data Structure is defined as follows:
 

Enque

Insert the element into the queue structure.
If the size of the Deque structure is empty that is the size of the Deque is 0. Then, Insert the element from the back.
Otherwise, If there are some elements in the Deque structure then pop the elements out from the Deque until the back of the Deque is greater than the current element and then finally insert the element from back.
Deque

If the first element of the Deque is equal to the front element of the queue then pop the elements out from the Queue and the Deque at the same time.
Otherwise, Pop the element from the front of the queue to maintain the order of the elements.
 

Get Minimum

Return the front element of the Deque to get the minimum element of the current element of the queue.

____________________________________________________________________________________________________________________________________________________________________

# Given an array and an integer K, find the maximum for each and every contiguous subarray of size K.

Examples : 

Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3 
Output: 3 3 4 5 5 5 6
Explanation: Maximum of 1, 2, 3 is 3
                       Maximum of 2, 3, 1 is 3
                       Maximum of 3, 1, 4 is 4
                       Maximum of 1, 4, 5 is 5
                       Maximum of 4, 5, 2 is 5 
                       Maximum of 5, 2, 3 is 5
                       Maximum of 2, 3, 6 is 6

Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4 
Output: 10 10 10 15 15 90 90
Explanation: Maximum of first 4 elements is 10, similarly for next 4 
                       elements (i.e from index 1 to 4) is 10, So the sequence 
                       generated is 10 10 10 15 15 90 90

 

 

## Naive Approach: To solve the problem using this approach follow the below idea:

The idea is very basic run a nested loop, the outer loop which will mark the starting point of the subarray of length K, the inner loop will run from the starting index to index+K, and print the maximum element among these K elements. 

Follow the given steps to solve the problem:

Create a nested loop, the outer loop from starting index to N - Kth elements. The inner loop will run for K iterations.
Create a variable to store the maximum of K elements traversed by the inner loop.
Find the maximum of K elements traversed by the inner loop.
Print the maximum element in every iteration of the outer loop

Time Complexity: O(N * K), The outer loop runs N-K+1 times and the inner loop runs K times for every iteration of the outer loop. So time complexity is O((n-k+1)*k) which can also be written as O(N * K)
Auxiliary Space: O(1)

## Maximum of all subarrays of size K using Deque: 
Create a Deque, Qi of capacity K, that stores only useful elements of current window of K elements. An element is useful if it is in current window and is greater than all other elements on right side of it in current window. Process all array elements one by one and maintain Qi to contain useful elements of current window and these useful elements are maintained in sorted order. The element at front of the Qi is the largest and element at rear/back of Qi is the smallest of current window.

Below is the dry run of the above approach: 
![image](https://user-images.githubusercontent.com/37725645/204632915-29db2c1e-8d97-457a-844f-888ab674f738.png)
Follow the given steps to solve the problem:

Create a deque to store K elements.
Run a loop and insert the first K elements in the deque. Before inserting the element, check if the element at the back of the queue is smaller than the current element, if it is so remove the element from the back of the deque until all elements left in the deque are greater than the current element. Then insert the current element, at the back of the deque.
Now, run a loop from K to the end of the array.
Print the front element of the deque.
Remove the element from the front of the queue if they are out of the current window.
Insert the next element in the deque. Before inserting the element, check if the element at the back of the queue is smaller than the current element, if it is so remove the element from the back of the deque until all elements left in the deque are greater than the current element. Then insert the current element, at the back of the deque.
Print the maximum element of the last window.

Time Complexity: O(N). It seems more than O(N) at first look. It can be observed that every element of the array is added and removed at most once. So there are total of 2n operations.
Auxiliary Space: O(K). Elements stored in the dequeue take O(K) space.

____________________________________________________________________________________________________________________________________________________________________

# First Circular Tour

Given information about N petrol pumps (say arr[]) that are present in a circular path. The information consists of the distance of the next petrol pump from the current one (in arr[i][1]) and the amount of petrol stored in that petrol pump (in arr[i][0]). Consider a truck with infinite capacity that consumes 1 unit of petrol to travel 1 unit distance. The task is to find the index of the first starting point such that the truck can visit all the petrol pumps and come back to that starting point.

Note: Return -1 if no such tour exists.

Examples:

Input: arr[] = {{4, 6}, {6, 5}, {7, 3}, {4, 5}}. 
Output: 1
Explanation: If started from 1st index then a circular tour can be covered.

Input: arr[] {{6, 4}, {3, 6}, {7, 3}}
Output: 2

 

## Naive Approach:

As the capacity of the truck is infinite it is feasible to fill the truck with all the amount of petrol available at each petrol pump.

A Simple Solution is to consider every petrol pumps as a starting point and see if there is a possible tour. If we find a starting point with a feasible solution, we return that starting point. 

Time Complexity: O(N2)
Auxiliary Space: O(1)

 
## First Circular Tour Using Queue:
Instead of checking the whole array for each starting point, we can store the current tour inside a queue. 

At the moment, the current amount of petrol becomes inefficient (i.e., negative) to reach the next petrol pump, remove the current starting point from the queue and consider the next point as the new starting point.

Instead of building a separate queue, we can use the array itself as a queue with the help of start and end pointers.

Note: Each petrol pump will be added in the queue at most twice and will be removed at most once.

Illustration:

Below image is a dry run of the above approach:
![image](https://user-images.githubusercontent.com/37725645/204633225-50ea70ba-7796-4981-aed0-56bba0e334d0.png)
Follow the below steps to implement the idea:

Set two pointers, start = 0 and end = 1 to use the array as a queue.
If the amount of petrol is efficient to reach the next petrol pump then increment the end pointer (circularly).
Otherwise, remove the starting point of the current tour, i.e., increment the start pointer.
If the start pointer reaches N then such a tour is not possible. Otherwise, return the starting point of the tour.

Time Complexity: O(N)
Auxiliary Space: O(1)
