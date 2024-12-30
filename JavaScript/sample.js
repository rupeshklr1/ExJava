var intVarablevalue = 10;
var floatVariableValue = 10.5;
var stringVariableValue = "Hello World";
var booleanVariableValue = true;
var arrayVariableValue = [1, 2, 3, 4, 5];
var objectVariableValue = { name: "Rupesh-me", age: 25 };
var nullVariableValue = null;
var undefinedVariableValue = undefined;

console.log(intVarablevalue);
console.log(floatVariableValue);
console.log(stringVariableValue);
console.log(booleanVariableValue);
console.log(arrayVariableValue);
console.log(objectVariableValue);
console.log(nullVariableValue);
console.log(undefinedVariableValue);

// Path: JavaScript/sample.js
objectVariableValue["name"] = "Raju";
localTempVar = objectVariableValue;
var tempOutofScopeVar = {};
tempOutofScopeVar= JSON.parse(JSON.stringify(objectVariableValue));
console.log("before updation ", tempOutofScopeVar , objectVariableValue);
objectVariableValue["newKey"] = tempOutofScopeVar;

console.log("--------end ", JSON.stringify(objectVariableValue, null, 4));