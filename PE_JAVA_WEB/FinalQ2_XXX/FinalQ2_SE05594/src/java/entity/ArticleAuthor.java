/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author tuans
 */
public class ArticleAuthor implements Serializable{
    private int articleID;
    private int authorID;
    
    
    public ArticleAuthor() {
    }

    public ArticleAuthor(int articleID, int authorID) {
        this.articleID = articleID;
        this.authorID = authorID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }
    
}
