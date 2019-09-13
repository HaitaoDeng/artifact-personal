package com.meiying.blogserver.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
@TableName("blogs")
public class BlogsPo implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private int blogId;

    @TableField(value = "user_id")
    private int userId;

    @TableField(value = "title")
    private String title;

    @TableField(value = "content")
    private byte[] content;

    @TableField(value = "blogs_group_id")
    private int blogsGroupId;

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public int getBlogsGroupId() {
        return blogsGroupId;
    }

    public void setBlogsGroupId(int blogsGroupId) {
        this.blogsGroupId = blogsGroupId;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "blogId=" + blogId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", blogsGroupId=" + blogsGroupId +
                '}';
    }
}
