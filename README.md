# Deque
![anod](https://user-images.githubusercontent.com/37725645/204134248-216e9431-2eac-44f0-98f8-a09d7729dc84.png)

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
