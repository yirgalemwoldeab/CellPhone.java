package day34_custom_class.app;

import day34_custom_class.app.App;

public class AppStore {
    public static void main(String[] args) {

App instagrame=new App();
instagrame.name="instagrame";
        instagrame.version=12.1;
        instagrame .isFree=true;
        instagrame. ratings=4;
instagrame.update();

        System.out.println(instagrame.name);
        System.out.println(instagrame.isFree);
        System.out.println(instagrame.ratings);
        System.out.println(instagrame.version);

        System.out.println(instagrame);
        }
    }
