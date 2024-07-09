# Kinoteca Parser

## Описание
Микросервис для маршрутизации запросов в микросервис [KinotecaClient](https://github.com/navI-minkoff/KinotecaClient) для интеграции c [API Кинопоиска](https://api.kinopoisk.dev/documentation)
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
```
http://localhost:8082/swagger-ui/index.html
```
#   K i n o t e c a P a r s e r  
 #   K i n o t e c a P a r s e r  
 g i t  
 i n i t  
 g i t  
 c o m m i t  
 - m  
 f u l l   p r o j e c t  
 g i t  
 b r a n c h  
 - M  
 m a i n  
 g i t  
 r e m o t e  
 a d d  
 o r i g i n  
 h t t p s : / / g i t h u b . c o m / n a v I - m i n k o f f / K i n o t e c a P a r s e r . g i t  
 g i t  
 p u s h  
 - u  
 o r i g i n  
 m a i n  
 