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

/**
 *   Return the second largest number in the array.
 *   //@param {Number[]} nums - An array of numbers.
 *   //@return {Number} The second largest number in the array.
 **/
function getSecondLargest(nums) {
  // Complete the function
  var max = nums[0];
  var secondMax = nums[0];

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] >= max) {
      max = nums[i];
    }
  }
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] >= secondMax && nums[i] != max) {
      secondMax = nums[i];
    }
  }
  return secondMax;
}

function main() {
  const n = +readLine();
  const nums = readLine()
    .split(" ")
    .map(Number);

  console.log(getSecondLargest(nums));
}
