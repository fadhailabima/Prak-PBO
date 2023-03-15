class MTimSepakbola {
    public static void main(String[] args) {
      TimSepakbola liverpool = new TimSepakbola("Liverpool");
  
      TimSepakbola manchesterUnited = new TimSepakbola("Manchester United");
  
      liverpool.startTandingBola(manchesterUnited);
  
      for (int i = 0; i < 7; i++) {
        liverpool.goal();
  
        System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.getSkor() + " - " + manchesterUnited.getSkor() + " " + manchesterUnited.nama);
      }
  
      // call endTandingBola()
      manchesterUnited.endTandingBola(liverpool);
    }
  }
  
