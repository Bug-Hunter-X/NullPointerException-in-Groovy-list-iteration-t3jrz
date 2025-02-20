```groovy
def myMethod(List<String> list) {
  // Solution 1: Using the safe navigation operator
  list?.each { item ->
    println item
  }

  // Solution 2: Using a null check
  if (list != null) {
    list.each { item ->
      println item
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['a', 'b', 'c'])