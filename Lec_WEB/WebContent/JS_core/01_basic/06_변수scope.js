// 변수의 유효범위
// scope

// const, let 의 유효범위
//  ==> Block Scope
//    { ... }


// 블럭
{
    const name = 'Mark' //블럭 안에서만 사용 가능
    console.log(`name=${name}`)
}

//블럭 밖에서 사용하려하면 에러!
// console.log(`name=${name}`)

{
    // console.log('name=',name) //초기화 안되었다고 에러
    const name = 'Mark'
    

}

{ //Block scope를 가진 변수는 Block 내에서 사용 가능
    console.log('value1=',value1); //에러는 아니다, undefined가 나올뿐
    
    var value1=200;
    // console.log('value2=',value2);
    //console.log('value2=', value2); //에러! 선언 된적이 없을뿐
}

// Hoisting
// https://developer.mozilla.org/ko/docs/Glossary/Hoisting

// 이러한 현상을 hoisting 이라 하는데
// hoisting 현상은 함수에서만 발생하는게 아니다.

// hoising 
// 아래에 있는 선언을(만) 끌어올린다.

// hoising 때문에 동작의 오류처럼 보이는 증상 겪게 됨

// hoising 현상은 처음부터 있었으나
// 용어 자체는 ES2015 및 그 이전에는 사용되지 않음

{
    console.log(`nick=${nick}`); //2 가hoisting됨

    nick='Mighty'; //1
    console.log(`nick=${nick}`); //1
    var nick='아이언맨'; //2

    //1. nick과 2.nick은 변수 scope가 다르다
}

age=6;
age++;
console.log('1.age=',age)

{
    console.log(`2.age=${age}`) //블럭 바깥쪽 scope의 변수 사용 가능.
    age=30
    console.log(`3.age=${age}`)
    // var age; //var은 hoisting 발생
    // let age; //let은 hoisting 이 발생 안한다.
}

console.log('4.age=',age)