public class SongNode {
   private String songTitle;
   private int songLength;
   private String songArtist;
   private SongNode nextNodeRef;  Reference to the next node                                   

   public SongNode() {
      songTitle = ;
      songLength = 0;
      songArtist = ;
      nextNodeRef = null;
   }

    Constructor                                                                                     
   public SongNode(String songTitleInit, int songLengthInit, String songArtistInit) {
      this.songTitle = songTitleInit;
      this.songLength = songLengthInit;
      this.songArtist = songArtistInit;
      this.nextNodeRef = null;
   }

    Constructor                                                                                     
   public SongNode(String songTitleInit, int songLengthInit, String songArtistInit, SongNode nextLoc) {
      this.songTitle = songTitleInit;
      this.songLength = songLengthInit;
      this.songArtist = songArtistInit;
      this.nextNodeRef = nextLoc;
   }

    insertAfter
   public void insertAfter(SongNode nodeLoc) {
      SongNode tmpNext;

      tmpNext = this.nextNodeRef;
      this.nextNodeRef = nodeLoc;
      nodeLoc.nextNodeRef = tmpNext;
   }

    Get location pointed by nextNodeRef                                                            
   public SongNode getNext() {
      return this.nextNodeRef;
   }

    TODO Write printSongInfo() method
   public String printSongInfo() {
      return Title +this.songTitle+nLength +this.songLength+nArtist +songArtist+n;
   }
}