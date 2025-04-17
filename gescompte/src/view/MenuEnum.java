package view;

public enum MenuEnum {
//Defaut ==>0          1
//Faire ==>1          2
   Error_Menu(0) ,
   Add_Compte(1),
   Show_Compte(2),
   Add_Transaction_Compte(3),
   Show_Transaction_Compte(4),
   Quitter(5);


    private final int value;
    private MenuEnum(int value){
      this.value=value;
    } 
   public  static MenuEnum  getEnum(int value){
        for (MenuEnum menuEnum : MenuEnum.values()) {
              if (menuEnum.value==value) {
                 return menuEnum;
              }
        }
        return Error_Menu;
  }
    
}
