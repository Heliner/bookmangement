package cn.cqut.bookmangement.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SearchContent {
    private String content;
    private Integer currentPage;
}
