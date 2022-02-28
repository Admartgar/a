package projecte.sapa;



import projecte.sapa.apartat1.*;
import projecte.sapa.apartat4.DescomprimirZip;


public class Main {

    public static void main(String[] args) {
        int bucle = 1;
        boolean descomprimit;



            descomprimit = DescomprimirZip.descomprimirZip();
        IntroduirDadesBasiques.dadesBasicIntro();
        System.out.println("Importació de eleccions municipals fet");
        ImportComunAutonom.importar();
        System.out.println("Importació de comunitats autònomes fet");
        ImportProvincies.importar();
        System.out.println("Importació de provincies fet");
        ImportMunicpis.importar();
        System.out.println("Importació de municipis fet");
        ImportEleccionsMunicpis.importar();
        System.out.println("Importació de eleccions fet");
        ImportCandidatures.llegir();
        System.out.println("Importació de candidatures fet");
        ImportPersones.ImportarPersones();
        System.out.println("Importació de persones fet");
        ImportCandidats.ImportarCandidats();
        System.out.println("Importació de candidats fet");
        ImportVotsAutonomic.lligirText();
        System.out.println("Importació de vots autonòmics fet");
        ImportVotsProvincials.llegir();
        System.out.println("Importació de vots provincials fet");
        ImportVotsMunicipals.llegir();
        System.out.println("Importació de vots municipals fet");
        System.out.println("\nProcés complet!");







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
