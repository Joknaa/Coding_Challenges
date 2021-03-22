"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", inputStdin => {
  inputString += inputStdin;
});

process.stdin.on("end", _ => {
  inputString = inputString
    .trim()
    .split("\n")
    .map(string => {
      return string.trim();
    });

  main();
});

function readLine() {
  return inputString[currentLine++];
}

function getLetter(s) {
  let letter;
  // Write your code here
  switch (s.charAt(0)) {
    case "a" || "e" || "i" || "o" || "u":
      letter = "A";
      break;
    case "b" || "c" || "d" || "f" || "g":
      letter = "B";
      break;
    case "h" || "j" || "k" || "l" || "m":
      letter = "C";
      break;
    case "n" ||
      "p" ||
      "q" ||
      "r" ||
      "s" ||
      "t" ||
      "v" ||
      "w" ||
      "x" ||
      "y" ||
      "z":
      letter = "D";
      break;
    case "p":
      letter = "D";
      break;
    case "q":
      letter = "D";
      break;
    case "r":
      letter = "D";
      break;
    case "s":
      letter = "D";
      break;
    case "t":
      letter = "D";
      break;
    case "v":
      letter = "D";
      break;
    case "w":
      letter = "D";
      break;
    case "x":
      letter = "D";
      break;
    case "y":
      letter = "D";
      break;
    case "z":
      letter = "D";
      break;
    default:
      break;
  }
  return letter;
}

function main() {
  const s = readLine();

  console.log(getLetter(s));
}
