package net.trycloud.utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_write() throws IOException {

        String path = "src/test/resources/TestData/B21-TryCloud credentials.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook > sheet > row > cell

        // loading excel workbook into class
        workbook = new XSSFWorkbook(fileInputStream);

        // open the sheet using workbook object
        sheet = workbook.getSheet("Sheet1");

        // Tony Starks row
        row = sheet.getRow(1);

        // Starks cell
        cell = row.getCell(1);


        System.out.println(cell);


        // Closing because we are done with them, not necessary but good practice to do
        fileInputStream.close();
        workbook.close();
    }

}
