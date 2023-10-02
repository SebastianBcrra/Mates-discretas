package matediscretas;

import java.util.*;
import javax.swing.JOptionPane;

public class Septiembre_19 {

    public static void main(String[] args) {
        Set<Integer> conjuntoA;
        Set<Integer> conjuntoB;
        Set<Integer> conjuntoC;
        Set<Integer> conjuntoD;
        Set<String> conjuntoX;
        Set<String> conjuntoY;
        Set<Integer> union;
        Set<Integer> union2;
        Set<String> unionString;
        Set<Integer> interseccion;
        Set<String> interseccionString;
        Set<Integer> diferencia;
        Set<Integer> diferencia2;
        Set<String> diferenciaString;
        Set<Integer> conjuntoUniversal;
        Set<String> conjuntoUniversalString;

        int opc, num, yesNO;
        String letter;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer? "
                    + "\n 1. Ejercicio 1 \n 2. Ejercicio 2 "
                    + "\n 3. Ejercicio 3 \n 4. Ejercicio 4"
                    + "\n 5. Ejercicio 5 \n 6. Ejercicio 6 \n 7. Ejercicio 7 "
                    + "\n 8. Ejercicio 8 \n 9. Ejercicio 9 \n 10. Ejercicio 10 "
                    + "\n 11. Ejercicio 11 \n 12. Ejercicio 12"));
            if (opc > 0 && opc <= 60) {
                switch (opc) {
                    case 1:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));

                        union = new HashSet<>(conjuntoA);
                        union.addAll(conjuntoB);
                        System.out.println("Unión: " + union);

                        break;
                    case 2:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoY = new HashSet<>(Arrays.asList("b", "c", "d"));

                        unionString = new HashSet<>(conjuntoX);
                        unionString.addAll(conjuntoY);
                        System.out.println("Unión: " + unionString);

                        break;
                    case 3:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));

                        System.out.println("Unión: ");

                        break;
                    case 4:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));

                        interseccion = new HashSet<>(conjuntoA);
                        interseccion.retainAll(conjuntoB);
                        System.out.println("Intersección: " + interseccion);

                        break;
                    case 5:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoY = new HashSet<>(Arrays.asList("b", "c", "d"));

                        interseccionString = new HashSet<>(conjuntoX);
                        interseccionString.retainAll(conjuntoY);
                        System.out.println("Intersección: " + interseccionString);
                        break;
                    case 6:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));

                        System.out.println("Interseccion: ");
                        break;
                    case 7:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));

                        diferencia = new HashSet<>(conjuntoA);
                        diferencia.removeAll(conjuntoB);
                        System.out.println("Diferencia (A - B): " + diferencia);
                        break;
                    case 8:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoY = new HashSet<>(Arrays.asList("b", "c", "d"));

                        diferenciaString = new HashSet<>(conjuntoX);
                        diferenciaString.removeAll(conjuntoY);
                        System.out.println("Diferencia (X - Y): " + diferenciaString);
                        break;
                    case 9:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));

                        diferencia = new HashSet<>(conjuntoA);
                        diferencia.removeAll(conjuntoX);
                        System.out.println("Diferencia (A - X): " + diferencia);
                        break;
                    case 10:
                        conjuntoA = new HashSet<>(Arrays.asList(3, 4));
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

                        Set<Integer> complemento = new HashSet<>(conjuntoUniversal);
                        complemento.removeAll(conjuntoA);
                        System.out.println("Complemento de A: " + complemento);
                        break;
                    case 11:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoUniversalString = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));

                        Set<String> complementoString = new HashSet<>(conjuntoUniversalString);
                        complementoString.removeAll(conjuntoX);
                        System.out.println("Complemento de X: " + complementoString);
                        break;
                    case 12:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

                        complemento = new HashSet<>(conjuntoUniversal);
                        complemento.removeAll(conjuntoX);
                        System.out.println("Complemento de X: " + complemento);
                        break;
                    case 13:
                        num = 3;
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

                        boolean perteneceA = conjuntoA.contains(num);
                        System.out.println("¿" + num + " pertenece a A? " + perteneceA);
                        break;
                    case 14:
                        letter = "d";
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c", "d"));

                        boolean perteneceX = conjuntoX.contains(letter);
                        System.out.println("¿" + letter + " pertenece a X? " + perteneceX);

                        break;
                    case 15:
                        num = 4;
                        letter = "b";
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));

                        perteneceX = conjuntoX.contains(letter);
                        perteneceA = conjuntoA.contains(num);

                        System.out.println("¿" + letter + " pertenece a A? " + perteneceX);
                        System.out.println("¿" + letter + " pertenece a X? " + perteneceX);
                        break;
                    case 16:
                        num = 5;
                        conjuntoA = new HashSet<>(Arrays.asList(6, 7, 8));

                        boolean noPerteneceA = !conjuntoA.contains(num);
                        System.out.println("¿" + num + " no pertenece a A? " + noPerteneceA);
                        break;
                    case 17:
                        letter = "a";
                        conjuntoX = new HashSet<>(Arrays.asList("x", "y", "z"));

                        boolean noPerteneceX = !conjuntoX.contains(letter);
                        System.out.println("¿" + letter + " no pertenece a X? " + noPerteneceX);
                        break;
                    case 18:
                        num = 5;
                        letter = "x";
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));

                        noPerteneceA = !conjuntoA.contains(num);
                        noPerteneceX = !conjuntoX.contains(letter);

                        System.out.println("¿" + num + " no pertenece a A? " + noPerteneceA);
                        System.out.println("¿" + letter + " no pertenece a X? " + noPerteneceX);
                        break;
                    case 19:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2));
                        conjuntoB = new HashSet<>(Arrays.asList(1, 2, 3, 4));

                        boolean esSubconjuntoOIgual = conjuntoA.containsAll(conjuntoB);
                        System.out.println("A es subconjunto o igual a B: " + esSubconjuntoOIgual);

                        break;
                    case 20:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
                        conjuntoY = new HashSet<>(Arrays.asList("a", "b", "c"));

                        boolean esSubconjuntoOIgualString = conjuntoX.containsAll(conjuntoY);
                        System.out.println("X es subconjunto o igual a Y: " + esSubconjuntoOIgualString);

                        break;
                    case 21:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));

                        esSubconjuntoOIgual = conjuntoA.containsAll(conjuntoX);
                        System.out.println("A es subconjunto o igual a X: " + esSubconjuntoOIgual);
                        break;
                    case 22:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2));
                        conjuntoB = new HashSet<>(Arrays.asList(1, 2, 3, 4));

                        boolean esSubconjuntoPropio = conjuntoA.containsAll(conjuntoB) && !conjuntoA.equals(conjuntoB);
                        System.out.println("A es subconjunto propio de B: " + esSubconjuntoPropio);
                        break;
                    case 23:
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
                        conjuntoY = new HashSet<>(Arrays.asList("a", "b", "c"));

                        boolean esSubconjuntoPropioString = conjuntoX.containsAll(conjuntoY) && !conjuntoX.equals(conjuntoY);
                        System.out.println("X es subconjunto propio de Y: " + esSubconjuntoPropioString);
                        break;
                    case 24:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));

                        esSubconjuntoPropio = conjuntoA.containsAll(conjuntoX) && !conjuntoA.equals(conjuntoX);
                        System.out.println("A es subconjunto propio de X: " + esSubconjuntoPropio);
                        break;
                    case 25:
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));

                        esSubconjuntoOIgual = conjuntoUniversal.containsAll(conjuntoA);
                        System.out.println("A es subconjunto del conjunto universal: " + esSubconjuntoOIgual);
                        break;
                    case 26:
                        conjuntoUniversalString = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
                        conjuntoX = new HashSet<>(Arrays.asList("b", "c", "d"));

                        esSubconjuntoOIgual = conjuntoUniversalString.containsAll(conjuntoX);
                        System.out.println("X es subconjunto del conjuntoi universal: " + esSubconjuntoOIgual);

                        break;
                    case 27:
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));

                        esSubconjuntoOIgual = conjuntoUniversal.containsAll(conjuntoA);
                        System.out.println("A es subconjunto del conjunto universal: " + esSubconjuntoOIgual);

                        conjuntoUniversalString = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
                        conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));

                        esSubconjuntoOIgual = conjuntoUniversalString.containsAll(conjuntoX);
                        System.out.println("X es subconjunto del conjuntoi universal: " + esSubconjuntoOIgual);

                        break;
                    case 28:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
                        conjuntoC = new HashSet<>(Arrays.asList(2, 4, 6));
                        conjuntoD = new HashSet<>(Arrays.asList(5, 6, 7));

                        union = new HashSet<>(conjuntoA);
                        union.addAll(conjuntoB);
                        System.out.println("A U B: " + union);

                        union2 = new HashSet<>(conjuntoC);
                        union2.addAll(conjuntoD);
                        System.out.println("C U D: " + union2);

                        interseccion = new HashSet<>(union);
                        interseccion.retainAll(union2);
                        System.out.println("(A U B) Intersección (C U D): " + interseccion);

                        break;

                    case 29:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

                        diferencia = new HashSet<>(conjuntoA);
                        diferencia.removeAll(conjuntoB);
                        System.out.println("Diferencia (A - B): " + diferencia);

                        diferencia2 = new HashSet<>(conjuntoB);
                        diferencia2.removeAll(conjuntoA);
                        System.out.println("Diferencia (B - A): " + diferencia2);

                        union = new HashSet<>(diferencia);
                        union.addAll(diferencia2);
                        System.out.println("A Δ B :(A - B) U (B - A): " + union);
                        break;

                    case 30:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5, 6));

                        complemento = new HashSet<>(conjuntoB);
                        complemento.removeAll(conjuntoA);
                        System.out.println("Complemento de A: " + complemento);

                        Set<Integer> complemento2 = new HashSet<>(conjuntoA);
                        complemento2.removeAll(conjuntoB);
                        System.out.println("Complemento de B: " + complemento2);

                        interseccion = new HashSet<>(complemento);
                        interseccion.retainAll(complemento2);
                        System.out.println("A'  ∩  B' : " + interseccion);

                        union = new HashSet<>(conjuntoA);
                        union.addAll(conjuntoB);
                        Set<Integer> complemento3 = new HashSet<>(union);
                        complemento3.removeAll(interseccion);
                        System.out.println("Complemento de (A'  ∩  B'): " + complemento);
                        break;

                    case 31:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
                        conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

                        complemento = new HashSet<>(conjuntoB);
                        complemento.removeAll(conjuntoA);
                        System.out.println("Complemento de A: " + complemento);

                        complemento2 = new HashSet<>(conjuntoA);
                        complemento2.removeAll(conjuntoB);
                        System.out.println("Complemento de B: " + complemento2);

                        interseccion = new HashSet<>(complemento);
                        interseccion.retainAll(complemento2);
                        System.out.println("A'  ∩  B' : " + interseccion);
                        break;
                    case 32:
                        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
                        conjuntoB = new HashSet<>(Arrays.asList(2, 3, 4, 5, 6));

                        interseccion = new HashSet<>(conjuntoA);
                        interseccion.retainAll(conjuntoB);
                        System.out.println("A  ∩  (B U {5,6})  : " + interseccion);

                        break;
                    case 33:
                        conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

                        complemento = new HashSet<>(conjuntoUniversal);
                        complemento.removeAll(conjuntoUniversal);
                        System.out.println("Complemento de U: " + complemento);
                        break;
                }
            } else {
                System.out.println("Ingrese un numero valido");
            }
            yesNO = JOptionPane.showConfirmDialog(null, "Desea ver otro ejercicio?", "EJERCICIOS", JOptionPane.YES_NO_OPTION);

        } while (yesNO == 0);
    }
}
