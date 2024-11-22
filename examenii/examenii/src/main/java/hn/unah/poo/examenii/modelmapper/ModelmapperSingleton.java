package hn.unah.poo.examenii.modelmapper;

import org.modelmapper.ModelMapper;

public class ModelmapperSingleton {

    private static ModelMapper modelmapper;

    private ModelmapperSingleton() {

    }

    public static ModelMapper getInstance() {
        if (modelmapper == null) {
            modelmapper = new ModelMapper();
        }
        return modelmapper;
    }

}
