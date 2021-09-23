package Controlador;

import Modelo.Nodo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EstructReg {

    public Nodo ini; 
    public int tam; 
    

    public EstructReg() {
        ini = null; 
        tam = 0;
    }

    public boolean esVacia() {
        return ini == null;
    }

    public int getTam() {
        return tam;
    }

    public void agregarFinal(int id, int creditos, String nombre, String apellido) {

        if (consultar(id) == null) {

            Nodo nuevo = new Nodo();

            nuevo.setId(id);
            nuevo.setNombre(nombre);
            nuevo.setApellido(apellido);
            nuevo.setCreditos(creditos);

            if (esVacia()) {
                ini = nuevo;
            } else {
                Nodo aux = ini;
                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(nuevo);
            }
            tam++;
        } else {
            JOptionPane.showMessageDialog(null, "El codigo a guardar ya existe");
        }

    }

    public void agregarInicio(int id, int creditos, String nombre, String apellido) {

        if (consultar(id) == null) {
            Nodo nuevo = new Nodo();

            nuevo.setId(id);
            nuevo.setNombre(nombre);
            nuevo.setApellido(apellido);
            nuevo.setCreditos(creditos);

            if (esVacia()) {
                ini = nuevo;
            } else {
                nuevo.setSiguiente(ini);
                ini = nuevo;
            }
            tam++;
        } else {
            JOptionPane.showMessageDialog(null, "El codigo a guardar ya existe");
        }

    }

    // ordenar Funcional
    public void ordenar() {
        int t = 1, c = 1;
        Nodo act = ini;/*definimos que el apuntador act esta en el primer nodo*/
        while (act.getSiguiente() != null)//Este while cuenta el total de nodos.
        {
            act = act.getSiguiente();
            c++;
        }
        /* estas 2 variebles solo son variables que guardaran el valor temporalmente*/
        int tem = 0;
        String tem1 = "";
        //aqui se hace el ordenamiento
        do {
            act = ini;//aux esta en el primer nodo
            Nodo sig = act.getSiguiente();//esta en el siguiente nodo 
            while (act.getSiguiente() != null) {
                if (act.getId() > sig.getId()) {
                    tem = act.id;
                    tem1 = act.nombre;
                    act.id = sig.id;
                    act.nombre = sig.nombre;
                    sig.id = tem;
                    sig.nombre = tem1;
                    //imprimir();
                    act = act.getSiguiente();
                    sig = sig.getSiguiente();
                } else {
                    //[1] [3] [2]
                    //    act sig 
                    act = act.getSiguiente();
                    sig = sig.getSiguiente();
                    //imprimir();
                }
            }
            t++;
        } while (t <= c);//act.ap_sig != null);
    }

    public void eliminar(int codigo) {
        if (consultar(codigo) != null) {
            if (ini.getId() == codigo) {
                ini = ini.getSiguiente();
            } else {
                Nodo aux = ini;
                while (aux.getSiguiente().getId() != codigo) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
            tam--;
            JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Codigo inexistente");
        }
    }

    public void eliminarFinal() {
        if (!esVacia() && tam >= 2) {
            Nodo aux = ini;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
            tam--;
            JOptionPane.showMessageDialog(null, "Datos Finales eliminados");
        } else {
            JOptionPane.showMessageDialog(null, "No datos suficientes para eliminar el ultimo elemento");
        }
    }

    public void eliminarInicial() {
        if (!esVacia() && tam >= 2) {
            ini = ini.getSiguiente();
            tam--;
            JOptionPane.showMessageDialog(null, "Datos Finales eliminados");
        } else {
            JOptionPane.showMessageDialog(null, "No datos suficientes para eliminar el ultimo elemento");
        }

    }

    public Object[] consultar(int codigo) {
        Object datos[] = new Object[4];
        Nodo aux = ini;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {
            if (codigo == aux.getId()) {
                encontrado = true;
                datos[0] = aux.getId();
                datos[1] = aux.getNombre();
                datos[2] = aux.getApellido();
                datos[3] = aux.getCreditos();

            } else {
                aux = aux.getSiguiente();
            }
        }
        if (encontrado == true) {
            return datos;
        } else {
            return null;
        }
    }

    public void listar(JTable jtbDatos, DefaultTableModel Model) {
        Object datosTabla[][];
        if (!esVacia() && tam >= 1) {
            Nodo aux = ini;
            datosTabla = new Object[tam][4];
            int i = 0;
            while (aux != null) {
                datosTabla[i][0] = aux.getId();
                datosTabla[i][1] = aux.getNombre();
                datosTabla[i][2] = aux.getApellido();
                datosTabla[i][3] = aux.getCreditos();

                aux = aux.getSiguiente();
                i++;
            }
            String cabecera[] = {
                "ID", "NOMBRE", "APELLIDO", "N° CREDITOS"
            };
            Model = new DefaultTableModel(datosTabla, cabecera);
            jtbDatos.setModel(Model);
        }
    }

}
