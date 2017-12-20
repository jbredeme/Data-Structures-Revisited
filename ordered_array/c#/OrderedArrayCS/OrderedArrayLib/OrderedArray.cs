using System;
using System.Collections.Generic;
using System.Text;

namespace OrderedArrayLib {
    public class OrderedArray {
        private Employee[] empArr;          //=> array of base class employee
        private int numElements;            //=> track the number of employee objects inserted into the array

        public OrderedArray(int size) {     
            empArr = new Employee[size];
            numElements = 0;

        }

        public int insert(Employee employee) {
            string lname = employee.getLname().ToLower();
            string temp;
            int successful = -1;
            int lastVisted;
            int temp2;
            int[] result;
            // Considerations for insert using binarysearch with duplicates allowed...
            // 1. search should produce the location in the array (index) where the item is found. In terms of duplicates allowed,
            //    the exact position within a range of equal values is immaterial as insertion location (left or right) doesn't matter
            //    to preserve ordering. By default I want to insert on the tail of a range to reduce the number of shifts required to make the insertion.
            //          b. if the key value is not located in the array I want to know the last location (index) the binary search visted before exiting 
            //             then I want to know if that value itself is part of a range of equal values. In the event that the value at the index was 
            //             apart of a range the head and tail indicies would be needed to identify the correct insertion point based on the values logical 
            //             evaluation (head - 1 or tail + 1).
            // 2. considerations on compacity limits, (ie trying to insert into an array that as no more available cells).
            try { 
                if(numElements == empArr.Length) {  //=> array is at max capacity, insertion is not possible
                    throw new Exception();
       
                }

                if (numElements == 0) {             //=> empty array, insertion is constant O(1)
                    empArr[0] = employee;
                    numElements += 1;

                } else {                            //=> insert object and preserve order
                    result = find(lname);           //=> determine if lname is in the array

                    if(result[0] == -1) {           //=> object with the same last name doesn't exist in the array
                        lastVisted = result[2];

                        if (lastVisted != -1) {     //=> last index visted when last name was not found in the array, determine if that value is part of a range       
                            temp = empArr[lastVisted].getLname().ToLower();
                            temp2 = String.Compare(temp, lname);
                            result = find(temp);

                            if(temp2 == -1) {
                                // shift items right starting at result[0] (head)
                                // insert at the head result[0]

                            } else {
                                // shift items right starting at result[1] + 1 (tail) 
                                // insert at result[1] + 1

                            }
                            
                        }
                        
                    } else {
                        // determine to insert at the head or the tail

                    }

                }
                
            } catch (Exception) {
                Console.WriteLine("Insertion was unsuccessful: array size {0}, current number of elements {1}", empArr.Length, numElements);

            }
            return successful;

        }


        public int[] find(string lname) {
            int lowerBound = 0;
            int upperBound = numElements - 1;
            int middle = 0;
            int result;
            int[] range = {-1, -1, -1};                     //=> lowerbound, upperbound range, (lowerbound == upperbound)
            string value;

            while (lowerBound <= upperBound) {              //=> search for the lowerbound in a range
                middle = (lowerBound + upperBound) / 2;
                value = empArr[middle].getLname();
                result = String.Compare(value.ToLower(), lname.ToLower());

                if(lowerBound == upperBound) {              //=> save last index binary search examines before exiting
                    range[2] = lowerBound;

                }

                if (result == 0) {
                    range[0] = middle;                      //=> store the index of the first occurance of target
                    upperBound = middle - 1;                //=> look to the left-side of target to see if there is more 

                } else if (result > 0) {
                    upperBound = middle - 1;


                } else {
                    lowerBound = middle + 1;

                }

            }

            if(range[0] != -1) {                            //=> inital search for an item was not found searching for an upperbound in a range is unnecessary
                lowerBound = 0;                             //=> reset lowerbound
                upperBound = numElements - 1;               //=> reset upperbound
                while (lowerBound <= upperBound) {          //=> serach for the upperbound in a range
                    middle = (lowerBound + upperBound) / 2;
                    value = empArr[middle].getLname();
                    result = String.Compare(value.ToLower(), lname.ToLower());

                    if (result == 0) {
                        range[1] = middle;                  //=> store the index of the last occurance of target
                        lowerBound = middle + 1;            //=> look to the right of target to see if there is more

                    }
                    else if (result > 0) {
                        upperBound = middle - 1;

                    }
                    else {
                        lowerBound = middle + 1;

                    }

                }

            }
            return range;

        }
        
    }

}
