package java15;

public class TextBlocks {
    public static void main(String[] args) {

        // いらん
        String html_ = """
            <html>
            
            </html>
            """;

        // 見やすいと思うけどなぁ
        String html = "";
        html += "\n<html>";
        html += "\n    <body>Hello</body>";
        html += "\n</html>";
        html += "\n";
    }
}
