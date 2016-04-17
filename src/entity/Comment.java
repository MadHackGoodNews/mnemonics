package entity;

public class Comment {
    private int commentID;
    private String mytime;
    private String content;
    private double score;
    
    public Comment (int commentID, String mytime, String content, double score){
      this.commentID = commentID;
      this.mytime = mytime;
      this.content = content;
      this.score = score;
    }
    
    public int getCommentID(){
      return commentID;
    }
    
    public void setCommentID(int commentID){
      this.commentID = commentID;
    }
    
    public String getMytime(){
      return mytime;
    }
    
    public void setMytime(String mytime){
      this.mytime = mytime;
    }
    
        public String getContent(){
      return content;
    }
    
    public void setContent(String content){
      this.content = content;
    }
    
    public double getScore(){
      return score;
    }
    
    public void setScore(double score){
      this.score = score;
    }
}
