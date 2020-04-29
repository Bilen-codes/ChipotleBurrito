# ChipotleBurrito
This program will implement a robot that assembles 25 burritos and,
 displays all ingredients used along with the final price of the burrito.

## Pseudo-code 
1. The program will first save all the ingident options in a 2D array
2. The program will call on a method that will generate the random commination
of the ingredients and send the final string to be displayed 25 times 
3. The called method will first go through each rows of the 2D array (the food 
catagories) and for each it will generate a random number which will be choosen as the index where the ingredient will be picked 
4. As the ingredients of each catagory is being choosen a totalPrice will be incremented by 0.50 for every chooice that doesn't contain the character sequence "no". 
5. Inside the loop that will call on this method will be a print statment displaying the final string for each round. 
6. After displaying the 25 burritos assembled the program will exit. 

## Test cases 
for (row = 0, row < ingredient's 2Darray length, row ++){
totalprice starts at 3.0.
  1.row = 0   random number generated = 2 brown rice +0.50
    row = 1   random number generated = 4 sofritas +0.50
    row = 2   random number generated = 0 pinto +0.50
    row = 3   random number generated = 1 medium +0.50
    row = 4   random number generated = 2 none    
    row = 5   random number generated = 1 no
    row = 6   random number generated = 0 yes +50
    row = 7   random number generated = 0 yes +50
    row = 0   random number generated = 1 no 

final string will be: brown rice, sofritas, pinto, medium, no veggies, no chees, guac, queso, no sour cream $6.00
 

 1.row = 0   random number generated = 2 brown rice +0.50
    row = 1   random number generated = 0 chicken +0.50
    row = 2   random number generated = 0 pinto +0.50
    row = 3   random number generated = 0 mild +0.50
    row = 4   random number generated = 3 all +0.50   
    row = 5   random number generated = 1 no
    row = 6   random number generated = 0 yes +50
    row = 7   random number generated = 0 yes +50
    row = 0   random number generated = 1 no 
    
final string will be: brown rice, chicken, pinto, mild, all veggies, no chesse, 
queso, no sour cream $ 6.00


 1.row = 0   random number generated = 2 brown rice +0.50
    row = 1   random number generated = 4 sofritas +0.50
    row = 2   random number generated = 0 pinto +0.50
    row = 3   random number generated = 1 medium +0.50
    row = 4   random number generated = 2 none    
    row = 5   random number generated = 1 no
    row = 6   random number generated = 0 yes +50
    row = 7   random number generated = 0 yes +50
    row = 0   random number generated = 1 yes +50

final string will be: brown rice, chicken, pinto, mild, all veggies, no chesse,
queso, sour cream $ 6.50
