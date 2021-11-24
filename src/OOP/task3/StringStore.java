package OOP.task3;

public class StringStore {
    public String storedString;

    StringStore(){
        storedString = " ";
    }

    StringStore(String[] strings){
        storedString = String.join("%", strings);
    }

    String addString(String str){
        String full = "Нельзя добавить";
        if (!str.equals("%")){
            full = storedString + str;
        }

        return full;
    }
    String addString(String[] strArray){
        String full = "Нельзя добавить";
        for (int i = 0; i < strArray.length; i++) {
            if (!strArray.equals("%")){
                full = storedString + "%" + strArray[i];
            }


        }
        return full;

    }

    public String[] getStoredString() {
        return storedString.split("%");
    }
}
