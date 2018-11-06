public class FactoriesExample {
    public static void workWithDocument(DocumentFactory documentFactory) {
        Document doc = documentFactory.getDocument();
        doc.sign("Paul");
        doc.sign("Jack");
        System.out.println(doc.getSignatures());
        doc.printInfo();
    }

    public static void main(String[] args) {
        workWithDocument(new RegulationFactory());
        System.out.println();
        workWithDocument(new ContractFactory());
    }
}
