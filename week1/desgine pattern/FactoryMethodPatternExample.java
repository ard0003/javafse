 public class FactoryMethodPatternExample {

    // 1. Document Interface
    interface Document {
        void open();
    }

    // 2. Concrete Document Classes
    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening a Word Document.");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening a PDF Document.");
        }
    }

    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening an Excel Document.");
        }
    }

    // 3. Abstract Factory
    static abstract class DocumentFactory {
        public abstract Document createDocument();
    }

    // 4. Concrete Factorie
    static class WordFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    static class PdfFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    static class ExcelFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}

