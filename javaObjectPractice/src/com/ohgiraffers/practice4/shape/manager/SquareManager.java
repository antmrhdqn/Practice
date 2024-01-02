package com.ohgiraffers.practice4.shape.manager;

import com.ohgiraffers.practice4.shape.model.dto.ShapeDTO;

public class SquareManager {
    public void calcPerimeter(ShapeDTO shape) {
        double perimeter = 2 * (shape.getWidth() + shape.getHeight());
        System.out.println("사각형의 둘레는 " + perimeter +"입니다.");
    }

    public void calcArea(ShapeDTO shape) {
        double area = shape.getWidth() * shape.getHeight();
        System.out.println(area);
    }

    public void printShape(ShapeDTO shape) {
        System.out.println("도형 타입 : 사각형" );
        System.out.println("높이 : " + shape.getHeight());
        System.out.println("너비 : " + shape.getWidth());
        System.out.println("색상 : " + shape.getColor());
    }

    public void paintColor(ShapeDTO shape, String Color) {
        shape.setColor(Color);
    }

}
