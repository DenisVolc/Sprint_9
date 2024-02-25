public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(!(name.length()>=3) || !(name.length()<=19)){
            return false;
        } else if (!name.equals(name.trim())) {
            return false;
        } else if (name.split(" ").length != 2) {
            return false;
        } else
            return true;
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}