public class Rooves {
    private int age = 17;
    private int height = 168;
    private String gender = "boy";
    private String color = "blue";
    private String country = "Denmark";

    public String[] getProfile() {
        return new String[] {
            "age = " + age,
            "height = " + height,
            "gender = " + gender,
            "color = " + color,
            "country = " + country
        };
    }
}

public class AboutMe {
    public static void main(String[] args) {
        String[] aboutMe = new Rooves().getProfile();
        for(String information : aboutMe) {
            System.out.println(information);
        }
    }
}
