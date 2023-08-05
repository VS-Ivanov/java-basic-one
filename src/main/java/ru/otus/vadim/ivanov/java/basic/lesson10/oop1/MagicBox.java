package ru.otus.vadim.ivanov.java.basic.lesson10.oop1;

public class MagicBox {
    //ширина коробки
    private int Width;

    //высота коробки
    private int Height;

    //глубина коробки
    private int Length;

    //цвет коробки
    private String Color;

    //признак открытости :)
    private Boolean IsOpened;

    //некое содержимое
    private String MagicContent;

    //создаем коробку
    public MagicBox(int Width, int Height, int Length, String Color) {
        this.Width = Width;
        this.Height = Height;
        this.Length = Length;
        this.Color = Color;

        this.IsOpened = false;

        //когда коробка создается в ней ничего нет
        this.MagicContent = null;
    }

    //открываем коробку
    public void open() {
        if(IsOpened == true) {
            System.out.println("Коробка уже открыта, остановись!");
            return;
        }

        System.out.println("Открываем нашу чудесную коробочку...");
        IsOpened = true;

    }

    //закрываем коробку
    public void close() {
        if(IsOpened == false) {
            System.out.println("Коробка уже закрыта, не делай этого!");
            return;
        }
        System.out.println("Закрываем коробку с чудесами...");
        IsOpened = false;

    }

    //перекрашиваем коробку
    public void setColor(String color) {
        this.Color = color;
    }

    //печатаем инфо о коробке
    public void info() {
        System.out.println("У нас есть вот такая чудесная коробка!");
        System.out.println(Width+" в ширину");
        System.out.println(Height+" в высоту");
        System.out.println(Length+" в глубину");
        System.out.println("И цвета "+Color);

        if(IsOpened == true) {
            System.out.println("Она открыта");
        }

        if(MagicContent != null) {
            System.out.println("И в ней что-то лежит...");
        }
    }

    //закидываем что-то в коробку
    public void put(String Something) {
        if(IsOpened == false) {
            System.out.println("Коробка закрыта! Ничего не получается!");
            return;
        }

        if(MagicContent != null) {
            System.out.println("В коробке уже что-то лежит!");
            return;
        }

        MagicContent = Something;
        System.out.println("Нечто теперь покоится на дне нашей коробки.");

    }

    //достаем что-то из нее
    public String takeOut() {
        if(IsOpened == false) {
            System.out.println("Коробка закрыта! Ничего не получается!");
            return null;
        }

        if(MagicContent == null) {
            System.out.println("В коробке совсем ничего нет!");
            return null;
        }

        System.out.println("Нечто выползает из коробки, держи крепко...");
        String Something = MagicContent;
        MagicContent = null;
        return Something;
    }

}
