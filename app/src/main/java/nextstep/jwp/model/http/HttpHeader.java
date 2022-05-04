package nextstep.jwp.model.http;

public class HttpHeader {

    private HttpHeaderType headerType;
    private String headerValue;

    private HttpHeader(HttpHeaderType headerType, String headerValue) {
        this.headerType = headerType;
        this.headerValue = headerValue;
    }

    public static HttpHeader of(String headerLine) {
        String[] headers = headerLine.split(": ");
        return new HttpHeader(HttpHeaderType.of(headers[0]), headers[1]);
    }

    @Override
    public String toString() {
        return headerType + ": " + headerValue;
    }
}