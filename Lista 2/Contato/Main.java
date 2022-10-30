class Main {
    public static void main(String[] args) {
      Contato contato = new Contato();
      
      contato.setInicializaDados("lukasceu@gmail.com", "7399990000","Lucas",04,07,2002);
      contato.setInicializaDadosAtuais(30, 10, 2022);
      contato.imprimeDados();
    }
  }