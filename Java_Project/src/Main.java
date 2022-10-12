public class Main {
    public static void main(String[] args)
    {
        Gamer gamer=new Gamer();
        gamer.setFirstName("Serhat");
        gamer.setLastName("Kamaci");
        gamer.setBirthYear(2001);
        gamer.setIdentityNumber("10692500157");
        gamer.setId(10);

        UserValidationManager userValidationManager= new UserValidationManager();
        GamerManager gamerManager= new GamerManager(userValidationManager);
        gamerManager.add(gamer);
    }
}