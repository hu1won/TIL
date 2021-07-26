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

### 4.	Chain rule 정의하고 chain rule을 사용한 예시 미분 문제를 만들어 풀이과정을 작성하라.

### 5.	Partial derivative/differentiation을 설명하고 예시 문제를 만들어 풀이과정을 작성하라.

### 6.	Gradient descent?

최적의 가중치와 편향을 찾기위해서 학습을 진행하며 손실함수가 최솟값을 갖도록 하는 것이다. 가중치의 차원이 커질수록 이 손실함수의 최솟값을 갖는 지점을 찾는 것은 어려워진다. 기울기를 이용해서 함수의 최솟값이 어디에 있는지 찾는 것이며 이를 경사하강법이라고 한다.

### 7.	AB=C 예시 matrix multiplication문제를 만들어 풀이과정을 작성하라. A는 2x3, B는 ?x?, C는 ?x2 shape을 가지고 있다. 모델 shape은 어떤 shape을 가져야 하며, 왜 그런 shape을 가져야 하는 지 설명하라.

A = 2x3 / B = 3x2 / C = 2x2

### 8.	Input feature shape이 2차원일 경우 row와 column은 어떤 수를 의미하는지 설명하라.

### 9.	Linear function또는 linear layer은 무엇인가?   

### 10.	Activation function은 왜 필요한가?

### 11.	Forward pass, backward pass 계산 예시를 작성하라.

### 12.	Sigmoid를 그래프로 표현하고, sigmoid의 미분도 그래프로 표현하라. 

### 13.	Cross entropy function는 어떤 supervised learning 문제에 어떻게 사용되나?

### 14.	Squared error loss (제곱 에러)함수는 어떤 supervised learning문제에 사용되나?

### 15.	Entropy를 설명하라. 어떤 정보가 의미 있는 정보인가?

### 16.	Softmax는 어디에 필요하며 왜 필요한가?

### 17.	Local minima 문제를 설명하라.

### 18.	Stochastic gradient descent과 gradient descent 차이를 설명하라? 왜 stochastic gradient descent은 local minima 문제에 더 장점이 있을까?

### 19.	Training size (학습 데이터 수), batch size, epoch의 관계를 설명하라.

### 20. Relu activation function을 설명하고, sigmoid 대비 Relu의 장점을 설명하라. Hint: multi-layer model, chain rule, gradient 

참고 : https://process-mining.tistory.com/98
