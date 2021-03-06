package src;
// @author Jhony_Angulo

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

public class ModeloTabla {

    public DefaultTableModel generarModelo(ResultSet res) {
        //Se crea variable a retornar
        DefaultTableModel DateTableModel = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        try {
            //Se aprovecha la clase ResultSetMetaData para convertir el resultset en una tablemodel, aquí se obtienen los metadatos
            ResultSetMetaData metaDatos = res.getMetaData();
            //Se extrae el número de columnas de la tabla
            int numCol = metaDatos.getColumnCount();
            //Se obtienen los nombres de cada columna
            for (int i = 0; i < numCol; i++) {
                //Se adicionan columnas al modelo
                DateTableModel.addColumn(metaDatos.getColumnName(i + 1));
            }
            //Se llena la tabla con filas.
            while (res.next()) {
                //Se crea un Array para cada fila
                Object[] fila = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                //Se adiciona fila al modelo
                DateTableModel.addRow(fila);
            }
            res.close();
        } catch (Exception e) {
        }
        //System.out.println("Modelo Tabla " + DateTableModel);
        //Se retorna el modelo
        return (DateTableModel);
    }
}
