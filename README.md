# Pen: A Modular Pen Design System

A Java project that models a real-world pen using composition and the Strategy pattern. Each pen is assembled from interchangeable components: a writing nib, an open/close cover, and a refill system. Components are defined through interfaces, making the system straightforward to extend without modifying existing code.

## Architecture

The project follows a component-based architecture where the `Pen` class acts as the central orchestrator. It delegates all behavior to its composed strategy objects:

- **Writable** defines how the pen writes (ballpoint, gel, fountain ink)
- **Cover** defines how the pen opens and closes (cap, click mechanism)
- **Refill** defines how the pen gets new ink (cartridge swap, tube injection)

A `PenFactory` handles object creation, mapping string identifiers to concrete implementations.

### Design Patterns

| Pattern | Where | Purpose |
|---------|-------|---------|
| Strategy | Writable, Cover, Refill interfaces | Swap behaviors at construction time |
| Factory | PenFactory | Centralize and simplify pen creation |
| Composition | Pen class | Assemble behavior from parts, not inheritance |

## Project Structure

```
src/main/java/com/pen/
|-- Main.java                        Entry point and demo
|-- model/
|   +-- Pen.java                     Core pen class (orchestrator)
|-- factory/
|   +-- PenFactory.java              Creates pens from string identifiers
|-- writable/                        Writing strategy implementations
|   |-- Writable.java                Interface
|   |-- BallWritable.java
|   |-- GelWritable.java
|   +-- InkWritable.java
|-- cover/                           Open/close mechanism implementations
|   |-- Cover.java                   Interface
|   |-- CapCover.java
|   +-- ClickCover.java
+-- refill/                          Refill strategy implementations
    |-- Refill.java                  Interface
    |-- CartridgeRefill.java
    +-- PlasticPipeRefill.java
```

## The Pen Class

The `Pen` class holds references to its three strategy objects and tracks whether it is currently open. It exposes four operations:

| Method | What it does |
|--------|-------------|
| `start()` | Opens the pen through its cover mechanism |
| `write(input)` | Writes text using the current nib and ink color (only works if open) |
| `refill(color)` | Swaps the ink color through the refill strategy |
| `close()` | Closes the pen through its cover mechanism |

Writing while the pen is closed prints an error message instead of producing output.

## Build and Run

Compile:

```bash
javac -d out --source-path src/main/java src/main/java/com/pen/Main.java
```

Run:

```bash
java -cp out com.pen.Main
```

The `-d out` flag places compiled `.class` files in a separate `out/` directory, keeping source and bytecode apart.

## UML Diagram

<img width="2967" height="1887" alt="Untitled-2026-03-23-1632" src="https://github.com/user-attachments/assets/cd718175-88d6-4094-b649-a1fc4674e740" />
