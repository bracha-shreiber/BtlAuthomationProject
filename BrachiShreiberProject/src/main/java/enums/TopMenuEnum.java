package enums;

public enum TopMenuEnum {

    Exercise_Of_Rights ("מיצוי זכויות"),

    Allowances_And_Benefits("קצבאות והטבות"),

    Insurance_Premiums("דמי ביטוח"),

    Contact_Us("יצירת קשר");

    private final String topMenu;
    TopMenuEnum(String topMenu){
        this.topMenu=topMenu;
    }
    public String getTopMenu(){
        return this.topMenu;
    }

}
