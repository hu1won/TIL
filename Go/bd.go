package main

import "fmt"
import "math"

//const는 상수 값을 선언합니다.
const s string = "constant"

func main(){

  fmt.Println(s)

  //const문은 어디서나 var문 캔을 표시 할 수 있습니다.
  const n = 500000000

  //상수 표현식은 임의의 정밀도로 산술 연산을 수행합니다.
  const d = 3e20 / n
  fmd.Println(d)

  //숫자 상수는 명시적 형변환과 같이 하나가 주어질 때까지 유형이 없습니다.
  fmt.Println(int64(d))

  //숫자에는 변수 할당이나 함수 호출과 같은 컨텍스트에서이를 사용하여 유형을 지정할 수 있습니다. 예를 들어, 여기 math.Sin은 float64를 예상합니다.
  fmt.Println(math.Sin(n))

}
