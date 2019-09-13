package com.meiying.blogserver.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.math.BigDecimal;

@Repository
@TableName("wzry_account")
@Data
public class WzryAccountPo implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @TableField(value = "location")
    private String location;

    @TableField(value = "title")
    private String title;

    @TableField(value = "skin_num")
    private int skinNum;

    @TableField(value = "hero_num")
    private int heroNum;

    @TableField(value = "price")
    private BigDecimal price;

    @TableField(value = "detail")
    private String detail;

    @TableField(value = "user_id")
    private int userId;

    @TableField(value = "rank")
    private String rank;

    @TableField(value = "credit")
    private int credit;

    @Override
    public String toString() {
        return "WzryAccountPo{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", skinNum=" + skinNum +
                ", heroNum=" + heroNum +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", userId=" + userId +
                ", rank='" + rank + '\'' +
                ", credit=" + credit +
                '}';
    }
}
