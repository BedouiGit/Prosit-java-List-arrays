public class Employe implements Comparable<Employe>{
    private int grade , id ;
    private String nom,prenom, nomDep;

    public  Employe(){}

    Employe(int id,String nom,String prenom,String nomDep,int grade)
    {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDep=nomDep;
        this.grade=grade;
    }

    int getId (){return id;}

    public void setId(int id) {
        this.id = id;
    }

    String getNom(){return nom;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    String getPrenom(){return prenom;}

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    String getNomDep(){return nomDep;}

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    int getGrade(){return grade;}

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {return "ID: "+id+ " Nom: "+nom+" Prenom: "+prenom+" Nom Departement: "+nomDep+" Grade: "+grade; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return getId() == employe.getId() && getNom().equals(employe.getNom());
    }

    @Override
    public int compareTo(Employe o) {
        return this.id - o.id;
    }

}



