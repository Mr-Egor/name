import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Вы маленький человек в высоком обществе людей. Вам предлагают одним действием изменить всю вашу жизнь, согласитесь ли вы?\n" +
                "\n" +
                "\t1 Принять предложение\n" +
                "\t2 Отказаться, оставив все как есть и пусть свою жизнь по течению\n");
        int s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();
        if (s == 1) {
            System.out.println("Вы приняли предложение от незнакомого человека.\n" +
                    "\n" +
                    "\t1 спросить, что будет ждать вас дальше\n" +
                    "\t2 спросить, кем является этот человек\n");
            int d;
            d = scanner.nextInt();
            if (d == 1 ){
                System.out.print("Вы узнали, что теперь вы служите самому царю\n" +
                        "\n" +
                        "\t1 обрадываться\n" +
                        "\t2 спросить, что означает \"служить\" царю\n");
                int f;
                f = scanner.nextInt();
                if (f == 1) {
                    System.out.print("Вы получили конверт\n" +
                            "\n" +
                            "\t1. распечать конверт\n" +
                            "\t2. отнести конверт страже\n");
                    int g;
                    g = scanner.nextInt();
                    if (g == 1) {
                        System.out.print("В конверте чёрном по белому написанно, что немедленно нужно явиться к царю\n" +
                                "\n" +
                                "1 Принять предложение и немедля явиться к царю\n" +
                                "2 Почувствовать что-то неладное, начать скрываться от царской стражи \n");
                        int h;
                        h = scanner.nextInt();
                        if (h == 1) {
                            System.out.print("Подходя к дворцу, вы увидели, что слишком много охраны для простого события. Вы решили сбежать");
                        }else
                            System.out.println("Когда вы начали скрываться вас заметила офрана и убила");
                    }else
                        System.out.print("Охраник принял ваш конверт как угрозу и убил вас");
                }else
                    System.out.println("Человек понял что вы бездарен и задушил вас");
            }else
                System.out.print("Человек начал рассказывать о своей жизни и своих проблемах (вы погибли от скуки)");
        }else
            System.out.println("когда вы шли домой вас насмерть сбила карета");
    }
}