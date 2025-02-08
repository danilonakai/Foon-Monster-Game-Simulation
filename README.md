# Foon Monster Game Simulation
This is a Java application developed as part of a college assignment. The app simulates the inhabitants of a fictional world called Foon, focusing on different types of Monsters such as Orcs, Goblins, and Manticores. It demonstrates core Java concepts including inheritance, association, overriding, constructors, and key object-oriented principles such as Encapsulation, Inheritance, and Polymorphism. The system models attributes like clan affiliation, health, and treasure, while handling battle mechanics, healing abilities, and interactions between Monsters. The app ensures that dead Monsters cannot engage in battles, attack, defend, or gain treasure, creating an interactive game environment where strategic decisions are made based on Monster stats and abilities.

## Features
- **Inheritance**: The app uses inheritance to model different Monster types (Orcs, Goblins, Manticores) and their shared behavior and attributes, avoiding code duplication.
- **Overriding**: Specific behaviors such as attack scores and healing abilities are overridden for different Monster types to implement unique characteristics.
- **Association**: The relationship between Warlords and Infantry, and between Goblins and their sworn enemies, is implemented through association.
- **Constructors**: The project implements multiple constructors for each Monster type to handle both full and default attribute initialization.
- **Battle System**: Monsters attack each other using a battle score system based on their Ferocity, Defense, and Magic attributes. A Manticore or Warlord’s battle score is enhanced by a factor of 1.5.
- **Healing**: Warlords can heal their Infantry by sounding their battle cry, which boosts health based on their leadership rating.
- **Treasure System**: Monsters can gain or lose treasure, which affects Warlords’ leadership ratings. Dead Monsters cannot gain treasure.

## Development Environment
- **Java Version**: 15 (Liberica JDK 15) or higher
- **IDE**: IntelliJ IDEA (Community Edition)

## Class Structure (UML Diagram)
![assignment6 drawio](https://github.com/user-attachments/assets/9c05d218-fe6e-4ea8-a76a-ab1de222e9ed)

## How to Play
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA (Community Edition).
3. Ensure that you are using Java 15 (Liberica JDK 15) or higher.
4. Run the `Main.java` file to simulate battles between different Monsters in the Foon world.
5. You can create instances of different Monster types, perform attacks, gain or lose treasure, and see the results of battle, including changes in health and leadership.

### Sample Output (from Main.java):
![image](https://github.com/user-attachments/assets/3bd34e16-e123-43de-bc1c-e5955c94ed1a)

## Implementation Notes
- The project uses **inheritance** to share common properties and behaviors between different Monster types.
- **Overriding** is used to customize the behavior of `attack()`, `heal()`, and `gainTreasure()` methods for specific Monster types like Warlords and Manticores.
- **Encapsulation** is implemented to restrict direct access to instance variables. Public getters and setters are used to allow controlled access.
- The `toString()` method is implemented for each class to provide easy-to-read summaries of Monster details, including attributes like health, battle score, and clan affiliation.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
