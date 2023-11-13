class Person:
    def __init__(self, name, age):
        """Initialize a person with a name and age."""
        self.name = name
        self.age = age


    def introduce(self):
        """Return a person's introduction."""
        return f"Hello, my name is {self.name} and I am {self.age} years old."