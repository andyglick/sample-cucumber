Feature: Object binding

@dev
Scenario: Bind objects to step definitions using tables
  When I create the following Menu items:
    | name         | category | price |
    | Garlic Bread | Side     | 4.99  |
    | Shepards Pie | Main     | 24.99 |
    | Cheesecake   | Dessert  | 8.99  |
  Then the menu should contain 3 items
  And the menu should contain "Shepards Pie"