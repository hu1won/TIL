### 1.	Supervised learning과 unsupervised learning의 차이

Supervised Learning은 한 줄로 요약하면 맞춰야 하는 값이 있는 것을 말한다.

##### •	분류: 예측하는 값이 Categorical한 것을 말한다. 이 예측하는 값은 합격여부처럼 예/아니오로 답이 나올 수도 있고, 어떤 사람의 출신 지역을 예측하는 것처럼 여러 가지 값이 될 수도 있다. 이 때, 앞의 경우처럼 예측 값이 두 개인 경우를 binary classifiaction, 뒤의 경우를 multi-class classification이라고 한다. 이의 예시로는 Supoort Vector Machine, Logistic Regression 등이 있다.

##### •	회귀: 예측하는 값이 Continuous한 것을 말한다. 위에서 든 예시처럼 집값이 얼마가 될지 예측하는 것 등이 이에 해당한다.

Unsupervised Learning은 supervised learning과 반대되는 개념으로, 맞춰야 하는 target value(label)가 없는 것을 말한다. label이 없는 것에 대한 문제를 해결하는 것을 unsupervised learning이라고 한다. 이에는 다음과 같은 것들이 포함된다.

##### •	Clustering: 위에서 든 예시와 같이 비슷한 것들을 묶는 것을 말한다. K-means clustering, DBSCAN, SOM 등 다양한 알고리즘들이 존재한다.

##### •	Association Rule (연관 규칙): 어떤 사건이 얼마나 자주 함께 발생하는지, 서로 얼마나 연관되어 있는지를 분석하는 것을 말한다. 

### 2.	Loss function이 왜 필요한가?

손실함수는 신경망을 학습할 때 학습 상태에 대해 측정하는 하나의 지표로 사용한다. 신경망의 가중치 매개변수들이 스스로 특징을 찾아 가기에 이 가중치 값의 최적이 될 수 있도록 해야 하며 잘 찾아가고 있는지 볼 때 손실 함수를 보는 것이다.

### 3.	Feature과 label/groundtruth이 무엇인지 예시를 들어 설명하라.

Feature - 샘플을 잘 설명하는 특징, 특성 ( 선형 회귀의 x 변수 )

Label - 예측하는 항목 ( 선형 회귀의 y 변수 )

##### 정답지라고도 불리듯이 답이 명확하게 정해져 있는 값이다.

![realcat](https://user-images.githubusercontent.com/71807924/126958531-9abae963-3253-46f9-a7d0-137aa7a87c56.jpg)

ground-truth - 기상학에서 유래된 용어로 어느한 장소에서 수집된 정보를 의미합니다.

#####  '우리가 정한 정답', '우리의 모델이 우리가 원하는 답으로 예측해주길 바라는 답'

##### 예를 들어, 아래 사진이 모델을 훈련시킬 데이터로 사용된다고 해보자. 사진은 고양이 분장을 한 사람이다. 이 사진에 대한 label, 즉 정답은 없다. 사람인 것도, 고양인 것도 아니다. 하지만 우리는 우리의 분류모델이 이를 '고양이'로 분류하길 원한다. 그리하여 이 데이터에 대한 "ground-truth" 값은 우리가 원하는 답인 '고양이'가 된다.

![cat](https://user-images.githubusercontent.com/71807924/126957802-adf2a42b-78a3-4aa7-8131-7b962eef0d60.PNG)

### 4.	Chain rule 정의하고 chain rule을 사용한 예시 미분 문제를 만들어 풀이과정을 작성하라.

chain rule - 두 함수를 합성한 합성 함수의 도함수(derivative)에 관한 공식이다.

함수 y = f(x)와 함수 z = g(y)를 합성한 함수 ![11](https://user-images.githubusercontent.com/71807924/126959406-1ac1074b-eb21-4b2e-97c7-c1f684478737.PNG) 의 미분법은 다음과 같다.

![22](https://user-images.githubusercontent.com/71807924/126959468-743d388f-1fbb-4fa8-a55e-fe90c31abfbd.PNG)

위의 식에서의 g'(y) = g'(f(x))를 뜻하고, 두 함수 f(x), g(y)가 모두 미분가능한 함수라는 것을 가정한다. 

합성 함수의 미분 공식은 다음과 같이 쓸 수 있다.

![33](https://user-images.githubusercontent.com/71807924/126959542-98a7e644-1301-4940-9b2c-e79255677248.PNG)

이와 같이 그 공식이 마치 사슬이 이어져 있는 것 같다 해서, 합성함수의 미분 공식을 연쇄법칙이라고도 한다.

##### chain rule = 연쇄법칙 = 합성함수의 미분법. 

##### 합성함수의 미분은 합성함수를 구성하는 각 함수의 미분으로 곱으로 나타낼 수 있다.

예시 - ![44](https://user-images.githubusercontent.com/71807924/126959786-9c789b85-b387-477f-a13b-5ad1c3f29061.PNG)

위와 같은 합성 함수가 있다. 이 식은 아래와 같이 두 개의 식으로 나눌 수 있다.

![55](https://user-images.githubusercontent.com/71807924/126959991-9459f5f6-5e98-4701-a331-08061878046d.PNG)

여기서 chain rule은

![33](https://user-images.githubusercontent.com/71807924/126960300-71525e94-6bed-4cd6-8ffd-3648f3bd5e1b.PNG)

dz가 각각 분모와 분자에 있어서 삭제해보면? 왼쪽 부분과 똑같은 모습이 된다. dL/dx를 따로 구하지말고, dL/dz와 dz/dx를 구해놓고 그걸 곱하면 dL/dx가 된다는 것이다.

L은 최종 출력값, z는 function에서 내보낸 값.

(x에 대해 편미분) = 1 (x에 대한 편미분이라 y는 상수로 취급되어서 값이 0이 되고, x의 지수인 1만 폴짝 뛰어내려서 1이 된다.)

(y에 대해 편미분) = 1 (y에 대한 미분이라 x는 상수로 취급, 값이 0이 되고, y의 지수인 1만 폴짝 뛰어내려서 1이 된다.)

feedforward를 할 때 수식은 x * W + b이다. ReLU를 제외하고 일단 이 부분만 backprop으로 구현해보면..

![66](https://user-images.githubusercontent.com/71807924/126960565-7091bfb3-6ea1-471d-b2c7-04ad362a1ee5.PNG)

Backprop에서 cs231n의 lecture 4의 정리를 보면..

add gate : gradient distributor 

max gate : gradient router

mul gate : gradient switcher (mul = multiplication)

y 에서 b로 갈때에는 dz/dz (이건 gradient다.) 이므로 1이 된다. 둘 다 값이 같으니까.  (그런데 dL/dz가 되면 다를 수 있다.)

+b에서 multiplication node로 갈 때, add 연산은 그냥 흘려보낸다. 뭘 하든 multiplication node 1이기 때문에 그냥 같은 값을 보내면 된다. 

multiplication node에서 x로 갈 때와 W로 갈 때에는 x로 보낼때는 W값 multiplication node 흘러들어온 값을, W로 보낼때는 x값 multiplication node 흘러들어온 값을 해서 보낸다. 

(위의 mul gate가 gradient switcher라고 불리는 이유)

그래서 x = W multiplication node 흘러들어온 값(여기에서는 1) 이 되고, W = x multiplication node 흘러들어온 값이 되어서, x로 보내지는 값은 W, W로 보내지는 값은 x가 된다. 

### 5.	Partial derivative/differentiation을 설명하고 예시 문제를 만들어 풀이과정을 작성하라.

### 6.	Gradient descent?

최적의 가중치와 편향을 찾기위해서 학습을 진행하며 손실함수가 최솟값을 갖도록 하는 것이다. 가중치의 차원이 커질수록 이 손실함수의 최솟값을 갖는 지점을 찾는 것은 어려워진다. 기울기를 이용해서 함수의 최솟값이 어디에 있는지 찾는 것이며 이를 경사하강법이라고 한다.

### 7.	AB=C 예시 matrix multiplication문제를 만들어 풀이과정을 작성하라. A는 2x3, B는 ?x?, C는 ?x2 shape을 가지고 있다. 모델 shape은 어떤 shape을 가져야 하며, 왜 그런 shape을 가져야 하는 지 설명하라.

A = 2x3 / B = 3x2 / C = 2x2

### 8.	Input feature shape이 2차원일 경우 row와 column은 어떤 수를 의미하는지 설명하라.

row - 예측 클래스 수

column - 실제 클래스 수

### 9.	Linear function또는 linear layer은 무엇인가?   

### 10.	Activation function은 왜 필요한가?

활성화 함수 (activation function)은 신경망의 output을 결정하는 식(equation)입니다.

각 뉴런은 가중치(weight)를 가지고 있으며 이것은 input number와 곱해져 다음 레이어로 전달하게 됩니다.

이때, 활성화 함수는 현재 뉴런의 input을 feeding 하여 생성된 output이 다음 레이어로 전해지는 과정 중 역할을 수행하는 수학적인 게이트(gate)라고 할 수 있습니다.

이 함수들은 신경망의 각 뉴런(neuron)에 붙어 있으며 뉴런의 input이 모델의 예측과 관련이 있는지 없는지를 근거로 이것을 활성화할지 활성화하지 않을지 결정합니다.

또한, 활성화 함수는 각 뉴런의 output을 0과 1 또는 -1과 1 사이로 normalization 하여 모델이 복잡한 데이터를 학습하는 데 도움을 줍니다.

### 11.	Forward pass, backward pass 계산 예시를 작성하라.

### 12.	Sigmoid를 그래프로 표현하고, sigmoid의 미분도 그래프로 표현하라. 

sigmoid 그래프

![image](https://user-images.githubusercontent.com/71807924/126963184-e31b9101-663b-49d9-af46-142d5a33931d.png)

sigmoid 미분 그래프

![image](https://user-images.githubusercontent.com/71807924/126962978-9550428c-6b30-43f6-83b8-91637af8d59f.png)


### 13.	Cross entropy function는 어떤 supervised learning 문제에 어떻게 사용되나?

### 14.	Squared error loss (제곱 에러)함수는 어떤 supervised learning문제에 사용되나?

### 15.	Entropy를 설명하라. 어떤 정보가 의미 있는 정보인가?

### 16.	Softmax는 어디에 필요하며 왜 필요한가?

### 17.	Local minima 문제를 설명하라.

### 18.	Stochastic gradient descent과 gradient descent 차이를 설명하라? 왜 stochastic gradient descent은 local minima 문제에 더 장점이 있을까?

### 19.	Training size (학습 데이터 수), batch size, epoch의 관계를 설명하라.

### 20. Relu activation function을 설명하고, sigmoid 대비 Relu의 장점을 설명하라. Hint: multi-layer model, chain rule, gradient 

참고 : https://process-mining.tistory.com/98
       https://eair.tistory.com/16
       https://lee-soohyun.tistory.com/25
       https://developers.google.com/machine-learning/glossary?hl=ko
