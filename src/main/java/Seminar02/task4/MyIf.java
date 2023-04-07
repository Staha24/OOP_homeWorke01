package Seminar02.task4;

public interface MyIf {
    int getUserID();

    default int getAdminID(){
        return 1;
    }
}
