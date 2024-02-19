
public class Main {
    public static void main(String[] args) {
        Concursante c1 = new Concursante();
        Concursante c2 = new Concursante();
        Concursante [] concursantes = new Concursante[]{c1,c2};
        for(int i = 0; i< concursantes.length;i++){
            concursantes[i].nombre.nombre = Leer.leerTexto("Introduce el nombre del concursante "+(i+1)+": ");
            concursantes[i].nombre.primerApellido = Leer.leerTexto("Introduce el primer apellido del concursante "+(i+1)+": ");
            concursantes[i].nombre.segundoApellido = Leer.leerTexto("Introduce el segundo apellido del concursante "+(i+1)+": ");
            concursantes[i].nombreArtistico = Leer.leerTexto("Introduce el nombre artístico de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].domicilio.calle = Leer.leerTexto("Introduce la calle del domicilio de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].domicilio.numero = Leer.leerEntero("Introduce el número de la vivienda de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].domicilio.piso = Leer.leerEntero("Introduce el piso de la vivienda de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].domicilio.puerta = Leer.leerEntero("Introduce la puerta del domicilio de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].domicilio.cp = Leer.leerEntero("Introduce el código postal de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].domicilio.poblacion = Leer.leerTexto("Introduce la población de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].domicilio.provincia = Leer.leerTexto("Introduce la provincia de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].anyo = Leer.leerEntero("Introduce el año de nacimiento de "+concursantes[i].nombre.nombre+": ");
            concursantes[i].c.titulo = Leer.leerTexto("Introduce el título del concurso: ");
            concursantes[i].c.f.dia = Leer.leerEntero("Introduce el día en el que ha participado "+concursantes[i].nombre.nombre+": ");
            concursantes[i].c.f.mes = Leer.leerEntero("¿De qué mes?: ");
            concursantes[i].c.f.anyo = Leer.leerEntero("¿Y de qué año?: ");
            concursantes[i].c.t.horas = Leer.leerEntero("¿Cuántas horas estuvo concursando?: ");
            concursantes[i].c.t.minutos = Leer.leerEntero("¿Y cuántos minutos?: ");
            concursantes[i].c.t.segundos = Leer.leerEntero("¿Y cuántos segundos?: ");
        }
        for (Concursante c: concursantes){
            System.out.println(c.nombre.nombre+" "+c.nombre.primerApellido+" "+c.nombre.segundoApellido+", más conocid@ como "+c.nombreArtistico+", residente en calle "+c.domicilio.calle+", nº"+c.domicilio.numero+" ,"+c.domicilio.piso+" - "+c.domicilio.puerta+", con código postal "+c.domicilio.cp+" ("+c.domicilio.poblacion+", "+c.domicilio.provincia+") ,nacido en "+c.anyo+", ha participado en "+c.c.titulo+" el dia "+c.c.f.dia+"-"+c.c.f.mes+"-"+c.c.f.anyo+", realizando un tiempo de "+c.c.t.horas+" horas, "+c.c.t.minutos+" minutos, y "+c.c.t.segundos+" segundos.");
        }
    }
}