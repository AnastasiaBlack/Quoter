package myquote

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def serviceMethod() {

    }

    def getStaticQuote() {
        return new Quote(author: "Alice", content: "We are all insane here.")
    }

    def getRandomQuote() {
        List<Quote> allQuotes = Quote.getAll();
        Quote randomQuote
        if (allQuotes.size() > 0) {
            int randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        } else {
            randomQuote = getStaticQuote()
        }
        return randomQuote
    }
}
