
public class Piece
{
   private int player;
   private boolean isKinged;
   
   public Piece(int myPlayer)
   {
     player = myplayer;
     isKinged = false;
   }
   
   public void setKing()
   {
     isKinged = true;
   }
   
   public boolean getKing()
   {
     return isKinged;
   }
   
   public boolean canMove()
   {
     
   }
   
   public int getPlayer()
   {
     return player;
   }
}
