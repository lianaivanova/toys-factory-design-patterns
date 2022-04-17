## Задача

С времето Дядо Коледа ставал все по-уморен и един ден решил да оптимизира работата в своята работилница.
Събрал трите си най-доверени джуджета и ги запознал с новия процес на работа.
Процесът и начинът на работа, който Дядо Коледа описал, бил следният:

В работилницата вече щяли да се произвеждат само два вида играчки: "Кукла" и "Колело".
За да не ходи всеки ден при джуджетата, Дядо Коледа си закупил магическа дъска,
на която щяло да пише коя от двете играчки му е необходима, а джуджетата щели да следят дъската
и когато видели написаната играчка, всяко джудже щяло да взима съответната играчка от работилницата.
За да управлява магическата дъска, Дядо Коледа трябвало да изрича магическите думи "Трябват ми кукли"
и "Трябват ми колелета" и веднага на дъската щяло да се изпише "Кукла" или "Колело".

Опишете програмно новия процес на работа в работилницата.
За целта използвайте шаблоните Command, Observer, Abstract factory или Factory method.
Обекти: Дядо коледа, Магическа дъска, Трябват ми кукли, Трябват ми колелета, Джудже, Работилница, Кукла, Колело
Част от условията са за свободна интерпретация. Например сами може да решите какво ще се случи с
произведените играчки, но използването на шаблоните е задължително.


## Изпълнение

В работилницата на Дядо Коледа работят трите джуджета Доби, Бинг и Уили, които се редуват в правенето на играчки. 

Чрез въвеждане на команди през терминала, Дядо Коледа може да изпълнява няколко действия:

При команда "I need dolls" или "I need bikes", Дядо Коледа изрича магическите думи, а на магическата дъска се изписва,
коя играчка се очаква от джуджетата да изработят. Всеки път, когато на дъската се появи дума, всяко едно от джуджетата проверява
каква е нужната играчка и в зависимост чий ред е да работи, съответното джудже отива до работилницата за желаната играчка,
изработва я и я слага в торбата на Дядо Коледа. А на дъската се изписва информация, кое джудже е изработило каква играчка.

При команда "toys", Дядо Коледа отваря торбата с играчки да провери какви играчки има вътре.

При команда "close", Дядо Коледа затваря своята работилница и производството на играчки приключва.
