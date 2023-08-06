package ru.otus.vadim.ivanov.java.basic.lesson10.oop1;

public class MagicBox {
    //ширина коробки
    private int width;

    //высота коробки
    private int height;

    //глубина коробки
    private int length;

    //цвет коробки
    private String color;

    //признак открытости :)
    private Boolean isOpened;

    //некое содержимое
    private String magicContent;

    //создаем коробку
    public MagicBox(int width, int height, int length, String color) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.color = color;

        this.isOpened = false;

        //когда коробка создается в ней ничего нет
        this.magicContent = null;
    }

    //открываем коробку
    public void open() {
        if(isOpened == true) {
            System.out.println("Коробка уже открыта, остановись!");
            return;
        }

        System.out.println("Открываем нашу чудесную коробочку...");
        isOpened = true;

    }

    //закрываем коробку
    public void close() {
        if(isOpened == false) {
            System.out.println("Коробка уже закрыта, не делай этого!");
            return;
        }
        System.out.println("Закрываем коробку с чудесами...");
        isOpened = false;

    }

    //перекрашиваем коробку
    public void setColor(String color) {
        this.color = color;
    }

    //печатаем инфо о коробке
    public void info() {
        System.out.println("У нас есть вот такая чудесная коробка!");
        System.out.println(width +" в ширину");
        System.out.println(height +" в высоту");
        System.out.println(length +" в глубину");
        System.out.println("И цвета "+ color);

        if(isOpened == true) {
            System.out.println("Она открыта");
        }

        if(magicContent != null) {
            System.out.println("И в ней что-то лежит...");
        }
    }

    //закидываем что-то в коробку
    public void put(String Something) {
        if(isOpened == false) {
            System.out.println("Коробка закрыта! Ничего не получается!");
            return;
        }

        if(magicContent != null) {
            System.out.println("В коробке уже что-то лежит!");
            return;
        }

        magicContent = Something;
        System.out.println("Нечто теперь покоится на дне нашей коробки.");

    }

    //достаем что-то из нее
    public String takeOut() {
        if(isOpened == false) {
            System.out.println("Коробка закрыта! Ничего не получается!");
            return null;
        }

        if(magicContent == null) {
            System.out.println("В коробке совсем ничего нет!");
            return null;
        }

        System.out.println("Нечто выползает из коробки, держи крепко...");
        String Something = magicContent;
        magicContent = null;
        return Something;
    }

}
