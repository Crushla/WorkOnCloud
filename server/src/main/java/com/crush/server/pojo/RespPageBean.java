package com.crush.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    /**
     * total总条数
     * data数据
     */
    private Long total;
    private List<?> data;
}
