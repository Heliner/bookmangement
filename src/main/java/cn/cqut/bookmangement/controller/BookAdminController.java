package cn.cqut.bookmangement.controller;

import cn.cqut.bookmangement.DTO.BookAdminCenterDTO;
import cn.cqut.bookmangement.DTO.BorrowBookDTO;
import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.entity.BookAdmin;
import cn.cqut.bookmangement.entity.BookInfo;
import cn.cqut.bookmangement.entity.BorrowRecord;
import cn.cqut.bookmangement.service.BookAdminService;
import cn.cqut.bookmangement.service.BookInfoService;
import cn.cqut.bookmangement.service.BorrowRecordService;
import cn.cqut.bookmangement.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

import static cn.cqut.bookmangement.util.ResultGenerator.GENERATE_SUCCESS_RESULT;

@RestController
@RequestMapping("/bookAdmin")
public class BookAdminController {
    @Autowired
    BookAdminService bookAdminService;
    @Autowired
    BookInfoService bookInfoService;
    @Autowired
    BorrowRecordService borrowRecordService;

    @RequestMapping("/bookInLab")
    public AjaxResult A01(@RequestBody BorrowBookDTO bookInfo) {
        return GENERATE_SUCCESS_RESULT(bookInfoService.bookInLab(bookInfo));
    }

    @RequestMapping("/borrowBook")
    public AjaxResult A02(@RequestBody Set<BorrowRecord> borrowRecords) {
        bookInfoService.borrowBook(borrowRecords);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/returnBook")
    public AjaxResult A03(@RequestBody BorrowRecord borrowRecord) {
        bookInfoService.returnBook(borrowRecord);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/getSequence")
    public AjaxResult A04() {
        return GENERATE_SUCCESS_RESULT(bookInfoService.generatePK());
    }

    @RequestMapping("/insertBook")
    public AjaxResult A05(@RequestBody BookInfo bookInfo) {
        bookInfoService.insertBookSelective(bookInfo);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/oneBook")
    public AjaxResult A06(@RequestBody BookInfo bookInfo) {
        return GENERATE_SUCCESS_RESULT(bookInfoService.selectBookPK(bookInfo));
    }

    @RequestMapping("/deleteBook")
    public AjaxResult A07(@RequestBody BookInfo bookInfo) {
        bookInfoService.deleteByPK(bookInfo);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/updateBook")
    public AjaxResult A08(@RequestBody BookInfo bookInfo) {
        bookInfoService.update(bookInfo);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/searchBookIORec")
    public AjaxResult A09(@RequestBody SearchContent searchContent) {
        return GENERATE_SUCCESS_RESULT(borrowRecordService.searchRec(searchContent));
    }

    @RequestMapping("/searchBook")
    public AjaxResult A10(@RequestBody SearchContent searchContent) {
        return GENERATE_SUCCESS_RESULT(bookInfoService.selectBookPage(searchContent));
    }

    @RequestMapping("/updateBookAdmin")
    public AjaxResult A11(@RequestBody BookAdminCenterDTO bookAdminCenterDTO, HttpServletRequest request) {
        bookAdminService.update(bookAdminCenterDTO, request);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/getBookAdmin")
    public AjaxResult A12(HttpServletRequest request) {
        BookAdmin bookAdmin = bookAdminService.getBookAdmin(request);
        bookAdmin.setAdpassword("");
        return GENERATE_SUCCESS_RESULT(bookAdmin);
    }
}
