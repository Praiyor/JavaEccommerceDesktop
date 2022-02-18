/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.model.tabel;

import br.udesc.prog2.models.products.Componente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pichau
 */
public class ComponenteTableModel extends AbstractTableModel{
    private List<Componente> componentes;
    
    private final String[] nomeColunas = {"Nome", "Categoria", "Status", "Pc"};
    private final int COLUNA_NOME = 0;
    private final int COLUNA_CATEGORIA = 1;
    private final int COLUNA_STATUS = 2;
    private final int COLUNA_PC = 3;
            
    public ComponenteTableModel (List<Componente> componentes){
        this.componentes = componentes;
    }

    @Override
    public int getRowCount() {
        return componentes.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
     @Override
    public String getColumnName(int column) {
        return nomeColunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Componente componente = this.componentes.get(rowIndex);
        String valor = null;
        switch(columnIndex){
            case COLUNA_NOME:
                valor = componente.getNome();
                break;
            case COLUNA_CATEGORIA:
                valor = componente.getCategoria();
                break;
            case COLUNA_STATUS:
                valor = componente.getStatus();
                break;    
            case COLUNA_PC:
                valor = componente.getPc().getNome();
                break;    
    }
        return valor;
    }
    
     public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == COLUNA_NOME && columnIndex == COLUNA_CATEGORIA  && columnIndex == COLUNA_PC)
            return false;
        return true;
    }
     
         @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    	Componente componente = this.componentes.get(rowIndex);
  
        switch (columnIndex) {
            case COLUNA_NOME:
                componente.setNome((String) aValue);
                break;
            case COLUNA_CATEGORIA:
                componente.setCategoria((String) aValue);
                break;
            case COLUNA_STATUS:
                componente.setStatus((String) aValue);
                break;  
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public void setComponentes(List<Componente> componentes) {
        this.componentes.clear();
        this.componentes.addAll(componentes);
    }
    
    public List<Componente> getComponentes() {
        return componentes;
    }
    
}
