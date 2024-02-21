package com.ohgiraffers.common;

import java.util.Objects;

public class BoardDTO {
    private Long id;
    private String title;
    private String content;
    private MemberDTO writer;

    public BoardDTO() {
    }

    public BoardDTO(Long id, String title, String content, MemberDTO writer) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MemberDTO getWriter() {
        return writer;
    }

    public void setWriter(MemberDTO writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer=" + writer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardDTO boardDTO = (BoardDTO) o;
        return Objects.equals(id, boardDTO.id) && Objects.equals(title, boardDTO.title) && Objects.equals(content, boardDTO.content) && Objects.equals(writer, boardDTO.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, writer);
    }
}
