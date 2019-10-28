# 创建模式

## Creational patterns
Name	|Description	|In Design Patterns	|In Code Complete	|Other
--------|---------------|-------------------|-------------------|----------
Abstract factory	|Provide an interface for creating families of related or dependent objects without specifying their concrete classes.	|Yes|	Yes	|N/A
Builder	|Separate the construction of a complex object from its representation, allowing the same construction process to create various representations.	|Yes	|No|	N/A
Dependency Injection	|A class accepts the objects it requires from an injector instead of creating the objects directly.|	No|	No	|N/A
Factory method	|Define an interface for creating a single object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.|	Yes	|Yes|	N/A
Lazy initialization	|Tactic of delaying the creation of an object, the calculation of a value, or some other expensive process until the first time it is needed. This pattern appears in the GoF catalog as "virtual proxy", an implementation strategy for the Proxy pattern.	|No	|No	|PoEAA
Multiton	|Ensure a class has only named instances, and provide a global point of access to them.|	No	|No	|N/A
Object pool	|Avoid expensive acquisition and release of resources by recycling objects that are no longer in use. Can be considered a generalisation of connection pool and thread pool patterns.	|No	|No|	N/A
Prototype	|Specify the kinds of objects to create using a prototypical instance, and create new objects from the 'skeleton' of an existing object, thus boosting performance and keeping memory footprints to a minimum.	|Yes	|No|	N/A
Resource |acquisition is initialization (RAII)	Ensure that resources are properly released by tying them to the lifespan of suitable objects.	|No	|No	|N/A
Singleton	|Ensure a class has only one instance, and provide a global point of access to it.|	Yes	|Yes|	N/A

