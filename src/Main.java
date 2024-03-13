import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Création d'une instance de SocieteArrayList
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés à la liste
        societe.ajouterEmploye(new Employe(1, "MR", "IMED", "Dev", 2));
        societe.ajouterEmploye(new Employe(2, "MR", "FAOUZI", "Cloud", 1));
        societe.ajouterEmploye(new Employe(3, "MR", "LOTFI", "Data-SC", 3));

        // Affichage de la liste d'employés
        System.out.println("Liste d'employés:");
        societe.displayEmploye();
        System.out.println();

        // Recherche d'un employé par nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom de l'employé à rechercher : ");
        String nomRecherche = scanner.nextLine();
        if (societe.rechercherEmploye(nomRecherche)) {
            System.out.println("L'employé existe dans la liste.");
        } else {
            System.out.println("L'employé n'existe pas dans la liste.");
        }
        System.out.println();

        // Suppression d'un employé
        System.out.println("Suppression de l'employé avec ID 2");
        societe.supprimerEmploye(new Employe(2, "MR", "FAOUZI", "Cloud", 1 ));
        societe.displayEmploye();
        System.out.println();

        // Tri par ID
        System.out.println("Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println();

        // Tri par nom de département et grade
        System.out.println("Tri par nom, département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
        }
    }
