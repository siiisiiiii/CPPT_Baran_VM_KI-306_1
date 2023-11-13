from Person import Person
from Sporsman import Sporsman

if __name__ == "__main__":
    # Create a regular person
    person1 = Person("John", 30)
    print(person1.introduce())

    # Create an athlete
    sportsman1 = (Sporsman("Alice", 25, "Swimming"))
    print(f"{sportsman1.name} is an athlete in {sportsman1.sport}.")
    print(sportsman1.train(5))
    print(sportsman1.compete())
