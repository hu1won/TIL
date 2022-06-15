##Django kakao login

> Django kakao 로그인 연동


1. django-allaouth 설치 [django-allauth 사이트](https://django-allauth.readthedocs.io/en/latest/installation.html)

   1. `pip install django-allauth`

   2. settings.py 추가

      - ```python
        AUTHENTICATION_BACKENDS = (
            ...
            # Needed to login by username in Django admin, regardless of `allauth`
            'django.contrib.auth.backends.ModelBackend',
            # `allauth` specific authentication methods, such as login by e-mail
            'allauth.account.auth_backends.AuthenticationBackend',
            ...
        )
        ```

      - ```python
        INSTALLED_APPS = (
            ...
            # The following apps are required:
            'django.contrib.auth',
            'django.contrib.sites',
            'allauth',
            'allauth.account',
            'allauth.socialaccount',  
            
            #카카오
            'allauth.socialaccount.providers.kakao',
            
        )
        ```

      - ```python
        # 디폴트 SITE의 id
        # 등록하지 않으면, 각 요청 시에 host명의 Site 인스턴스를 찾습니다 .
        SITE_ID = 1
        # django-allauth setting
        LOGIN_REDIRECT_URL = 'tif:index' # 로그인 후 리디렉션할 페이지
        ACCOUNT_LOGOUT_REDIRECT_URL = "tif:index"  # 로그아웃 후 리디렉션 할 페이지
        ACCOUNT_LOGOUT_ON_GET = True # 로그아웃 버튼 클릭 시 자동 로그아웃
        ```

   3. urls.py 추가

      - ```python
        urlpatterns = [
            ...
            url(r'^accounts/', include('allauth.urls')),
            ...
        ]
        ```

   4. migrate

      - `./manage.py migrate`

   5. 카카오 연동

      - [Kakao Developers](https://developers.kakao.com/apps/135702/settings/general)/내 어플리케이션 에서 새 어플리케이션 생성
      - 일반 탭 
        - 웹 플랫폼 추가하고, 사이트 도메인에 사용할 모든 도메인을 명시 (e.g.` http://localhost:8000`)
        - Redirect Path: */accounts/kakao/login/callback/* 기입
      - 사용자 관리 탭
        - 사용자 관리 옵션 키기
        - 개인정보 관리항목의 수집목적 기입
      - 일반 탭
        - REST API 키를 복사
      - 장고 Admin 페이지 
        - Social Accounts/ Social Applications 에서 새로운 Socail Application 생성
        - provider : Kakao 선택
        - name : 원하는 이름 kakao라거나
        - client id:  REST API 복붙
        - secret key: kakao oauth 인증에서는 사용되지 않는 값, 더미값으로 none을 입력
        - sites: example.com 사이트 선택
        - 저장
