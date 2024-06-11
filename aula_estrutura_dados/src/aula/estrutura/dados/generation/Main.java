package aula.estrutura.dados.generation;

import aula.estrutura.dados.generation.ex01.Ex01;
import aula.estrutura.dados.generation.ex02.Ex02;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex01 ex01 = new Ex01();
        Ex02 ex02 = new Ex02();

        ex01.execute();
        ex02.execute();


    }
}