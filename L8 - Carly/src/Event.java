public class Event
{
    private String numar_eveniment;
    private int numar_invitati;
    private int pret_eveniment;

    private String numar_telefon;
    public static final int pret_per_oaspete_mic()
    {
        int pret_mic=32;
        return pret_mic;
    }
    public static final int pret_per_oaspete_mare()
    {
        int pret_mare=35;
        return pret_mare;
    }
    public static final int limita_eveniment_mare()
    {
        return 50;
    }
    public Event(String nr_eveniment, int nr_invitati, String nr_telefon)
    {
        numar_eveniment=nr_eveniment;
        numar_invitati=nr_invitati;
        numar_telefon=nr_telefon;
    }
    public Event()
    {
        numar_eveniment="A000";
        numar_invitati=0;
        numar_telefon="0000000000";
    }
    public void setNumar_eveniment(String x)
    {
        int ok=1;
        char ch;
        x=numar_eveniment;
        ch=x.charAt(0);
        if(x.length()>4 || Character.isDigit(x.charAt(0))==true)
        {
            ok=0;
        }
        for(int i=1;i<x.length()-1;i++)
        {
            if(Character.isDigit(x.charAt(i))==false)
                ok=0;
        }
        if(ok==0)
            x="A000";
        else
            if(Character.isUpperCase(x.charAt(0))==false)
            {
                x=x.substring(0,1).toUpperCase()+x.substring(1);
            }
        numar_eveniment=x;
    }
    public void setNumar_telefon(String y)
    {
        String z="";
        y=numar_telefon;
        for(int i=0;i<y.length();i++)
        {
            if(Character.isDigit(y.charAt(i)))
            {
                z=z+y.charAt(i);
            }
        }
        if(z.length()==10)
            numar_telefon=z;
        else
            numar_telefon="0000000000";
    }
    public String getNumar_telefon()
    {
        String aux;
        aux="("+numar_telefon.substring(0,3)+")"+" "+numar_telefon.substring(3,6)+"-"+numar_telefon.substring(6,10);
        return aux;
    }
    public String getNumar_eveniment()
    {
        return numar_eveniment;
    }
    public void setNumar_invitati(int y)
    {
        y=numar_invitati;
        if(y<50)
            pret_eveniment=y*pret_per_oaspete_mic();
        else
            pret_eveniment=y*pret_per_oaspete_mare();
    }
    public int getNumar_invitati()
    {
        return numar_invitati;
    }
    public int getPret_eveniment()
    {
        return pret_eveniment;
    }
    public boolean isLargeEvent()
    {
        numar_invitati=getNumar_invitati();
        if(numar_invitati>=limita_eveniment_mare())
            return true;
        else
            return false;
    }

}