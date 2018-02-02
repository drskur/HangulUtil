# HangulUtil


## java.text.Normalizer
 Java 6부터 추가된 Normalizer는 한글 자동완성을 처리하기에 적합한 방법이 아닙니다.
 
 ```scala
  import java.text.Normalizer
  
  val str = "한글"
  val q1 = "ㅎ"
  val q2 = "하"
  
  val nfdStr = Normalizer.normalize(str, Normalizer.Form.NFD)
  
  
  val nfdQ1 = Normalizer.normalize(q1, Normalizer.Form.NFD)
  val nfdQ2 = Normalizer.normalize(q2, Normalizer.Form.NFD)
  
  nfdStr.startsWith(nfdQ1)
  // false
  
  nfdStr.startsWith(nfdQ2)
  // true
  
  val nfkdStr = Normalizer.normalize(str, Normalizer.Form.NFKD)
  
  val nfkdQ1 = Normalizer.normalize(q1, Normalizer.Form.NFKD)
  val nfkdQ2 = Normalizer.normalize(q2, Normalizer.Form.NFKD)
  
  nfkdStr.startsWith(nfkdQ1)
  // true
  
  nfkdQ2.startsWith(nfkdQ2)
  // true
 ```
 
  ```scala
   import java.text.Normalizer
   
   val str = "가로수"
   val q1 = "갈"
   val q2 = "가로"
   
   val nfkdStr = Normalizer.normalize(str, Normalizer.Form.NFKD)
   
   val nfkdQ1 = Normalizer.normalize(q1, Normalizer.Form.NFKD)
   val nfkdQ2 = Normalizer.normalize(q2, Normalizer.Form.NFKD)
   
   nfkdStr.startsWith(nfkdQ1)
   // false
   
   nfkdQ2.startsWith(nfkdQ2)
   // true
  ```
  
## HangulUtil

### disassemble

```scala
import com.github.drskur.HangulUtil.implicits._

val str1 = "한글"
val q1 = "ㅎ"
val q2 = "하"

val str2 = "가로수"
val q3 = "갈"

str1.disassemble
// ㅎㅏㄴㄱㅡㄹ

str1.disassemble.startsWith(q1.disassemble)
// true

str1.disassemble.startsWith(q2.disassemble)
// true

str2.disassemble.startsWith(q3.disassemble)
// true

```

### quertyToJaso

```scala
import com.github.drskur.HangulUtil.implicits._

val str = "한글"
val q = "gksr"

q.quertyToJaso
// ㅎㅏㄴㄱ

str.startsWith(q.quertyToJaso)
// true

```