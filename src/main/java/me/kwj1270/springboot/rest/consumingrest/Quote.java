package me.kwj1270.springboot.rest.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// 클래스에 선언되지 않은 프로퍼티가 json 에 있으면 바인딩 오류 발생,
// @JsonIgnoreProperties 는 이를 무시하는 Annotation
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    // @JsonProperty("json key")을 이용하면, 해당 key 로 매핑을 진행한다.(바인딩)
    private String type;
    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }

}
