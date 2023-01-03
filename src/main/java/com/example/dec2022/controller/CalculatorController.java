package com.example.dec2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Stating to the Spring Container that this is a Controller
@RequestMapping("/calculate")//name of the controller
public class CalculatorController {

    @GetMapping("/add/{first}/{second}")
    public double add(@PathVariable("first") double firstNumber,
                      @PathVariable("second") double secondNumber)
    {
     return firstNumber+secondNumber;
    }
    @GetMapping("/subtract/{first}/{second}")
    public double subtract(@PathVariable("first") double firstNumber,
                           @PathVariable("second") double secondNumber)
    {
        if (firstNumber > secondNumber)
        {
        return firstNumber - secondNumber;
        }

        return secondNumber - firstNumber;
    }
    @GetMapping("/multiply/{first}/{second}")
    public double multiply(@PathVariable("first") double firstNumber,
                           @PathVariable("second") double secondNumber)
    {
        return firstNumber*secondNumber;
    }

    @GetMapping("divide/{first}/{second}")
    public double divide(@PathVariable("first") double firstNumber,
                         @PathVariable("second") double secondNumber)
    {
        if(secondNumber==0)
        {
            return -1;
        }
        return firstNumber/secondNumber;
    }




}
