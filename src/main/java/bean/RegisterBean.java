package bean;

import java.io.Serializable;

public class RegisterBean implements Serializable{
	//手動でserialVersionUIDを追加する:
	private static final long serialVersionUID = 1L;
  private String name;
  private String age;
  private String[] langs;

  public RegisterBean(){
  }


  public void setName(String name){
    this.name = name;
  }
  public void setAge(String age){
    this.age = age;
  }
  public void setLangs(String[] langs){
    this.langs = langs;
  }

  public String getName(){
    return name;
  }
  public String getAge(){
    return age;
  }
  public String[] getLangs(){
    return langs;
  }

  public String getJpnAge(){
    String jpnAge;
    if(age.equals("child")){
      jpnAge = "18歳未満";
    } else {
      jpnAge = "18歳以上";
    }
    return jpnAge;
  }
  public String getStrLangs(){
    String strLangs = "";
    for(int i = 0; i < langs.length; i++){
      strLangs = strLangs + langs[i] + " ";
    }
    return strLangs;
  }
}

