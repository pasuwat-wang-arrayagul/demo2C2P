package demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuickPayRequest {
    @JsonProperty("GenerateQPReq")
    private GenerateQuickPayRequest generateQPReq ;

    public GenerateQuickPayRequest getGenerateQPReq() {
        return this.generateQPReq;
    }

    public void setGenerateQPReq(GenerateQuickPayRequest generateQPReq) {
       this.generateQPReq = generateQPReq;
    }
}
