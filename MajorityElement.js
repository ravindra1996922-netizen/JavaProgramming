let arr = [2,1,1,1,1,1,1,1,1,1,1,1,1, 3, 4, 5, 6, 2, 2, 2];


let arr2=arr.reduce((acc,curr)=>{

acc[curr]??=0
acc[curr]+=1;
return acc;
},{})

console.log(arr2)
let max=0
let h=0;
for(let key in arr2)
{
arr2[key]>max? (max=arr2[key], h=Number(key)):0
}
console.log(max,h)

max>(arr.length/2)? console.log("Max time="+max, "element="+h):console.log("array does not contain  any majority element")