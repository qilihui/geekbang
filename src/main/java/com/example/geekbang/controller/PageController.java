package com.example.geekbang.controller;

import com.example.geekbang.domain.vo.GeekDirVo;
import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.entity.GeekColumnContent;
import com.example.geekbang.entity.GeekColumnDirectory;
import com.example.geekbang.service.ColumnContentService;
import com.example.geekbang.service.ColumnDirectoryService;
import com.example.geekbang.service.ColumnService;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author qilihui
 * @date 2021/11/11 9:00 下午
 */
@Controller
@AllArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping("/page/column")
public class PageController {
    private final ColumnService columnService;
    private final ColumnDirectoryService columnDirectoryService;
    private final ColumnContentService columnContentService;

    private static final String DEFAULT_HTML = "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>%s</title></head><body>    %s</body></html>";


    @RequestMapping("/all")
    public String getAllColumn(Model model) {
        List<GeekColumn> columnList = columnService.getAllColumn();
        model.addAttribute("columnList", columnList);
        return "column";
    }

    @RequestMapping("/{sku}")
    public String getDirBySku(@PathVariable("sku") Integer sku, Model model) {
        List<GeekColumnDirectory> directoryList = columnDirectoryService.getBySku(sku);
        GeekColumn column = columnService.getBySku(sku);
        List<GeekDirVo> collect = directoryList.stream().map(x -> {
            GeekDirVo vo = new GeekDirVo();
            vo.setArticleTitle(x.getArticleTitle());
            vo.setUrl(x.getColumnSku() + "/" + x.getDirectoryId());
            return vo;
        }).collect(Collectors.toList());
        model.addAttribute("directoryList", collect);
        model.addAttribute("title", column.getTitle());
        return "dir";
    }

    @RequestMapping(value = "/{sku}/{dir}", produces = {MediaType.TEXT_HTML_VALUE})
    @ResponseBody
    public String getDirBySku(@PathVariable("sku") Integer sku, @PathVariable("dir") Integer dir) {
        GeekColumnContent content = columnContentService.getBySkuAndDir(sku, dir);
        if (Objects.isNull(content) || StringUtils.isEmpty(content.getArticleContent())) {
            return String.format(DEFAULT_HTML, "404", "页面是空的~~~");
        }
        return String.format(DEFAULT_HTML, content.getArticleTitle(), content.getArticleContent());
    }

}
