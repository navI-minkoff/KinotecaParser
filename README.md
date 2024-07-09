# Kinoteca Parser

## Описание
Микросервис для внешней интеграции c [API Кинопоиска](https://api.kinopoisk.dev/documentation)
## Используемые технологии
- Spring Boot
- Spring Web
- Spring Test
- Spring Cloud OpenFeign
- Spring Data JPA
- Liquibase
- PostgreSQL
- Lombok

## Использование
1. В `application.yaml` установите личный токен для подключения к [API Кинопоиска](https://api.kinopoisk.dev/documentation). Получить токен можно [здесь](https://t.me/kinopoiskdev_bot).
    ```yaml
    kinopoisk-api:
      key: your_token_here
    ```
2. Установите значения для подключения к базе данных:
    ```yaml
   spring:
    datasource:
      driver-class-name: your_database_driver_class_name
      url: your_database_url
      username: your_database_url
      password: your_database_password
    ```
3. Запустить микросервис [KinotecaClient](https://github.com/navI-minkoff/KinotecaClient).

## Документация API
После запуска 2-х микросервисов, документация API будет доступна по следующему адресу:

> http://localhost:8082/swagger-ui/index.html

