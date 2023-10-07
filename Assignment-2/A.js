// Function to reverse every word in a sentence
function reverseWordsInSentence(sentence) {
    // Split the sentence into words using space as the delimiter
    let words = sentence.split(" ");

    // Initialize an empty array to store reversed words
    let reversedWords = [];

    // Iterate through each word and reverse it
    for (let word of words) {
        let ans = reverseWord(word);
        reversedWords.push(ans);
    }

    // Join the reversed words to form the reversed sentence
    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

// Function to reverse a single word
function reverseWord(word) {
    // Convert the word to an array of characters, reverse it, and join it back into a string
    return word.split("").reverse().join("");
}

// Get user input
let input = prompt("Enter a sentence: ");

// Call the function to reverse every word in the sentence
let Result = reverseWordsInSentence(input);

// Display the reversed sentence
console.log("Reversed sentence: " + Result);