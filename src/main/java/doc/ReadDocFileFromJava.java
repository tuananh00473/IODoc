//package doc;
//
///**
//* User: anhnt
//* Date: 11/26/13
//* Time: 4:39 PM
//*/
//import org.apache.poi.poifs.filesystem.*;
//import org.apache.poi.hpsf.DocumentSummaryInformation;
//import org.apache.poi.hwpf.*;
//import org.apache.poi.hwpf.extractor.*;
//import org.apache.poi.hwpf.usermodel.HeaderStories;
//
//import java.io.*;
//
//public class ReadDocFileFromJava {
//
//    public static void main(String[] args) {
//        /**This is the document that you want to read using Java.**/
//        String fileName = "E:\\test.doc";
//
//        /**Method call to read the document (demonstrate some useage of POI)**/
//        readMyDocument(fileName);
//
//    }
//    public static void readMyDocument(String fileName){
//        POIFSFileSystem fs = null;
//        try {
//            fs = new POIFSFileSystem(new FileInputStream(fileName));
//            HWPFDocument doc = new HWPFDocument(fs);
//
//            /** Read the content **/
//            readParagraphs(doc);
//
//            int pageNumber=1;
//
//            /** We will try reading the header for page 1**/
//            readHeader(doc, pageNumber);
//
//            /** Let's try reading the footer for page 1**/
//            readFooter(doc, pageNumber);
//
//            /** Read the document summary**/
//            readDocumentSummary(doc);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void readParagraphs(HWPFDocument doc) throws Exception{
//        WordExtractor we = new WordExtractor(doc);
//
//        /**Get the total number of paragraphs**/
//        String[] paragraphs = we.getParagraphText();
//        System.out.println("Total Paragraphs: "+paragraphs.length);
//
//        for (int i = 0; i<paragraphs.length; i++) {
//
//            System.out.println("Length of paragraph "+(i +1)+": "+ paragraphs[i].length());
//            System.out.println(paragraphs[i].toString());
//
//        }
//
//    }
//
//    public static void readHeader(HWPFDocument doc, int pageNumber){
//        HeaderStories headerStore = new HeaderStories( doc);
//        String header = headerStore.getHeader(pageNumber);
//        System.out.println("Header Is: "+header);
//
//    }
//
//    public static void readFooter(HWPFDocument doc, int pageNumber){
//        HeaderStories headerStore = new HeaderStories( doc);
//        String footer = headerStore.getFooter(pageNumber);
//        System.out.println("Footer Is: "+footer);
//
//    }
//
//    public static void readDocumentSummary(HWPFDocument doc) {
//        DocumentSummaryInformation summaryInfo=doc.getDocumentSummaryInformation();
//        String category = summaryInfo.getCategory();
//        String company = summaryInfo.getCompany();
//        int lineCount=summaryInfo.getLineCount();
//        int sectionCount=summaryInfo.getSectionCount();
//        int slideCount=summaryInfo.getSlideCount();
//
//        System.out.println("---------------------------");
//        System.out.println("Category: "+category);
//        System.out.println("Company: "+company);
//        System.out.println("Line Count: "+lineCount);
//        System.out.println("Section Count: "+sectionCount);
//        System.out.println("Slide Count: "+slideCount);
//
//    }
//
//}
