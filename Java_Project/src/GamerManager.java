public class GamerManager implements IGamerService{
    IUserValidation userValidation;
    public  GamerManager(IUserValidation userValidation)
    {
        this.userValidation=userValidation;
    }
    @Override
    public void add(Gamer gamer) {
        if(userValidation.validate(gamer))
        {
            System.out.println("Kayit olundu --> "+gamer.getFirstName()+" "+gamer.getLastName());
        }
        else
        {
            System.out.println("Kayit olunamadi :(");
        }
    }

    @Override
    public void update(Gamer gamer) {
        if(userValidation.validate(gamer))
        {
            System.out.println("Kayit olundu --> "+gamer.getFirstName()+" "+gamer.getLastName());
        }
        else
        {
            System.out.println("Kayit olunamadi :(");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Kayit silindi.");
    }
}
