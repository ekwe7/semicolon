//return array for every 1st later capitalized

function capitalizedLater(str){
return str.replace(/\b[a-z]/gi, function(zeze){
return zeze.toUpperCase();
})
}

let output = capitalizedLater('welcome to semicolon');
console.log(output);
