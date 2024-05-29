스텝 카운터
============

단계를 기록하고 다시 읽는 방법에 대한 간단한 예입니다.

소개
------------

전제조건
--------------

- Android API 레벨 >= 14
- Android 빌드 도구 v29
- 안드로이드 지원 저장소
- 시작 지침에 따라 Android 클라이언트에 Google 프로젝트 등록
  http://developers.google.com/fit/android/get-started

시작하기
---------------
이 샘플은 Gradle 빌드 시스템을 사용합니다. 이 프로젝트를 구축하기 위해서는
"gradlew build" 명령을 수행하거나 Android Studio에서 "Import Project"를 사용합니다.

참고: Google Fit을 사용하려면 Google 프로젝트 아래에 Android 클라이언트를 등록해야 합니다
API는 앱에서 사용할 수 있습니다. 이 과정은 앱에 적절한 동의 화면이 있는지 확인합니다
구글 API에 액세스하기 위해 필요한 것들 중 사용자가 수용할 수 있는 정보.
자세한 내용은 설명서를 참조하십시오. http://developers.google.com/fit/android/get-started

지지해요
-------

이 샘플들을 사용하는 가장 일반적인 문제는 SIGN_IN_FAILED 예외입니다. 사용자가 경험할 수 있는
Fit API에 연결할 Google 계정을 선택한 후 logcat에 오류가 표시됩니다.

이 오류가 발생하면 다음 단계를 확인합니다:

1. Android 클라이언트를 등록하려면 http://developers.google.com/fit/android/get-started 의 지침을 따릅니다.
1. 클라우드 프로젝트에 [Fit API](https://console.developers.google.com/apis/api/fitness.googleapis.com/overview) 가 활성화되어 있는지 확인합니다.
1. 클라우드 프로젝트에 대해 [cred 자격 증명](https://console.developers.google.com/apis/api/fitness.googleapis.com/credentials) 을 확인하십시오:
- 자격 증명의 ** 패키지 이름**가 샘플과 일치하는지 확인합니다.
- **package name**가 'app/build.gradle' 파일의 'applicationId'와 일치하는지 확인합니다.
- **Signing-Certificate fingerprint**가 올바르게 입력되었는지 확인합니다.

지원을 위해 다음 채널을 사용합니다:

- 스택 오버플로: http://stackoverflow.com/questions/tagged/android

이 샘플에서 오류를 발견한 경우 다음과 같은 문제를 제기하십시오:
https://github.com/android/fit

패치는 권장되며 CONTRIB.md 의 지침에 따라 제출할 수 있습니다.