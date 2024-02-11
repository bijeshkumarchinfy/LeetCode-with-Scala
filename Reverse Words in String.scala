object Solution {
    def reverseWords(s: String): String = {
        return s.split(" ").map(words=>words.trim).filter(_.matches("\\w+")).reverse.mkString(" ")
    }
}
