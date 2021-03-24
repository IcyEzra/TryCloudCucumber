package net.trycloud.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {


    @Test
    public void excel_read_test() throws IOException {

        // To be able to read from excel file we need to load the file
        // Declare a string and copy the content path of file and pass it as String then pass it in argument
        // Handle exception with throws, IOException covers most if not all exceptions
        String path = "src/test/resources/TestData/B21-TryCloud credentials.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        // Workbook > Sheet > Row > Cell
        // We created workbook instance and loaded "SampleData" file
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // Create the sheet and pass the name of the sheet we want to work on
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // Row --> Sheet, follows index rules, starts from 0
        System.out.println(sheet.getRow(1).getCell(0));

        System.out.println(sheet.getRow(4).getCell(0));

        // returns count of cells used only, starts counting from 1, if cells are not used they will not be counted
        int usedRows = sheet.getPhysicalNumberOfRows(); // = 5

        // returns the count from top to bottom, even counts if there are empty cells, starts counting from 0
        int lastUseRow = sheet.getLastRowNum(); // = 4

        System.out.println(usedRows);
        System.out.println(lastUseRow);


    }


}
