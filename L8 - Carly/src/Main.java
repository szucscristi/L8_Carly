
public class Main
{


    public static void main(String[] args)
    {
        Event botez_alina=new Event("A212",53,")))(((---9208729182");
        Event majorat_marius=new Event();
        botez_alina=getData(botez_alina);
        majorat_marius=getData(majorat_marius);
        System.out.println("Detalii botez Alina: ");
        System.out.print("\nNumarul evenimentului: "+botez_alina.getNumar_eveniment()+"\nNumarul invitatilor: "+botez_alina.getNumar_invitati()+"\nPret total: "+botez_alina.getPret_eveniment()+"\nNumar telefon: "+botez_alina.getNumar_telefon());
        if(botez_alina.isLargeEvent()==true)
            System.out.println("\nEvenimentul este unul mare");
        else
            System.out.println("\nEvenimentul este unul mic");
        System.out.println("\n\nDetalii majorat Marius: ");
        System.out.print("\nNumarul evenimentului: "+majorat_marius.getNumar_eveniment()+"\nNumarul invitatilor: "+majorat_marius.getNumar_invitati()+"\nPret totaL: "+majorat_marius.getPret_eveniment()+"\nNumar telefon: "+majorat_marius.getNumar_telefon());
        if(majorat_marius.isLargeEvent()==true)
            System.out.println("\nEvenimentul este unul mare");
        else
            System.out.println("\nEvenimentul este unul mic");

    }

    public static Event getData(Event detalii)
    {
        String nr_event="";
        String nr_telefon="";
        int numar_invitati=0;
        detalii.setNumar_eveniment(nr_event);
        detalii.setNumar_invitati(numar_invitati);
        detalii.setNumar_telefon(nr_telefon);
        detalii.getPret_eveniment();
        detalii.getNumar_eveniment();
        detalii.getNumar_telefon();
        return detalii;
    }
}