# История изменений

## [1.1.9] 4.08.24
Повышение абстракции для кастомного BeanPostProcessor: <br>добавлена аннотация на метод, из которого вытаскивается возвращаемый тип DTO

## [1.1.8] 1.08.24 
Повышение абстракции для блока кода, где осуществлялась трансформация из DTO в Entity:<br>
-Уход от if-else;<br>
-Повышение гибкости кода;<br>
-Предовтращение дальнейшего дублирования кода при добавления новых entity и dto.

## [1.1.7] 22.07.24
Добавлен Liquibase.

## [1.1.6] 22.07.24
Изменено имя сущности и всё его сопутствующее.

## [1.1.5] 22.07.24
-Добавлена новая сущность Vacation для потока в брокер ActiveMQ для реализации связи OneToMany;<br>
-Реализованы DTO сущности для разграничения от бизнес сущностей.

## [1.1.4] 11.07.24
Минорный рефакторинг приложения.

## [1.1.3] 11.07.24
Изменена апи к сервису, добавлен Swagger.

## [1.1.2] 10.07.24
-Изменен способ вставки в мапу с асихронного на сихронный для потока в кэш;<br>
-Добавлено подключение к JMX для hazelcast;<br>
-Изменение java версии на корректную (17);<br>
-Изменение имен для entity сущностей.

## [1.1.1] 10.07.24
Минорный рефакторинг приложения.

## [1.1.0] 10.07.24
Рефакторинг приложения, изменения типа архитектуры приложения с упаковки по предметной области на упаковку по уровням.