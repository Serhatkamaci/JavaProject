public class UserValidationManager implements  IUserValidation{
    @Override
    public boolean validate(Gamer gamer) {
        if(gamer.getBirthYear()==2001 && gamer.getFirstName()=="Serhat" && gamer.getLastName()=="Kamaci" && gamer.getIdentityNumber()=="10692500157")
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
