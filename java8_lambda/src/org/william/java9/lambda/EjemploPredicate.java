package org.william.java9.lambda;

import org.william.java9.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> test = num -> num > 5;
        System.out.println(test.test(10));

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_USER"));

        BiPredicate<Integer, Integer> test3 = (num1, num2) -> num1 > num2;
        System.out.println(test3.test(10, 5));

        BiPredicate<String, String> test4 = String::equals;
        System.out.println(test4.test("ROLE_USER", "ROLE_USER"));

        Usuario usuario = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario.setNombre("William");
        usuario2.setNombre("William");
        BiPredicate<Usuario, Usuario> test5 = (user1, user2) -> user1.getNombre().equals(user2.getNombre());
        System.out.println(test5.test(usuario, usuario2));

    }
}
