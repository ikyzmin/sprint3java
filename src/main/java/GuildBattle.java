import java.util.ArrayList;
import java.util.List;

public class GuildBattle {
     static void main() {
        Warrior war = new Warrior("Василий", 100, 25, 10);  //Создаём объекты для классов персонажей.
        Mage mag = new Mage("Пётр", 50, 40, 100);
        Palladin pal = new Palladin("Павел", 75, 33, 5, 50);
        Palladin newPal = new Palladin("Николай", 75, 33, 5, 50);

        mag.takeDamage(war.attack());
        System.out.println(pal.getHealth());

        List<Hero> list1 = new ArrayList<>();
        List<Hero> list2 = new ArrayList<>();   //Создали список для Родительского класса Hero.

        list1.add(war);   //Добавляем объекты созданные выше.Пример Warrior war = new Warrior.
        list1.add(mag);
        list2.add(pal);
        list2.add(newPal);

        List<Tank> listOfTank = new ArrayList<>();  //Создали список для интерфейса Tank.
        listOfTank.add(war);
        listOfTank.add(newPal);

        List<MagicUser> listOfMag = new ArrayList<>();  //Создали список для интерфейса MagicUser.
        listOfMag.add(mag);
        listOfMag.add(pal);

        ((Warrior) listOfTank.get(0)).takeDamage(mag.attack());  //Взяли первый объект и привели его из типа Tank в тип Warrior.
        System.out.println(war.getHealth());  //Моделирование простого боя, между героями.

        System.out.println(war.getArmorValue());
        System.out.println(war.canBlock());
        System.out.println(war.isAlive());  //Проверка реализованных способностей Война(Warrior).

        System.out.println(mag.getCurrentMana());  //Проверка реализованных способностей Мага(Mage).

        System.out.println("Проверка метода canCastSpell: " + mag.canCastSpell(20));

        System.out.println(pal.getCurrentMana());

        pal.introduce();
        System.out.println(pal.getCurrentMana());  //Проверка реализованных способностей Палладина(Palladin).
        pal.restoreMana(15);
        System.out.println(pal.getCurrentMana());


    }
}
