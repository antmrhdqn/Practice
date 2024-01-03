package com.ohgiraffers.practice4.shape.views;

import com.ohgiraffers.practice4.shape.manager.SquareManager;
import com.ohgiraffers.practice4.shape.manager.TriangleManager;
import com.ohgiraffers.practice4.shape.model.dto.ShapeDTO;

import java.util.Scanner;

public class ShapeMenu {

    private Scanner sc = new Scanner(System.in);


    public void mainMenu() {
        System.out.println("============ 도형계산기 ============");
        System.out.println("3. 삼각형");
        System.out.println("4. 사각형");
        System.out.println("9. 프로그램 종료");
        System.out.println("===================================");
        while (true) {
            System.out.print("계산하려는 도형을 선택하세요 : ");
            int type = sc.nextInt();
            sc.nextLine();
            if (type == 3) {
                System.out.print("높이를 입력하세요 : ");
                double height = sc.nextDouble();
                sc.nextLine();

                System.out.print("너비를 입력하세요 : ");
                double width = sc.nextDouble();

                ShapeDTO shape = new ShapeDTO(type, height, width);
                ShapeMenu shapeMenu = new ShapeMenu();
                shapeMenu.triangleMenu(shape);
                break;
            } else if (type == 4) {
                System.out.print("높이를 입력하세요 : ");
                double height = sc.nextDouble();
                sc.nextLine();

                System.out.print("너비를 입력하세요 : ");
                double width = sc.nextDouble();

                ShapeDTO shape = new ShapeDTO(type, height, width);
                ShapeMenu shapeMenu = new ShapeMenu();
                shapeMenu.squareMenu(shape);
                break;
            } else {
                System.out.println("계산할 수 없는 도형입니다. ");
            }
        }

    }

    private void triangleMenu(ShapeDTO shape) {
        TriangleManager triangleManager = new TriangleManager();
        ShapeMenu shapeMenu = new ShapeMenu();
        while (true) {
            System.out.println("======= 삼각형 계산기 =======");
            System.out.println("1. 삼각형의 둘레 구하기");
            System.out.println("2. 삼각형의 면적 구하기");
            System.out.println("3. 선택한 도형 정보 출력하기");
            System.out.println("4. 도형의 색상 칠하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.println("===========================");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                triangleManager.calcPerimeter(shape);
            } else if (menu == 2) {
                triangleManager.calcArea(shape);
            } else if (menu == 3) {
                triangleManager.printShape(shape);
            } else if (menu == 4) {
                System.out.print("어떤 색으로 도형을 칠할까요? : ");
                String color = shapeMenu.inputColor();
                triangleManager.paintColor(shape, color);
                System.out.println("선택하신 도형을 " + color + "로 색칠합니다. (다시 3번을 선택하면 색상은 " + color + "으로 변합니다.");
            } else if (menu == 9) {
                return;
            } else {
                System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택해주세요.");
            }

        }

    }

    private void squareMenu(ShapeDTO shape) {
        SquareManager squareManager = new SquareManager();
        ShapeMenu shapeMenu2 = new ShapeMenu();
        while (true) {
            System.out.println("======= 사각형 계산기 =======");
            System.out.println("1. 사각형의 둘레 구하기");
            System.out.println("2. 사각형의 면적 구하기");
            System.out.println("3. 선택한 도형 정보 출력하기");
            System.out.println("4. 도형의 색상 칠하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.println("===========================");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                squareManager.calcPerimeter(shape);
            } else if (menu == 2) {
                squareManager.calcArea(shape);
            } else if (menu == 3) {
                squareManager.printShape(shape);
            } else if (menu == 4) {
                System.out.print("어떤 색으로 도형을 칠할까요? : ");
                String color = shapeMenu2.inputColor();
                squareManager.paintColor(shape, color);
                System.out.println("선택하신 도형을 " + color + "로 색칠합니다. (다시 3번을 선택하면 색상은 " + color + "으로 변합니다.");
            } else if (menu == 9) {
                return;
            } else {
                System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택해주세요.");
            }

        }

    }

    private String inputColor() {
        String color = sc.nextLine();
        return color;
    }
}




