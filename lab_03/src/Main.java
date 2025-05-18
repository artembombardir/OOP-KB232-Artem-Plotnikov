public class Main {
    public static void main(String[] args) {
        // UserStories
        UserStory regForm = new UserStory(1, "Форма реєстрації", 5, null);
        UserStory emailVer = new UserStory(2, "Підтвердження email", 3, new UserStory[]{regForm});

        // Завершимо регформу
        regForm.complete(); // має завершитися
        emailVer.complete(); // не завершиться, бо залежність не завершена

        System.out.println(regForm + " isCompleted: " + regForm.isCompleted());
        System.out.println(emailVer + " isCompleted: " + emailVer.isCompleted());

        // Завершимо залежність і спробуємо ще раз
        emailVer.complete();
        System.out.println(emailVer + " isCompleted: " + emailVer.isCompleted());

        // Bug для завершеної UserStory
        Bug bug1 = Bug.createBug(10, "Додати повторюваний пароль", 2, regForm);
        Bug bug2 = Bug.createBug(11, "Email некоректний", 1, emailVer);

        // Sprint
        Sprint sprint = new Sprint(10, 3); // 10 годин, максимум 3 тикети

        // Додаємо тикети
        System.out.println("Add regForm: " + sprint.addUserStory(regForm)); // true
        System.out.println("Add emailVer: " + sprint.addUserStory(emailVer)); // true
        System.out.println("Add bug1: " + sprint.addBug(bug1)); // true

        // Додаємо ще один тикет — не має додатись
        Bug extraBug = Bug.createBug(12, "Ще один баг", 5, regForm);
        System.out.println("Add extraBug: " + sprint.addBug(extraBug)); // false (по ліміту або часу)

        // Виводимо всі тикети у спринті
        for (Ticket t : sprint.getTickets()) {
            System.out.println(t.toString());
        }
        System.out.println("Total estimate: " + sprint.getTotalEstimate());
    }
}
