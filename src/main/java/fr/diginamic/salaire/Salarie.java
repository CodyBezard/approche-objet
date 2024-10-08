package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    private Double salaireMensuel;
    private String contrat;
        public Salarie(String nom,String prenom, Double salaire){
            super(nom, prenom);
            this.salaireMensuel=salaire;
        }

        @Override
        public Double getSalaire(){
            return salaireMensuel;
        }

        @Override
        public String getStatut(){
            return "Salarié.e";
        }

}
