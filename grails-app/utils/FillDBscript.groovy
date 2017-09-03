import myquote.*
println Quote.count()
new Quote(author:"Harry Potter", content:"I am a wizard.").save()
new Quote(author:"Me", content:"Hahahah lol.").save()
new Quote(author:"The Chesire Cat", content:"Smile hahahahahahah and do not touch the caterpillar.").save()
println Quote.count()