# [@NotNull](https://login.codingdojo.com/m/315/9533/115812)

## Learning Objectives:

- Distinguish between `@NotNull`, `@NotEmpty`, and `@NotBlank`
- Avoid common mistake with `@NotNull` validation

### `@NotNull` 

> This validation will accept empty fields ...

### `@NotEmpty`

> ... a String consisting of only spaces is allowed.

### `@NotBlank`

>__This validation makes the most sense for the String data type__. It will not accept empty fields. It also trims trailing spaces before checking the String length. This will ensure that a String consisting of only spaces will not pass the validation.