# Треки обучения

Порядок освоения курсов.

## Понять, как работает клетка

```mermaid
flowchart TD
    Mgen[Высшая математика]:::cond
    Linal[Линейная алгебра]
    Diffur[Дифференциальные уравнения]
    Tfkp[ТФКП]
    Phgen[Общая физика]:::cond
    Teormech[Теоретическая механика]
    Qmech[Квантовая механика]
    Phq[Квантовая физика]
    Chgen[Общая химия]:::cond,href
    Chnorg[Неорганическая химия]:::href
    Chorg[Органическая химия]:::href
    Chq[Квантовая химия]:::href
    Bioch[Биохимия]:::href
    Molb[Молекулярная биология]:::href
    Cyt[Цитология]:::href
    Gen[Генетика]:::href
    Epi[Эпигенетика]:::href

    Chgen --> Chq --> Chorg --> Bioch --> Molb --> Cyt
    Molb --> Gen --> Epi
    Chq -.-> Chnorg
    Phgen --> Teormech --> Qmech --> Chq
    Mgen --> Diffur --> Qmech
    Mgen --> Linal
    Mgen --> Tfkp
    Qmech -.-> Phq
    Linal --> Qmech
    Tfkp --> Qmech

    classDef cond stroke-dasharray:3,opacity:0.8
    classDef href color:#0000ee,text-decoration:underline

    click Chgen href "https://github.com/prozion/anti-aging-education/#общая-химия" _blank
    click Chnorg href "https://github.com/prozion/anti-aging-education/#неорганическая-химия" _blank
    click Chorg href "https://github.com/prozion/anti-aging-education/#органическая-химия" _blank
    click Chq "https://github.com/prozion/anti-aging-education/#квантовая-химия" _blank
    click Bioch "https://github.com/prozion/anti-aging-education/#биохимия" _blank
    click Molb "https://github.com/prozion/anti-aging-education/#молекулярная-биология" _blank
    click Cyt "https://github.com/prozion/anti-aging-education/#цитология" _blank
    click Gen "https://github.com/prozion/anti-aging-education/#генетика" _blank
    click Epi "https://github.com/prozion/anti-aging-education/#эпигенетика" _blank
```
