package egovframework.example.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * FAQ를 처리하는 VO 클래스
 * Spring Boot 변환 버전
 * Lombok 사용
 * 
 * @since 2009.04.01
 * @version 1.1
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FaqManageVO extends FaqManageDefaultVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** FAQ ID */
    private String faqId;

    /** 질문제목 */
    private String qestnSj;

    /** 질문내용 */
    private String qestnCn;

    /** 답변내용 */
    private String answerCn;

    /** 조회횟수 */
    private String inqireCo;

    /** 첨부파일ID */
    private String atchFileId;

    /** 최초등록시점 */
    private String frstRegisterPnttm;

    /** 최초등록자ID */
    private String frstRegisterId;

    /** 최종수정시점 */
    private String lastUpdusrPnttm;

    /** 최종수정자ID */
    private String lastUpdusrId;
}
