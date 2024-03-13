import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    ArrayList<Employe> listEmpolye;
    SocieteArrayList()
    {
        this.listEmpolye=new ArrayList<Employe>();
    }

    public void ajouterEmploye(Employe t)
    {
        listEmpolye.add(t);
    }
    public boolean rechercherEmploye(String nom)
    {
        for(Employe employe : listEmpolye)
        {
            if (employe.getNom() == nom) return true;
        }
        return false;
    }
    public boolean rechercherEmploye(Employe t)
    {
        return listEmpolye.contains(t);
    }
    public void supprimerEmploye(Employe t)
    {
        listEmpolye.remove(t);
    }
    public void displayEmploye()
    {
        System.out.println(listEmpolye);
    }
    public void trierEmployeParId()//Comparable
    {
        Collections.sort(listEmpolye);
    }
    public void trierEmployeParNomDepartementEtGrade() //Comparator
    {
        Comparator<Employe> departementComparator = new Comparator<Employe>() {

            public int compare(Employe o1, Employe o2) {
                return o1.getNomDep().compareTo(o2.getNomDep());
            }
        };
        Comparator<Employe> gradeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };
        Collections.sort(listEmpolye, departementComparator.thenComparing(gradeComparator));
    }

}
