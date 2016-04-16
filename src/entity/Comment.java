package entity;

public class Comment {
    private int commentID;
    private String mytime;
    private String content;
    private int score;
    
    public Comment (int commentID, String mytime, String content, int score){
      this.commentID = commentID;
      this.mytime = mytime;
      this.content = content;
      this.score = score;
    }
    
    public int getCommentID(){
      return commentID;
    }
    
    public void setCommentID(commentID){
      this.commentID = commentID;
    }
    
    public String getMytime(){
      return mytime;
    }
    
    public void setMytime(mytime){
      this.mytime = mytime;
    }
    
        public String getContent(){
      return content;
    }
    
    public void setContent(content){
      this.content = content;
    }
    
    public int getScore(){
      return score;
    }
    
    public void setScore(score){
      this.score = score;
    }
}
