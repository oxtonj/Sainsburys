External Libraries required:
java-json          - For JSON functionality
jsoup-1.13.1       - For web scraping

Software used:
Eclipse IDE

Type of file:
Java Class

Things that could be improved:
Scraped information is stored in JSON objects which are stored in JSON array 
however keys are displayed in alphabetical order instead of intended order.
I.E. keys displayed as Description, kcal_per_100g, Title, unit_price instead
of Title, kcal_per_100g, unit_price, Description.

When scraping prices they were stored as string values but had trouble converting 
them to number values so gross and VAT were worked out without using web scraping.

Tests performed:
Running JSON Array and looking at what can be stored inside JSON Array.
Web scraping tests performed to look at what type of data can be scraped.
Formatting tests performed to store doubles in two decimal places.
Error handling tests performed.
  