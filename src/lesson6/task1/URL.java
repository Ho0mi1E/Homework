package lesson6.task1;

public class URL {

    String url;

    public URL(String url) {
        this.url = url;
    }

    void getUrl(){
        String check = url;
        String ht = "";
        String[] https = {"http://", "https://"};
        String[] ru = {".ru", ".by", ".com"};
        for (int i = 0; i < https.length; i++) {
            if (url.startsWith(https[i])){
                url.replace(https[i], "0");
                ht = url;
                for (int j = 0; j < ru.length; j++) {
                    if (url.endsWith(ru[i])){
                        url.replace(ru[i],"0");
                    }


                }
            }

        }
        if (check.equals(url) || check.equals("00") || check.equals(ht)){
            System.out.println("Некорректно");
        }else {
            System.out.println("Корректно");
        }
    }
}
