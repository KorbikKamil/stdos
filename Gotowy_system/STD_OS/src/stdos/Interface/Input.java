package stdos.Interface;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Scanner;

class Input{
    public static void startInterface() throws UnsupportedOperationException {

        Help.printLogo();

        Scanner inputScanner = new Scanner(System.in);
            while (!SwitchInput.exitFlag) {
                System.out.print(">>");
                String input = inputScanner.nextLine();
                ///#TODO: linia 107 running CPU jest nullem exception
                try {
                    SwitchInput.inputSwitch(input);
               } catch (Exception e) {
                   System.out.println("[Shell]: Blad modulu" + e.getMessage());
                }
            }

    }
    }


