# JavaFunctionalProgramming
 // No State
    // - Should only depend on the state defined inside
    // - Example= Lambdas(line 18-23)
    // - shouldn't depend on any other state
    //Pure Functions (self contained)
    // - Example= Lambdas(line 18-23)
    // - don't depend on global state
    //Impure Functions
    // - do depend on global state
    // No Side Effects
    // - should have no side effects other than everything inside the body of your function
    //Higher Order Functions
    // - Considered to be higher order function if one of two conditions are met.
    // - The function takes one or more functions are parameters.
        // - functions inside another function
    // - The function returns another function as result.
        // - if function returns another function
        // - Example: Callbacks (line 17), Combinator Pattern.CustomerRegistrationValidation (line 14)
