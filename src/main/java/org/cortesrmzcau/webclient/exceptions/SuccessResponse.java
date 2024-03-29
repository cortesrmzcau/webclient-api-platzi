package org.cortesrmzcau.webclient.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SuccessResponse extends CommonResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object result;
}
