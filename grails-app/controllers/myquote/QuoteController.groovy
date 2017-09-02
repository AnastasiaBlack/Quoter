package myquote

class QuoteController {
    static scaffold = Quote
    static defaultAction = "home";
//
//    def index() {
//        redirect(action: "home")
//    }

    def home() {
        def staticAuthor = "Me";
        def staticContent = "Practice makes Perfect:)"
        [author: staticAuthor, content: staticContent]
    }


    def random() {
        List<Quote> allQuotes = Quote.getAll();
        Quote randomQuote
        if (allQuotes.size() > 0) {
            int randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = new Quote(author: "Alice", content: "We are all insane here.")
        }
        [quote: randomQuote]
    }
}
