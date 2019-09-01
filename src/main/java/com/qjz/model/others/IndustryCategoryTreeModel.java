package com.qjz.model.others;

import com.qjz.enums.post.PostTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 行业分类树
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/8/30 21:20
 **/
@Setter
@Getter
@Accessors(chain = true)
@ApiModel("行业分类树")
public class IndustryCategoryTreeModel {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("父节点id")
    private Integer parentId;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("职位类型")
    private PostTypeEnum type;
    @ApiModelProperty("子分类")
    private List<IndustryCategoryTreeModel> children;
}
