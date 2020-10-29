package ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Sychaev", true)
        };
//        User user = findUser(users, "Petr Sychaev");
//        if (validate(user)) {
//            System.out.println("This user has an access");
//        }
    }
}
