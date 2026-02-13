let arr = [-9, 1, -2, -2, -4, 5, 9, 6, -0, 0, 9];

let pos = arr.filter((n) => n >= 0);
let neg = arr.filter((n) => n < 0);

let result = [];
let i = 0,
  j = 0;

while (i < neg.length && j < pos.length) {
  result.push(neg[i++]);
  result.push(pos[j++]);
}

while (i < neg.length) result.push(neg[i++]);
while (j < pos.length) result.push(pos[j++]);

console.log(result);
