# Как стать биохимиком в лонжевити

Антиэйдж-биохимик исследует процессы старения на молекулярном уровне, разрабатывает новые физикохимические способы исследования и модификации этих процессов.

Примеры задач:

1. Разработка молекулярного комплекса, который способен разлагать конечные продукты гликирования в межклеточном матриксе, и при этом не разрушает сами клетки и легко доставим в место своей реакции.
1. Поиск эффективных методов картирования эпигенома в различных тканях организма

Вот последовательность курсов для получения знаний необходимых биохимику. Первая диаграмма соответствует университетскому подходу, в котором студенты начинают изучение с базовых и простых предметов и с каждым семестром переходят на все более сложные и специализированные предметы и темы.

```mermaid
flowchart LR
  subgraph year1 [1 курс]
  Общая_химия[Общая химия]:::href
  Компьютерный_инструментарий[Компьютерный инструментарий]:::href
  Механика[Механика]:::href
  Информатика[Информатика]:::href
  Математический_анализ[Математический анализ]:::href
  Неорганическая_химия[Неорганическая химия]:::href
  Линейная_алгебра[Линейная алгебра]:::href
  Теоретическая_неорганическая_химия[Теоретическая неорганическая химия]:::href
  end

  subgraph year2 [2 курс]
  Теоретическая_механика[Теоретическая механика]:::href
  Теория_вероятностей[Теория вероятностей]:::href
  Реальная_структура_твердого_тела[Реальная структура твердого тела]:::href
  Уравнения_математической_физики[Уравнения математической физики]:::href
  Дифференциальные_уравнения[Дифференциальные уравнения]:::href
  Теория_поля[Теория поля]:::href
  Аналитическая_химия[Аналитическая химия]:::href
  Математическая_статистика[Математическая статистика]:::href
  Оптика[Оптика]:::href
  Биоинформатика[Биоинформатика]:::href
  Аналитическая_биохимия[Аналитическая биохимия]:::href
  end

  subgraph year3 [3 курс]
  Квантовая_механика[Квантовая механика]:::href
  Физиология[Физиология]:::href
  Строение_вещества[Строение вещества]:::href
  Кристаллохимия[Кристаллохимия]:::href
  Патофизиология[Патофизиология]:::href
  Квантовая_химия[Квантовая химия]:::href
  Иммунология[Иммунология]:::href
  Строение_молекул[Строение молекул]:::href
  Математические_методы_химии[Математические методы химии]:::href
  Органическая_химия[Органическая химия]:::href
  Статистическая_физика[Статистическая физика]:::href
  end

  subgraph year4 [4 курс]
  Физическая_химия[Физическая химия]:::href
  Химическая_термодинамика[Химическая термодинамика]:::href
  end

  subgraph year5 [5 курс]
  Язык_программирования_С++[C++]:::href
  Язык_R[Язык R]:::href
  Язык_SQL[Язык SQL]:::href
  end

  subgraph year6 [6 курс]
  Онкология[Онкология]:::href
  end

  

  Общая_химия -.-> Неорганическая_химия
  Квантовая_механика -.-> Квантовая_химия
  Компьютерный_инструментарий -.-> Язык_программирования_С++
  Компьютерный_инструментарий -.-> Язык_R
  Компьютерный_инструментарий -.-> Язык_SQL
  Теоретическая_механика -.-> Теория_поля
  Теоретическая_механика -.-> Физическая_химия
  Теоретическая_механика -.-> Квантовая_механика
  Физиология -.-> Иммунология
  Физиология -.-> Патофизиология
  Строение_вещества -.-> Строение_молекул
  Теория_вероятностей -.-> Математическая_статистика
  Механика -.-> Оптика
  Механика -.-> Теоретическая_механика
  Реальная_структура_твердого_тела -.-> Строение_вещества
  Кристаллохимия -.-> Реальная_структура_твердого_тела
  Патофизиология -.-> Онкология
  Уравнения_математической_физики -.-> Физическая_химия
  Квантовая_химия -.-> Строение_молекул
  Информатика -.-> Биоинформатика
  Информатика -.-> Компьютерный_инструментарий
  Математический_анализ -.-> Уравнения_математической_физики
  Математический_анализ -.-> Дифференциальные_уравнения
  Математический_анализ -.-> Теория_поля
  Математический_анализ -.-> Математические_методы_химии
  Неорганическая_химия -.-> Теоретическая_неорганическая_химия
  Неорганическая_химия -.-> Аналитическая_химия
  Неорганическая_химия -.-> Физическая_химия
  Неорганическая_химия -.-> Кристаллохимия
  Неорганическая_химия -.-> Органическая_химия
  Дифференциальные_уравнения -.-> Уравнения_математической_физики
  Теория_поля -.-> Квантовая_механика
  Аналитическая_химия -.-> Аналитическая_биохимия
  Физическая_химия -.-> Химическая_термодинамика
  Линейная_алгебра -.-> Теория_вероятностей
  Математическая_статистика -.-> Статистическая_физика
  

  classDef cond stroke-dasharray:3,opacity:0.8
  classDef href color:#0969D7

  class Анатомия,Высшая_математика,Информатика,Общая_биология,Общая_физика,Общая_химия cond

  click Алгоритмы_в_биоинформатике href "https://github.com/prozion/anti-aging-education/blob/main/pages/Алгоритмы_в_биоинформатике.md" _blank
  click Альгология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Альгология.md" _blank
  click Аналитическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Аналитическая_химия.md" _blank
  click Аналитическая_биохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Аналитическая_биохимия.md" _blank
  click Аналитическая_геометрия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Аналитическая_геометрия.md" _blank
  click Анатомия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Анатомия.md" _blank
  click Антитела_и_их_использование_в_биохимических_исследованиях href "https://github.com/prozion/anti-aging-education/blob/main/pages/Антитела_и_их_использование_в_биохимических_исследованиях.md" _blank
  click Антропология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Антропология.md" _blank
  click Белковая_инженерия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Белковая_инженерия.md" _blank
  click Биоинформатика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биоинформатика.md" _blank
  click Биоинженерия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биоинженерия.md" _blank
  click Биологическая_статистика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биологическая_статистика.md" _blank
  click Биология_опухолевой_клетки href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биология_опухолевой_клетки.md" _blank
  click Биология_развития_дрозофилы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биология_развития_дрозофилы.md" _blank
  click Биометрия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биометрия.md" _blank
  click Бионеорганическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Бионеорганическая_химия.md" _blank
  click Биофизика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биофизика.md" _blank
  click Биофизика_мембран href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биофизика_мембран.md" _blank
  click Биофизика_мембранного_транспорта href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биофизика_мембранного_транспорта.md" _blank
  click Биофизика_регуляторных_процессов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биофизика_регуляторных_процессов.md" _blank
  click Биофизические_методы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биофизические_методы.md" _blank
  click Биотехнология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биотехнология.md" _blank
  click Биохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биохимия.md" _blank
  click Биохимия_растений href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биохимия_растений.md" _blank
  click Биохимические_процессы_в_клетках href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биохимические_процессы_в_клетках.md" _blank
  click Биоэнергетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биоэнергетика.md" _blank
  click Биоэтика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биоэтика.md" _blank
  click Ботаника href "https://github.com/prozion/anti-aging-education/blob/main/pages/Ботаника.md" _blank
  click Ботаника_высших_растений href "https://github.com/prozion/anti-aging-education/blob/main/pages/Ботаника_высших_растений.md" _blank
  click Ботаника_низших_растений href "https://github.com/prozion/anti-aging-education/blob/main/pages/Ботаника_низших_растений.md" _blank
  click Вирусология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Вирусология.md" _blank
  click Возрастная_анатомия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Возрастная_анатомия.md" _blank
  click Высокомолекулярные_соединения href "https://github.com/prozion/anti-aging-education/blob/main/pages/Высокомолекулярные_соединения.md" _blank
  click Высшие_растения href "https://github.com/prozion/anti-aging-education/blob/main/pages/Высшие_растения.md" _blank
  click Высшая_математика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Высшая_математика.md" _blank
  click Генетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Генетика.md" _blank
  click Генетика_микроорганизмов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Генетика_микроорганизмов.md" _blank
  click Генетика_человека href "https://github.com/prozion/anti-aging-education/blob/main/pages/Генетика_человека.md" _blank
  click Генетическая_инженерия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Генетическая_инженерия.md" _blank
  click Геносистематика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Геносистематика.md" _blank
  click Геронтологические_особенности_органов_и_систем href "https://github.com/prozion/anti-aging-education/blob/main/pages/Геронтологические_особенности_органов_и_систем.md" _blank
  click Геронтология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Геронтология.md" _blank
  click Гистология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Гистология.md" _blank
  click Диагностика_наноматериалов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Диагностика_наноматериалов.md" _blank
  click Дизайн_лекарств href "https://github.com/prozion/anti-aging-education/blob/main/pages/Дизайн_лекарств.md" _blank
  click Динамическая_биохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Динамическая_биохимия.md" _blank
  click Дискретная_математика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Дискретная_математика.md" _blank
  click Дифференциальные_уравнения href "https://github.com/prozion/anti-aging-education/blob/main/pages/Дифференциальные_уравнения.md" _blank
  click Зоология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Зоология.md" _blank
  click Зоология_беспозвоночных href "https://github.com/prozion/anti-aging-education/blob/main/pages/Зоология_беспозвоночных.md" _blank
  click Зоология_позвоночных href "https://github.com/prozion/anti-aging-education/blob/main/pages/Зоология_позвоночных.md" _blank
  click Изучение_реакций_на_молекулярном_и_наноразмерном_уровне href "https://github.com/prozion/anti-aging-education/blob/main/pages/Изучение_реакций_на_молекулярном_и_наноразмерном_уровне.md" _blank
  click Иммунобиотехнология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Иммунобиотехнология.md" _blank
  click Иммунология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Иммунология.md" _blank
  click Инженерная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Инженерная_биология.md" _blank
  click Инженерная_энзимология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Инженерная_энзимология.md" _blank
  click Интегративные_механизмы_диабета href "https://github.com/prozion/anti-aging-education/blob/main/pages/Интегративные_механизмы_диабета.md" _blank
  click Информатика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Информатика.md" _blank
  click Информационная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Информационная_биология.md" _blank
  click Искусственный_интеллект_в_химии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Искусственный_интеллект_в_химии.md" _blank
  click История_и_методология_биологии href "https://github.com/prozion/anti-aging-education/blob/main/pages/История_и_методология_биологии.md" _blank
  click История_и_методология_химии href "https://github.com/prozion/anti-aging-education/blob/main/pages/История_и_методология_химии.md" _blank
  click Кариология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кариология.md" _blank
  click Квантовая_биохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Квантовая_биохимия.md" _blank
  click Квантовая_механика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Квантовая_механика.md" _blank
  click Квантовая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Квантовая_химия.md" _blank
  click Квантовомеханические_расчеты_в_неорганической_химии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Квантовомеханические_расчеты_в_неорганической_химии.md" _blank
  click Кинетика_биотехнологических_процессов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кинетика_биотехнологических_процессов.md" _blank
  click Кинетика_ферментативных_реакций href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кинетика_ферментативных_реакций.md" _blank
  click Кинетика_и_механизмы_образования_макромолекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кинетика_и_механизмы_образования_макромолекул.md" _blank
  click Кинетика_процессов_на_межфазных_границах href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кинетика_процессов_на_межфазных_границах.md" _blank
  click Кинетика_реакций_в_конденсированной_фазе href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кинетика_реакций_в_конденсированной_фазе.md" _blank
  click Клеточная_инженерия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Клеточная_инженерия.md" _blank
  click Клеточный_цикл_и_клеточная_гибель href "https://github.com/prozion/anti-aging-education/blob/main/pages/Клеточный_цикл_и_клеточная_гибель.md" _blank
  click Коллоидная_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Коллоидная_химия.md" _blank
  click Комбинаторика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Комбинаторика.md" _blank
  click Компьютерный_дизайн_лекарственных_веществ href "https://github.com/prozion/anti-aging-education/blob/main/pages/Компьютерный_дизайн_лекарственных_веществ.md" _blank
  click Компьютерный_инструментарий href "https://github.com/prozion/anti-aging-education/blob/main/pages/Компьютерный_инструментарий.md" _blank
  click Компьютерные_методы_в_биологических_исследованиях href "https://github.com/prozion/anti-aging-education/blob/main/pages/Компьютерные_методы_в_биологических_исследованиях.md" _blank
  click Кристаллохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кристаллохимия.md" _blank
  click Культивирование_микроорганизмов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Культивирование_микроорганизмов.md" _blank
  click Лабораторная_техника href "https://github.com/prozion/anti-aging-education/blob/main/pages/Лабораторная_техника.md" _blank
  click Лазерная_спектроскопия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Лазерная_спектроскопия.md" _blank
  click Лазерная_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Лазерная_химия.md" _blank
  click Линейная_алгебра href "https://github.com/prozion/anti-aging-education/blob/main/pages/Линейная_алгебра.md" _blank
  click Математическая_статистика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Математическая_статистика.md" _blank
  click Математические_методы_химии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Математические_методы_химии.md" _blank
  click Математический_анализ href "https://github.com/prozion/anti-aging-education/blob/main/pages/Математический_анализ.md" _blank
  click Математическое_моделирование_клеточного_метаболизма href "https://github.com/prozion/anti-aging-education/blob/main/pages/Математическое_моделирование_клеточного_метаболизма.md" _blank
  click Математическое_описание_биологических_процессов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Математическое_описание_биологических_процессов.md" _blank
  click Машинное_обучение href "https://github.com/prozion/anti-aging-education/blob/main/pages/Машинное_обучение.md" _blank
  click Медицинская_биохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Медицинская_биохимия.md" _blank
  click Медицинская_биотехнология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Медицинская_биотехнология.md" _blank
  click Медицинская_биофизика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Медицинская_биофизика.md" _blank
  click Медицинская_информатика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Медицинская_информатика.md" _blank
  click Медицинская_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Медицинская_химия.md" _blank
  click Межмолекулярные_взаимодействия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Межмолекулярные_взаимодействия.md" _blank
  click Мембранные_органеллы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Мембранные_органеллы.md" _blank
  click Метаболическое_моделирование href "https://github.com/prozion/anti-aging-education/blob/main/pages/Метаболическое_моделирование.md" _blank
  click Методы_анализа_и_визуализации_в href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_анализа_и_визуализации_в.md" _blank
  click Методы_выделения_и_очистки_биомолекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_выделения_и_очистки_биомолекул.md" _blank
  click Методы_иммунохимии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_иммунохимии.md" _blank
  click Методы_исследования_материалов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_исследования_материалов.md" _blank
  click Методы_исследования_биологических_макромолекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_исследования_биологических_макромолекул.md" _blank
  click Методы_исследования_единичных_макромолекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_исследования_единичных_макромолекул.md" _blank
  click Методы_микроскопии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_микроскопии.md" _blank
  click Методы_работы_с_экспериментальными_животными href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_работы_с_экспериментальными_животными.md" _blank
  click Методы_синтеза_и_модификации_гетероциклических_соединений href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_синтеза_и_модификации_гетероциклических_соединений.md" _blank
  click Методы_физической_биохимии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Методы_физической_биохимии.md" _blank
  click Механизмы_трансформации_энергии_в_нативных_и_гибридных_системах href "https://github.com/prozion/anti-aging-education/blob/main/pages/Механизмы_трансформации_энергии_в_нативных_и_гибридных_системах.md" _blank
  click Механизмы_ферментативного_катализа href "https://github.com/prozion/anti-aging-education/blob/main/pages/Механизмы_ферментативного_катализа.md" _blank
  click Механизмы_ферментативных_реакций href "https://github.com/prozion/anti-aging-education/blob/main/pages/Механизмы_ферментативных_реакций.md" _blank
  click Механика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Механика.md" _blank
  click Микология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Микология.md" _blank
  click Микробиология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Микробиология.md" _blank
  click Моделирование_биологических_процессов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Моделирование_биологических_процессов.md" _blank
  click Моделирование_структур_биополимеров href "https://github.com/prozion/anti-aging-education/blob/main/pages/Моделирование_структур_биополимеров.md" _blank
  click Моделирование_в_системной_биологии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Моделирование_в_системной_биологии.md" _blank
  click Молекулярная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биология.md" _blank
  click Молекулярная_биология_гена href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биология_гена.md" _blank
  click Молекулярная_биология_клетки href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биология_клетки.md" _blank
  click Молекулярная_биология_митохондрий href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биология_митохондрий.md" _blank
  click Молекулярная_биоинженерия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биоинженерия.md" _blank
  click Молекулярная_биотехнология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биотехнология.md" _blank
  click Молекулярная_биоэнергетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биоэнергетика.md" _blank
  click Молекулярная_визуализация href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_визуализация.md" _blank
  click Молекулярная_генетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_генетика.md" _blank
  click Молекулярная_иммунология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_иммунология.md" _blank
  click Молекулярные_основы_биологических_функций href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярные_основы_биологических_функций.md" _blank
  click Нанобиотехнология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Нанобиотехнология.md" _blank
  click Нанохимия_и_нанотехнологии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Нанохимия_и_нанотехнологии.md" _blank
  click Нанобиоматериалы_и_нанобиотехнологии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Нанобиоматериалы_и_нанобиотехнологии.md" _blank
  click Научное_исследование href "https://github.com/prozion/anti-aging-education/blob/main/pages/Научное_исследование.md" _blank
  click Нейробиология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Нейробиология.md" _blank
  click Нейрофизиология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Нейрофизиология.md" _blank
  click Неорганическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Неорганическая_химия.md" _blank
  click Неорганический_синтез href "https://github.com/prozion/anti-aging-education/blob/main/pages/Неорганический_синтез.md" _blank
  click Низкомолекулярные_биорегуляторы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Низкомолекулярные_биорегуляторы.md" _blank
  click Общая_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Общая_биология.md" _blank
  click Общая_физика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Общая_физика.md" _blank
  click Общая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Общая_химия.md" _blank
  click Онкоиммунология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Онкоиммунология.md" _blank
  click Онкология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Онкология.md" _blank
  click Оптика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Оптика.md" _blank
  click Оптимизация_структурных_прототипов_лекарств href "https://github.com/prozion/anti-aging-education/blob/main/pages/Оптимизация_структурных_прототипов_лекарств.md" _blank
  click Организация_науки href "https://github.com/prozion/anti-aging-education/blob/main/pages/Организация_науки.md" _blank
  click Органическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Органическая_химия.md" _blank
  click Органические_наноматериалы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Органические_наноматериалы.md" _blank
  click Органический_синтез href "https://github.com/prozion/anti-aging-education/blob/main/pages/Органический_синтез.md" _blank
  click Палеобиология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Палеобиология.md" _blank
  click Патология_экспериментальных_животных href "https://github.com/prozion/anti-aging-education/blob/main/pages/Патология_экспериментальных_животных.md" _blank
  click Патофизиология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Патофизиология.md" _blank
  click Поверхностно-активные_вещества href "https://github.com/prozion/anti-aging-education/blob/main/pages/Поверхностно-активные_вещества.md" _blank
  click Практическая_биоинформатика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Практическая_биоинформатика.md" _blank
  click Прикладная_статистика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Прикладная_статистика.md" _blank
  click Программируемая_гибель_клеток href "https://github.com/prozion/anti-aging-education/blob/main/pages/Программируемая_гибель_клеток.md" _blank
  click Программное_обеспечение_в_биологических_исследованиях href "https://github.com/prozion/anti-aging-education/blob/main/pages/Программное_обеспечение_в_биологических_исследованиях.md" _blank
  click Процессы_и_аппараты_биотехнологии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Процессы_и_аппараты_биотехнологии.md" _blank
  click Работа_с_научной_литературой href "https://github.com/prozion/anti-aging-education/blob/main/pages/Работа_с_научной_литературой.md" _blank
  click Радиационная_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Радиационная_химия.md" _blank
  click Радиационная_химия_полимеров href "https://github.com/prozion/anti-aging-education/blob/main/pages/Радиационная_химия_полимеров.md" _blank
  click Радиохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Радиохимия.md" _blank
  click Растворы_полимеров href "https://github.com/prozion/anti-aging-education/blob/main/pages/Растворы_полимеров.md" _blank
  click Реакционная_способность_органических_соединений href "https://github.com/prozion/anti-aging-education/blob/main/pages/Реакционная_способность_органических_соединений.md" _blank
  click Реальная_структура_твердого_тела href "https://github.com/prozion/anti-aging-education/blob/main/pages/Реальная_структура_твердого_тела.md" _blank
  click Репродуктивная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Репродуктивная_биология.md" _blank
  click Рибосомы_и_биосинтез_белка href "https://github.com/prozion/anti-aging-education/blob/main/pages/Рибосомы_и_биосинтез_белка.md" _blank
  click Секвенирование_нового_поколения href "https://github.com/prozion/anti-aging-education/blob/main/pages/Секвенирование_нового_поколения.md" _blank
  click Синтетические_методы_органической_химии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Синтетические_методы_органической_химии.md" _blank
  click Системная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Системная_биология.md" _blank
  click Системная_биология_старения href "https://github.com/prozion/anti-aging-education/blob/main/pages/Системная_биология_старения.md" _blank
  click Спланхнология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Спланхнология.md" _blank
  click Статистическая_физика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Статистическая_физика.md" _blank
  click Статистическая_термодинамика_конденсированного_состояния href "https://github.com/prozion/anti-aging-education/blob/main/pages/Статистическая_термодинамика_конденсированного_состояния.md" _blank
  click Статическая_биохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Статическая_биохимия.md" _blank
  click Стволовые_клетки href "https://github.com/prozion/anti-aging-education/blob/main/pages/Стволовые_клетки.md" _blank
  click Строение_вещества href "https://github.com/prozion/anti-aging-education/blob/main/pages/Строение_вещества.md" _blank
  click Строение_молекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Строение_молекул.md" _blank
  click Структура_и_функции_митохондрий href "https://github.com/prozion/anti-aging-education/blob/main/pages/Структура_и_функции_митохондрий.md" _blank
  click Структура_и_функции_пептидов_и_белков href "https://github.com/prozion/anti-aging-education/blob/main/pages/Структура_и_функции_пептидов_и_белков.md" _blank
  click Структурная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Структурная_биология.md" _blank
  click Супрамолекулярная_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Супрамолекулярная_химия.md" _blank
  click Теоретическая_механика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Теоретическая_механика.md" _blank
  click Теоретическая_неорганическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Теоретическая_неорганическая_химия.md" _blank
  click Теоретическая_физика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Теоретическая_физика.md" _blank
  click Теория_вероятностей href "https://github.com/prozion/anti-aging-education/blob/main/pages/Теория_вероятностей.md" _blank
  click Теория_поля href "https://github.com/prozion/anti-aging-education/blob/main/pages/Теория_поля.md" _blank
  click Теория_эволюции href "https://github.com/prozion/anti-aging-education/blob/main/pages/Теория_эволюции.md" _blank
  click Теория_экспериментальных_методов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Теория_экспериментальных_методов.md" _blank
  click Технология_углеродных_материалов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Технология_углеродных_материалов.md" _blank
  click Уравнения_математической_физики href "https://github.com/prozion/anti-aging-education/blob/main/pages/Уравнения_математической_физики.md" _blank
  click Фармакология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Фармакология.md" _blank
  click Физика_белка href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физика_белка.md" _blank
  click Физика_конденсированного_состояния_вещества href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физика_конденсированного_состояния_вещества.md" _blank
  click Физика_твердого_тела href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физика_твердого_тела.md" _blank
  click Физико-химические_методы_анализа href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физико-химические_методы_анализа.md" _blank
  click Физико-химические_методы_исследования_в_химии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физико-химические_методы_исследования_в_химии.md" _blank
  click Физико-химические_принципы_биорегуляции href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физико-химические_принципы_биорегуляции.md" _blank
  click Физиологическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиологическая_химия.md" _blank
  click Физиология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиология.md" _blank
  click Физиология_висцеральных_систем href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиология_висцеральных_систем.md" _blank
  click Физиология_выделительной_системы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиология_выделительной_системы.md" _blank
  click Физиология_высшей_нервной_деятельности href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиология_высшей_нервной_деятельности.md" _blank
  click Физиология_кровообращения href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиология_кровообращения.md" _blank
  click Физиология_центральной_нервной_системы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиология_центральной_нервной_системы.md" _blank
  click Физика_белковых_молекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физика_белковых_молекул.md" _blank
  click Физическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физическая_химия.md" _blank
  click Физическая_химия_ферментов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физическая_химия_ферментов.md" _blank
  click Физические_методы_в_химии href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физические_методы_в_химии.md" _blank
  click Физические_методы_исследования_макромолекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физические_методы_исследования_макромолекул.md" _blank
  click Физиология_митоза href "https://github.com/prozion/anti-aging-education/blob/main/pages/Физиология_митоза.md" _blank
  click Флуоресцентная_микроскопия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Флуоресцентная_микроскопия.md" _blank
  click Функциональная_нейроцитология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Функциональная_нейроцитология.md" _blank
  click Функциональные_материалы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Функциональные_материалы.md" _blank
  click Химическая_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химическая_биология.md" _blank
  click Химическая_информация_и_базы_данных href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химическая_информация_и_базы_данных.md" _blank
  click Химия_высоких_энергий href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_высоких_энергий.md" _blank
  click Химия_ионных_и_молекулярных_систем href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_ионных_и_молекулярных_систем.md" _blank
  click Химическая_кинетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химическая_кинетика.md" _blank
  click Химическая_термодинамика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химическая_термодинамика.md" _blank
  click Химическая_технология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химическая_технология.md" _blank
  click Химические_основы_биологических_процессов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химические_основы_биологических_процессов.md" _blank
  click Химия_белка href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_белка.md" _blank
  click Химия_биологически_активных_веществ href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_биологически_активных_веществ.md" _blank
  click Химия_веществ_и_материалов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_веществ_и_материалов.md" _blank
  click Химия_высоких_энергий href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_высоких_энергий.md" _blank
  click Химия_ионных_и_молекулярных_систем href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_ионных_и_молекулярных_систем.md" _blank
  click Химия_и_технология_веществ_и_материалов href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_и_технология_веществ_и_материалов.md" _blank
  click Химия_нуклеиновых_кислот href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_нуклеиновых_кислот.md" _blank
  click Химия_твердого_тела href "https://github.com/prozion/anti-aging-education/blob/main/pages/Химия_твердого_тела.md" _blank
  click Хроматография href "https://github.com/prozion/anti-aging-education/blob/main/pages/Хроматография.md" _blank
  click Цитогенетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Цитогенетика.md" _blank
  click Цитология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Цитология.md" _blank
  click Численные_методы href "https://github.com/prozion/anti-aging-education/blob/main/pages/Численные_методы.md" _blank
  click Численные_методы_в_химии_полимеров href "https://github.com/prozion/anti-aging-education/blob/main/pages/Численные_методы_в_химии_полимеров.md" _blank
  click Эволюционная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эволюционная_биология.md" _blank
  click Эволюционная_биоэнергетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эволюционная_биоэнергетика.md" _blank
  click Эволюционное_разнообразие_защитных_систем href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эволюционное_разнообразие_защитных_систем.md" _blank
  click Электричество href "https://github.com/prozion/anti-aging-education/blob/main/pages/Электричество.md" _blank
  click Электронная_микроскопия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Электронная_микроскопия.md" _blank
  click Электрофизиология_возбудимых_клеток href "https://github.com/prozion/anti-aging-education/blob/main/pages/Электрофизиология_возбудимых_клеток.md" _blank
  click Электрохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Электрохимия.md" _blank
  click Электрохимические_методы_анализа href "https://github.com/prozion/anti-aging-education/blob/main/pages/Электрохимические_методы_анализа.md" _blank
  click Эмбриология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эмбриология.md" _blank
  click Эмбриотехнология_млекопитающих href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эмбриотехнология_млекопитающих.md" _blank
  click Эндокринология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эндокринология.md" _blank
  click Энзимология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Энзимология.md" _blank
  click Энергетика_клетки href "https://github.com/prozion/anti-aging-education/blob/main/pages/Энергетика_клетки.md" _blank
  click Эпигенетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эпигенетика.md" _blank
  click Эукариотическая_РНК href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эукариотическая_РНК.md" _blank
  click Язык_программирования_С++ href "https://github.com/prozion/anti-aging-education/blob/main/pages/Язык_программирования_С++.md" _blank
  click Язык_R href "https://github.com/prozion/anti-aging-education/blob/main/pages/Язык_R.md" _blank
  click Язык_SQL href "https://github.com/prozion/anti-aging-education/blob/main/pages/Язык_SQL.md" _blank
```

Возможен и другой подход, когда обучение начинается сразу с центрального предмета. В нашем случае это биохимия. Если в ходе обучения встречаются непонятные моменты, то можно разобрать и понять их, переключившись на предмет, лежащий в основе непонятной темы. Это может быть квантовая химия, если непонятно как работает химическая связь, или молекулярная биология, если не ясен биологический смысл той или иной функции молекулы. Далее, если не хватает понимания устрйоства клетки и процессов в ней происходящих, на помощь может прийти цитология. И так далее. Подробнее смотрите на диаграмме.

```mermaid
flowchart TD
  Эпигенетика[Эпигенетика]:::href
  Молекулярная_генетика[Молекулярная генетика]:::href
  Биохимия[Биохимия]:::href
  Молекулярная_биология[Молекулярная биология]:::href
  Строение_молекул[Строение молекул]:::href
  Квантовая_химия[Квантовая химия]:::href
  Органическая_химия[Органическая химия]:::href
  Кариология[Кариология]:::href
  Цитология[Цитология]:::href
  Неорганическая_химия[Неорганическая химия]:::href

  Эпигенетика -.-> Биохимия
  Эпигенетика -.-> Молекулярная_биология
  Эпигенетика -.-> Кариология
  Молекулярная_генетика -.-> Биохимия
  Молекулярная_генетика -.-> Молекулярная_биология
  Молекулярная_генетика -.-> Кариология
  Биохимия -.-> Молекулярная_биология
  Биохимия -.-> Строение_молекул
  Биохимия -.-> Квантовая_химия
  Биохимия -.-> Органическая_химия
  Молекулярная_биология -.-> Цитология
  Молекулярная_биология -.-> Кариология
  Строение_молекул -.-> Квантовая_химия
  Квантовая_химия -.-> Неорганическая_химия
  Органическая_химия -.-> Квантовая_химия
  Органическая_химия -.-> Неорганическая_химия
  

  classDef href color:#0969D7

  click Эпигенетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Эпигенетика.md" _blank
  click Молекулярная_генетика href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_генетика.md" _blank
  click Биохимия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Биохимия.md" _blank
  click Молекулярная_биология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Молекулярная_биология.md" _blank
  click Строение_молекул href "https://github.com/prozion/anti-aging-education/blob/main/pages/Строение_молекул.md" _blank
  click Квантовая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Квантовая_химия.md" _blank
  click Органическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Органическая_химия.md" _blank
  click Кариология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Кариология.md" _blank
  click Цитология href "https://github.com/prozion/anti-aging-education/blob/main/pages/Цитология.md" _blank
  click Неорганическая_химия href "https://github.com/prozion/anti-aging-education/blob/main/pages/Неорганическая_химия.md" _blank
```
