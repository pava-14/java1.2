# Отчёт о тестировании Credit Card Number Validator

## Краткое описание

27.04.2020 - 28.04.2020 было проведено дымовое  тестирование приложения Credit Card Number Validator.

На тестирование затрачено: 2 часа

В результате тестирования выявлены следующие дефекты:
* Орфографическая ошибка в тексте домашнего задания: https://github.com/pava-14/java1.2/issues/1
* Не работает ссылка в руководстве по установке IntelliJ IDEA: https://github.com/pava-14/java1.2/issues/2
* Не проходит проверку номер первой кредитной карты AmericanExpress из списка: https://github.com/pava-14/java1.2/issues/3
* Не проходит проверку номер второй кредитной карты AmericanExpress из списка: https://github.com/pava-14/java1.2/issues/4
* Не проходит проверку номер первой кредитной карты Visa (13 digit) из списка: https://github.com/pava-14/java1.2/issues/5
* Не проходит проверку номер второй кредитной карты Visa (13 digit) из списка: https://github.com/pava-14/java1.2/issues/6
* Не проходит проверку номер первой кредитной карты Maestro из списка: https://github.com/pava-14/java1.2/issues/7
* Не проходит проверку номер второй кредитной карты Maestro из списка: https://github.com/pava-14/java1.2/issues/8

## Описание процесса тестирования

В процессе тестирования использовались следующие артефакты*:
* Руководство по установке IntelliJ IDEA https://github.com/netology-code/javaqa-homeworks/blob/master/intro/idea.md
* Список номеров кредитных карт https://github.com/pava-14/java1.2/blob/master/cc_list.txt


В качестве тестовых данных использовались номера кредитных карт:
* VISA
1. 4929941954511502
2. 4024007136611083

* VisaElectron
1. 4844221854665498
2. 4917664743050145

* MasterCard
1. 5401081619375276
2. 5179484915093017

* MIR
1. 2201382000000013
2. 2200000000000061
        
* AmericanExpress
1. 340479580406549
2. 374935533381435

* Visa (13-digit)
1. 4539407299513
2. 4929228805533

* Maestro
1. 586824160825533338
2. 6799990100000000019

Ожидаемый результат на проверку номеров кредитных карт:
Result is OK - в выводе Credit Card Number Validator

Тестирование производилось в следующем окружении:
* ОС Windows 10 version 1909 64-bit
* openjdk version "11.0.7" 2020-04-14
* OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.7+10)
* OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.7+10, mixed mode)