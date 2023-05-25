
package primertrabajo5;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipularPrograma {

    private final AccionesPersona control;

    public ManipularPrograma() {
        control = new AccionesPersona();
    }

    public void menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al programa para manipular pukamones");
        System.out.println("Elija la opcion deseada");
        System.out.println("1. Mostrar todos los pukamones");
        System.out.println("2. Registrar nuevo pukamon");
        System.out.println("3. Editar los datos del pukamon");
        System.out.println("4. Borrar el pukamon");
        System.out.println("5. Salir");

        int opcion = Integer.parseInt(entrada.nextLine());

        switch (opcion) {
            case 1:
                ArrayList<Persona> listaPersonas = control.mostrarPersonas();
                for (Persona objeto : listaPersonas) {
                    System.out.println("El id del pukamon es: " + objeto.getId() + "\n"
                            + "El nombre del pukamon es: " + objeto.getNombre() + "\n"
                            + "El apellido paterno del pukamon es: " + objeto.getApellido_Paterno()+ "\n"
                            + "El apellido materno del pukamon es: " + objeto.getApellido_Materno()+ "\n"
                            + "La edad del pukamon es: " + objeto.getEdad()+ "\n"
                            + "La direccion del pukamon es: " + objeto.getDireccion()+ "\n"
                            + "La colonia del pukamon es: " + objeto.getColonia()+ "\n");
                }
                menu();
                break;
            case 2:
                System.out.println("Ingrese el id del pukamon");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el nombre del pukamon:");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingrese el apellido paterno del pukamon:");
                String apellido_paterno = entrada.nextLine(); 
                System.out.println("Ingrese el apellido materno del pukamon:");
                String apellido_materno = entrada.nextLine();
                System.out.println("Ingrese la edad del pukamon:");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese la direccion del pukamon:");
                String Direccion = entrada.nextLine();
                System.out.println("Ingrese la colonia del pukamon:");
                String colonia = entrada.nextLine();
                
                

                Persona personaPukamon = new Persona();
                personaPukamon.setId(idpersona);
                personaPukamon.setNombre(nombrepersona);
                personaPukamon.setApellido_Paterno(apellido_paterno);
                personaPukamon.setApellido_Materno(apellido_materno);
                personaPukamon.setEdad(edadpersona);
                personaPukamon.setDireccion(Direccion);
                personaPukamon.setColonia(colonia);
                

                control.agregarPersona(personaPukamon);
                System.out.println("Pukamon registrado.");
                menu();
                break;
            case 3:
              System.out.println(" Busqueda por ID:");
                idpersona = Integer.parseInt(entrada.nextLine());
                Persona personaBuscar = control.buscarPersona(idpersona);

                if (personaBuscar != null) {
                    System.out.println("La informacion del pukamon es:");
                    System.out.println("ID: " + personaBuscar.getId());
                    System.out.println("Nombre: " + personaBuscar.getNombre());
                    System.out.println("Apellido Paterno: " + personaBuscar.getApellido_Paterno());
                    System.out.println("Apellido Materno: " + personaBuscar.getApellido_Materno());
                    System.out.println("Edad: " + personaBuscar.getEdad());
                    System.out.println("Direccion: " + personaBuscar.getDireccion());
                    System.out.println("Colonia: " + personaBuscar.getColonia());

                    System.out.println("Ingrese el nuevo nombre:");
                    String nuevonombre = entrada.nextLine();
                    System.out.println("Ingrese el nuevo apellido paterno:");
                    String nuevoapellidoP = entrada.nextLine();
                    System.out.println("Ingrese el nuevo apellido materno:");
                    String nuevoapellidoM = entrada.nextLine();
                    System.out.println("Ingrese la nueva edad:");
                    int nuevaedad = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese la nueva direccion:");
                    String nuevaDireccion = entrada.nextLine();
                    System.out.println("Ingrese la nueva colonia:");
                    String nuevaColonia = entrada.nextLine();

                    personaBuscar.setNombre(nuevonombre);
                    personaBuscar.setApellido_Paterno(nuevoapellidoP);
                    personaBuscar.setApellido_Materno(nuevoapellidoM);
                    personaBuscar.setEdad(nuevaedad);
                    personaBuscar.setDireccion(nuevaDireccion);
                    personaBuscar.setColonia(nuevaColonia);
                    
                    
                    
                    
                    control.actualizarPersona(personaBuscar);
                    System.out.println("Pukamon actualizado correctamente.");
                } else {
                    System.out.println("Pukamon no encontrado.");
                }
      
             menu();
             break;
                
           
        case 4: 
                System.out.println("Ingrese el id del pukamon a sacrificar");
                idpersona = Integer.parseInt(entrada.nextLine());
                //creo mi objeto para eliminar
                Persona personaEliminar = control.buscarPersona(idpersona);
                
                //la peto
                control.eliminarPersona(personaEliminar);
                
                System.out.println("Ese pukamon ya es libre");
                menu();
                break;
                
            default:
                System.out.println("Opcion no valida llegale");
                break;
        }
    
    }}
    

