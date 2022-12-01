package net.csibio.injection.client.domain.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.csibio.injection.client.constants.enums.ProjectStatus;
import net.csibio.injection.client.domain.bean.PlatformConfig;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

@Data
@Document(collection = "project")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDO implements Serializable {

    @Serial
    private static final long serialVersionUID = -3258829839112356627L;

    @Id
    String id;

    /**
     * 项目编号, 唯一键
     */
    @Indexed(unique = true)
    String name;

    /**
     * 项目名称,唯一值
     */
    @Indexed(unique = true)
    String alias;

    /**
     * 项目负责人
     */
    String owner;

    /**
     * 存储平台信息,Key为Platform名称
     */
    TreeMap<String, PlatformConfig> platformMap = new TreeMap<>();

    /**
     * 平台
     */
    Set<String> platforms;

    /**
     * 用户id
     */
    String userId;

    /**
     * 实验的创建日期
     */
    Date createDate;

    /**
     * 最后修改日期
     */
    Date lastModifiedDate;
}