package top.abigtree.wiki.pojo.analysis;

import java.util.List;

import lombok.AllArgsConstructor;
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
public class EntityBasicData {
    Integer id;

    LanguageEnum language;

    String lang;

    String label;

    String description;

    List<String> aliases;
}
