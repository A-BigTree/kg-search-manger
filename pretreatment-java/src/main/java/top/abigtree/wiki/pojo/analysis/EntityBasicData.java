package top.abigtree.wiki.pojo.analysis;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.abigtree.wiki.enums.LanguageEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntityBasicData {
    private Integer id;

    private LanguageEnum language;

    private String lang;

    private String label;

    private String description;

    private List<String> aliases;
}
