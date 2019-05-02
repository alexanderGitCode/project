Feature: Login in application

Scenario: ebay
Given Enter to Ebay "https://www.ebay.com/"
And Search for shoes
And Select brand PUMA
And Select status New with box 
When Print the number of results
And Order by price ascendant
And Take the first five products with their prices and print them in console
And Order and print the products by name ascendant
And Order and print the products by price in descendant mode
And Order by price ascendant again
Then Assert the order taking the first five results


