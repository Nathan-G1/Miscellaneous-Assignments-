package SeleniumP1;

public class TestHere {
    public static void main(String[] args){
        System.out.println(getSandwithch("hhh"));
    }
    public static String getSandwithch(String thi) {
        String sandwithch = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0\"/>\n" +
                "  <title>Starter Template - Materialize</title>\n" +
                "\n" +
                "  <!-- CSS  -->\n" +
                "  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n" +
                "  <link href=\"css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n" +
                "  <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <nav class=\"light-blue lighten-1\" role=\"navigation\">\n" +
                "    <div class=\"nav-wrapper container\"><a id=\"logo-container\" href=\"#\" class=\"brand-logo\">NEWS SUCKER</a>\n" +
                "      <ul class=\"right hide-on-med-and-down\">\n" +
                "        <li><a href=\"#\">Navbar Link</a></li>\n" +
                "      </ul>\n" +
                "\n" +
                "      <ul id=\"nav-mobile\" class=\"sidenav\">\n" +
                "        <li><a href=\"#\">Navbar Link</a></li>\n" +
                "      </ul>\n" +
                "      <a href=\"#\" data-target=\"nav-mobile\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\n" +
                "    </div>\n" +
                "  </nav>\n" +
                "  <div class=\"section no-pad-bot\" id=\"index-banner\">\n" +
                "    <div class=\"container\">\n" +
                "      <br><br>\n" +
                "      <h1 class=\"header center orange-text\">NEWS sucker</h1>\n" +
                "      \n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"section\">\n" +
                "\n" +
                "      <!-- here goes the first section -->\n" +
                "<div class=\"row\">\n" +
                "    <div class=\"col s11 m12\">\n" +
                "      <div class=\"card\">\n" +
                "        <div class=\"card-image\">\n" +
                "          <img src=\""+ thi + "\">\n"+
                "          <span class=\"card-title\">News Pic</span>\n" +
                "        </div>\n" +
                "        <div class=\"card-content\">\n" +
                "          <p>";

        return sandwithch;
    }
}
