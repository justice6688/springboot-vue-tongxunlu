package com.zheng.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zy
 * @date 2021-10-21
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @JsonProperty(value = "Fid")
    @TableId(type = IdType.AUTO)
    private Integer Fid;

    // SpringBoot使用 @RequestBody 接受不到参数的问题
    @JsonProperty(value = "Fname")
    private String Fname;

    @JsonProperty(value = "Fphone")
    private String Fphone;

    @JsonProperty(value = "Faddress")
    private String Faddress;

    @JsonProperty(value = "deleted")
    @TableLogic //逻辑删除
    private Integer deleted;

}
