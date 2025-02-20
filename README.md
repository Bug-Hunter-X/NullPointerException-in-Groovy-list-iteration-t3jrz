# Groovy NullPointerException in List Iteration
This example demonstrates a common NullPointerException in Groovy when attempting to iterate over a list that might be null.

The `myMethod` function iterates over a list of strings and prints each element.  However, if a null list is passed, a NullPointerException occurs during the iteration.

The solution shows how to handle this case using safe navigation operator (`?.`) or a null check.