package top.abigtree.wiki.pojo;

import java.util.List;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiSiteLink {
    String site;

    String title;

    List<String> badges;

    String url;
}
