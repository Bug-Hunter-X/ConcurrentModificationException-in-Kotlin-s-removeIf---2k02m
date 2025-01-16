# Kotlin ConcurrentModificationException with removeIf()

This repository demonstrates a common error in Kotlin when using the `removeIf()` function on a mutable list while simultaneously iterating over it.  The example showcases the `ConcurrentModificationException` that arises and provides a solution.

## Bug
The provided `bug.kt` file contains code that attempts to remove even numbers from a list using `removeIf()`.  This leads to a `ConcurrentModificationException` because `removeIf()` modifies the list structure during iteration. 

## Solution
The `bugSolution.kt` file presents a solution using an iterator to safely remove elements from the list while iterating.  This avoids the `ConcurrentModificationException`. 