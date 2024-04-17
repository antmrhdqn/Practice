package com.ohgiraffers.practice4.shape.manager;

import com.ohgiraffers.practice4.shape.model.dto.ShapeDTO;

public class TriangleManager {
    public void calcPerimeter(ShapeDTO shape) {
        System.out.println("아무리 찾아도 밑변과 높이로 삼각형의 둘레 구하는 법을 모르겠음");
    }

    public void calcArea(ShapeDTO shape) {
        double area = (shape.getWidth() * shape.getHeight())/2;
        System.out.println(area);
    }

    public void printShape(ShapeDTO shape) {
        System.out.println("도형 타입 : 삼각형" );
        System.out.println("높이 : " + shape.getHeight());
        System.out.println("너비 : " + shape.getWidth());
        System.out.println("색상 : " + shape.getColor());
    }

    public void paintColor(ShapeDTO shape, String Color) {
        shape.setColor(Color);
    }

}
