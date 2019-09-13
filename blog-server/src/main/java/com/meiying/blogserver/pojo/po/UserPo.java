package com.meiying.blogserver.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Repository;


@Repository
@TableName("users")
@Data
public class UserPo {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "nickname")
    private String nickName;

    @TableField(value = "sex")
    private int sex;

    @TableField(value = "signature")
    private String signature;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", signature='" + signature + '\'' +
                '}';
    }
}
