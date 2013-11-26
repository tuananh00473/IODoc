//package doc; /**
//* User: anhnt
//* Date: 11/26/13
//* Time: 8:55 AM
//*/
//import org.apache.poi.hwpf.HWPFDocument;
//import org.apache.poi.hwpf.extractor.WordExtractor;
//
//import java.io.File;
//import java.io.FileInputStream;
//
//public class DocReader {
//
//    public void readDocFile() {
//        File docFile = null;
//        WordExtractor docExtractor = null ;
//        WordExtractor exprExtractor = null ;
//        try {
//            docFile = new File("E:\\test.doc");
////A FileInputStream obtains input bytes from a file.
//            FileInputStream fis=new FileInputStream(docFile);
//
////A HWPFDocument used to read document file from FileInputStream
//            HWPFDocument doc = new HWPFDocument(fis);
//
//            docExtractor = new WordExtractor(doc);
//        }
//        catch(Exception exep)
//        {
//            System.out.println(exep.getMessage());
//        }
//
////This Array stores each line from the document file.
//        String [] docArray = docExtractor.getParagraphText();
//
//        for(int i=0;i<docArray.length;i++)
//        {
//            if(docArray[i] != null)
//                System.out.println("Line "+ i +" : " + docArray[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        DocReader reader = new DocReader();
//        reader.readDocFile();
//    }
//}
