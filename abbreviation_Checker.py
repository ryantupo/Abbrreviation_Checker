

#function to check wheather a given abrevation is an actual abrevation of a given word
def abrevation_check(possible_abbrevation,word):
    
    #our 3rd word make by decrypting the given word
    new_word = ""

    #list of our abrevation letter by letter
    first_word = list(possible_abbrevation)

    #a for loop to check if each letter in word is inside the abbrevbation
    #and creating a new word made of the commmon letters
    for i in word:
        if i in possible_abbrevation:
            new_word += i

    #check if the abrevation contains any forgein letters that word doesnt have
    for i in first_word:
        if i not in word:
            return False
        #if the abbrevation contains only letters found in word checks if
        #the abbrevation is inside the new word
        elif i in word:
            if possible_abbrevation in new_word:
                return True
            else:
                return False

#example of call of function
x = abrevation_check("kg","kilogram")
print(x)