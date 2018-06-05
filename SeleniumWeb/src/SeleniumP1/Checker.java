package SeleniumP1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Checker {
    public String imgUrl;

    public String wiseSaying = "\n" +
            "</p>\n" +
            "        </div>\n" +
            "        <div class=\"card-action\">\n" +
            "          <a href=\"#\">This is a link</a>\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "  </div>" +
            "\n" +
            "      <!--   Icon Section   -->\n" +
            "      <div class=\"row\">\n" +
            "        <div class=\"col s12 m4\">\n" +
            "          <div class=\"icon-block\">\n" +
            "            <h2 class=\"center light-blue-text\"><i class=\"material-icons\">flash_on</i></h2>\n" +
            "            <h5 class=\"center\">Speeds up development</h5>\n" +
            "\n" +
            "            <p class=\"light\">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>\n" +
            "          </div>\n" +
            "        </div>\n" +
            "\n" +
            "        <div class=\"col s12 m4\">\n" +
            "          <div class=\"icon-block\">\n" +
            "            <h2 class=\"center light-blue-text\"><i class=\"material-icons\">group</i></h2>\n" +
            "            <h5 class=\"center\">User Experience Focused</h5>\n" +
            "\n" +
            "            <p class=\"light\">By utilizing elements and principles of Material Design, we were able to create a framework that incorporates components and animations that provide more feedback to users. Additionally, a single underlying responsive system across all platforms allow for a more unified user experience.</p>\n" +
            "          </div>\n" +
            "        </div>\n" +
            "\n" +
            "        <div class=\"col s12 m4\">\n" +
            "          <div class=\"icon-block\">\n" +
            "            <h2 class=\"center light-blue-text\"><i class=\"material-icons\">settings</i></h2>\n" +
            "            <h5 class=\"center\">Easy to work with</h5>\n" +
            "\n" +
            "            <p class=\"light\">We have provided detailed documentation as well as specific code examples to help new users get started. We are also always open to feedback and can answer any questions a user may have about Materialize.</p>\n" +
            "          </div>\n" +
            "        </div>\n" +
            "      </div>\n" +
            "\n" +
            "    </div>\n" +
            "    <br><br>\n" +
            "  </div>\n" +
            "\n" +
            "  <footer class=\"page-footer orange\">\n" +
            "    <div class=\"container\">\n" +
            "      <div class=\"row\">\n" +
            "        <div class=\"col l6 s12\">\n" +
            "          <h5 class=\"white-text\">Company Bio</h5>\n" +
            "          <p class=\"grey-text text-lighten-4\">We are a team of college students working on this project like it's our full time job. Any amount would help support and continue development on this project and is greatly appreciated.</p>\n" +
            "\n" +
            "\n" +
            "        </div>\n" +
            "        <div class=\"col l3 s12\">\n" +
            "          <h5 class=\"white-text\">Settings</h5>\n" +
            "          <ul>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 1</a></li>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 2</a></li>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 3</a></li>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 4</a></li>\n" +
            "          </ul>\n" +
            "        </div>\n" +
            "        <div class=\"col l3 s12\">\n" +
            "          <h5 class=\"white-text\">Connect</h5>\n" +
            "          <ul>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 1</a></li>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 2</a></li>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 3</a></li>\n" +
            "            <li><a class=\"white-text\" href=\"#!\">Link 4</a></li>\n" +
            "          </ul>\n" +
            "        </div>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "    <div class=\"footer-copyright\">\n" +
            "      <div class=\"container\">\n" +
            "      Made by <a class=\"orange-text text-lighten-3\" href=\"http://materializecss.com\">Materialize</a>\n" +
            "      </div>\n" +
            "    </div>\n" +
            "  </footer>\n" +
            "\n" +
            "\n" +
            "  <!--  Scripts-->\n" +
            "  <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n" +
            "  <script src=\"js/materialize.js\"></script>\n" +
            "  <script src=\"js/init.js\"></script>\n" +
            "\n" +
            "  </body>\n" +
            "</html>\n";

    public String getWiseSaying() {
        return wiseSaying;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getSandwithch(String thi) {
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
