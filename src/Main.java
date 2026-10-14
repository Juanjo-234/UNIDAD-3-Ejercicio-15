//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Enrutador enrutador = new Enrutador("RTR-CORE-01", "192.168.1.1", true);

    System.out.println("Intento 1 (IP Válida):");
    enrutador.setDireccionIP("10.0.0.254");

    System.out.println("\nIntento 2 (IP Inválida - Formato incompleto):");
    enrutador.setDireccionIP("192.168.1");

    System.out.println("\nIntento 3 (IP Inválida - Octeto fuera de rango > 255):");
    enrutador.setDireccionIP("256.100.50.1");
    
}
