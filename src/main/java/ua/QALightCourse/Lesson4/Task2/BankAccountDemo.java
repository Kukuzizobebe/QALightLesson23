package ua.QALightCourse.Lesson4.Task2;

/*Створіть клас BankAccount з полями: номер рахунку, ім'я власника, баланс (private).
Додайте методи для поповнення та зняття коштів.
Додайте перевірку, щоб не можна було зняти більше, ніж є на рахунку.
Створіть об'єкт, протестуйте методи.*/
public class BankAccountDemo {
    static void main(String[] args) {
        BankAccount banAccountInMono = new BankAccount(290049489, 150, "Andrii");
        System.out.println(banAccountInMono);
        banAccountInMono.withdrawMoney(120);
        System.out.println(banAccountInMono);
        banAccountInMono.topUpMoney(90);
        System.out.println(banAccountInMono);
    }
}
