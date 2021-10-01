package com.xkcoding.mongodb.convert;


import com.xkcoding.mongodb.model.Article;
import com.xkcoding.mongodb.model.ArticleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author liuqiang
 * @since 2021-10-01
 */
@Mapper
public interface ArticleConvert {
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

//    Article articleDTOtoArticle(ArticleDTO articleDTO);
    ArticleVO articleToArticleVO(Article article);
}
