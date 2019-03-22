package park.jdbc.rqw;

import java.util.List;

public interface ArticleDao {
	
	 List<Article> listArticle();
	 /** 목록 **/
	 
	 Article getArticle(String articleId);
	 /**  조회 **/
	 
	 void addArticle(Article artilce);
	
	 /**  등록 **/
	 
	 void updateArticle(Article article);
	
	/**  추가 **/
	 
	 void deleteArticle(String articleId);
	List<Article> listArticles() throws DaoException;
	
	 /** 사제 **/
	
	
	
}
