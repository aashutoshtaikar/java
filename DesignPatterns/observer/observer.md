Observer Pattern
================

Loose coupling is the benefit
 - The subject(publisher) doesnt need to know anything about the Observers(subscribers)

Negatives:
subject(publishers) will send updates to observers(subscribers) that dont matter to the observers. 

The observer pattern is a software design pattern in which an object, caled the subject maintains a list of its dependents, called observers and notifyies them automatically of any state changes, usually by calling one of their methods.