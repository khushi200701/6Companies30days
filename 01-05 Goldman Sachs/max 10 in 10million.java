// Find max 10 numbers in a list having 10M entries.


//quickselect algo
array={...the 10 million numbers...} 
result[10];

pivot=QuickSelect(array,million-11);

for(i=0;i<million;i++)//O(N)
   if(array[i]>=pivot)
      result.add(array[i]);
