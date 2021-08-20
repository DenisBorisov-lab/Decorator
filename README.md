# Decorator
## Декоратор - это структурный паттерн проектирования, который позволяет динамически добавлять обьектам новую функциональность.

### Шаги реализации:

1. Создать интерфейс, который описывает общие методы для основного компонента и его дополнений
2. Создать класс конкретного компонента и поместить в него основную логику
3. Создать базовый класс декораторов. Он должен иметь поле для хранения ссылки на вложенный компонент
4. Конкретный компонент и базовый класс декоратора должны имплементировать один и тот же интерфейс
5. Создать классы конкретных декораторов, которые должны наследоваться от базового класса декоратора. Конкретный класс декоратор должен выполнять свою добавочную функцию, при этом не забывая вызывать операцию обёрнутого класса.
6. Последний шаг - вызов операции у обьекта базового класса декоратора

### Преимущества и недостатки:

#### Преимущества:

1. Большая гибкость, чем у наследования 
2. Позволяет добавлять обязанности на лету 
3. Можно добавлять несколько новых обязанностей сразу
4. Позволяет иметь несколько мелких объектов вместо одного объекта на все случаи жизни

#### Недостатки:

1. Трудно конфигурировать многократно обёрнутые объекты
2. Обилие крошечных классов

### Реализация паттерна в этом проекте:

Идея проекта состоит в том, что клиент сам снаряжает своего персонажа. У аватара есть 4 характеистики: верхняя одежда, штаны, носки и кросовки. У каждого поля есть значения типа boolean. Пользователь в классе Demo указывает ссылки на те обьекты, элементы которых он бы хотел видеть на своём персонаже. Результат программы записывается в файл data.json.
