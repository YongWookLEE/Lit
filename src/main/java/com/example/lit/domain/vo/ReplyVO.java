package com.example.lit.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReplyVO {
    private Long replyNumber;
    private Long reviewNumber;
    private Long userNumber;
    private String replyContent;
    private String replyRegisterDate;

}
