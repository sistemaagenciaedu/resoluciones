package resoluciones.example.demo.services;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import resoluciones.example.demo.entities.Resolucion;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
@Component
public class ResolucionImporter {

    public List<Resolucion> excelImport(MultipartFile file) {

        List<Resolucion> listaResoluciones= new ArrayList<>();

        //String excelFilePath = "C:\\Users\\jorge\\Desktop\\libro1.xlsx";
        long start = System.currentTimeMillis();

        FileInputStream inputStream;
        try {
            inputStream = (FileInputStream) file.getInputStream();
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();
            rowIterator.next();
            /***
             * datos de las resoluciones
             * */
            Long id=null;
            String tipoDeAgrupamiento=null;
            String tipodeGestion=null;
            String nomina=null;
            String tipoDeCertificacion=null;
            String denomiCertificacion=null;
            String marcoDeReferencia=null;
            String uRLresolucionAprobatoriaDC=null;
            String resolucionValidezNacional=null;
            String instituciones=null;
            Date fechaVencimientoUPlazoDeVigenciaCABA=null;
            Date fechaVencimientoUPlazoDeVigenciaNAC=null;
            String cargaHoraria=null;

            while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                id=null;
                tipoDeAgrupamiento=null;
                tipodeGestion=null;
                nomina=null;
                tipoDeCertificacion=null;
                denomiCertificacion=null;
                marcoDeReferencia=null;
                uRLresolucionAprobatoriaDC=null;
                resolucionValidezNacional=null;
                instituciones=null;
                fechaVencimientoUPlazoDeVigenciaCABA=null;
                fechaVencimientoUPlazoDeVigenciaNAC=null;
                cargaHoraria=null;
                while (cellIterator.hasNext()) {
                    /**
                     * **************Datos
                     * Duros********************************
                     */

                    Cell nextCell = cellIterator.next();
                    int columnIndex = nextCell.getColumnIndex();
                    switch (columnIndex) {

                        case 0:
                            System.out.println(nextCell.getCellType() + " id " + nextCell.getNumericCellValue());
                            id = (long) nextCell.getNumericCellValue();

                            break;
                        case 1:
                            System.out.println(nextCell.getCellType() + " tipoDeAgrupamiento " + nextCell.getStringCellValue());
                            tipoDeAgrupamiento = nextCell.getStringCellValue();

                            break;
                        case 2:
                            System.out.println(nextCell.getCellType() + " tipodeGestion " + nextCell.getStringCellValue());
                            tipodeGestion = nextCell.getStringCellValue();

                            break;
                        case 3:

                            System.out.println(nextCell.getCellType() + " nomina " + nextCell.getStringCellValue());
                            nomina = nextCell.getStringCellValue();

                            break;
                        case 4:
                            System.out.println(nextCell.getCellType() + " tipoDeCertificacion " + nextCell.getStringCellValue());
                            tipoDeCertificacion = nextCell.getStringCellValue();

                            break;
                        case 5:
                            System.out.println(nextCell.getCellType() + " denomiCertificacion " + nextCell.getStringCellValue());
                            denomiCertificacion = nextCell.getStringCellValue();

                            break;
                        case 6:
                            System.out.println(nextCell.getCellType() + " marcoDeReferencia " + nextCell.getStringCellValue());
                            marcoDeReferencia = nextCell.getStringCellValue();

                            break;
                            case 7:
                            System.out.println(nextCell.getCellType() + " uRLresolucionAprobatoriaDC " + nextCell.getStringCellValue());
                            uRLresolucionAprobatoriaDC = nextCell.getStringCellValue();

                            break;
                            case 8:
                            System.out.println(nextCell.getCellType() + " resolucionValidezNacional " + nextCell.getStringCellValue());
                                resolucionValidezNacional = nextCell.getStringCellValue();

                            break;
                            case 9:
                            System.out.println(nextCell.getCellType() + " instituciones " + nextCell.getStringCellValue());
                                instituciones = nextCell.getStringCellValue();

                            break;
                            case 10:
                            System.out.println(nextCell.getCellType() + " fechaVencimientoUPlazoDeVigenciaCABA " + nextCell.getDateCellValue());

                                fechaVencimientoUPlazoDeVigenciaCABA=nextCell.getDateCellValue();
                            break;
                            case 11:
                            System.out.println(nextCell.getCellType() + " fechaVencimientoUPlazoDeVigenciaCABA " +nextCell.getDateCellValue());

                                fechaVencimientoUPlazoDeVigenciaNAC=nextCell.getDateCellValue();
                            break;
                            case 12:
                            System.out.println(nextCell.getCellType() + " cargaHoraria " + nextCell.getStringCellValue());
                                cargaHoraria=nextCell.getStringCellValue();

                            break;

                    }

                }


                listaResoluciones.add(new Resolucion(id, tipoDeAgrupamiento, tipodeGestion, nomina, tipoDeCertificacion, denomiCertificacion,marcoDeReferencia, uRLresolucionAprobatoriaDC, resolucionValidezNacional, instituciones, fechaVencimientoUPlazoDeVigenciaCABA, fechaVencimientoUPlazoDeVigenciaNAC, cargaHoraria) );
                Iterator<Resolucion> iteradorReso=listaResoluciones.iterator();
                while (iteradorReso.hasNext()){
                    Resolucion nueva=iteradorReso.next();
                    if (nueva.getTipoDeAgrupamiento()==null){
                        listaResoluciones.remove(nueva);
                    }
                }

                             }

            workbook.close();
            long end = System.currentTimeMillis();
            System.out.printf("Import done in %d ms\n", (end - start));

        } catch (Exception e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }
        System.out.println("El tamañ de la lista antes de enviar es " + listaResoluciones.size());
        return listaResoluciones;
    }

}