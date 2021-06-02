let x; if(foo && foo.bar && foo.bar.baz) { x = foo.bar.baz()}

let x = foo?.bar?.baz();

function print(doPrint: boolean): any { if (doPrint) { return; } console.log('print'); return { print: print }; } print(false)?.print(false)?.print(true).print(false);
// console : print
// console : print
