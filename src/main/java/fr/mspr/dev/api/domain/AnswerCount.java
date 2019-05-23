package fr.mspr.dev.api.domain;

public class AnswerCount {
    private String response;
    private Integer total;

    public AnswerCount(String response, Integer total) {
        this.response = response;
        this.total = total;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

