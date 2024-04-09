package inhatc.cse.spring.di.java_properties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class AdminConnect {
    private String adminId;
    private String adminPw;
    private String subId;
    private String subPw;

}
