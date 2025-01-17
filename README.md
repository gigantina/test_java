# TZ2
![Java CI with Maven](https://github.com/gigantina/test_java/actions/workflows/maven.yml/badge.svg)

## Описание проекта
Этот проект реализует функции для работы с числами из файла: чтение, поиск минимального и максимального числа, сложение, умножение всех чисел, а также поиск моды. Также включает тесты для проверки корректности этих функций и тесты на производительность 

Проект использует CI/CD систему GitHub Actions для автоматического запуска тестов при каждом новом коммите, также их можно запустить вручную

## Функциональность
- Чтение чисел из файла
- Поиск минимального числа
- Поиск максимального числа
- Сложение всех чисел
- Умножение всех чисел
- Поиск моды

## Тестирование
Проект включает следующие тесты:
- Проверка корректности функций поиска минимума, максимума, сложения, умножения и моды
- Проверка скорости работы


## График зависимости времени (в ns) от количества чисел в файле на примере функции _summ
![График](https://github.com/gigantina/test_java/blob/origin/image.png)
Асимптотика функции _summ - O(n)

## CI/CD
Проект настроен для автоматического запуска тестов при каждом новом коммите с использованием GitHub Actions. Также можно нажать на кнопку Re-run all jobs, чтобы проверить его вручную

### Уведомления в Telegram
Проект настроен для отправки уведомлений в Telegram о результатах тестов. Был создан телеграм-канал, куда бот отправляет резульат работы. При успешном выполнении выводится сообщение, что тесты пройдены успешно. В противном случае - информация об ошибках
Ссылка на канал: https://t.me/tz2channel

