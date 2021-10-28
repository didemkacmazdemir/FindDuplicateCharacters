The computeIfAbsent is similar to the computeIfPresent, but runs the compute method only if the key is NOT present or exists.

The difference is computeIfAbsent uses a Function to update the value; 
the putIfAbsent update the value directly.

