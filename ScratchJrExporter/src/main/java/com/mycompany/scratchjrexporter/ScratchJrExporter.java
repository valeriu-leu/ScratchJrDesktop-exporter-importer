/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.scratchjrexporter;

/**
 *
 * @author Dr
 */
public class ScratchJrExporter {

    public static void main(String[] args) {

        try {
            // Export
            SqlConnector connector = new SqlConnector("jdbc:sqlite:C://Users/Dr/Documents/ScratchJR/scratchjr.sqllite");

            ZipFileCreator z = new ZipFileCreator(connector);
            z.createExportFile("tmp/");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
