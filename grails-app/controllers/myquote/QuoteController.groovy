package myquote

class QuoteController {
    static scaffold = Quote
    static defaultAction = "home"
    def quoteService


    def home() {
        def staticAuthor = "Me";
        def staticContent = "Practice makes Perfect:)"
        [author: staticAuthor, content: staticContent]
    }


    def random() {
        Quote randomQuote = quoteService.getRandomQuote()
        [quote: randomQuote]
    }

    def ajaxRandom(){
        def randomQuote = quoteService.getRandomQuote()
        render{
            q(randomQuote.content)
            p(randomQuote.author)
        }
    }
}
