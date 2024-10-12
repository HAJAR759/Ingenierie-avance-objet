package exercice2;

class CompteEpargne extends Compte {

    public CompteEpargne(String id, String dateCreation) {
        super(id, dateCreation);
    }

    @Override
    public boolean addOperation(Operation operation) {
        if (operation.getTypeOperation() == TypeOperation.Debit) {
            this.operations.add(operation);
            this.montant += operation.getMontant() * 0.05;
            return true;
        } else {
            int currentYear = java.time.LocalDate.now().getYear();
            int yearCreation = Integer.parseInt(this.dateCreation.split("/")[2]);
            if (this.montant >= operation.getMontant() * 0.1 && currentYear > yearCreation) {
                this.operations.add(operation);
                this.montant -= operation.getMontant() * 0.1;
                return true;
            }
            return false;
        }
    }
}
