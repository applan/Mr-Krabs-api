# Mr-Krabs
내 재테크를 위한 개발


## 사용 한 것

- [Jira](https://applan.atlassian.net/jira/software/projects/MK/boards/1/roadmap)
- [Github](https://github.com/applan/Mr-Krabs-api)

| SoftWare     |   Use    | Version |
|--------------|:--------:|:-------:|
| `Language`   |   Java   |   11    |
| `FrameWork`  |  Spring  |  2.6.4  |
| `Build Tool` |  Gradle  |  7.4.1  |
| `DB`         | MariaDB  |  10.x   |
| `IDE`        | IntelliJ |         |
| `Project`    |   Jira   |         |
| `Version`    |  GitHub  |         |


## 요구사항 마인드 맵
> 2022-04-05에 정리

![mindMap](Mr.Krabs.jpg)

## 프로젝트 구조
- kr
  - co
    - mrkrabs
      - core
        - domain
          - dashBoard [대시보드]
          - lookup [조회]
            - all
            - out
            - in
          - bank [자산관리]
            - card
            - insurance
            - loan
            - bank book
            - cash
            - out
              - fixed
              - flex
            - in
              - salary
              - wage
          - system settings [시스템 설정]
            - menu
            - history
              - data
              - login
        - global
          - config
          - model
        - util