package org.william.datatime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());
        System.out.println("Mes: " + fechaActual.getMonth());
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());
        fechaActual = LocalDate.of(2020, 10, 10);
        System.out.println("Fecha actual: " + fechaActual);

        fechaActual = LocalDate.of(2020, Month.NOVEMBER, 10);
        System.out.println("Fecha actual: " + fechaActual);

        fechaActual = LocalDate.parse("2020-11-10");
        System.out.println("Fecha actual: " + fechaActual);

        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("Mañana será: " + diaDeManiana);

//        LocalDate mesAnterior = LocalDate.now().minusMonths(1);
        LocalDate mesAnterior = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Mes anterior fue: " + mesAnterior);

        DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("El día de la semana de la fecha 2020-11-10 es: " + miercoles);

        int once = LocalDate.of(2020, 11, 11).getDayOfMonth();
        System.out.println("El día del mes de la fecha 2020-11-11 es: " + once);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("El año actual es bisiesto: " + esBisiesto);

        boolean esAntes = LocalDate.of(2020,11,11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("La fecha actual es antes de 2020-11-10: " + esAntes);

        boolean esDespues = LocalDate.of(2020,11,11).isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("La fecha actual es después de 2020-11-10: " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("La fecha actual es después de ayer: " + esDespues);

    }
}
