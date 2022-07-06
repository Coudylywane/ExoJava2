package com.allocation;

import java.util.List;
import java.util.Scanner;

import com.allocation.model.Chambre;
import com.allocation.model.EtatChambre;
import com.allocation.model.Etudiant;
import com.allocation.model.Pavillon;
import com.allocation.model.TypeChambre;
import com.allocation.model.TypeEtudiant;
import com.allocation.services.ChambreService;
import com.allocation.services.EtudiantService;
import com.allocation.services.PavillonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {

        Scanner scanner = new Scanner(System.in);

        ChambreService chambreService = new ChambreService();
        PavillonService pavillonService = new PavillonService();
        EtudiantService etudiantService = new EtudiantService();

        int choix;
        int choix1;
        int choix2;

        do {

            System.out.println("1-Chambre");
            System.out.println("2-Pavillon");
            System.out.println("3-Etudiant");
            System.out.println("4-Quitter");

            System.out.println("Faites votre choix");

            choix = scanner.nextInt();

            switch (choix) {
                case 1:

                System.out.println("################ Menu Chambre #################");

                    do {
                        System.out.println("1-Ajouter");
                        System.out.println("2-Lister");
                        System.out.println("3-Retour");

                        System.out.println("Faites votre choix");

                        choix1 = scanner.nextInt();

                        switch (choix1) {
                            case 1:
                                    Chambre chambre = new Chambre();

                                    System.out.println("Entrer le numero de la chambre");
                                    chambre.setNumero(scanner.nextInt());

                                    System.out.println("Entrer le numero de l'etage");
                                    chambre.setNumeroEtage(scanner.nextInt());

                                    chambre.setEtatChambre(EtatChambre.DISPONIBLE);
                                    
                                    System.out.println("Choisir le type de chambre");
                                    System.out.println("1-COLLECTIVE , 2-PERSONNELLE");
                                    int choixType = scanner.nextInt();

                                    if (choixType == 1) {
                                        chambre.setTypeChambre(TypeChambre.COLLECTIVE); 
                                    }else{
                                        chambre.setTypeChambre(TypeChambre.PERSONNELLE);  
                                    }


                                    System.out.println("Voulez-vous lui affecter un pavillon");
                                    System.out.println("1-oui , 2-non");
                                    int choixPav = scanner.nextInt();

                                    if (choixPav == 1) {
                                        Pavillon pavillon = new Pavillon();
                                        System.out.println("Entrer l'id du pavillon");
                                        pavillon.setId(scanner.nextLong());;
/*                                         pavillon.setId(1L);
 */                                        chambre.setPavillon(pavillon);
                                    }
                                    chambreService.addChambre(chambre);
                                break;

                                case 2:
                            System.out.println("################ Autres Chambre #################");

                                do {

                                    System.out.println("1-Supprimer");
                                    System.out.println("2-Modifier");
                                    System.out.println("3-Archiver");
                                    System.out.println("4-Retour");

                                    List<Chambre> chambres = chambreService.getAllChambre();
                                    for(Chambre ch : chambres) {
                                        System.out.println("################ ID : " + ch.getId() + " ###########");
                                        System.out.println("Numero : " + ch.getNumero());
                                        System.out.println("Numero Etage : " + ch.getNumeroEtage());
                                        System.out.println("Etat Chambre : " + ch.getEtatChambre().name());
                                        System.out.println("Type Chambre : " + ch.getTypeChambre().name());
                                    }

                                    System.out.println("Faites votre choix");
                                    choix2 = scanner.nextInt();

                                    switch (choix2) {
                                        case 1:
                                                System.out.println("Entrer l'id de la chambre");
                                                int id = scanner.nextInt();
                                                chambre = chambreService.getOneChambre(id);
                                                if (chambre == null) {
                                                    System.out.println("Chambre inexistante");
                                                } else {
                                                    chambreService.deleteChambre(id);
                                                }
                                            
                                            break;

                                        case 2:
                                        System.out.println("Entrer l'id de la chambre");
                                        int ids = scanner.nextInt();
                                        chambre = chambreService.getOneChambre(ids);
                                        if (chambre == null) {
                                            System.out.println("Chambre inexistante");
                                        }else{
                                            System.out.println("Entrer le numero de la chambre");
                                            chambre.setNumero(scanner.nextInt());
        
                                            System.out.println("Entrer le numero de l'etage");
                                            chambre.setNumeroEtage(scanner.nextInt());
        
                                            chambre.setEtatChambre(EtatChambre.DISPONIBLE);
                                            System.out.println("Choisir le type de chambre");
                                            System.out.println("1-COLLECTIVE , 2-PERSONNELLE");
                                            int choixType1 = scanner.nextInt();
        
                                            if (choixType1 == 1) {
                                                chambre.setTypeChambre(TypeChambre.COLLECTIVE); 
                                            }else{
                                                chambre.setTypeChambre(TypeChambre.PERSONNELLE);  
                                            } 
                                            chambreService.modifierChambre(chambre);
                                        }

                                        break;


                                        case 3:
                                        System.out.println("Entrer l'id de la chambre");
                                        int idss = scanner.nextInt();
                                        chambre = chambreService.getOneChambre(idss);
                                        if (chambre == null) {
                                            System.out.println("Chambre inexistante");
                                        }else{
                                            
                                            chambre.setEtatChambre(EtatChambre.ARCHIVER);
                                            
                                            chambreService.archiverChambre(chambre);
                                        }

                                        break;
                                    
                                        default:
                                            break;
                                    }

                                    
                                } while (choix2 != 4);

                                    
                                break;  
                        
                            default:
                                break;
                        }


                      


                    } while (choix1 != 3);

                    
                    break;

                    case 2 :
                    System.out.println("################ Menu Pavillon #################");

                        do {
                            System.out.println("1-Ajouter");
                            System.out.println("2-Lister");
                            System.out.println("3-Retour");

                            System.out.println("Faites votre choix");

                            choix1 = scanner.nextInt();
                            switch (choix1) {
                                case 1: 
                                    Pavillon pavillon = new Pavillon();
                                    System.out.println("Entrer le Libelle du pavillon");
                                    pavillon.setNumero(scanner.nextLine());

                                    System.out.println("Entrer le nombre d'etages");
                                    pavillon.setNombreEtage(scanner.nextInt());

                                    pavillonService.addPavillon(pavillon);
                                break;

                                case 2:
                                System.out.println("################ Autres Pavillon #################");
                                do {
                                    System.out.println("1-Modifier");
                                    System.out.println("2-Retour");

                                    List<Pavillon> pavillons = pavillonService.getAllPavillons();
                                    for(Pavillon pav : pavillons) {
                                        System.out.println("################ ID : " + pav.getId() + " ###########");
                                        System.out.println("Libelle : " + pav.getNumero());
                                        System.out.println("Numero Etage : " + pav.getNombreEtage());
                    
                                    }

                                    System.out.println("Faites votre choix");
                                    choix2 = scanner.nextInt();

                                    switch (choix2) {
                                        case 1:
                                            System.out.println("Entrer l'id du pavillon");
                                            int id = scanner.nextInt();
                                            pavillon = pavillonService.getOnePavillon(id);

                                            if (pavillon == null) {
                                                System.out.println("Pavillon inexistant");
                                            }else{
                                                System.out.println("Entrer le Libelle du pavillon");
                                                pavillon.setNumero(scanner.next());

                                                System.out.println("Entrer le nombre d'etages");
                                                pavillon.setNombreEtage(scanner.nextInt());

                                                pavillonService.modifierPavillon(pavillon);;
                                            }

                                            break;
                                    
                                        default:
                                            break;
                                    }

                                    
                                } while (choix2 != 2);
                                break;
                            
                                default:
                                    break;
                            }
                            
                        } while (choix1 != 3);
                    break;

                    case 3 :
                    System.out.println("################ Menu Etudiant #################");

                    do {
                        System.out.println("1-Ajouter");
                        System.out.println("2-Lister");
                        System.out.println("3-Retour");

                        System.out.println("Faites votre choix");

                        choix1 = scanner.nextInt();
                        String adresse ;

                        switch (choix1) {
                            case 1: 
                                Etudiant etudiant = new Etudiant();
                                System.out.println("Entrer le matricule de l'etudiant");
                                etudiant.setMatricule(scanner.next());

                                System.out.println("Entrer le nom de l'etudiant");
                                etudiant.setNom(scanner.next());

                                System.out.println("Entrer le prenom de l'etudiant");
                                etudiant.setPrenom(scanner.next());

                                System.out.println("Entrer le login de l'etudiant");
                                etudiant.setLogin(scanner.next());

                                System.out.println("Choisir le type d'etudiant");
                                System.out.println("1-NONBOURSIER , 2-BOURSIER ");
                                int choixEtu = scanner.nextInt();

                                if (choixEtu == 1) {
                                    etudiant.setTypeEtudiant(TypeEtudiant.NONBOURSIER);
                                    System.out.println("Choisir l'adresse de l'etudiant");
                                    etudiant.setAdresse(scanner.next());
                                }else if(choixEtu == 2){
                                    etudiant.setTypeEtudiant(TypeEtudiant.BOURSIER);
                                    Chambre chambre = new Chambre();
                                    System.out.println("Entrer l'id du chambre");
                                    chambre.setId(scanner.nextLong());;
                                    etudiant.setChambre(chambre);
                                   
                                }

                                etudiantService.addEtudiant(etudiant);
                            break;
                        }

                    } while (choix1 != 3);
            
                default:
                    break;
            }

           
        } while (choix != 4);


    }
}
