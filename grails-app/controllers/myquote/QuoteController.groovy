package myquote

class QuoteController {
    static defaulAction = "home";
	
	def index(){
	redirect(action:"home")}
	
	def home(){
	def staticAuthor = "Me";
	def staticContent = "Practice makes Perfect:)"
    [ author: staticAuthor, content: staticContent]
	}

	
	def random() {
      def staticAuthor = "The Cat"
      def staticContent = "Real Programmers don't eat much quiche"
      [ author: staticAuthor, content: staticContent]
    }
}
