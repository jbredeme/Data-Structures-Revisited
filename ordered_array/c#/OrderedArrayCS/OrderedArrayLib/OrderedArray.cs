using System;
using System.Collections.Generic;
using System.Text;

namespace OrderedArrayLib {
    public class OrderedArray {
        private Employee[] empArr;
        private int size;
        private int numElements;    

        public OrderedArray(int size) {
            empArr = new Employee[size];
            numElements = 0;

        }

        public int insert(Employee e) {
            return 0;
        }

        public int delete(int id) {
            return 0;
        }

        public int[] find(string lname) {
            int lowerBound = 0;
            int upperBound = numElements - 1;
            int middle = 0;
            int[] range = {-1, -1};

            while (lowerBound <= upperBound) {              //=> search for the lowerbound in a range
                middle = (lowerBound + upperBound) / 2;
                string value = empArr[middle].getLname();
                int result = String.Compare(value.ToLower(), lname.ToLower());

                if (result == 0) {
                    range[0] = middle;                      //=> store the index of the first occurance of target
                    upperBound = middle - 1;                //=> look to the left-side of target to see if there is more 

                } else if (result > 0) {
                    upperBound = middle - 1;


                } else {
                    lowerBound = middle + 1;

                }

            }

            lowerBound = 0;                                 //=> reset lowerbound
            upperBound = numElements - 1;                   //=> reset upperbound
            while (lowerBound <= upperBound) {              //=> serach for the upperbound in a range
                middle = (lowerBound + upperBound) / 2;
                string value = empArr[middle].getLname();
                int result = String.Compare(value.ToLower(), lname.ToLower());

                if (result == 0) {
                    range[1] = middle;                      //=> store the index of the last occurance of target
                    lowerBound = middle + 1;                //=> look to the right of target to see if there is more

                } else if (result > 0) {
                    upperBound = middle - 1;

                } else {
                    lowerBound = middle + 1;

                }

            }
            return range;

        }
        
    }

}
