package LibraryProject.Items;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public interface BorrowableItem {

    void borrowItem(String login, String fileName);
    void returnItem(String login, String fileName);
}
