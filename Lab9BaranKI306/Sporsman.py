from Person import Person

class Sporsman(Person):
    def __init__(self, name, age, sport):
        """Initialize an athlete with a name, age, and sport. Inherits from the Person class."""
        super().__init__(name, age)
        self.sport = sport
        self.training_hours = 0

    def train(self, hours):
        """Simulate athlete training and increase training hours."""
        self.training_hours += hours
        return f"{self.name} trained for {hours} hours. Total training hours: {self.training_hours}"

    def compete(self):
        """Simulate athlete competing and decrease energy level."""
        if self.training_hours >= 10:
            self.training_hours -= 10
            return f"{self.name} successfully competed. Total training hours: {self.training_hours}"
        else:
            return f"{self.name} needs more training to compete."


if __name__ == "__main__":
    # Create a regular person
    person1 = Person("John", 30)
    print(person1.introduce())

    # Create an athlete
    athlete1 = Athlete("Alice", 25, "Swimming")
    print(f"{athlete1.name} is an athlete in {athlete1.sport}.")
    print(athlete1.train(5))
    print(athlete1.compete())
