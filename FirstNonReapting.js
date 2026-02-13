let arr = [2, 2, 2,9, 3, 4, 5, 6, 2, 2, 2];
const freq = arr.reduce((acc, num) => {
  acc[num] = (acc[num] || 0) + 1;
  return acc;
}, {});

const result = arr.find(num => freq[num] === 1);

console.log(result + " is 1st non repeting element");
