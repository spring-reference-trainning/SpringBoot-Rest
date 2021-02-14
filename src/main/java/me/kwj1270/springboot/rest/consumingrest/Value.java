package me.kwj1270.springboot.rest.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// 클래스에 선언되지 않은 프로퍼티가 json 에 있으면 바인딩 오류 발생,
// @JsonIgnoreProperties 는 이를 무시하는 Annotation
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }

}
