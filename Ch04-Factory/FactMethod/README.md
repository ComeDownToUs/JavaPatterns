The process for creating pizzas is contained within an abstract method in Stores.PizzaStore,
allowing each store to decide on the pizzas which they allow.

Defers instantiation to subclasses.

This pattern leaves the Stores.PizzaStore concrete classes dependent on individual pizzas
