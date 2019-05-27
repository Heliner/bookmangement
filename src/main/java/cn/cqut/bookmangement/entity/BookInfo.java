package cn.cqut.bookmangement.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BookInfo {
    private String bookId;

    private String bookName;

    private String author;

    private String translator;

    private BigDecimal price;

    private String isbnCode;

    private Date comeUpTime;

    private String publishCompany;

    private Integer state;

    private String enteringMen;

    private Date enteringDate;

    public BookInfo(String bookId, String bookName, String author, String translator, BigDecimal price, String isbnCode, Date comeUpTime, String publishCompany, Integer state, String enteringMen, Date enteringDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.translator = translator;
        this.price = price;
        this.isbnCode = isbnCode;
        this.comeUpTime = comeUpTime;
        this.publishCompany = publishCompany;
        this.state = state;
        this.enteringMen = enteringMen;
        this.enteringDate = enteringDate;
    }

    public BookInfo() {
        super();
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator == null ? null : translator.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode == null ? null : isbnCode.trim();
    }

    public Date getComeUpTime() {
        return comeUpTime;
    }

    public void setComeUpTime(Date comeUpTime) {
        this.comeUpTime = comeUpTime;
    }

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany == null ? null : publishCompany.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getEnteringMen() {
        return enteringMen;
    }

    public void setEnteringMen(String enteringMen) {
        this.enteringMen = enteringMen == null ? null : enteringMen.trim();
    }

    public Date getEnteringDate() {
        return enteringDate;
    }

    public void setEnteringDate(Date enteringDate) {
        this.enteringDate = enteringDate;
    }


}