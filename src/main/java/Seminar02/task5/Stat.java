package Seminar02.task5;

public interface Stat {
    int getUserID();

    default int getAdminID(){
        return 1;
    }
    static int getUniversalID(){
        return 5;
    }
}
