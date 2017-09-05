def authors = ["Mannie Nock", "Goodween Barrow"]
def quoteParts = [["Time ", "waits for ", "no man"], 
["The Wolf ", "eats ", "meat"],
["Groovy", "is", "the bees knees"],
["Alice", "travels to", "the Wonderland"]
]

String createQuote(List quoteParts, List authors){
def random = new Random()
def m = quoteParts.size()
def n = authors.size()

return quoteParts[random.nextInt(m)][0]+" " + quoteParts[random.nextInt(m)][1]+" " + quoteParts[random.nextInt(m)][2]+" " + authors[random.nextInt(n)]
}

for(int i in 0..<10){
def quote = createQuote(quoteParts, authors)
println quote
}