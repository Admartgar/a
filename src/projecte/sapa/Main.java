package projecte.sapa;


import org.apache.commons.io.FileUtils;
import projecte.sapa.*;
import projecte.sapa.apartat1.*;
import projecte.sapa.apartat4.DescomprimirZip;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        int bucle = 1;
        boolean descomprimit;



            descomprimit = DescomprimirZip.descomprimirZip();
            IntroduirDadesBasiques.dadesBasicIntro();
            System.out.println("a");
            ImportComunAutonom.importar();
            System.out.println("b");
            ImportProvincies.importar();
            System.out.println("c");
            ImportMunicpis.importar();
            System.out.println("d");
            ImportEleccionsMunicpis.importar();
            System.out.println("e");
            ImportCandidatures.llegir();
            System.out.println("f");
            ImportPersones.ImportarPersones();
            System.out.println("g");
            ImportCandidats.ImportarCandidats();
            System.out.println("h");
            ImportVotsMunicipals.llegir();
            System.out.println("i");



            System.out.println("Fin");







        /*
        boolean descomprimit;
        try {
            while (!FileUtils.isEmptyDirectory(DescomprimirZip.origin)) {

                descomprimit = DescomprimirZip.descomprimirZip();
                if (bucle == 1) {
                    ImportComunAutonom.importar();
                }


                DescomprimirZip.procesarZips(descomprimit);
                bucle++;
            }
        } catch (IOException x){

        }
        */




    }
}
