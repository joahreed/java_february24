# [Layers](https://login.codingdojo.com/m/315/9533/64296)

## Learning Objective:
Gain a better understanding of MVC Layers

Model:
- domain model
- service layer
- persistence layer

View:
- `.jsp`

Controller:

- `.java` file with `@Controller` annotation.


## MVC Structure

```mermaid

flowchart TD
     subgraph model

    end

    controller --> model --> id1[(Database)]
    controller --> view

```

---


## Spring MVC structure

```mermaid

flowchart TD
     subgraph model
        direction TB
        service  --> multiline[repository + domain model]
    end

    controller --> model --> id1[(Database)]
    controller --> view

```


## Communication chart

```mermaid
flowchart LR

controller --> service --> repository --> id1[(Database)]

```