package pjssafy;

public class UserManager {
    private int MAX_SIZE =100;
    private int size =0;
    private User userList[] =new User [MAX_SIZE];

    public void add(User user){
        if(size<MAX_SIZE) {
            userList[size++] = user;
        }
    }
}
