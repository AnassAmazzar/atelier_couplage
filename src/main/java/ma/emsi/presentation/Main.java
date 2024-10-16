package ma.emsi.presentation;


import ma.emsi.dao.entities.Etudiant;
import ma.emsi.dao.entities.EtudiantDAO;
import ma.emsi.dao.entities.EtudiantDAODictionary;
import ma.emsi.dao.entities.IEtudiantDAO;
import ma.emsi.metier.EtudiantManager;

public class Main {
    public static void main(String[] args) {
        //IEtudiantDAO etudiantDAO = new EtudiantDAO();
        IEtudiantDAO etudiantDAODictionary = new EtudiantDAODictionary();
        Etudiant e1 = new Etudiant(101, "Dupont", "Jean", "jean.dupont@example.com");
        Etudiant e2 = new Etudiant(102, "Martin", "Claire", "claire.martin@example.com");
        Etudiant e3 = new Etudiant(103, "El Amrani", "Youssef", "youssef.elamrani@example.com");
        Etudiant e4 = new Etudiant(104, "Ndiaye", "Fatou", "fatou.ndiaye@example.com");
        Etudiant e5 = new Etudiant(105, "Zhang", "Li", "li.zhang@example.com");
        //Etudiant e6 = new Etudiant(105, "Zhang", "Li", "li.zhang@example.com");
        //EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAODictionary);
        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);
        etudiantManager.addEtudiant(e5);
        //etudiantManager.addEtudiant(e6);
        e5.setPrenom("Ahmed");
        e5.setNom("Amine");
        e5.setEmail("Amine");
        etudiantManager.updateEtudiant(e5);
        System.out.println(etudiantManager.getAllEtudiants());

    }
}