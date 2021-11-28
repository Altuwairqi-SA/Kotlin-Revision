fun question1(divisor:Int, maxRange:Int): List<Int>{
    var divisibleList = mutableListOf<Int>()
    try{
        for (number in 0..maxRange){
            if(number % divisor == 0) divisibleList.add(number)
        }
    }catch (aE: ArithmeticException){
        println("You can't enter zero as divisor $aE.message")
        divisibleList.add(-1)
    }
    return divisibleList
}

fun question2(num1:Int, num2:Int): List<Int>{
    var min = num1
    var max = num2
    if(num1 > num2) {min= num2; max= num1}
    var multiplesList = mutableListOf<Int>()
    for (number in min..max){
        if(number % min == 0){
            multiplesList.add(number)
        }
    }
    return multiplesList
}

fun question3(words:String, paragraph: String):Map<String,Int> {
    var listWords = words.lowercase().split(" ")
    var listParagraph = paragraph.lowercase().split(","," ")
    var count = 0
    var bagOfWords = mutableMapOf<String,Int>()
    listWords.forEach { word ->
        listParagraph.forEach {
            if(it.equals(word)){
                count+=1
            }
        }
        bagOfWords[word] = count
        count = 0
    }
    return bagOfWords
}

fun main() {
    println(question1(3, 10))
    println(question2(60, 8))
    println(question3("likes John", "John likes to watch movies. Mary likes movies too."))
    println(
        question3(
            "the to and",
            "Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, optionally, help you to detect grammar mistakes and plagiarism. to check word count, simply place your cursor into the text box above and start typing. You'll see the number of characters and words increase or decrease as you type, delete, and edit them. You can also copy and paste text from another program over into the online editor above. The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later."
        )
    )
    println(
        question3(
            "Glass of is for",
            "Glass is a non-crystalline, often transparent amorphous solid, that has widespread practical, technological, and decorative use in, for example, window panes, tableware, and optics. Glass is most often formed by rapid cooling (quenching) of the molten form; some glasses such as volcanic glass are naturally occurring. The most familiar, and historically the oldest, types of manufactured glass are \"silicate glasses\" based on the chemical compound silica (silicon dioxide, or quartz), the primary constituent of sand. Soda-lime glass, containing around 70% silica, accounts for around 90% of manufactured glass. The term glass, in popular usage, is often used to refer only to this type of material, although silica-free glasses often have desirable properties for applications in modern communications technology. Some objects, such as drinking glasses and eyeglasses, are so commonly made of silicate-based glass that they are simply called by the name of the material."
        )
    )
}