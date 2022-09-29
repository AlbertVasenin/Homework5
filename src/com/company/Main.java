package com.company;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        //Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера или телефона,
        // а также мобильное приложение. И нам, и клиенту удобнее с телефона пользоваться мобильным приложением.
        // Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку
        // на скачивание приложения. Но мы не знаем, iOS или Android он использует.
        //Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее
        // сообщение для обоих вариантов.
        //Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        //При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
        //Например, для iOS оно будет звучать так:
        //«Установите версию приложения для iOS по ссылке».
        //А для Android так:
        //«Установите версию приложения для Android по ссылке».
        byte clientOS = 1;
        System.out.println("Нажмите 0, если у Вас iOS, нажмите 1, если у Вас Android");
        if(clientOS  == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        //К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона,
        // но и год его создания: от этого зависит, подойдет ли приложение для телефона или оно просто не установится.
        //Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
        //Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
        //Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий —
        // операционной системы телефона (iOS или Android) и года производства.
        //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
        //Например, для iOS оно будет звучать так:
        //«Установите облегченную версию приложения для iOS по ссылке».
        //А для Android так:
        //«Установите облегченную версию приложения для Android по ссылке».
        //При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
        //Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
        //**Важно**: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
        byte clientOS = 0;
        short clientDeviceYear = 2012;
        System.out.println("Нажмите 0, если у Вас iOS, нажмите 1, если у Вас Android, далее введите год выпуска Вашего устройства");
        if(clientOS  == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        //Напишите программу, которая определяет, является ли год високосным или нет.
        //Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        //Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        //« … год является високосным». Или «... год не является високосным».
        //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        // Также високосным является каждый четырехсотый год.
        int year = 2021;
        if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() {
        //Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку
        // банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена
        // его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
        //Правила доставки такие:
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //Напишите программу, которая выдает сообщение в консоль:
        //"Потребуется дней: " + срок доставки
        //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        int deliveryDistance = 95;
        int oneDay = 1;
        if(deliveryDistance > 20) {
            oneDay++;
        }
        if(deliveryDistance > 60) {
            oneDay++;
        }
        System.out.println("Потребуется дней: " + oneDay);
    }
    public static void task5() {
        //Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        // Например, 1 месяц (он же январь) принадлежит к сезону зима.
        //Для написания программы используйте оператор switch.
        // Для обозначения номера месяца используйте переменную monthNumber = 12.
        //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Январь месяц относится к зиме");
                break;
            case 2:
                System.out.println("Февраль месяц относится к зиме");
                break;
            case 3:
                System.out.println("Март месяц относится к весне");
                break;
            case 4:
                System.out.println("Апрель месяц относится к весне");
                break;
            case 5:
                System.out.println("Май месяц относится к весне");
                break;
            case 6:
                System.out.println("Июнь месяц относится к лету");
                break;
            case 7:
                System.out.println("Июль месяц относится к лету");
                break;
            case 8:
                System.out.println("Август месяц относится к лету");
                break;
            case 9:
                System.out.println("Сентябрь месяц относится к осени");
                break;
            case 10:
                System.out.println("Октябрь месяц относится к осени");
                break;
            case 11:
                System.out.println("Ноябрь месяц относится к осени");
                break;
            case 12:
                System.out.println("Декабрь месяц относится к зиме");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void task6(){
        //И снова дела банковские, уже сложнее.
        //В нашем банке можно, кроме дебетовых, получать еще и кредитные карты. У таких карт есть допустимый лимит
        // средств, который рассчитывается исходя из возраста клиента и его зарплаты.
        //Правила расчета следующие:
        //Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        //Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        //Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        //Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        //Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
        //Вводные данные: переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения
        // зарплаты клиента. Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит
        // в консоль в формате: «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
        int age = 25;
        double salary = 50_000;
        if (age>=23 & salary>=50_000 & salary<80_000){
            salary=salary * 3 * 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if(age>=23 & salary>=80_000) {
            salary=salary * 3 * 1.5;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if(age>=23 & salary < 50_000){
            salary=salary * 3;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if(age<23 & salary>=50_000 & salary<80_000){
            salary=salary * 2 * 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if(age < 23 & salary>=80_000) {
            salary=salary * 2 * 1.5;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else {
            salary=salary * 2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        }
    }
    public static void task7(){
        //Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит и оценивает
        //клиентов и их возможность выплачивать кредит. Для того, чтобы вывести предварительное решение,
        //нам необходимо использовать данные о возрасте, зарплате и желаемой сумме.
        //Правила следующие: Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев.
        //Максимальный ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.
        //Если возраст меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем ставку на 0.7%.
        //Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
        //Вводные данные: используйте переменные age = 25 для обозначения возраста, salary = 60_000 для обозначения
        //зарплаты, wantedSum = 330_000 для обозначения желаемой суммы кредита.
        //Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный
        //допустимый платеж. Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту
        //согласно процентной ставке, то кредит одобрен, если меньше — отказан.
        //Пример ответа в консоль: «Максимальный платеж при ЗП * равен * рублей. Платеж по кредиту *** рублей.
        //Одобрено/отказано».
        int age = 34; // возраст
        double salary = 85_000; // зарплата
        double wantedSum = 330_000; // желаемый кредит
        double MaxPaySalary = salary * 0.5; // максимальный платеж по кредиту от зп
        double month = 12; // срок кредита (месяцы)
        double PayCreditSum = (wantedSum + (wantedSum * 0.1)) / month; // платеж по кредиту с учетом базовой ставки 10%
        double PCS11 = (wantedSum + (wantedSum * 0.11)) / month; // платеж по ставке 11%
        double PCS10_5 = (wantedSum + (wantedSum * 0.105)) / month; // платеж по ставке 10.5%
        double PCS10_3 = (wantedSum + (wantedSum * 0.103)) / month; // платеж по ставке 10.3%
        double PCS9_8 = (wantedSum + (wantedSum * 0.098)) / month; // платеж по ставке 9.8%
        double PCS9_3 = (wantedSum + (wantedSum * 0.093)) / month; // платеж по ставке 9.3%
        if (age<23 & salary < 80_000 & MaxPaySalary > PCS11){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS11 + " рублей.Одобрено");
        } else if(age<23 & salary < 80_000 & MaxPaySalary < PCS11){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS11 + " рублей.Отказано");
        } else if(age>=23 & age<30 & salary < 80_000 & MaxPaySalary > PCS10_5){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS10_5 + " рублей.Одобрено");
        } else if(age>=23 & age<30 & salary < 80_000 & MaxPaySalary < PCS10_5){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS10_5 + " рублей.Отказано");
        } else if(age<23 & salary > 80_000 & MaxPaySalary > PCS10_3){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS10_3 + " рублей.Одобрено");
        } else if(age<23 & salary > 80_000 & MaxPaySalary < PCS10_3){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS10_3 + " рублей.Отказано");
        } else if(age>=23 & age<30 & salary > 80_000 & MaxPaySalary > PCS9_8){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS9_8 + " рублей.Одобрено");
        } else if(age>=23 & age<30 & salary > 80_000 & MaxPaySalary < PCS9_8){
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS9_8 + " рублей.Отказано");
        } else if (age>=30 & salary < 80_000 & MaxPaySalary > PayCreditSum) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PayCreditSum + " рублей.Одобрено");
        } else if (age>=30 & salary < 80_000 & MaxPaySalary < PayCreditSum) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PayCreditSum + " рублей.Отказано");
        } else if (age>=30 & salary > 80_000 & MaxPaySalary > PCS9_3) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS9_3 + " рублей.Одобрено");
        } else if (age>=30 & salary > 80_000 & MaxPaySalary < PCS9_3) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "+ MaxPaySalary + " рублей.Платеж по кредиту " + PCS9_3 + " рублей.Отказано");
        }
    }
}


